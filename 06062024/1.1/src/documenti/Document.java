package documenti;

import util.DocumentType;

public abstract class Document {
	
	private String title;
	
	private DocumentType type;
	
	public Document(String title, DocumentType type) {
		this.title = title;
		this.type = type;
	}
	
	public DocumentType getType () {
		return type;
	}
	
	public void setTitle (String title) {
		this.title = title;
	}
	
	public String getTitle () {
		return this.title;
	}
	
	public abstract void print();
	public abstract void load();
	public abstract void save();
}
