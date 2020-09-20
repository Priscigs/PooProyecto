import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCrear = new JButton("Crear Cuenta");
		btnCrear.setBounds(152, 79, 121, 35);
		contentPane.add(btnCrear);
		
		InicioSesion iS = new InicioSesion();
		
		JButton btnIniciarSesin = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iS.setVisible(true);
				dispose();
			}
		});
		btnIniciarSesin.setBounds(152, 124, 121, 35);
		contentPane.add(btnIniciarSesin);
		
		Descripcion d = new Descripcion();
		
		JButton btnDescripcin = new JButton("Descripci\u00F3n");
		btnDescripcin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setVisible(true);
				dispose();
			}
		});
		btnDescripcin.setBounds(152, 169, 121, 35);
		contentPane.add(btnDescripcin);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(152, 214, 121, 35);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDOS A PEQUEGAMES");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblNewLabel.setBounds(97, 10, 250, 57);
		contentPane.add(lblNewLabel);
	}

}
