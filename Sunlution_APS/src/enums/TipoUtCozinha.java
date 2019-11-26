package enums;

public enum TipoUtCozinha {
	FOGAO("Fogão"), 
	MICROONDAS("Microondas"), 
	TORNEIRA_ELETRICA("Torneira Elétrica"), 
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
