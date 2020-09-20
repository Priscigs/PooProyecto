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

public class Juegos extends JFrame {

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRompecabezas = new JButton("Rompecabezas");
		btnRompecabezas.setBounds(144, 78, 158, 39);
		contentPane.add(btnRompecabezas);
		
		JButton btnLaberinto = new JButton("Laberinto");
		btnLaberinto.setBounds(144, 127, 158, 39);
		contentPane.add(btnLaberinto);
		
		JButton btnColoresYFormas = new JButton("Colores y formas");
		btnColoresYFormas.setBounds(144, 176, 158, 39);
		contentPane.add(btnColoresYFormas);
		
		JButton btnMemoria = new JButton("Memoria");
		btnMemoria.setBounds(144, 225, 158, 39);
		contentPane.add(btnMemoria);
		
		JLabel lblNewLabel = new JLabel("PequeGames");
		lblNewLabel.setFont(new Font("Lucida Console", Font.BOLD, 18));
		lblNewLabel.setBounds(165, 23, 203, 45);
		contentPane.add(lblNewLabel);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(144, 274, 158, 39);
		contentPane.add(btnSalir);
	}

}
