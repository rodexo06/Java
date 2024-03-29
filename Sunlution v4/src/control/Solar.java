package control;

import model.Residencia;
import view.FrameHome;

public class Solar {
	double potenciaIns, areaMini, qtdPaineis, tipoPainel, precoMedio;
	final short pesoMedio = 16;	// kg/metroquardado
	short prodAnual;
	
	public void testeSolar(double somaCons) {
		if(somaCons <= 65) {
			setPotenciaIns(0.66); //kWp
			setAreaMini(5.28); //m quadrados
			setQtdPaineis(2);
			setTipoPainel(330); //Watts
			setProdAnual((short)780); //kWh/ano
			setPrecoMedio(6816.27); //tAOKEYS
		}if(somaCons <= 108 && somaCons > 65) {
			setPotenciaIns(1.08); //kWp
			setAreaMini(8.64); //m quadrados
			setQtdPaineis(4);
			setTipoPainel(270); //Watts
			setProdAnual((short)1296); //kWh/ano
			setPrecoMedio(9646.52); //tAOKEYS
		}if(somaCons <= 130 && somaCons > 108 ) {
			setPotenciaIns(1.30); //kWp
			setAreaMini(10.40); //m quadrados
			setQtdPaineis(4);
			setTipoPainel(325); //Watts
			setProdAnual((short)1560); //kWh/ano
			setPrecoMedio(11777.70); //tAOKEYS
		}if(somaCons <= 132 && somaCons > 130 ) { //
			setPotenciaIns(1.32); //kWp 	//
			setAreaMini(10.56); //m quadrados			//
			setQtdPaineis(4);				//
			setTipoPainel(330); //Watts		//
			setProdAnual((short)1584); //kWh/ano		//
			setPrecoMedio(9350); //tAOKEYS		///
		}if(somaCons <= 198 && somaCons > 132 ) {
			setPotenciaIns(1.98); //kWp
			setAreaMini(15.84); //m quadrados
			setQtdPaineis(6);
			setTipoPainel(330); // Watts
			setProdAnual((short)2376); // kWh/ano
			setPrecoMedio(14486.89); // tAOKEYS
		}if(somaCons <= 265 && somaCons > 198 ) {
			setPotenciaIns(2.64); //kWp
			setAreaMini(21.12); //m quadrados
			setQtdPaineis(8);
			setTipoPainel(330); // Watts
			setProdAnual((short)3180); // kWh/ano
			setPrecoMedio(15110.00); // tAOKEYS
		}if(somaCons <= 326 && somaCons > 265 ) {
			setPotenciaIns(3.25); //kWp
			setAreaMini(26.00); //m quadrados
			setQtdPaineis(10);
			setTipoPainel(325); // Watts
			setProdAnual((short)3912); // kWh/ano
			setPrecoMedio(20039.80); // tAOKEYS			
		}if(somaCons <= 392 && somaCons > 326 ) {
			setPotenciaIns(3.92); //kWp
			setAreaMini(31.); //m quadrados
			setQtdPaineis(12);
			setTipoPainel(325); // Watts
			setProdAnual((short)4704); // kWh/ano
			setPrecoMedio(22615.23); // tAOKEYS	
		}if(somaCons <= 464 && somaCons > 392 ) {
			setPotenciaIns(4.62); //kWp
			setAreaMini(36.96); //m quadrados
			setQtdPaineis(14);
			setTipoPainel(330); // Watts
			setProdAnual((short)5568); // kWh/ano
			setPrecoMedio(23715.00); // tAOKEYS			
		}if(somaCons <= 531 && somaCons > 464 ) {
			setPotenciaIns(5.28); //kWp
			setAreaMini(42.24); //m quadrados
			setQtdPaineis(16);
			setTipoPainel(330); // Watts 
			setProdAnual((short)6372); // kWh/ano
			setPrecoMedio(28200.00); // tAOKEYS			
		}if(somaCons <= 597 && somaCons > 531 ) {
			setPotenciaIns(5.94); //kWp
			setAreaMini(47.52); //m quadrados
			setQtdPaineis(18);
			setTipoPainel(330); // Watts
			setProdAnual((short)7164); // kWh/ano
			setPrecoMedio(20039.80); // tAOKEYS
		}if(somaCons <= 664 && somaCons > 597 ) {
			setPotenciaIns(3.25); //kWp
			setAreaMini(26.00); //m quadrados
			setQtdPaineis(10);
			setTipoPainel(325); // Watts
			setProdAnual((short)3912); // kWh/ano
			setPrecoMedio(28750.00); // tAOKEYS
		}if(somaCons > 597) {
			System.out.print("Progarama n aceita"); //  falar carlinhos
		}	
	}

	public void relatorioConsumo(Residencia r) {
		
		//FrameHome.relsolar.append();
		}
	
	
	
	@Override
	public String toString() {
		return "Solar" + "\n" + "Potencia Instalada= " + potenciaIns + "\n " + "Area Minima= " + areaMini + "\n " 
				+ "Quantidade de Paineis= " + qtdPaineis + "\n " + "Tipo Painel=" + tipoPainel + "\n " 
				+ "Pre�o M�dio= " + precoMedio + "\n " + "Peso M�dio= " + pesoMedio	+ "\n " + "Produ��o Anual= " 
				+ prodAnual;
	}

	public double getPotenciaIns() {
		return potenciaIns;
	}

	public void setPotenciaIns(double potenciaIns) {
		this.potenciaIns = potenciaIns;
	}

	public double getAreaMini() {
		return areaMini;
	}

	public void setAreaMini(double areaMini) {
		this.areaMini = areaMini;
	}

	public double getQtdPaineis() {
		return qtdPaineis;
	}

	public short getPesoMedio() {
		return pesoMedio;
	}

	public void setQtdPaineis(double qtdPaineis) {
		this.qtdPaineis = qtdPaineis;
	}

	public double getTipoPainel() {
		return tipoPainel;
	}

	public void setTipoPainel(double tipoPainel) {
		this.tipoPainel = tipoPainel;
	}

	public double getPrecoMedio() {
		return precoMedio;
	}

	public void setPrecoMedio(double precoMedio) {
		this.precoMedio = precoMedio;
	}

	public short getProdAnual() {
		return prodAnual;
	}

	public void setProdAnual(short prodAnual) {
		this.prodAnual = prodAnual;
	}
	

}
	
	
	
	