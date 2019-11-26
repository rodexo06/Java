package principal.Residencia;

import javax.swing.JOptionPane;
import principal.Ultilitarios.Textos;
import principal.enums.Comodos;

public class Default extends Lampada{

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Residencia residencia1 = new Residencia();
		Textos tx = new Textos();
		Comodos enumcm = null;
		String opcomodos = null;
		String menu1 = JOptionPane.showInputDialog(tx.getTextmenu1());
		
		
		
		
		if (menu1.equalsIgnoreCase("Casa")){
			int menu2 =Integer.parseInt(JOptionPane.showInputDialog(tx.getTextcasa()));
			
			
			// COZINHA
			
			
			if (menu2 == 1) {
				Comodo cozinha = new Comodo();
				do {
				int menu3 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextCozinha()));
				if (menu3 == 1) {
					//Lampada
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpc());
				}
				if (menu3 == 2) {
					ProdEletSimples geladeira = null;
					String opc = null;
					if (geladeira == null) {
						geladeira =  new ProdEletSimples();
						geladeira.inicializacaoDiferente();
						geladeira.calculoGasto();
						geladeira.mostrarObj(geladeira);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								geladeira.maisUm();
								geladeira.calculoGasto();
								geladeira.mostrarObj(geladeira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								geladeira.menosUm();
								geladeira.calculoGasto();
								geladeira.mostrarObj(geladeira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								geladeira.calcularHora();
								geladeira.calculoGasto();
								geladeira.mostrarObj(geladeira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								geladeira.definirVoltagem();
								geladeira.calculoGasto();
								geladeira.mostrarObj(geladeira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								geladeira.mostrarObj(geladeira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								geladeira.maisUm();
								geladeira.calculoGasto();
								geladeira.mostrarObj(geladeira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								geladeira.menosUm();
								geladeira.calculoGasto();
								geladeira.mostrarObj(geladeira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								geladeira.calcularHora();
								geladeira.calculoGasto();
								geladeira.mostrarObj(geladeira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								geladeira.definirVoltagem();
								geladeira.calculoGasto();
								geladeira.mostrarObj(geladeira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								geladeira.mostrarObj(geladeira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
					cozinha.Utensilios.add(geladeira);
				}
				
				if (menu3 == 3) {
					ProdEletSimples microondas = null;
					String opc = null;
					if (microondas == null) {
						microondas =  new ProdEletSimples();
						microondas.inicializacaoDiferente();
						microondas.calculoGasto();
						microondas.mostrarObj(microondas);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								microondas.maisUm();
								microondas.calculoGasto();
								microondas.mostrarObj(microondas);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								microondas.menosUm();
								microondas.calculoGasto();
								microondas.mostrarObj(microondas);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								microondas.calcularHora();
								microondas.calculoGasto();
								microondas.mostrarObj(microondas);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								microondas.definirVoltagem();
								microondas.calculoGasto();
								microondas.mostrarObj(microondas);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								microondas.mostrarObj(microondas);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								microondas.maisUm();
								microondas.calculoGasto();
								microondas.mostrarObj(microondas);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								microondas.menosUm();
								microondas.calculoGasto();
								microondas.mostrarObj(microondas);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								microondas.calcularHora();
								microondas.calculoGasto();
								microondas.mostrarObj(microondas);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								microondas.definirVoltagem();
								microondas.calculoGasto();
								microondas.mostrarObj(microondas);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								microondas.mostrarObj(microondas);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
					cozinha.Utensilios.add(microondas);
				}
				if (menu3 == 4) {
					//Torneira
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 5) {
					ProdEletSimples fogao = null;
					String opc = null;
					if (fogao == null) {
						fogao =  new ProdEletSimples();
						fogao.inicializacaoDiferente();
						fogao.calculoGasto();
						fogao.mostrarObj(fogao);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								fogao.maisUm();
								fogao.calculoGasto();
								fogao.mostrarObj(fogao);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								fogao.menosUm();
								fogao.calculoGasto();
								fogao.mostrarObj(fogao);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								fogao.calcularHora();
								fogao.calculoGasto();
								fogao.mostrarObj(fogao);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								fogao.definirVoltagem();
								fogao.calculoGasto();
								fogao.mostrarObj(fogao);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								fogao.mostrarObj(fogao);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								fogao.maisUm();
								fogao.calculoGasto();
								fogao.mostrarObj(fogao);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								fogao.menosUm();
								fogao.calculoGasto();
								fogao.mostrarObj(fogao);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								fogao.calcularHora();
								fogao.calculoGasto();
								fogao.mostrarObj(fogao);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								fogao.definirVoltagem();
								fogao.calculoGasto();
								fogao.mostrarObj(fogao);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								fogao.mostrarObj(fogao);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					cozinha.Utensilios.add(fogao);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 6) {
					ProdEletSimples cafeteira = null;
					String opc = null;
					if (cafeteira == null) {
						cafeteira =  new ProdEletSimples();
						cafeteira.inicializacaoDiferente();
						cafeteira.calculoGasto();
						cafeteira.mostrarObj(cafeteira);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								cafeteira.maisUm();
								cafeteira.calculoGasto();
								cafeteira.mostrarObj(cafeteira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								cafeteira.menosUm();
								cafeteira.calculoGasto();
								cafeteira.mostrarObj(cafeteira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								cafeteira.calcularHora();
								cafeteira.calculoGasto();
								cafeteira.mostrarObj(cafeteira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								cafeteira.definirVoltagem();
								cafeteira.calculoGasto();
								cafeteira.mostrarObj(cafeteira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								cafeteira.mostrarObj(cafeteira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								cafeteira.maisUm();
								cafeteira.calculoGasto();
								cafeteira.mostrarObj(cafeteira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								cafeteira.menosUm();
								cafeteira.calculoGasto();
								cafeteira.mostrarObj(cafeteira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								cafeteira.calcularHora();
								cafeteira.calculoGasto();
								cafeteira.mostrarObj(cafeteira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								cafeteira.definirVoltagem();
								cafeteira.calculoGasto();
								cafeteira.mostrarObj(cafeteira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								cafeteira.mostrarObj(cafeteira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
					cozinha.Utensilios.add(cafeteira);
				}
				if (menu3 == 7) {
					//Cafeteira
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpc());
				}
				}
				while (opcomodos.equalsIgnoreCase("Sim")|| opcomodos.equalsIgnoreCase("s"));
				residencia1.comodos.add(cozinha);
			}
			if (menu2 == 2) {
				Comodo sala = new Comodo();
				do {
				int menu3 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextSala()));
				if (menu3 == 1) {
					//Lampada
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpc());
				}
				if (menu3 == 2) {
					ProdEletSimples carregador = null;
					String opc = null;
					if (carregador == null) {
						carregador =  new ProdEletSimples();
						carregador.inicializacaoDiferente();
						carregador.calculoGasto();
						carregador.mostrarObj(carregador);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								carregador.maisUm();
								carregador.calculoGasto();
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								carregador.menosUm();
								carregador.calculoGasto();
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								carregador.calcularHora();
								carregador.calculoGasto();
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								carregador.definirVoltagem();
								carregador.calculoGasto();
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								carregador.maisUm();
								carregador.calculoGasto();
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								carregador.menosUm();
								carregador.calculoGasto();
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								carregador.calcularHora();
								carregador.calculoGasto();
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								carregador.definirVoltagem();
								carregador.calculoGasto();
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					sala.Utensilios.add(carregador);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				
				if (menu3 == 3) {
					ProdEletSimples dvd = null;
					String opc = null;
					if (dvd == null) {
						dvd =  new ProdEletSimples();
						dvd.inicializacaoDiferente();
						dvd.calculoGasto();
						dvd.mostrarObj(dvd);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								dvd.maisUm();
								dvd.calculoGasto();
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								dvd.menosUm();
								dvd.calculoGasto();
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								dvd.calcularHora();
								dvd.calculoGasto();
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								dvd.definirVoltagem();
								dvd.calculoGasto();
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								dvd.maisUm();
								dvd.calculoGasto();
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								dvd.menosUm();
								dvd.calculoGasto();
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								dvd.calcularHora();
								dvd.calculoGasto();
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								dvd.definirVoltagem();
								dvd.calculoGasto();
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					sala.Utensilios.add(dvd);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 4) {
					ProdEletSimples roteador = null;
					String opc = null;
					if (roteador == null) {
						roteador =  new ProdEletSimples();
						roteador.inicializacaoDiferente();
						roteador.calculoGasto();
						roteador.mostrarObj(roteador);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								roteador.maisUm();
								roteador.calculoGasto();
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								roteador.menosUm();
								roteador.calculoGasto();
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								roteador.calcularHora();
								roteador.calculoGasto();
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								roteador.definirVoltagem();
								roteador.calculoGasto();
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								roteador.maisUm();
								roteador.calculoGasto();
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								roteador.menosUm();
								roteador.calculoGasto();
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								roteador.calcularHora();
								roteador.calculoGasto();
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								roteador.definirVoltagem();
								roteador.calculoGasto();
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					sala.Utensilios.add(roteador);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());

				}
				if (menu3 == 5) {
					ProdEletSimples radio = null;
					String opc = null;
					if (radio == null) {
						radio =  new ProdEletSimples();
						radio.inicializacaoDiferente();
						radio.calculoGasto();
						radio.mostrarObj(radio);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								radio.maisUm();
								radio.calculoGasto();
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								radio.menosUm();
								radio.calculoGasto();
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								radio.calcularHora();
								radio.calculoGasto();
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								radio.definirVoltagem();
								radio.calculoGasto();
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								radio.maisUm();
								radio.calculoGasto();
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								radio.menosUm();
								radio.calculoGasto();
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								radio.calcularHora();
								radio.calculoGasto();
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								radio.definirVoltagem();
								radio.calculoGasto();
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					sala.Utensilios.add(radio);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 6) {
					ProdEletSimples telefone = null;
					String opc = null;
					if (telefone == null) {
						telefone =  new ProdEletSimples();
						telefone.inicializacaoDiferente();
						telefone.calculoGasto();
						telefone.mostrarObj(telefone);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								telefone.maisUm();
								telefone.calculoGasto();
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								telefone.menosUm();
								telefone.calculoGasto();
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								telefone.calcularHora();
								telefone.calculoGasto();
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								telefone.definirVoltagem();
								telefone.calculoGasto();
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								telefone.maisUm();
								telefone.calculoGasto();
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								telefone.menosUm();
								telefone.calculoGasto();
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								telefone.calcularHora();
								telefone.calculoGasto();
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								telefone.definirVoltagem();
								telefone.calculoGasto();
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					sala.Utensilios.add(telefone);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 7) {
					ProdEletSimples ventilador = null;
					String opc = null;
					if (ventilador == null) {
						ventilador =  new ProdEletSimples();
						ventilador.inicializacaoDiferente();
						ventilador.calculoGasto();
						ventilador.mostrarObj(ventilador);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								ventilador.maisUm();
								ventilador.calculoGasto();
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								ventilador.menosUm();
								ventilador.calculoGasto();
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								ventilador.calcularHora();
								ventilador.calculoGasto();
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								ventilador.definirVoltagem();
								ventilador.calculoGasto();
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								ventilador.maisUm();
								ventilador.calculoGasto();
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								ventilador.menosUm();
								ventilador.calculoGasto();
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								ventilador.calcularHora();
								ventilador.calculoGasto();
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								ventilador.definirVoltagem();
								ventilador.calculoGasto();
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					sala.Utensilios.add(ventilador);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 8) {
					ProdEletSimples tv = null;
					String opc = null;
					if (tv == null) {
						tv =  new ProdEletSimples();
						tv.inicializacaoDiferente();
						tv.calculoGasto();
						tv.mostrarObj(tv);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								tv.maisUm();
								tv.calculoGasto();
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								tv.menosUm();
								tv.calculoGasto();
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								tv.calcularHora();
								tv.calculoGasto();
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								tv.definirVoltagem();
								tv.calculoGasto();
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								tv.maisUm();
								tv.calculoGasto();
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								tv.menosUm();
								tv.calculoGasto();
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								tv.calcularHora();
								tv.calculoGasto();
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								tv.definirVoltagem();
								tv.calculoGasto();
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					sala.Utensilios.add(tv);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				}while (opcomodos.equalsIgnoreCase("Sim")|| opcomodos.equalsIgnoreCase("s"));
				
				residencia1.comodos.add(sala);
			}
			if (menu2 == 3) {
				Comodo quarto = new Comodo();
				do {
				int menu3 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextQuarto()));
				if (menu3 == 1) {
					//Lampada
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 2) {
					ProdEletSimples carregador = null;
					String opc = null;
					if (carregador == null) {
						carregador =  new ProdEletSimples();
						carregador.inicializacaoDiferente();
						carregador.calculoGasto();
						carregador.mostrarObj(carregador);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								carregador.maisUm();
								carregador.calculoGasto();
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								carregador.menosUm();
								carregador.calculoGasto();
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								carregador.calcularHora();
								carregador.calculoGasto();
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								carregador.definirVoltagem();
								carregador.calculoGasto();
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								carregador.maisUm();
								carregador.calculoGasto();
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								carregador.menosUm();
								carregador.calculoGasto();
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								carregador.calcularHora();
								carregador.calculoGasto();
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								carregador.definirVoltagem();
								carregador.calculoGasto();
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								carregador.mostrarObj(carregador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					quarto.Utensilios.add(carregador);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				
				if (menu3 == 3) {
					ProdEletSimples dvd = null;
					String opc = null;
					if (dvd == null) {
						dvd =  new ProdEletSimples();
						dvd.inicializacaoDiferente();
						dvd.calculoGasto();
						dvd.mostrarObj(dvd);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								dvd.maisUm();
								dvd.calculoGasto();
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								dvd.menosUm();
								dvd.calculoGasto();
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								dvd.calcularHora();
								dvd.calculoGasto();
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								dvd.definirVoltagem();
								dvd.calculoGasto();
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								dvd.maisUm();
								dvd.calculoGasto();
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								dvd.menosUm();
								dvd.calculoGasto();
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								dvd.calcularHora();
								dvd.calculoGasto();
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								dvd.definirVoltagem();
								dvd.calculoGasto();
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								dvd.mostrarObj(dvd);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					quarto.Utensilios.add(dvd);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 4) {
					ProdEletSimples roteador = null;
					String opc = null;
					if (roteador == null) {
						roteador =  new ProdEletSimples();
						roteador.inicializacaoDiferente();
						roteador.calculoGasto();
						roteador.mostrarObj(roteador);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								roteador.maisUm();
								roteador.calculoGasto();
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								roteador.menosUm();
								roteador.calculoGasto();
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								roteador.calcularHora();
								roteador.calculoGasto();
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								roteador.definirVoltagem();
								roteador.calculoGasto();
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								roteador.maisUm();
								roteador.calculoGasto();
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								roteador.menosUm();
								roteador.calculoGasto();
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								roteador.calcularHora();
								roteador.calculoGasto();
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								roteador.definirVoltagem();
								roteador.calculoGasto();
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								roteador.mostrarObj(roteador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					quarto.Utensilios.add(roteador);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());

				}
				if (menu3 == 5) {
					ProdEletSimples radio = null;
					String opc = null;
					if (radio == null) {
						radio =  new ProdEletSimples();
						radio.inicializacaoDiferente();
						radio.calculoGasto();
						radio.mostrarObj(radio);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								radio.maisUm();
								radio.calculoGasto();
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								radio.menosUm();
								radio.calculoGasto();
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								radio.calcularHora();
								radio.calculoGasto();
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								radio.definirVoltagem();
								radio.calculoGasto();
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								radio.maisUm();
								radio.calculoGasto();
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								radio.menosUm();
								radio.calculoGasto();
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								radio.calcularHora();
								radio.calculoGasto();
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								radio.definirVoltagem();
								radio.calculoGasto();
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								radio.mostrarObj(radio);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					quarto.Utensilios.add(radio);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 6) {
					ProdEletSimples telefone = null;
					String opc = null;
					if (telefone == null) {
						telefone =  new ProdEletSimples();
						telefone.inicializacaoDiferente();
						telefone.calculoGasto();
						telefone.mostrarObj(telefone);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								telefone.maisUm();
								telefone.calculoGasto();
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								telefone.menosUm();
								telefone.calculoGasto();
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								telefone.calcularHora();
								telefone.calculoGasto();
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								telefone.definirVoltagem();
								telefone.calculoGasto();
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								telefone.maisUm();
								telefone.calculoGasto();
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								telefone.menosUm();
								telefone.calculoGasto();
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								telefone.calcularHora();
								telefone.calculoGasto();
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								telefone.definirVoltagem();
								telefone.calculoGasto();
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								telefone.mostrarObj(telefone);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					quarto.Utensilios.add(telefone);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 7) {
					ProdEletSimples ventilador = null;
					String opc = null;
					if (ventilador == null) {
						ventilador =  new ProdEletSimples();
						ventilador.inicializacaoDiferente();
						ventilador.calculoGasto();
						ventilador.mostrarObj(ventilador);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								ventilador.maisUm();
								ventilador.calculoGasto();
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								ventilador.menosUm();
								ventilador.calculoGasto();
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								ventilador.calcularHora();
								ventilador.calculoGasto();
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								ventilador.definirVoltagem();
								ventilador.calculoGasto();
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								ventilador.maisUm();
								ventilador.calculoGasto();
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								ventilador.menosUm();
								ventilador.calculoGasto();
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								ventilador.calcularHora();
								ventilador.calculoGasto();
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								ventilador.definirVoltagem();
								ventilador.calculoGasto();
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								ventilador.mostrarObj(ventilador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					quarto.Utensilios.add(ventilador);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 8) {
					ProdEletSimples tv = null;
					String opc = null;
					if (tv == null) {
						tv =  new ProdEletSimples();
						tv.inicializacaoDiferente();
						tv.calculoGasto();
						tv.mostrarObj(tv);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								tv.maisUm();
								tv.calculoGasto();
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								tv.menosUm();
								tv.calculoGasto();
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								tv.calcularHora();
								tv.calculoGasto();
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								tv.definirVoltagem();
								tv.calculoGasto();
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								tv.maisUm();
								tv.calculoGasto();
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								tv.menosUm();
								tv.calculoGasto();
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								tv.calcularHora();
								tv.calculoGasto();
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								tv.definirVoltagem();
								tv.calculoGasto();
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								tv.mostrarObj(tv);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					quarto.Utensilios.add(tv);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				}while (opcomodos.equalsIgnoreCase("Sim")|| opcomodos.equalsIgnoreCase("s"));
				
				residencia1.comodos.add(quarto);
			}
			
			
			
			//BANHEIRO
			
			
			if (menu2 == 4) {
				Comodo banheiro = new Comodo();
				do {
				int menu3 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextBanheiro()));
				if (menu3 == 1) {
					//Lampada
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 2) {
					ProdEletSimples maquinaBarbea = null;
					String opc = null;
					if (maquinaBarbea == null) {
						maquinaBarbea =  new ProdEletSimples();
						maquinaBarbea.inicializacaoDiferente();
						maquinaBarbea.calculoGasto();
						maquinaBarbea.mostrarObj(maquinaBarbea);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								maquinaBarbea.maisUm();
								maquinaBarbea.calculoGasto();
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								maquinaBarbea.menosUm();
								maquinaBarbea.calculoGasto();
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								maquinaBarbea.calcularHora();
								maquinaBarbea.calculoGasto();
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								maquinaBarbea.definirVoltagem();
								maquinaBarbea.calculoGasto();
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								maquinaBarbea.maisUm();
								maquinaBarbea.calculoGasto();
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								maquinaBarbea.menosUm();
								maquinaBarbea.calculoGasto();
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								maquinaBarbea.calcularHora();
								maquinaBarbea.calculoGasto();
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								maquinaBarbea.definirVoltagem();
								maquinaBarbea.calculoGasto();
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					banheiro.Utensilios.add(maquinaBarbea);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				
				if (menu3 == 3) {
					ProdEletSimples secador = null;
					String opc = null;
					if (secador == null) {
						secador =  new ProdEletSimples();
						secador.inicializacaoDiferente();
						secador.calculoGasto();
						secador.mostrarObj(secador);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								secador.maisUm();
								secador.calculoGasto();
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								secador.menosUm();
								secador.calculoGasto();
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								secador.calcularHora();
								secador.calculoGasto();
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								secador.definirVoltagem();
								secador.calculoGasto();
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								secador.maisUm();
								secador.calculoGasto();
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								secador.menosUm();
								secador.calculoGasto();
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								secador.calcularHora();
								secador.calculoGasto();
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								secador.definirVoltagem();
								secador.calculoGasto();
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					banheiro.Utensilios.add(secador);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 4) {
					ProdEletSimples torneira = null;
					String opc = null;
					if (torneira == null) {
						torneira =  new ProdEletSimples();
						torneira.inicializacaoDiferente();
						torneira.calculoGasto();
						torneira.mostrarObj(torneira);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								torneira.maisUm();
								torneira.calculoGasto();
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								torneira.menosUm();
								torneira.calculoGasto();
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								torneira.calcularHora();
								torneira.calculoGasto();
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								torneira.definirVoltagem();
								torneira.calculoGasto();
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								torneira.maisUm();
								torneira.calculoGasto();
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								torneira.menosUm();
								torneira.calculoGasto();
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								torneira.calcularHora();
								torneira.calculoGasto();
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								torneira.definirVoltagem();
								torneira.calculoGasto();
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					banheiro.Utensilios.add(torneira);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());

				}
				if (menu3 == 5) {
					ProdEletSimples chuveiro = null;
					String opc = null;
					if (chuveiro == null) {
						chuveiro =  new ProdEletSimples();
						chuveiro.inicializacaoDiferente();
						chuveiro.calculoGasto();
						chuveiro.mostrarObj(chuveiro);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								chuveiro.maisUm();
								chuveiro.calculoGasto();
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								chuveiro.menosUm();
								chuveiro.calculoGasto();
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								chuveiro.calcularHora();
								chuveiro.calculoGasto();
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								chuveiro.definirVoltagem();
								chuveiro.calculoGasto();
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								chuveiro.maisUm();
								chuveiro.calculoGasto();
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								chuveiro.menosUm();
								chuveiro.calculoGasto();
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								chuveiro.calcularHora();
								chuveiro.calculoGasto();
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								chuveiro.definirVoltagem();
								chuveiro.calculoGasto();
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					banheiro.Utensilios.add(chuveiro);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 6) {
					ProdEletSimples chapinha = null;
					String opc = null;
					if (chapinha == null) {
						chapinha =  new ProdEletSimples();
						chapinha.inicializacaoDiferente();
						chapinha.calculoGasto();
						chapinha.mostrarObj(chapinha);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								chapinha.maisUm();
								chapinha.calculoGasto();
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								chapinha.menosUm();
								chapinha.calculoGasto();
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								chapinha.calcularHora();
								chapinha.calculoGasto();
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								chapinha.definirVoltagem();
								chapinha.calculoGasto();
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								chapinha.maisUm();
								chapinha.calculoGasto();
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								chapinha.menosUm();
								chapinha.calculoGasto();
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								chapinha.calcularHora();
								chapinha.calculoGasto();
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								chapinha.definirVoltagem();
								chapinha.calculoGasto();
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					banheiro.Utensilios.add(chapinha);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 7) {
					ProdEletSimples babyLiss = null;
					String opc = null;
					if (babyLiss == null) {
						babyLiss =  new ProdEletSimples();
						babyLiss.inicializacaoDiferente();
						babyLiss.calculoGasto();
						babyLiss.mostrarObj(babyLiss);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								babyLiss.maisUm();
								babyLiss.calculoGasto();
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								babyLiss.menosUm();
								babyLiss.calculoGasto();
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								babyLiss.calcularHora();
								babyLiss.calculoGasto();
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								babyLiss.definirVoltagem();
								babyLiss.calculoGasto();
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								babyLiss.maisUm();
								babyLiss.calculoGasto();
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								babyLiss.menosUm();
								babyLiss.calculoGasto();
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								babyLiss.calcularHora();
								babyLiss.calculoGasto();
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								babyLiss.definirVoltagem();
								babyLiss.calculoGasto();
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					banheiro.Utensilios.add(babyLiss);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				}while (opcomodos.equalsIgnoreCase("Sim")|| opcomodos.equalsIgnoreCase("s"));
				residencia1.comodos.add(banheiro);
			}
				
			if (menu2 == 5) {
				Comodo quintal = new Comodo();
				do {
				int menu3 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextQuintal()));
				if (menu3 == 1) {
					//Lampada
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 2) {
					ProdEletSimples maquinaBarbea = null;
					String opc = null;
					if (maquinaBarbea == null) {
						maquinaBarbea =  new ProdEletSimples();
						maquinaBarbea.inicializacaoDiferente();
						maquinaBarbea.calculoGasto();
						maquinaBarbea.mostrarObj(maquinaBarbea);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								maquinaBarbea.maisUm();
								maquinaBarbea.calculoGasto();
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								maquinaBarbea.menosUm();
								maquinaBarbea.calculoGasto();
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								maquinaBarbea.calcularHora();
								maquinaBarbea.calculoGasto();
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								maquinaBarbea.definirVoltagem();
								maquinaBarbea.calculoGasto();
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								maquinaBarbea.maisUm();
								maquinaBarbea.calculoGasto();
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								maquinaBarbea.menosUm();
								maquinaBarbea.calculoGasto();
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								maquinaBarbea.calcularHora();
								maquinaBarbea.calculoGasto();
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								maquinaBarbea.definirVoltagem();
								maquinaBarbea.calculoGasto();
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								maquinaBarbea.mostrarObj(maquinaBarbea);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					quintal.Utensilios.add(maquinaBarbea);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				
				if (menu3 == 3) {
					ProdEletSimples secador = null;
					String opc = null;
					if (secador == null) {
						secador =  new ProdEletSimples();
						secador.inicializacaoDiferente();
						secador.calculoGasto();
						secador.mostrarObj(secador);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								secador.maisUm();
								secador.calculoGasto();
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								secador.menosUm();
								secador.calculoGasto();
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								secador.calcularHora();
								secador.calculoGasto();
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								secador.definirVoltagem();
								secador.calculoGasto();
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								secador.maisUm();
								secador.calculoGasto();
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								secador.menosUm();
								secador.calculoGasto();
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								secador.calcularHora();
								secador.calculoGasto();
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								secador.definirVoltagem();
								secador.calculoGasto();
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								secador.mostrarObj(secador);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					quintal.Utensilios.add(secador);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 4) {
					ProdEletSimples torneira = null;
					String opc = null;
					if (torneira == null) {
						torneira =  new ProdEletSimples();
						torneira.inicializacaoDiferente();
						torneira.calculoGasto();
						torneira.mostrarObj(torneira);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								torneira.maisUm();
								torneira.calculoGasto();
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								torneira.menosUm();
								torneira.calculoGasto();
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								torneira.calcularHora();
								torneira.calculoGasto();
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								torneira.definirVoltagem();
								torneira.calculoGasto();
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								torneira.maisUm();
								torneira.calculoGasto();
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								torneira.menosUm();
								torneira.calculoGasto();
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								torneira.calcularHora();
								torneira.calculoGasto();
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								torneira.definirVoltagem();
								torneira.calculoGasto();
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								torneira.mostrarObj(torneira);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					quintal.Utensilios.add(torneira);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());

				}
				if (menu3 == 5) {
					ProdEletSimples chuveiro = null;
					String opc = null;
					if (chuveiro == null) {
						chuveiro =  new ProdEletSimples();
						chuveiro.inicializacaoDiferente();
						chuveiro.calculoGasto();
						chuveiro.mostrarObj(chuveiro);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								chuveiro.maisUm();
								chuveiro.calculoGasto();
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								chuveiro.menosUm();
								chuveiro.calculoGasto();
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								chuveiro.calcularHora();
								chuveiro.calculoGasto();
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								chuveiro.definirVoltagem();
								chuveiro.calculoGasto();
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								chuveiro.maisUm();
								chuveiro.calculoGasto();
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								chuveiro.menosUm();
								chuveiro.calculoGasto();
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								chuveiro.calcularHora();
								chuveiro.calculoGasto();
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								chuveiro.definirVoltagem();
								chuveiro.calculoGasto();
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								chuveiro.mostrarObj(chuveiro);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					quintal.Utensilios.add(chuveiro);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 6) {
					ProdEletSimples chapinha = null;
					String opc = null;
					if (chapinha == null) {
						chapinha =  new ProdEletSimples();
						chapinha.inicializacaoDiferente();
						chapinha.calculoGasto();
						chapinha.mostrarObj(chapinha);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								chapinha.maisUm();
								chapinha.calculoGasto();
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								chapinha.menosUm();
								chapinha.calculoGasto();
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								chapinha.calcularHora();
								chapinha.calculoGasto();
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								chapinha.definirVoltagem();
								chapinha.calculoGasto();
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								chapinha.maisUm();
								chapinha.calculoGasto();
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								chapinha.menosUm();
								chapinha.calculoGasto();
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								chapinha.calcularHora();
								chapinha.calculoGasto();
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								chapinha.definirVoltagem();
								chapinha.calculoGasto();
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								chapinha.mostrarObj(chapinha);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					quintal.Utensilios.add(chapinha);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				if (menu3 == 7) {
					ProdEletSimples babyLiss = null;
					String opc = null;
					if (babyLiss == null) {
						babyLiss =  new ProdEletSimples();
						babyLiss.inicializacaoDiferente();
						babyLiss.calculoGasto();
						babyLiss.mostrarObj(babyLiss);
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								babyLiss.maisUm();
								babyLiss.calculoGasto();
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								babyLiss.menosUm();
								babyLiss.calculoGasto();
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								babyLiss.calcularHora();
								babyLiss.calculoGasto();
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								babyLiss.definirVoltagem();
								babyLiss.calculoGasto();
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
						}
					}
					else {
						
						opc = JOptionPane.showInputDialog(tx.getTextOpc());
						while(opc.equalsIgnoreCase("Sim")|| opc.equalsIgnoreCase("s")) {
							int menu4 = Integer.parseInt(JOptionPane.showInputDialog(tx.getTextMenuUtensiVol()));
							if (menu4 == 1) {
								babyLiss.maisUm();
								babyLiss.calculoGasto();
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 2) {
								babyLiss.menosUm();
								babyLiss.calculoGasto();
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 3) {
								babyLiss.calcularHora();
								babyLiss.calculoGasto();
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 4) {
								babyLiss.definirVoltagem();
								babyLiss.calculoGasto();
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							if (menu4 == 5) {
								babyLiss.mostrarObj(babyLiss);
								opc = JOptionPane.showInputDialog(tx.getTextOpc());
							}
							
						}
					}
					quintal.Utensilios.add(babyLiss);
					opcomodos = JOptionPane.showInputDialog(tx.getTextOpcComodo());
				}
				}while (opcomodos.equalsIgnoreCase("Sim")|| opcomodos.equalsIgnoreCase("s"));
				residencia1.comodos.add(quintal);
			}
		
			
		}else {
			
			
			int menu2 =Integer.parseInt(JOptionPane.showInputDialog(tx.getTextapt()));
			if (menu2 == 1) {
				Comodo cozinha = new Comodo();
				residencia1.comodos.add(cozinha);
			}
			if (menu2 == 2) {
				Comodo sala = new Comodo();
				residencia1.comodos.add(sala);
			}
			if (menu2 == 3) {
				Comodo banheiro = new Comodo();
				residencia1.comodos.add(banheiro);
			}
			if (menu2 == 4) {
				Comodo banheiro = new Comodo();
				residencia1.comodos.add(banheiro);
			}
			if (menu2 == 5) {
				Comodo areaServico = new Comodo();
				residencia1.comodos.add(areaServico);
			}
			
			
		}
		
		
	}

}
