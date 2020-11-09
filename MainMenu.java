import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

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
	
	public MainMenu() {
		setTitle("Menú Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		CrearCuenta cC = new CrearCuenta();
		
		JButton btnCrear = new JButton("Crear Cuenta");
		btnCrear.setBackground(new Color(230, 230, 250));
		btnCrear.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cC.setVisible(true);
				dispose();
			}
		});
		btnCrear.setBounds(106, 77, 172, 35);
		contentPane.add(btnCrear);
		
		InicioSesion iS = new InicioSesion();
		
		JButton btnIniciarSesin = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesin.setBackground(new Color(230, 230, 250));
		btnIniciarSesin.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnIniciarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iS.setVisible(true);
				dispose();
			}
		});
		btnIniciarSesin.setBounds(106, 122, 172, 35);
		contentPane.add(btnIniciarSesin);
		
		Descripcion d = new Descripcion();
		
		JButton btnDescripcin = new JButton("Descripci\u00F3n");
		btnDescripcin.setBackground(new Color(230, 230, 250));
		btnDescripcin.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnDescripcin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setVisible(true);
				dispose();
			}
		});
		btnDescripcin.setBounds(106, 167, 172, 35);
		contentPane.add(btnDescripcin);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBackground(new Color(230, 230, 250));
		btnSalir.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(106, 212, 172, 35);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDOS A PEQUEGAMES");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 22));
		lblNewLabel.setBounds(10, 10, 388, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 378, 302);
		ImageIcon icon = new ImageIcon(getClass().getResource("fondoM.jpg"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
	}

}
