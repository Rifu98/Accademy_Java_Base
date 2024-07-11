package it.federico.rifugiato.Esercizi_test.Esercizio_2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListUtilsTest {
	
	ListUtils utils;
	
	@BeforeEach
	public void newInstance () {
        this.utils = new ListUtils();
	}
	
    @Test
    public void testGetEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expected = Arrays.asList(2, 4, 6);
        assertEquals(expected, utils.getEvenNumbers(numbers));
    }

    @Test
    public void testSortNumbers() {
        List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, utils.sortNumbers(numbers));
    }
}
