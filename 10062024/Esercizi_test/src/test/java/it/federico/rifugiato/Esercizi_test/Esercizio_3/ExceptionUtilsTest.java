package it.federico.rifugiato.Esercizi_test.Esercizio_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExceptionUtilsTest {
	
	ExceptionUtils utils;
	
	@BeforeEach
	public void newInstance () {
        this.utils = new ExceptionUtils();
	}

    @Test
    public void testValidateAgeThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> utils.validateAge(-1));
    }

    @Test
    public void testValidateAgeDoesNotThrowException() {
        Assertions.assertDoesNotThrow(() -> utils.validateAge(30));
    }

    @Test
    public void testCheckNotNullThrowsException() {
        Assertions.assertThrows( NullPointerException.class, () -> utils.checkNotNull(null));
    }

    @Test
    public void testCheckNotNullDoesNotThrowException() {
        Assertions.assertDoesNotThrow(() -> utils.checkNotNull(new Object ()));
    }
}

