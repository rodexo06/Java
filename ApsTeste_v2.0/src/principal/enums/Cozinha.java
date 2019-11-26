package principal.enums;

public enum Cozinha {
	
	
	Lampadas(1), Fogao(2), Microondas(3),Torneira(4), Geladeira(5),	Cafeteira(6), Purifcador(7);

	private int valor;
	
	private Cozinha(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
}
