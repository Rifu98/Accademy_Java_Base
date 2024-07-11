package it.federico.rifugiato.Esercizi_test.Esercizio_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testIsPrimeTrue() {
        MathUtils utils = new MathUtils();
        assertTrue(utils.isPrime(5));
    }

    @Test
    public void testIsPrimeFalse() {
        MathUtils utils = new MathUtils();
        assertFalse(utils.isPrime(4));
    }

    @Test
    public void testIsPrimeForOne() {
        MathUtils utils = new MathUtils();
        assertFalse(utils.isPrime(1));
    }

    @Test
    public void testIsPrimeForZero() {
        MathUtils utils = new MathUtils();
        assertFalse(utils.isPrime(0));
    }

    @Test
    public void testIsPrimeForNegativeNumber() {
        MathUtils utils = new MathUtils();
        assertFalse(utils.isPrime(-5));
    }
}
