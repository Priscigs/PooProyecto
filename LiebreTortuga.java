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

public class LiebreTortuga extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LiebreTortuga frame = new LiebreTortuga();
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
	public LiebreTortuga() {
		setTitle("La Liebre y la Tortuga");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1138, 655);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("La Liebre y la Tortuga");
		lblNewLabel.setFont(new Font("Rockwell", Font.ITALIC, 80));
		lblNewLabel.setBounds(10, 24, 894, 103);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 164, 1104, 213);
		contentPane.add(scrollPane);
		
		Cuentos lT = new Cuentos();
		
		JTextArea textArea = new JTextArea(lT.cuento2());
		textArea.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		scrollPane.setViewportView(textArea);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(821, 387, 245, 236);
		ImageIcon icon = new ImageIcon(getClass().getResource("liebre.jpg"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
		
		JButton btnNewButton = new JButton("Regresar al Men\u00FA de Cuentos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarCuentos mC = new MostrarCuentos();
				mC.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Leelawadee", Font.BOLD, 18));
		btnNewButton.setBounds(10, 560, 309, 48);
		contentPane.add(btnNewButton);
	}

}
