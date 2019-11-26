package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import control.Calculos;
import enums.TipoCom;
import enums.TipoUtArea;
import enums.TipoUtBanheiro;
import enums.TipoUtCozinha;
import enums.TipoUtQuarto;
import enums.TipoUtSala;
import model.Comodos;
import model.Residencia;
import model.Utensilio;

public class FrameUtensilios extends JFrame {
	
	private JPanel contentPane;
	ArrayList<Enum> tipoUt = new ArrayList<Enum>();
	ArrayList<JSpinner> quantidade = new ArrayList<JSpinner>();
	ArrayList<JComboBox> voltagem = new ArrayList<JComboBox>();
	ArrayList<JSpinner> hora = new ArrayList<JSpinner>();	

	int qntUt = 0;
	
	
	/**
	 * Create the frame.
	 */
	public FrameUtensilios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;
		setBounds(width/2, height/2, 493, 237);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblComodoIcon = new JLabel("");
		/*Image imgIconQuarto = new ImageIcon(this.getClass().getResource("/icon_house.png")).getImage();
		lblComodoIcon.setIcon(new ImageIcon(imgIconQuarto));*/
		lblComodoIcon.setBounds(6, 6, 55, 41);
		contentPane.add(lblComodoIcon);
				
		// LAMPADA
		JLabel lblLampada = new JLabel("Lampada");
		lblLampada.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblLampada.setBounds(6, 74, 173, 23);
		contentPane.add(lblLampada);
		
		JSpinner spnQntLampada = new JSpinner();
		spnQntLampada.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spnQntLampada.setBounds(212, 71, 80, 28);
		contentPane.add(spnQntLampada);
		
		JComboBox cbVtgLampada = new JComboBox();
		cbVtgLampada.setModel(new DefaultComboBoxModel(new String[] {"110", "220"}));
		cbVtgLampada.setBounds(304, 72, 68, 26);
		contentPane.add(cbVtgLampada);
		
		JComboBox cmTpLampada = new JComboBox();
		cmTpLampada.setModel(new DefaultComboBoxModel(new String[] {"Incandescente", "LED", "Fluorescente "}));
		cmTpLampada.setBounds(99, 72, 101, 26);
		contentPane.add(cmTpLampada);
		
		JSpinner spHrLampada = new JSpinner();
		spHrLampada.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spHrLampada.setBounds(384, 71, 87, 28);
		contentPane.add(spHrLampada);
		
		// LABELS COLUNAS
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblTipo.setBounds(99, 51, 80, 18);
		contentPane.add(lblTipo);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblQuantidade.setBounds(212, 51, 80, 18);
		contentPane.add(lblQuantidade);
		
		JLabel lblVoltagem = new JLabel("Voltagem");
		lblVoltagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblVoltagem.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblVoltagem.setBounds(304, 51, 68, 18);
		contentPane.add(lblVoltagem);
		
		JLabel lblHorasDeUso = new JLabel("Horas de Uso");
		lblHorasDeUso.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorasDeUso.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblHorasDeUso.setBounds(384, 51, 87, 18);
		contentPane.add(lblHorasDeUso);	
		
	}
	
	// COMPONENTES DINÃ‚MICOS
	public void dinamico(Comodos c) {
				
		// LABEL CONTA PÃ�GINA E CABEÃ‡ALHO
		JLabel lblComodo = new JLabel(c.getTpCom().getValor());
		lblComodo.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblComodo.setBounds(44, 6, 250, 41);
		contentPane.add(lblComodo);
		 
		JLabel lblPagina = new JLabel((FrameHome.contador+1) + "/" + FrameHome.listaComodos.size());
		lblPagina.setHorizontalAlignment(SwingConstants.CENTER);
		lblPagina.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblPagina.setBounds(422, 17, 41, 23);
		contentPane.add(lblPagina);	
		
		// Para variar a posiÃ§Ã£o de cada Utensilio
		int y = 0;
		
		//Conta quantidade de utensilios				
		if(c.getTpCom()==TipoCom.QUARTO) {
			qntUt = TipoUtQuarto.values().length;
			
		}else if(c.getTpCom()==TipoCom.BANHEIRO) {
			qntUt =  TipoUtBanheiro.values().length;
			
		}else if(c.getTpCom()==TipoCom.COZINHA) {
			qntUt =    TipoUtCozinha.values().length;
			
		}else if(c.getTpCom()==TipoCom.SALA) {
			qntUt =    TipoUtSala.values().length;
			
		}else if(c.getTpCom()==TipoCom.AREA_SERV) {
			qntUt =    TipoUtArea.values().length;
		};

		
		// Gerando componentes  de acordo com a  quantidade de enums
		for(int i=0;i<qntUt;i++) {
			
			if(c.getTpCom()==TipoCom.QUARTO) {
				TipoUtQuarto[] quarto =  TipoUtQuarto.values();
				JLabel lblUtensilio = new JLabel(quarto[i].getValor());
				lblUtensilio.setFont(new Font("SansSerif", Font.PLAIN, 18));
				lblUtensilio.setBounds(6, 112+y, 150, 23);
				contentPane.add(lblUtensilio);
				tipoUt.add(quarto[i]);
			}else if(c.getTpCom()==TipoCom.BANHEIRO) {
				TipoUtBanheiro[] banheiro =  TipoUtBanheiro.values();
				JLabel lblUtensilio = new JLabel(banheiro[i].getValor());
				lblUtensilio.setFont(new Font("SansSerif", Font.PLAIN, 18));
				lblUtensilio.setBounds(6, 112+y, 150, 23);
				contentPane.add(lblUtensilio);
				tipoUt.add(banheiro[i]);
			}else if(c.getTpCom()==TipoCom.COZINHA) {
				TipoUtCozinha[] cozinha =  TipoUtCozinha.values();
				JLabel lblUtensilio = new JLabel(cozinha[i].getValor());
				lblUtensilio.setFont(new Font("SansSerif", Font.PLAIN, 18));
				lblUtensilio.setBounds(6, 112+y, 150, 23);
				contentPane.add(lblUtensilio);
				tipoUt.add(cozinha[i]);
			}else if(c.getTpCom()==TipoCom.SALA) {
				TipoUtSala[] sala =  TipoUtSala.values();
				JLabel lblUtensilio = new JLabel(sala[i].getValor());
				lblUtensilio.setFont(new Font("SansSerif", Font.PLAIN, 18));
				lblUtensilio.setBounds(6, 112+y, 150, 23);
				contentPane.add(lblUtensilio);
				tipoUt.add(sala[i]);
			}else if(c.getTpCom()==TipoCom.AREA_SERV) {
				TipoUtArea[] area =  TipoUtArea.values();
				JLabel lblUtensilio = new JLabel(area[i].getValor());
				lblUtensilio.setFont(new Font("SansSerif", Font.PLAIN, 18));
				lblUtensilio.setBounds(6, 112+y, 150, 23);
				contentPane.add(lblUtensilio);
				tipoUt.add(area[i]);
			};
			
			
			JSpinner spnQntUt = new JSpinner();
			spnQntUt.setBounds(212, 109+y, 80, 28);
			spnQntUt.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			contentPane.add(spnQntUt);
			quantidade.add(spnQntUt);
			
			JComboBox cbVtgUt = new JComboBox();
			cbVtgUt.setModel(new DefaultComboBoxModel(new String[] {"110", "220"}));
			cbVtgUt.setBounds(304, 110+y, 68, 26);
			contentPane.add(cbVtgUt);
			voltagem.add(cbVtgUt);
					
			JSpinner spnHrUt = new JSpinner();
			spnHrUt.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spnHrUt.setBounds(384, 109+y, 87, 28);
			contentPane.add(spnHrUt);
			hora.add(spnHrUt);
				
			y += 38;
					
		}
		
		
		// Tamanho dinÃ¢mico
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;
		setBounds(width/2, height/2, 493, 197+y);
		setLocationRelativeTo(null);
						
		JButton btnProximo = new JButton("Proximo");
		btnProximo.setBounds(344, 108+y, 127, 41);
		/*Image imgNext = new ImageIcon(this.getClass().getResource("/icon_next.png")).getImage();
		btnProximo.setIcon(new ImageIcon(imgNext));*/
		contentPane.add(btnProximo);
		
		btnProximo.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				for(int i=0;i<qntUt;i++) {
					
					Utensilio utFinal = new Utensilio();
					
					if(c.getTpCom()==TipoCom.QUARTO) {
						utFinal.setTipo(TipoUtQuarto.values()[i]);
						FrameHome.calc.aplicaconsumo(FrameHome.residencia); //
						
					}else if(c.getTpCom()==TipoCom.BANHEIRO) {
						utFinal.setTipo(TipoUtBanheiro.values()[i]);
						FrameHome.calc.aplicaconsumo(FrameHome.residencia); //
						
					}else if(c.getTpCom()==TipoCom.COZINHA) {
						utFinal.setTipo(TipoUtCozinha.values()[i]);
						FrameHome.calc.aplicaconsumo(FrameHome.residencia); //
						 
					}else if(c.getTpCom()==TipoCom.SALA) {
						utFinal.setTipo(TipoUtSala.values()[i]);
						FrameHome.calc.aplicaconsumo(FrameHome.residencia); //
						
					}else if(c.getTpCom()==TipoCom.AREA_SERV) {
						utFinal.setTipo(TipoUtArea.values()[i]);
						FrameHome.calc.aplicaconsumo(FrameHome.residencia); //
						
					};
					
					utFinal.setQuantidade(quantidade.indexOf(i));
					utFinal.setHora(hora.indexOf(i));
					utFinal.setVoltagem(Integer.parseInt(voltagem.get(i).getSelectedItem().toString()));						
					FrameHome.listaUtensilio.add(utFinal);
					FrameHome.calc.calcularconsumo(FrameHome.residencia, i);
				}
				
				
				FrameHome.listaComodos.get(FrameHome.contador).setUtensilios(FrameHome.listaUtensilio);

				
				
				setVisible(false);
				FrameHome.calc.calcularconsumo(FrameHome.residencia, FrameHome.contador);
				
				FrameHome.contador++;	
				
				
				// Verifica de acabou as comodos
				if(FrameHome.contador!=FrameHome.listaComodos.size()) {
					
					// Abre nova janela com prÃ³ximo comodo
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								FrameUtensilios frame = new FrameUtensilios();
								frame.dinamico(FrameHome.listaComodos.get(FrameHome.contador));
								frame.setVisible(true);
								FrameHome.calc.somaConsumo(FrameHome.residencia);
								
								FrameHome.calc.calcTarifa();
								FrameHome.calc.relatorioConsumo(FrameHome.residencia);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					
				}else {
					FrameHome.calc.somaConsumo(FrameHome.residencia);
					
					FrameHome.calc.calcTarifa();
					FrameHome.calc.relatorioConsumo(FrameHome.residencia);
					// Caso nÃ£o, abre tela de relatÃ³rios
					setDefaultCloseOperation(EXIT_ON_CLOSE);
					FrameHome.residencia.setComodo(FrameHome.listaComodos);
					JFrame relatorio = new FrameRelatorio();
					relatorio.setVisible(true);
					
				}				
			}
		});
	}	
}
