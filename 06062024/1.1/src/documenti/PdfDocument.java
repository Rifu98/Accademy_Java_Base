package documenti;

import util.DocumentType;

public class PdfDocument extends Document {

	private String corpo;

	public PdfDocument(String title, String corpo) {
		super(title, DocumentType.PDF);
		this.corpo = corpo;
	}
	
	public String getCorpo () {
		return this.corpo;
	}
	

	@Override
	public void print() {
		System.out.println("Stampo il Pdf");
		System.out.println(corpo);
	}

	@Override
	public void load() {
		System.out.println("Carico il Pdf");
		
	}

	@Override
	public void save() {
		System.out.println("Salvo il Pdf");
		
	}
}
