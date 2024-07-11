package it.federico.rifugiato;

public class Main {
	
	public static String concatena (String nome, String cognome, boolean stampaMaiuscolo) {
		if (stampaMaiuscolo) {
			return nome.toUpperCase() + " " + cognome.toUpperCase();
		} else {
			return nome.toLowerCase() + " " + cognome.toLowerCase();
		}
	}

	public static void main(String[] args) {
		String nome = "Federico";
		String cognome = "Rifugiato";
		
		System.out.println(concatena(nome, cognome, true));
		System.out.println(concatena(nome, cognome, false));
	}

}
