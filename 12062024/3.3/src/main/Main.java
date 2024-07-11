package main;

import veicolo.Veicolo;

public class Main {
	public static void main (String [] args) {
		Veicolo veicolo = new Veicolo.VeicoloBuilder()
				.setMotore("V12")
				.setTelaio("Carbonio")
				.setOptional("Gomme Slick")
				.build();
		System.out.println(veicolo);
	}
}
