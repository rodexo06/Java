package enums;

public enum TipoRes {
	
	CASA(1),
	APTO(2);

	private final int valor;
	
	TipoRes(int tipoRes){
		 valor = tipoRes;
	 }
	 
	 public int getValor() {
		 return valor;
	 }
}
