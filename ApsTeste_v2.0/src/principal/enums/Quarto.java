package principal.enums;

public enum Quarto {
	
	
	Lampadas(1), Carregador(2), VideoGame(3), Radio(4), TV(5), Ventilador(6), Impressora(7), Notebook(5), Computador(6), Intrumentos(7);

	private int valor;
	
	private Quarto(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
}

