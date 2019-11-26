import javax.swing.JOptionPane;

public abstract class Figura {

	String cor;
	
	public abstract double area();

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void Cor() {
		this.cor = JOptionPane.showInputDialog("Qual a cor? ");
		setCor(cor);
	}
}
