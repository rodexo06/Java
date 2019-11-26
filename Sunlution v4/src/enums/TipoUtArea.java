package enums;

public enum TipoUtArea {
	
		MAQUINA_LAVAR("Maquina de Lavar"),
		SECADORA("Secadora");
		
		
		
		private String valor;
		
		TipoUtArea(String tipoUt) {
			valor = tipoUt;
		}
		
		public String getValor() {
			return valor;
		}
}
