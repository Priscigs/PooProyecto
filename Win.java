import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Win extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Win frame = new Win();
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
	public Win() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Men\u00FA de juegos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juegos j = new Juegos();
				j.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnNewButton.setBounds(248, 315, 214, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u00A1Felicidades!");
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 40));
		lblNewLabel.setBounds(82, 100, 390, 112);
		contentPane.add(lblNewLabel);
		
		JLabel lblGanaste = new JLabel("Ganaste :)");
		lblGanaste.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 40));
		lblGanaste.setBounds(123, 154, 283, 112);
		contentPane.add(lblGanaste);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 494, 399);
		ImageIcon icon = new ImageIcon(getClass().getResource("confetti.jpg"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
	}
}
