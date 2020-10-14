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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Juegos extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juegos frame = new Juegos();
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
	public Juegos() {
		setTitle("Juegos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRompecabezas = new JButton("Rompecabezas");
		btnRompecabezas.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnRompecabezas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rompecabezas r = new Rompecabezas();
				r.setVisible(true);
				dispose();
			}
		});
		btnRompecabezas.setBounds(144, 78, 158, 39);
		contentPane.add(btnRompecabezas);

		JButton btnLaberinto = new JButton("Laberinto");
		btnLaberinto.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnLaberinto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lab lab = new Lab();	
				lab.setVisible(true);
			}
		});
		btnLaberinto.setBounds(144, 127, 158, 39);
		contentPane.add(btnLaberinto);
		
		JButton btnColoresYFormas = new JButton("Colores y formas");
		btnColoresYFormas.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnColoresYFormas.setBounds(144, 176, 158, 39);
		contentPane.add(btnColoresYFormas);
		
		JButton btnMemoria = new JButton("Memoria");
		btnMemoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Memoria m = new Memoria();
				dispose();
			}
		});
		btnMemoria.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnMemoria.setBounds(144, 225, 158, 39);
		contentPane.add(btnMemoria);
		
		JLabel lblNewLabel = new JLabel("PequeGames");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblNewLabel.setBounds(82, 23, 292, 45);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = comboBox.getSelectedItem().toString();
				
				if(mensaje.equals("Regresar")) {
					JuegosMenu jM = new JuegosMenu();
					jM.setVisible(true);
					dispose();	
				}
				
				if(mensaje.equals("Salir")) {
					System.exit(0);
				}
			}
		});
		comboBox.setFont(new Font("Segoe UI", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Regresar", "Salir"}));
		comboBox.setBounds(0, 0, 92, 21);
		contentPane.add(comboBox);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 436, 304);
		ImageIcon icon = new ImageIcon(getClass().getResource("juegos.jpg"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
	}
}
