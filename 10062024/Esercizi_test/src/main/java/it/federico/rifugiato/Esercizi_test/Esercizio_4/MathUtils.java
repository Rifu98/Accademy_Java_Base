package it.federico.rifugiato.Esercizi_test.Esercizio_4;

public class MathUtils {
	public boolean isPrime ( int number ) {
		if ( number <= 1) {
			return false ;
		}
		for (int i = 2; i <= Math . sqrt ( number ) ; i ++) {
			if ( number % i == 0) {
				return false ;
			}
		}
	return true ;
	}
}