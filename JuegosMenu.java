import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;

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
		btnNewButton.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(160, 96, 125, 32);
		contentPane.add(btnNewButton);
		
		MostrarCuentos mC = new MostrarCuentos();
		
		JButton btnCuentos = new JButton("Cuentos");
		btnCuentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mC.setVisible(true);
				dispose();
			}
		});
		btnCuentos.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnCuentos.setBounds(160, 138, 125, 32);
		contentPane.add(btnCuentos);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnSalir.setBounds(160, 182, 125, 32);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("Men\u00FA de Juegos");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblNewLabel.setBounds(73, 31, 353, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 436, 263);
		ImageIcon icon = new ImageIcon(getClass().getResource("juegos.jpg"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
	}

}
