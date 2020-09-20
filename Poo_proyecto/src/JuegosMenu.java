import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class JuegosMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuegosMenu frame = new JuegosMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JuegosMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnJuegos = new JButton("Juegos");
		btnJuegos.setBounds(178, 92, 85, 21);
		contentPane.add(btnJuegos);
		
		JButton btnCuentos = new JButton("Cuentos");
		btnCuentos.setBounds(178, 143, 85, 21);
		contentPane.add(btnCuentos);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(178, 195, 85, 21);
		contentPane.add(btnSalir);
	}

}
