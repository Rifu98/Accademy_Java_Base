package veicoli;

public class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private boolean guasto;

    public Veicolo(String targa, String marca, String modello) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }
    
    public String getTarga () {
    	return this.targa;
    }
    
    public String getMarca () {
    	return this.marca;
    }
    
    public String getModello () {
    	return this.modello;
    }
    
    public boolean getGuasto () {
    	return this.guasto;
    }
    
    public void setTarga (String targa) {
    	this.targa = targa;
    }
    
    public void setMarca (String marca) {
    	this.marca = marca;
    }
    
    public void setModello (String modello) {
    	this.modello = modello;
    }
    
    public void setGuasto (boolean guasto) {
    	this.guasto = guasto;
    }
}
