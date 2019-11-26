package principal.Residencia;

import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class ProdEletSimples {
	public String nome;
    public double consumoobj, consumo;
    public int voltagem, quantidade;
    public SimpleDateFormat horas = new SimpleDateFormat("hh:mm");
    public int hora, min;
    
    
    public void definirVoltagem() {
		this.voltagem =Integer.parseInt(JOptionPane.showInputDialog("Qual é a voltagem dele?"));
		this.setVoltagem(voltagem);
		if(voltagem == 110 || voltagem == 220) {
			if(voltagem == 110) {
				//consumo = 11;
				//this.setConsumo(consumo);
			} else {
				//consumo = 22;
				//this.setConsumo(consumo);
			}
		} else JOptionPane.showMessageDialog(null,"Selecione uma voltagem correta"); 
	}
	public void mostrarObj(ProdEletSimples objeto) {
		JOptionPane.showMessageDialog(null, "Consumo: " + consumo + "\n" + "Consumo Total: " + consumoobj);
	}
	public void calculoGasto() {
		consumoobj = getQuantidade() * getConsumo() * getHora();
		this.setConsumoobj(consumoobj);
	}
    public void maisUm() {
    	getQuantidade();
		quantidade++;
		setQuantidade(quantidade);
	}
    public void menosUm() {
    	getQuantidade();
		quantidade--;
		setQuantidade(quantidade);
	}
    public void inicializacaoDiferente() throws NumberFormatException, HeadlessException{
		this.quantidade++;
		setQuantidade(quantidade);
		definirVoltagem();
		calcularHora();
	}
    public void inicializacao() throws NumberFormatException, HeadlessException{
		this.quantidade++;
		setQuantidade(quantidade);
		this.voltagem = 220;
		this.setVoltagem(voltagem);
		calcularHora();
	}
	public void calcularHora() throws NumberFormatException, HeadlessException {
		hora =Integer.parseInt(JOptionPane.showInputDialog("Quantas horas vc usa ele"));
		min =Integer.parseInt(JOptionPane.showInputDialog("Quantos minutos vc usa ele"));
		hora =+ 60/min;
		this.setHora(hora);
	}
    public String relatorio() {
    	return "Nome: " + nome + "\t" + "Quantidade: " + quantidade + "\n" + 
    			"Horas de consumo: " + hora + ":" + min + "\t" + "Consumo do utensilio: " + consumo + 
    			"\n" + "Consumo Total: " + consumoobj;
    }
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public double getConsumoobj() {
		return consumoobj;
	}
	public void setConsumoobj(double consumoobj) {
		this.consumoobj = consumoobj;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public SimpleDateFormat getHoras() {
		return horas;
	}
	public void setHoras(SimpleDateFormat horas) {
		this.horas = horas;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}

}
