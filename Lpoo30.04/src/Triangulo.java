import javax.swing.JOptionPane;

public class Triangulo extends Figura {

	private double b, h;

	public Triangulo() {
		super();
		this.b = Double.parseDouble(JOptionPane.showInputDialog("Base: "));
		this.h = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
		setB(b);
		setH(h);
		Cor();
	}

	public double area() {
		return b*h/2;
	}
	
	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}



	
	
}
