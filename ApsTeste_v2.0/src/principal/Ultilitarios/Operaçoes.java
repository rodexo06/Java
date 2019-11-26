package principal.Ultilitarios;

import java.util.ArrayList;

import principal.Residencia.Comodo;
import principal.Residencia.ProdEletSimples;

public class Operaçoes {
	
	public void getConsumoComodo(ArrayList<ProdEletSimples> prod, ArrayList<Integer> somobj, Comodo com)
    {
        double somaConsumoProdComodo = 0;
        for (int i = 0; i < prod.size(); i++)
        {
            somaConsumoProdComodo += prod.get(i).consumoobj;
        }
        
        somobj.add((int) somaConsumoProdComodo);
    }
	
	public double getConsumoRes(ArrayList<Comodo> comodos, ArrayList<Integer> somobj ) {
		double somaConsumoComodo = 0;
		for (int i = 0; i < comodos.size(); i++)
        {
        	
            somaConsumoComodo += somobj.get(i);
        }
		return somaConsumoComodo;
	}
	
	public void definirTipoPainel(ArrayList<Comodo> comodos, ArrayList<Integer> somobj ) {
		if(getConsumoRes(comodos, somobj) > 120){
			
		}
	}
	

}
