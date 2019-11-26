package model;

import java.text.SimpleDateFormat;

public class Utensilio {
	
	Enum<?> tipo;
	double consumo, consumotot = 0;
	int voltagem, quantidade;
    int hora;
    
	public Enum<?> getTipo() {
		return tipo;
	}
	public void setTipo(Enum<?> tipo) {
		this.tipo = tipo;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public double getConsumotot() {
		return consumotot;
	}
	
	public void setConsumotot(double consumotot) {
		this.consumotot += consumotot;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	
	@Override
	public String toString() {
		return "Utensilio"  + getTipo() + "consumo: " + getConsumotot() + "voltagem: "+ getVoltagem() +
				"/n" +  "quantidade: " + getQuantidade() + "hora: " + getHora();
	}
    
	
	
	
    }
