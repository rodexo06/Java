import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class Inicio {

	private JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblToppDosTopp = new JLabel("Topp dos topp");
		lblToppDosTopp.setBounds(127, 45, 145, 14);
		frame.getContentPane().add(lblToppDosTopp);
		
		JButton btnLetsGoBaby = new JButton("Lets go Baby");
		btnLetsGoBaby.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnLetsGoBaby.setAction(action);
		btnLetsGoBaby.setBounds(152, 207, 120, 23);
		frame.getContentPane().add(btnLetsGoBaby);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
