package Documenti;

import util.DocumentType;

public class SpreadsheetDocument extends Document {
	
	int [] [] dati;

	public SpreadsheetDocument(String title, int [] [] dati) {
		super(title, DocumentType.SPREADSHEET);
		this.dati = dati;
	}
	
	public void setDati (int [] [] dati) {
		this.dati = dati;
	}
	
	public int [] [] getDati () {
		return this.dati;
	}
	

	@Override
	public void print() {
		System.out.println("Stampo il Spreadsheet");
		for (int [] riga : dati) {
			for (int dato : riga) {
				System.out.print(dato + " ");
			}
			System.out.println();
		}
	}

	@Override
	public void load() {
		System.out.println("Carico il Spreadsheet");
		
	}

	@Override
	public void save() {
		System.out.println("Salvo il Spreadsheet");
		
	}
}
