package control;

import javax.swing.JOptionPane;

import enums.TipoUtArea;
import enums.TipoUtBanheiro;
import enums.TipoUtCozinha;
import enums.TipoUtQuarto;
import enums.TipoUtSala;
import model.Residencia;
import view.*;

public class Calculos {
	
	double[] somacomodo;
	double somaconsumo = 0;
	double tarifa, valorconsumo;
	
	public void aplicaconsumo(Residencia r) {
		
		for (int x=0;x<r.getComodo().size();x++) {
			for(int y=0;y<r.getComodo().get(x).getUtensilios().size();y++) {
				
				// Area de serviço
				
				if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtArea.MAQUINA_LAVAR) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}				
				if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtArea.SECADORA) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}
				
				// Banheiro
				
				if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtBanheiro.BABYLISS) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtBanheiro.CHAPINHA) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtBanheiro.CHUVEIRO) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtBanheiro.MAQUINA_BARBEAR) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtBanheiro.SECADOR) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtBanheiro.TORNEIRA) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}
				
				// Cozinha				
				
				if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtCozinha.CAFETEIRA) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtCozinha.FOGAO) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtCozinha.GELADEIRA) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtCozinha.MICROONDAS) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtCozinha.PURIFICADOR) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtCozinha.OUTRO) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtCozinha.TORNEIRA_ELETRICA) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}
				
				//QUARTO
				
				if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtQuarto.AR_CONDICIONADO) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtQuarto.COMPUTADOR) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtQuarto.OUTRO) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtQuarto.RADIO) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtQuarto.TV) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtQuarto.VENTILADOR) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtQuarto.VIDEOGAME) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}
				
				//Sala
				
				if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtSala.DVD) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtSala.RADIO) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtSala.TELEFONE) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtSala.TV) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtSala.VENTILADOR) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}if(r.getComodo().get(x).getUtensilios().get(y).getTipo() == TipoUtSala.AR_CONDICIONADO) {
					if(r.getComodo().get(x).getUtensilios().get(y).getVoltagem() == 110) {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}else {
						r.getComodo().get(x).getUtensilios().get(y).setConsumo(15.2);
					}
				}
			}
		}
	}
	
	public void calcularconsumo(Residencia r) {
		for (int x=0;x<r.getComodo().size();x++) {
			for(int y=0;y<r.getComodo().get(x).getUtensilios().size();y++) {
				r.getComodo().get(x).getUtensilios().get(y).setConsumotot((r.getComodo().get(x).getUtensilios().get(y).getHora()) * r.getComodo().get(x).getUtensilios().get(y).getConsumo());		
				JOptionPane.showMessageDialog(null, r.getComodo().get(x).getUtensilios().get(y).getConsumotot());
			}
		}
	}

	public void somaConsumo(Residencia r) {
		
		for (int x=0;x<r.getComodo().size();x++) {
			for(int y=0;y<r.getComodo().get(x).getUtensilios().size();y++) {
				somaconsumo +=	r.getComodo().get(x).getUtensilios().get(y).getConsumotot();
				somacomodo[x] += r.getComodo().get(x).getUtensilios().get(y).getConsumotot();
			}
		}	
		setSomaconsumo(somaconsumo);
	}
	

	public void relatorioConsumo(Residencia r) {
		
		for (int x=0;x<r.getComodo().size();x++) {
			FrameHome.relconsumo.insert(x, r.getComodo().get(x).toString() + "\n");
			somacomodo = new double[r.getComodo().size()];
			for(int y=0;y<r.getComodo().get(x).getUtensilios().size();y++) {
				FrameHome.relconsumo.insert(y, r.getComodo().get(x).getUtensilios().get(y).toString() + "\n");
			}
		FrameHome.relconsumo.insert(x, somacomodo[x]);
		}
		FrameHome.relconsumo.insert(0, "\n" + getSomaconsumo());
	}
	
	public void calcTarifa() {
		
		if(somaconsumo <= 50) {
			tarifa = 0.65893;
			valorconsumo = tarifa*somaconsumo;	
		}if(somaconsumo <= 300 && somaconsumo > 50) {
			tarifa = 0.81306;
			valorconsumo = tarifa*somaconsumo;
		}if(somaconsumo <= 450 && somaconsumo > 300) {
			tarifa = 0.97834;
			valorconsumo = tarifa*somaconsumo;
		}if(somaconsumo > 450) {
			tarifa = 0.96328;
			valorconsumo = tarifa*somaconsumo;
		}
	}
	
	

	
	
	public double[] getSomacomodo() {
		return somacomodo;
	}

	public void setSomacomodo(double[] somacomodo) {
		this.somacomodo = somacomodo;
		
	}

	public double getSomaconsumo() {
		return somaconsumo;
	}

	public void setSomaconsumo(double somaconsumo) {
		this.somaconsumo = somaconsumo;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getValorconsumo() {
		return valorconsumo;
	}

	public void setValorconsumo(double valorconsumo) {
		this.valorconsumo = valorconsumo;
	}
	
	
}
