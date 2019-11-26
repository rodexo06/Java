package enums;

public enum TipoCom {
	AREA_SERV("Área de Serviço"), BANHEIRO("Banheiro"), COZINHA("Cozinha"), QUARTO("Quarto"), SALA("Sala");
	
	private String valor;
	
	private TipoCom(String tipoCom) {
		valor = tipoCom;
	}
	
	public String getValor() {
		return valor;
	}
	
}
