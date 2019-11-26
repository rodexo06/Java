package principal.enums;

public enum Sala {
	
	Lampadas(1), Carregador(2), DVD(3), Roteador(4), Radio(5), Telefone(6), Ventilador(7), TV(8);

	private int valor;
	
	private Sala(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
}
