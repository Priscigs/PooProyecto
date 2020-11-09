import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Estadisticas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estadisticas frame = new Estadisticas();
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
	public Estadisticas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>Nombre del ni\u00F1o/a:<html>");
		lblNewLabel.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
		lblNewLabel.setBounds(32, 10, 120, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblJuego = new JLabel("Juego:");
		lblJuego.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
		lblJuego.setBounds(32, 89, 120, 40);
		contentPane.add(lblJuego);
		
		JLabel lblTiempo = new JLabel("Tiempo");
		lblTiempo.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
		lblTiempo.setBounds(257, 89, 120, 40);
		contentPane.add(lblTiempo);
		
		JLabel lblRompecabezas = new JLabel("Rompecabezas");
		lblRompecabezas.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
		lblRompecabezas.setBounds(32, 144, 199, 40);
		contentPane.add(lblRompecabezas);
		
		JLabel lblLaberinto = new JLabel("Laberinto");
		lblLaberinto.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
		lblLaberinto.setBounds(32, 207, 120, 40);
		contentPane.add(lblLaberinto);
		
		JLabel lblFigurasYColores = new JLabel("Figuras y Colores");
		lblFigurasYColores.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
		lblFigurasYColores.setBounds(32, 279, 217, 40);
		contentPane.add(lblFigurasYColores);
		
		JLabel lblMemoria = new JLabel("Memoria");
		lblMemoria.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
		lblMemoria.setBounds(32, 349, 120, 40);
		contentPane.add(lblMemoria);
		
		JLabel lblRendimiento = new JLabel("Rendimiento");
		lblRendimiento.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
		lblRendimiento.setBounds(405, 89, 160, 40);
		contentPane.add(lblRendimiento);
		
		JButton btnNewButton = new JButton("Regresar a Men\u00FA de Juegos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juegos j = new Juegos();
				j.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnNewButton.setBounds(32, 417, 307, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(-32, 0, 645, 477);
		ImageIcon icon = new ImageIcon(getClass().getResource("esta.jpg"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
	}
}
