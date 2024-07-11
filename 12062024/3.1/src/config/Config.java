package config;

public class Config {
	
	//Struttura singleton
	private static Config instance;
	
	private Config () {
		this.config = "Default";
	}

	public static Config getInstance () {
		if ( instance == null ) {
			instance = new Config ();
		}
		return instance;
	}
	
	//Classe effettiva
	
	private String config;
	
	public void setConfig (String config) {
		this.config = config;
	}

	public String getConfig() {
		return this.config;
	}

}
