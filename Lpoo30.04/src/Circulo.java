import javax.swing.JOptionPane;

public class Circulo extends Figura{	
	
	public Circulo(double raio) {
		super();
		this.raio =Double.parseDouble(JOptionPane.showInputDialog("Qual é o raio?"));
		setRaio(raio);
		Cor();
	}

	private double raio;
	
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}

	
	public double getRaio() {
		return raio;
	}

	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	

}
