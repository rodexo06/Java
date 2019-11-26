package model;

import java.util.ArrayList;

import enums.TipoCom;

public class Comodos {
	
	TipoCom tpCom;
	ArrayList<Utensilio> utensilios = new ArrayList<Utensilio>();
	
	public ArrayList<Utensilio> getUtensilios() {
		return utensilios;
	}
	public void setUtensilios(ArrayList<Utensilio> utensilios) {
		this.utensilios = utensilios;
	}
	public TipoCom getTpCom() {
		return tpCom;
	}
	public void setTpCom(TipoCom tpCom) {
		this.tpCom = tpCom;
	}
	@Override
	public String toString() {
		return "Comodo: " + getTpCom();
	}
	
	
	
}
