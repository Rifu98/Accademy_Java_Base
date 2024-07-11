package it.federico.rifugiato.Esercizi_test.Esercizio_6;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTest {

    private EmailService emailService;
    private SMSService smsService;
    private NotificationService notificationService;

    @BeforeEach
    public void setUp() {
        emailService = Mockito.mock(EmailService.class);
        smsService = Mockito.mock(SMSService.class);
        notificationService = new NotificationService(emailService, smsService);
    }

    @Test
    public void testSendNotificationWithEmail() {
        User user = new User("user@example.com", null);
        String message = "Hello, World!";
        
        notificationService.sendNotification(user, message);
        
        verify(emailService).sendEmail("user@example.com", message);
        verify(smsService, never()).sendSMS("3279874194", "ciao");
    }

    @Test
    public void testSendNotificationWithPhoneNumber() {
        User user = new User(null, "1234567890");
        String message = "Hello, World!";
        
        notificationService.sendNotification(user, message);
        
        verify(smsService).sendSMS("1234567890", message);
        verify(emailService, never()).sendEmail(anyString(), anyString());
    }

    @Test
    public void testSendNotificationWithEmailAndPhoneNumber() {
        User user = new User("user@example.com", "1234567890");
        String message = "Hello, World!";
        
        notificationService.sendNotification(user, message);
        
        verify(emailService).sendEmail("user@example.com", message);
        verify(smsService).sendSMS("1234567890", message);
    }

    @Test
    public void testSendNotificationWithNoContactInfo() {
        User user = new User(null, null);
        String message = "Hello, World!";
        
        notificationService.sendNotification(user, message);
        
        verify(emailService, never()).sendEmail("federicorifugiato52@gmail.com", "ciao");
        verify(smsService, never()).sendSMS("3279874194", "ciao");
    }
}

