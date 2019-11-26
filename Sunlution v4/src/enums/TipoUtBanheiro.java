package enums;

public enum TipoUtBanheiro {
	
		
		
	MAQUINA_BARBEAR("Maquina de Barbear"),
	SECADOR("Secador"),
	TORNEIRA("Torneira"),
	CHUVEIRO("Chuveiro"),
	CHAPINHA("Chapinha"),
	BABYLISS("BabyLiss");
		private String valor;
		
		TipoUtBanheiro(String tipoUt) {
			valor = tipoUt;
		}
		
		public String getValor() {
			return valor;
		}
}
