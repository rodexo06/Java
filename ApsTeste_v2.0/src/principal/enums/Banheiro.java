package principal.enums;

public enum Banheiro {
	
	Lampadas(1), MaquinaBarbear(2), Secador(3), Torneira(4), Chuveiro(5), Chapinha(6), BabyLiss(7);

	private int valor;
	
	private Banheiro(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
}

