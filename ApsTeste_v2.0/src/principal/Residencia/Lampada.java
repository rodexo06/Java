package principal.Residencia;

import javax.swing.JOptionPane;

public class Lampada extends ProdEletSimples {
	
	String tipo;
	
	public void definirTipo() {
		tipo = JOptionPane.showInputDialog("Qual o tipo de Lampada?" + "\n" + "Led" + "\n" + "Incadescente" + "\n" + "Fluorescente");
		
		if(tipo.equalsIgnoreCase("LED")) {
			consumo = 10 ;
		}
		
		if(tipo.equalsIgnoreCase("Incadescente")) {
		
			
		}
		
		if(tipo.equalsIgnoreCase("Fluorescente")) {
			
		}
		
		
	}
}
