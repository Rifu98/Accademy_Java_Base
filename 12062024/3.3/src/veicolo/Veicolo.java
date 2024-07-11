package veicolo;

public class Veicolo {
	private String motore;
	private String telaio;
	private String optional;
	
	Veicolo (VeicoloBuilder builder) {
		this.motore = builder.motore;
		this.telaio = builder.telaio;
		this.optional = builder.optional;
	}
	public static class VeicoloBuilder {

		String motore;
		String telaio;
		String optional;
		
		public VeicoloBuilder setMotore (String motore) {
			this.motore = motore;
			return this;
		}
		
		public VeicoloBuilder setTelaio (String telaio) {
			this.telaio = telaio;
			return this;
		}
		
		public VeicoloBuilder setOptional (String optional) {
			this.optional = optional;
			return this;
		}
		
		public Veicolo build () {
			return new Veicolo(this);
		}
		
		@Override
		public String toString () {
			return "Motore: " + motore + " telaio: " + telaio + " optional: " + optional;
			
		}
	}
}
