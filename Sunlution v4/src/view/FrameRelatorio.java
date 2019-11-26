package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Solar;
import model.Comodos;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class FrameRelatorio extends JFrame {
	Solar s = new Solar();

	private JPanel contentPane;

	/**
	 * Create the frame.*/
	
	public FrameRelatorio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;
		setBounds(width/2-100, height/2-100, 579, 523);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		s.testeSolar(FrameHome.calc.getSomaconsumo());
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBackground(Color.WHITE);
		textPane.setBounds(20, 64, 517, 339);
		contentPane.add(textPane);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		btnFinalizar.setBounds(139, 415, 122, 39);
		contentPane.add(btnFinalizar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				PrintWriter pw = null;
				try {
					pw = new PrintWriter(new FileOutputStream("relatorio.txt"));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				pw.write(s.toString());
				pw.flush();
				pw.close();	
			}
		});
		btnImprimir.setBounds(302, 415, 122, 39);
		contentPane.add(btnImprimir);
		
		JLabel lblRelatrio = new JLabel("Relatorio");
		lblRelatrio.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblRelatrio.setBounds(217, 6, 160, 41);
		contentPane.add(lblRelatrio);
		
		JLabel lblIcone = new JLabel("");
		/*Image imgRelat = new ImageIcon(this.getClass().getResource("/icon_relat.png")).getImage();
		lblIcone.setIcon(new ImageIcon(imgRelat));*/
		lblIcone.setBounds(179, 6, 55, 41);
		contentPane.add(lblIcone);
		
		
		//AREA DO RAFA rsrsr
		String text = "aaaaaaaaaaaaaa" + FrameHome.calc.getSomaconsumo();
		textPane.setText(FrameHome.calc.getTeste());
		
	}
}
