import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Incorreto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Incorreto frame = new Incorreto();
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
	public Incorreto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 64, 459, 159);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("<html>Intentalo de nuevo :)<html>");
		lblNewLabel.setBackground(new Color(216, 191, 216));
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 36));
		scrollPane.setViewportView(lblNewLabel);
		
		JButton btnNewButton = new JButton("Atras");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lvl1 lev1 = new Lvl1();
				lev1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnNewButton.setBounds(370, 239, 138, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 554, 343);
		ImageIcon icon = new ImageIcon(getClass().getResource("fondogeo.jpg"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
	}
}

