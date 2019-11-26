package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import enums.TipoCom;
import model.Comodos;
import model.Residencia;
import model.Utensilio;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class FrameQntComodos extends JFrame {

	private JPanel contentPane;
	private JTextField tfQuarto;
	private JTextField tfSala;
	private JTextField tfCozinha;
	private JTextField tfBanheiro;
	private JTextField tfArea;

	
	private int contSala = 0;
	private int contQuarto = 0;
	private int contCozinha = 0;
	private int contBanheiro = 0;
	private int contArea = 0;
	
	
	
	FrameUtensilios janelaUt;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameQntComodos frameComodos = new FrameQntComodos();
					frameComodos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameQntComodos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;
		setBounds(width/2-200, height/2-200, 391, 386);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		// LABELS
		JLabel lblComodos = new JLabel("Comodos");
		lblComodos.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblComodos.setBounds(44, 6, 160, 41);
		panel.add(lblComodos);
		
		JLabel lblQuarto = new JLabel("Quarto");
		lblQuarto.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblQuarto.setBounds(59, 100, 75, 23);
		panel.add(lblQuarto);
		
		JLabel lblSala = new JLabel("Sala");
		lblSala.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblSala.setBounds(59, 140, 75, 23);
		panel.add(lblSala);
		
		JLabel lblCozinha = new JLabel("Cozinha");
		lblCozinha.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblCozinha.setBounds(59, 178, 75, 23);
		panel.add(lblCozinha);
		
		JLabel lblBanheiro = new JLabel("Banheiro");
		lblBanheiro.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblBanheiro.setBounds(59, 216, 75, 23);
		panel.add(lblBanheiro);
		
		JLabel lblreaDeServio = new JLabel("Ã�rea de ServiÃ§o");
		lblreaDeServio.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblreaDeServio.setBounds(59, 254, 150, 23);
		panel.add(lblreaDeServio);
		
		
		
		// TEXTFIELDS
		tfQuarto = new JTextField();
		tfQuarto.setEditable(false);
		tfQuarto.setText("0");
		tfQuarto.setBounds(313, 95, 35, 28);
		panel.add(tfQuarto);
		tfQuarto.setColumns(10);
		
		tfSala = new JTextField();
		tfSala.setEditable(false);
		tfSala.setText("0");
		tfSala.setColumns(10);
		tfSala.setBounds(313, 135, 35, 28);
		panel.add(tfSala);
		
		tfCozinha = new JTextField();
		tfCozinha.setEditable(false);
		tfCozinha.setText("0");
		tfCozinha.setColumns(10);
		tfCozinha.setBounds(313, 173, 35, 28);
		panel.add(tfCozinha);
		
		tfBanheiro = new JTextField();
		tfBanheiro.setEditable(false);
		tfBanheiro.setText("0");
		tfBanheiro.setColumns(10);
		tfBanheiro.setBounds(313, 211, 35, 28);
		panel.add(tfBanheiro);
		
		tfArea = new JTextField();
		tfArea.setEditable(false);
		tfArea.setText("0");
		tfArea.setColumns(10);
		tfArea.setBounds(313, 249, 35, 28);
		panel.add(tfArea);
		
		
		// BOTÃ•ES MAIS E MENOS QUARTO
		JButton btMenosQuarto = new JButton("-");
		btMenosQuarto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(contQuarto>0) {
					contQuarto--;
					tfQuarto.setText(String.valueOf(contQuarto));
				}
				
			}
		});
		btMenosQuarto.setBounds(204, 98, 45, 28);
		panel.add(btMenosQuarto);
		
		JButton btMaisQuarto = new JButton("+");
		btMaisQuarto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				contQuarto++;
				tfQuarto.setText(String.valueOf(contQuarto));
			}
		});
		btMaisQuarto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btMaisQuarto.setBounds(256, 98, 45, 28);
		panel.add(btMaisQuarto);
		
		
		
		// BOTÃ•ES MAIS E MENOS SALA
		JButton btMenosSala = new JButton("-");
		btMenosSala.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(contSala>0) {
					contSala--;
					tfSala.setText(String.valueOf(contSala));
				}
			}
		});
		btMenosSala.setBounds(204, 138, 45, 28);
		panel.add(btMenosSala);
		
		
		JButton btMaisSala = new JButton("+");
		btMaisSala.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				contSala++;
				tfSala.setText(String.valueOf(contSala));
			}
		});
		btMaisSala.setBounds(256, 138, 45, 28);
		panel.add(btMaisSala);
		
		
		
		// BOTÃ•ES MAIS E MENOS COZINHA
		JButton btMenosCozinha = new JButton("-");
		btMenosCozinha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(contCozinha>0) {
					contCozinha--;
					tfCozinha.setText(String.valueOf(contCozinha));
				}
			}
		});
		btMenosCozinha.setBounds(204, 176, 45, 28);
		panel.add(btMenosCozinha);
		
		JButton btMaisCozinha = new JButton("+");
		btMaisCozinha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contCozinha++;
				tfCozinha.setText(String.valueOf(contCozinha));
			}
		});
		btMaisCozinha.setBounds(256, 176, 45, 28);
		panel.add(btMaisCozinha);
		
		
		
		// BOTÃ•ES MAIS E MENOS BANHEIRO
		JButton btMenosBanheiro = new JButton("-");
		btMenosBanheiro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(contBanheiro>0) {
					contBanheiro--;
					tfBanheiro.setText(String.valueOf(contBanheiro));
				}
			}
		});
		btMenosBanheiro.setBounds(204, 211, 45, 28);
		panel.add(btMenosBanheiro);
		
		JButton btMaisBanheiro = new JButton("+");
		btMaisBanheiro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contBanheiro++;
				tfBanheiro.setText(String.valueOf(contBanheiro));
			}
		});
		btMaisBanheiro.setBounds(256, 211, 45, 28);
		panel.add(btMaisBanheiro);
				
		
		
		// BOTÃ•ES MAIS E MENOS AREA
		JButton btMenosArea = new JButton("-");
		btMenosArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(contArea>0) {
					contArea--;
					tfArea.setText(String.valueOf(contArea));
				}
			}
		});
		btMenosArea.setBounds(204, 249, 45, 28);
		panel.add(btMenosArea);
		
		JButton btMaisArea = new JButton("+");
		btMaisArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					contArea++;
					tfArea.setText(String.valueOf(contArea));
			}
		});
		btMaisArea.setBounds(256, 249, 45, 28);
		panel.add(btMaisArea);
		
		
		// ICONES
		JLabel lblLogo = new JLabel("");
		/*
		 * Image imgLogoMin = new
		 * ImageIcon(this.getClass().getResource("/logo_min.png")).getImage();
		 * lblLogo.setIcon(new ImageIcon(imgLogoMin));
		 */
		lblLogo.setBounds(6, 6, 55, 41);
		panel.add(lblLogo);
		
		JLabel lblIconQuarto = new JLabel("");
		lblIconQuarto.setHorizontalAlignment(SwingConstants.CENTER);
		/*
		 * Image imgIconQuarto = new
		 * ImageIcon(this.getClass().getResource("/icon_quarto.png")).getImage();
		 * lblIconQuarto.setIcon(new ImageIcon(imgIconQuarto));
		 */
		lblIconQuarto.setBounds(16, 93, 45, 33);
		panel.add(lblIconQuarto);
		
		JLabel lblIconSala = new JLabel("");
		lblIconSala.setHorizontalAlignment(SwingConstants.CENTER);
		/*
		 * Image imgIconSala = new
		 * ImageIcon(this.getClass().getResource("/icon_sala.png")).getImage();
		 * lblIconSala.setIcon(new ImageIcon(imgIconSala));
		 */
		lblIconSala.setBounds(16, 133, 45, 33);
		panel.add(lblIconSala);
		
		JLabel lblIconCozinha = new JLabel("");
		lblIconCozinha.setHorizontalAlignment(SwingConstants.CENTER);
		/*
		 * Image imgIconCozinha = new
		 * ImageIcon(this.getClass().getResource("/icon_cozinha.png")).getImage();
		 * lblIconCozinha.setIcon(new ImageIcon(imgIconCozinha));
		 */
		lblIconCozinha.setBounds(16, 171, 45, 33);
		panel.add(lblIconCozinha);
		
		JLabel lblIconBanheiro = new JLabel("");
		lblIconBanheiro.setHorizontalAlignment(SwingConstants.CENTER);
		/*
		 * Image imgIconBanheiro = new
		 * ImageIcon(this.getClass().getResource("/icon_banheiro.png")).getImage();
		 * lblIconBanheiro.setIcon(new ImageIcon(imgIconBanheiro));
		 */
		lblIconBanheiro.setBounds(16, 209, 45, 33);
		panel.add(lblIconBanheiro);
		
		JLabel lblIconArea = new JLabel("");
		lblIconArea.setHorizontalAlignment(SwingConstants.CENTER);
		/*
		 * Image imgIconArea = new
		 * ImageIcon(this.getClass().getResource("/icon_Area.png")).getImage();
		 * lblIconArea.setIcon(new ImageIcon(imgIconArea));
		 */		lblIconArea.setBounds(16, 247, 45, 33);
		panel.add(lblIconArea);
		
		
		// BOTÃƒO PRONTO
		
		JButton btnProximo = new JButton("Pronto");
		btnProximo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Residencia residencia = new Residencia();
				
				int contTotal = (contArea + contBanheiro + contCozinha + contQuarto + contSala);

				for(int i = 0; i < contQuarto;i++) {
					Comodos c = new Comodos();
					c.setTpCom(TipoCom.QUARTO);
					FrameHome.listaComodos.add(c);
				}
				
				for(int i = 0; i < contSala;i++) {
					Comodos c = new Comodos();
					c.setTpCom(TipoCom.SALA);
					FrameHome.listaComodos.add(c);
				}
				
				for(int i = 0; i < contSala;i++) {
					Comodos c = new Comodos();
					c.setTpCom(TipoCom.SALA);
					FrameHome.listaComodos.add(c);
				}
				
				for(int i = 0; i < contCozinha;i++) {
					Comodos c = new Comodos();
					c.setTpCom(TipoCom.COZINHA);
					FrameHome.listaComodos.add(c);
				}
				
				for(int i = 0; i < contBanheiro;i++) {
					Comodos c = new Comodos();
					c.setTpCom(TipoCom.BANHEIRO);
					FrameHome.listaComodos.add(c);
				}
				
				for(int i = 0; i < contArea;i++) {
					Comodos c = new Comodos();
					c.setTpCom(TipoCom.AREA_SERV);
					FrameHome.listaComodos.add(c);
				}
				
				if(janelaUt == null) {
					setVisible(false);
			
					if(FrameHome.listaComodos.size()>0) {
						janelaUt = new FrameUtensilios();
						janelaUt.setVisible(true);
						janelaUt.dinamico(FrameHome.listaComodos.get(0));	
					}
				}
				
				
			}
		});
		
		/*
		 * Image imgNext = new
		 * ImageIcon(this.getClass().getResource("/icon_done.png")).getImage();
		 * btnProximo.setIcon(new ImageIcon(imgNext));
		 */
		btnProximo.setBounds(221, 287, 127, 41);
		panel.add(btnProximo);
		
		JLabel lblAgoraPrecisamosSaber = new JLabel("<html><p>Agora precisamos saber quantos comodos<br>tem a sua casa:</p></html>");
		lblAgoraPrecisamosSaber.setBounds(26, 47, 322, 41);
		panel.add(lblAgoraPrecisamosSaber);
	}
}
