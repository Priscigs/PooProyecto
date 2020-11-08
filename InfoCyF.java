import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InfoCyF extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoCyF frame = new InfoCyF();
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
	public InfoCyF() {
		setTitle("Información de Colores y Figuras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 80, 699, 351);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 50, 311, 196);
		contentPane.add(scrollPane);
		
		MenuPrincipal mP = new MenuPrincipal();
		
		JTextArea txtrA = new JTextArea(mP.infoCyF());
		txtrA.setFont(new Font("Gill Sans MT", Font.PLAIN, 14));
		scrollPane.setColumnHeaderView(txtrA);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(394, 95, 253, 200);
		ImageIcon icon = new ImageIcon(getClass().getResource("Figuras.png"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
		
		JLabel lblNewLabel = new JLabel("<html>Colores y figuras<html>");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 30));
		lblNewLabel.setBounds(447, 10, 169, 75);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnNewButton.setBounds(36, 256, 116, 42);
		contentPane.add(btnNewButton);
	}

}
