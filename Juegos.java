import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

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
		setBounds(100, 100, 403, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRompecabezas = new JButton("Rompecabezas");
		btnRompecabezas.setBackground(new Color(230, 230, 250));
		btnRompecabezas.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnRompecabezas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rompecabezas r = new Rompecabezas();
				r.setVisible(true);
				dispose();
			}
		});
		btnRompecabezas.setBounds(112, 78, 184, 39);
		contentPane.add(btnRompecabezas);

		TiempoFYC tiempo = new TiempoFYC();
		JButton btnLaberinto = new JButton("Laberinto");
		btnLaberinto.setBackground(new Color(230, 230, 250));
		btnLaberinto.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnLaberinto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabPrueba lab = new LabPrueba();	
				lab.setVisible(true);
				tiempo.setVisible(true);
				dispose();
			}
		});
		btnLaberinto.setBounds(112, 127, 184, 39);
		contentPane.add(btnLaberinto);
		
		coloresyFiguras cF = new coloresyFiguras();
		
		JButton btnColoresYFormas = new JButton("Colores y formas");
		btnColoresYFormas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cF.setVisible(true);
				dispose();
			}
		});
		btnColoresYFormas.setBackground(new Color(230, 230, 250));
		btnColoresYFormas.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnColoresYFormas.setBounds(112, 176, 184, 39);
		contentPane.add(btnColoresYFormas);
		
		JButton btnMemoria = new JButton("Memoria");
		btnMemoria.setBackground(new Color(230, 230, 250));
		btnMemoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Memoria m = new Memoria();
				dispose();
			}
		});
		btnMemoria.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnMemoria.setBounds(112, 225, 184, 39);
		contentPane.add(btnMemoria);
		
		JLabel lblNewLabel = new JLabel("PequeGames");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblNewLabel.setBounds(72, 20, 292, 45);
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
				
				if(mensaje.equals("Estadisticas")) {
					Estadisticas es = new Estadisticas();
					es.setVisible(true);
					dispose();
				}
				
				if(mensaje.equals("Salir")) {
					System.exit(0);
				}
			}
		});
		comboBox.setFont(new Font("Segoe UI", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Regresar", "Estadisticas", "Salir"}));
		comboBox.setBounds(0, 0, 117, 21);
		contentPane.add(comboBox);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 392, 304);
		ImageIcon icon = new ImageIcon(getClass().getResource("manos2.jpg"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
	}
}
