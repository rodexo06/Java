package principal.enums;

public enum Comodos {
	
	Cozinha(1), Sala(2), Quarto(3), Banheiro(4), Quintal(5), AreaServico(6);  

	private int valor;
	
	private Comodos(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
}