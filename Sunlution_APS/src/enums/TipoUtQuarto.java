package enums;

public enum TipoUtQuarto {

	TV("TV"),
	VIDEOGAME("Video Game"),
	RADIO("Radio"),
	VENTILADOR("Ventilador"),
	COMPUTADOR("Computador"),
	AR_CONDICIONADO("Ar-Condicionado"),
	OUTRO("Outro");

	private String valor;

	TipoUtQuarto(String tipoUt) {
		valor = tipoUt;
	}

	public String getValor() {
		return valor;
	}
}
