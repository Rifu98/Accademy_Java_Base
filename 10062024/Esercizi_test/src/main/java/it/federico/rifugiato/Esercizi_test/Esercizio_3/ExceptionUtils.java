package it.federico.rifugiato.Esercizi_test.Esercizio_3;

public class ExceptionUtils {
	public void validateAge ( int age ) {
		if ( age < 0 || age > 150) {
			throw new IllegalArgumentException (" Invalid age") ;
		}
	}
	
	public void checkNotNull ( Object obj ) {
		if ( obj == null ) {
			throw new NullPointerException (" Object is null ");
		}
	}
}