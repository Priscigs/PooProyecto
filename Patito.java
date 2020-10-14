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

public class Patito extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Patito frame = new Patito();
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
	public Patito() {
		setTitle("Patito Feo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1144, 681);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("El Patito Feo");
		lblNewLabel.setFont(new Font("Rockwell", Font.ITALIC, 80));
		lblNewLabel.setBounds(10, 24, 894, 103);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 154, 1114, 272);
		contentPane.add(scrollPane);
		
		Cuentos pF = new Cuentos();
		
		JTextArea textArea = new JTextArea(pF.cuento3());
		textArea.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		scrollPane.setViewportView(textArea);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(326, 436, 218, 200);
		ImageIcon icon = new ImageIcon(getClass().getResource("patito.jpg"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
		
		JLabel lblFondo1 = new JLabel("patito.jpg");
		lblFondo1.setBounds(68, 436, 218, 200);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("patito.jpg"));
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
		btnNewButton.setBounds(815, 574, 309, 48);
		contentPane.add(btnNewButton);
	}

}
