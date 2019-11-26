package enums;

public enum TipoUtSala {
	
	DVD("DVD"),
	RADIO("Radio"),
	TELEFONE("Telefone"),
	VENTILADOR("Ventilador"),
	TV("TV"), 
	AR_CONDICIONADO("Ar-Condicionado");
		
		
		private String valor;
		
		TipoUtSala(String tipoUt) {
			valor = tipoUt;
		}
		
		public String getValor() {
			return valor;
		}
}
