package documenti;

import util.DocumentType;

public class WordDocument extends Document {

	private String corpo;

	public WordDocument(String title, String corpo) {
		super(title, DocumentType.WORD);
		this.corpo = corpo;
	}
	
	public String getCorpo () {
		return this.corpo;
	}
	
	public void setCorpo (String corpo) {
		this.corpo = corpo;
	}
	
	@Override
	public void print() {
		System.out.println("Stampo il Word");
		System.out.println(corpo);
	}

	@Override
	public void load() {
		System.out.println("Carico il Word");
		
	}

	@Override
	public void save() {
		System.out.println("Salvo il Word");
		
	}

}
