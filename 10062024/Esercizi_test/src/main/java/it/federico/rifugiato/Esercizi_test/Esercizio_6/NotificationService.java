package it.federico.rifugiato.Esercizi_test.Esercizio_6;

public class NotificationService {
	private EmailService emailService ;
	private SMSService smsService ;

	public NotificationService ( EmailService emailService , SMSService smsService ) {
		this . emailService = emailService ;
		this . smsService = smsService ;
	}

	public void sendNotification ( User user , String message ) {
		if ( user . getEmail () != null ) {
			emailService . sendEmail ( user . getEmail () , message );
		}
		if ( user . getPhoneNumber () != null ) {
			smsService . sendSMS ( user . getPhoneNumber () , message ) ;
		}
	}
}
