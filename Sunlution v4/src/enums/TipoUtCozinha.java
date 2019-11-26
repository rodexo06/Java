package enums;

public enum TipoUtCozinha {
	FOGAO("Fog�o"), 
	MICROONDAS("Microondas"), 
	TORNEIRA_ELETRICA("Torneira El�trica"), 
	GELADEIRA("Geladeira"),
	CAFETEIRA("Cafeteria"), 
	PURIFICADOR("Purificador"),
	OUTRO("Outro");

	private String valor;

	TipoUtCozinha(String tipoUt) {
		valor = tipoUt;
	}

	public String getValor() {
		return valor;
	}
}
