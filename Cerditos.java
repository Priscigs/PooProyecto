import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Cerditos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cerditos frame = new Cerditos();
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
	public Cerditos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1117, 644);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Los Tres Cerditos");
		lblNewLabel.setFont(new Font("Rockwell", Font.ITALIC, 80));
		lblNewLabel.setBounds(10, 24, 727, 103);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 139, 1083, 235);
		contentPane.add(scrollPane);
		
		Cuentos c = new Cuentos();
		
		JTextArea textArea = new JTextArea(c.cuento4());
		textArea.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		scrollPane.setViewportView(textArea);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(481, 388, 318, 218);
		ImageIcon icon = new ImageIcon(getClass().getResource("cerditos.jpg"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
		
		JLabel lblFondo1 = new JLabel("");
		lblFondo1.setBounds(823, 384, 245, 197);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("lobo.jpg"));
		ImageIcon img1 = new ImageIcon(icon1.getImage().getScaledInstance(lblFondo1.getWidth(), lblFondo1.getHeight(), Image.SCALE_SMOOTH));
		lblFondo1.setIcon((img1));
		contentPane.add(lblFondo1);
		
		JButton btnNewButton = new JButton("Regresar al Men\u00FA de Cuentos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarCuentos mC = new MostrarCuentos();
				mC.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Leelawadee", Font.BOLD, 18));
		btnNewButton.setBounds(10, 549, 309, 48);
		contentPane.add(btnNewButton);
	}

}
