package model;

import java.util.ArrayList;

import enums.TipoRes;

public class Residencia {
	
	ArrayList<Comodos> comodo = new ArrayList<Comodos>();

	public ArrayList<Comodos> getComodo() {
		return comodo;
	}

	public void setComodo(ArrayList<Comodos> comodo) {
		this.comodo = comodo;
	}
	
}
