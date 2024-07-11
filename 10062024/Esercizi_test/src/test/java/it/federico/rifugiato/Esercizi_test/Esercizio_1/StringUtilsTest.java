package it.federico.rifugiato.Esercizi_test.Esercizio_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
	
	StringUtils utils;
	
	@BeforeEach
	public void newInstance () {
        this.utils = new StringUtils();
	}

    @Test
    public void testConcatenate() {
        assertEquals("hello world", utils.concatenate("hello", " world"));
    }

    @Test
    public void testIsPalindromeTrue() {
        assertTrue(utils.isPalindrome("anna"));
    }

    @Test
    public void testIsPalindromeFalse() {
        assertFalse(utils.isPalindrome("hello"));
    }
}
