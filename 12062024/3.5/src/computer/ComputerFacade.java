package computer;

public class ComputerFacade {
	private Accensione accensione;
	private Editor editor;
	private Connessione connessione;
	
	public ComputerFacade () {
		this.accensione = new Accensione();
		this.editor = new Editor();
		this.connessione = new Connessione();
	}
	
	public void usaComputer () {
		accensione.accendi();
		editor.scrivi();
		connessione.connettiti();
	}
}
