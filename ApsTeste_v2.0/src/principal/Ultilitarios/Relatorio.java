package principal.Ultilitarios;

import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import principal.Residencia.Comodo;
import principal.Residencia.ProdEletSimples;

public class Relatorio {	
		
		public void relatorioComodo(ArrayList<ProdEletSimples> prod) {
			StringBuilder rel = new StringBuilder();
			
			for (int i = 0; i < prod.size(); i++)
	        {
	        	
	            rel.insert(i, prod.get(i).relatorio());
	        }
			opcPrint(prod, rel);	        
		}

		public void relatorioResidencia(ArrayList<ProdEletSimples> prod, ArrayList<Comodo> comodos, ArrayList<Integer> somobj) {
			StringBuilder rel = new StringBuilder();
			String[] relRes =  new String[comodos.size()];
			
			for (int i = 0; i< comodos.size(); i++) {
				for (int j = 0; j < prod.size(); j++){ 	
					
		            rel.insert(j, prod.get(j).relatorio());
		        }
				relRes[i] = rel.toString();
			}
			String op = JOptionPane.showInputDialog("Deseja baixar o relatorio ou apenas consultar? (baixar ou exibir)");
			if(op.equalsIgnoreCase("Baixar")) {
				PrintWriter pw = null;
				try {
					pw = new PrintWriter(new FileOutputStream("relatorio.txt"));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				pw.write(relRes.toString());
				pw.flush();
				pw.close();
			}else {
				for (int i = 0; i < prod.size(); i++) {
					JOptionPane.showMessageDialog(null, relRes);
				}
			}
		}

		public void opcPrint(ArrayList<ProdEletSimples> prod, StringBuilder rel) throws HeadlessException {
			String op = JOptionPane.showInputDialog("Deseja baixar o relatorio ou apenas consultar? (baixar ou exibir)");
			if(op.equalsIgnoreCase("Baixar")) {
				PrintWriter pw = null;
				try {
					pw = new PrintWriter(new FileOutputStream("relatorio.txt"));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				pw.write(rel.toString());
				pw.flush();
				pw.close();
			}else {
				for (int i = 0; i < prod.size(); i++) {
					
					JOptionPane.showMessageDialog(null, rel);
				}
			}
		}
}
