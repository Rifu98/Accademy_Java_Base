package veicoli;

public class Vettura extends Veicolo {
    private String tipologia;

    public Vettura(String targa, String marca, String modello, String tipologia) {
        super(targa, marca, modello);
        this.tipologia = tipologia;
    }
    
    public String getTipologia () {
    	return this.tipologia;
    }
    
    public void setTipologia (String tipologia) {
    	this.tipologia = tipologia;
    }
}
