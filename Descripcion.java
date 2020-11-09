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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;

public class Descripcion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Descripcion frame = new Descripcion();
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
	public Descripcion() {
		setTitle("Descripción");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 432);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Descripción");
		lblNewLabel.setFont(new Font("Rockwell", Font.ITALIC, 80));
		lblNewLabel.setBounds(40, 43, 453, 103);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mM = new MainMenu();
				mM.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(189, 314, 124, 50);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 156, 429, 134);
		contentPane.add(scrollPane);
		
		MenuPrincipal mP = new MenuPrincipal();
		JTextArea textArea = new JTextArea(mP.descripcion());
		textArea.setBackground(new Color(230, 230, 250));
		textArea.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		scrollPane.setViewportView(textArea);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 506, 395);
		ImageIcon icon = new ImageIcon(getClass().getResource("manos.jpg"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
	}

}
