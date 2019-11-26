package view;
import java.awt.Image; 
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Calculos;
import model.Comodos;
import model.Residencia;
import model.Utensilio;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Color;
import java.awt.Dimension;

public class FrameHome extends JFrame {

	private JPanel contentPane;
	private static FrameHome frame = new FrameHome();
	
	public static Residencia residencia = new Residencia();
	public static ArrayList<Comodos> listaComodos = new ArrayList<Comodos>();
	public static ArrayList<Utensilio> listaUtensilio = new ArrayList<Utensilio>();
	public static Calculos calc = new Calculos();
	public static StringBuilder relconsumo = new StringBuilder();
	public static StringBuilder relsolar = new StringBuilder();
	
	public static int contador = 0;
	/**
	 * Launch the application.
	*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { 
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
           System.err.print(ex);
        } catch (InstantiationException ex) {
        	System.err.print(ex);
        } catch (IllegalAccessException ex) {
        	System.err.print(ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        	System.err.print(ex);
        }
		
		
	}

	/**
	 * Create the frame.
	 */
	public FrameHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		  int height = screenSize.height;
		  int width = screenSize.width;
		setBounds(width/2-100, height/2-100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		//Image imgLogo = new ImageIcon(this.getClass().getResource("/home.png")).getImage();
		//lblLogo.setIcon(new ImageIcon(imgLogo));
		lblLogo.setBounds(80, 16, 274, 113);
		contentPane.add(lblLogo);
		
		
		JLabel lbBemVindo = new JLabel("<html><p style='text-align:center'>Bem-vindo ao Sunlution, iremos te ajudar a calcular <br>seu gasto elétrico mensal e propor soluções sustentáveis de economia através de painéis solares.</p></html>");
		lbBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lbBemVindo.setBounds(51, 125, 331, 64);
		
		contentPane.add(lbBemVindo);
		
		JLabel lblPorFavorSelecione = new JLabel("Vamos comeÃ§ar!");
		lblPorFavorSelecione.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblPorFavorSelecione.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorFavorSelecione.setBounds(92, 185, 249, 14);
		contentPane.add(lblPorFavorSelecione);
		
		JButton btComecar = new JButton("Começar");
		/*
		 * Image imgNext = new
		 * ImageIcon(this.getClass().getResource("/icon_next.png")).getImage();
		 * btComecar.setIcon(new ImageIcon(imgNext));
		 */
		btComecar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				new FrameQntComodos().setVisible(true);
				frame.setVisible(false);
				
			}
		});
		btComecar.setBounds(145, 204, 144, 51);
		contentPane.add(btComecar);
		
		
		
	}
}
