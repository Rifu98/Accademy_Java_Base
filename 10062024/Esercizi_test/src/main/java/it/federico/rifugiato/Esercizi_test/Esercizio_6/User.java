package it.federico.rifugiato.Esercizi_test.Esercizio_6;

public class User {
	private String email ;
	private String phoneNumber ;

	public User ( String email , String phoneNumber ) {
		this . email = email ;
		this . phoneNumber = phoneNumber ;
	}

	public String getEmail () {
		return email ;
	}

	public String getPhoneNumber () {
		return phoneNumber ;
	}
}