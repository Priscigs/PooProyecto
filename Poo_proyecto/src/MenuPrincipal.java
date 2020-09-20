import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setTitle("PequeGames");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCrear = new JButton("Crear Cuenta");
		btnCrear.setBounds(159, 66, 123, 21);
		contentPane.add(btnCrear);
		InicioSesion iS = new InicioSesion();
		
		JButton btnIniciarSesin = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iS.setVisible(true);
				dispose();
			}
		});
		btnIniciarSesin.setBounds(159, 111, 123, 21);
		contentPane.add(btnIniciarSesin);
		Descripcion des = new Descripcion();
		
		JButton btnDescripcin = new JButton("Descripci\u00F3n");
		btnDescripcin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mm = new MainMenu();
				des.setVisible(true);
				dispose();
			}
		});
		btnDescripcin.setBounds(159, 155, 123, 21);
		contentPane.add(btnDescripcin);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(159, 201, 123, 21);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDOS A PEQUEGAMES");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 10));
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setBounds(134, 25, 191, 31);
		contentPane.add(lblNewLabel);
	}
}
