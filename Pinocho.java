import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pinocho extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pinocho frame = new Pinocho();
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
	public Pinocho() {
		setTitle("Cuentos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1127, 714);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Cuentos c = new Cuentos();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 158, 1103, 310);
		
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea(c.cuento1());
		textArea.setForeground(new Color(0, 100, 0));
		textArea.setFont(new Font("Eras Bold ITC", Font.PLAIN, 14));
		scrollPane.setViewportView(textArea);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(36, 478, 253, 200);
		ImageIcon icon = new ImageIcon(getClass().getResource("pinocho2.png"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
		
		JLabel lblFondo1 = new JLabel("");
		lblFondo1.setBounds(969, 10, 114, 136);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("grillo.png"));
		ImageIcon img1 = new ImageIcon(icon1.getImage().getScaledInstance(lblFondo1.getWidth(), lblFondo1.getHeight(), Image.SCALE_SMOOTH));
		lblFondo1.setIcon((img1));
		contentPane.add(lblFondo1);
		
		JLabel lblNewLabel = new JLabel("Pinocho");
		lblNewLabel.setFont(new Font("Forte", Font.ITALIC, 80));
		lblNewLabel.setBounds(10, 24, 386, 103);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Regresar al Men\u00FA de Cuentos");
		btnNewButton.setBackground(new Color(154, 205, 50));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarCuentos mC = new MostrarCuentos();
				mC.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnNewButton.setBounds(776, 608, 309, 48);
		contentPane.add(btnNewButton);
	}
}
