package Documenti;

import util.DocumentType;
import exceptions.*;

public abstract class Document {
    private String title;
    private DocumentType type;
    
    public Document(String title, DocumentType type) {
        this.title = title;
        this.type = type;
    }
    
    public DocumentType getType() {
        return type;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public abstract void print() throws PrintException;
    public abstract void load() throws LoadException;
    public abstract void save() throws SaveException;
}
