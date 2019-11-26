import javax.swing.JOptionPane;

public class Retangulo extends Figura{
	
	private double b, h;

	public Retangulo() {
		super();
		this.b = Double.parseDouble(JOptionPane.showInputDialog("Base: "));
		this.h = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
		setB(b);
		setH(h);
		Cor();
	}

	public double area() {
		return b*h;
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
