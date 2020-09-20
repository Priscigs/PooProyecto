import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		Juegos j = new Juegos();
		
		JButton btnNewButton = new JButton("Juegos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(167, 97, 85, 32);
		contentPane.add(btnNewButton);
		
		JButton btnCuentos = new JButton("Cuentos");
		btnCuentos.setBounds(167, 139, 85, 32);
		contentPane.add(btnCuentos);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(167, 183, 85, 32);
		contentPane.add(btnSalir);
	}

}
