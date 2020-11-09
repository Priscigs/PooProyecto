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
import java.awt.Color;

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
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Juegos j = new Juegos();
		
		JButton btnNewButton = new JButton("Juegos");
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(125, 75, 140, 47);
		contentPane.add(btnNewButton);
		
		MostrarCuentos mC = new MostrarCuentos();
		
		JButton btnCuentos = new JButton("Cuentos");
		btnCuentos.setBackground(new Color(230, 230, 250));
		btnCuentos.setForeground(new Color(0, 0, 0));
		btnCuentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mC.setVisible(true);
				dispose();
			}
		});
		btnCuentos.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnCuentos.setBounds(125, 132, 140, 47);
		contentPane.add(btnCuentos);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBackground(new Color(230, 230, 250));
		btnSalir.setForeground(new Color(0, 0, 0));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnSalir.setBounds(125, 189, 140, 47);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("Men\u00FA de Juegos");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblNewLabel.setBounds(27, 21, 353, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 386, 263);
		ImageIcon icon = new ImageIcon(getClass().getResource("juegoos.jpg"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
	}

}
