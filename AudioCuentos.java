import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AudioCuentos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AudioCuentos frame = new AudioCuentos();
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
	public AudioCuentos() {
		setTitle("Audio Cuentos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 586);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Audio Cuentos");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblNewLabel.setBounds(246, 30, 307, 57);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(79, 140, 173, 167);
		ImageIcon icon7 = new ImageIcon(getClass().getResource("ranafoto.jpg"));
		ImageIcon img7 = new ImageIcon(
				icon7.getImage().getScaledInstance(btnNewButton.getWidth(), btnNewButton.getHeight(), Image.SCALE_SMOOTH));
		btnNewButton.setIcon((img7));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sonido sound = new Sonido();
				sound.ReproducirSonido("src/ranacuento.wav");
			}
		});
		btnNewButton.setIcon((img7));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(293, 140, 173, 167);
		ImageIcon icon = new ImageIcon(getClass().getResource("ranaking.jpg"));
		ImageIcon img = new ImageIcon(
				icon.getImage().getScaledInstance(btnNewButton_1.getWidth(), btnNewButton_1.getHeight(), Image.SCALE_SMOOTH));
		btnNewButton_1.setIcon((img));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sonido sound = new Sonido();
				sound.ReproducirSonido("src/principe.wav");
			}
		});
		btnNewButton_1.setIcon((img));
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Duraci\u00F3n: 3 min");
		lblNewLabel_1.setForeground(new Color(153, 0, 102));
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblNewLabel_1.setBounds(79, 115, 173, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Duraci\u00F3n: 11 min");
		lblNewLabel_1_1.setForeground(new Color(153, 0, 153));
		lblNewLabel_1_1.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(293, 115, 173, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(508, 140, 173, 167);
		ImageIcon icon2 = new ImageIcon(getClass().getResource("ricitosfoto.jpeg"));
		ImageIcon img2 = new ImageIcon(
				icon2.getImage().getScaledInstance(btnNewButton_2.getWidth(), btnNewButton_2.getHeight(), Image.SCALE_SMOOTH));
		btnNewButton_2.setIcon((img2));

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sonido sound = new Sonido();
				sound.ReproducirSonido("src/ricitos.wav");
			}
		});
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Duraci\u00F3n: 10 min");
		lblNewLabel_1_1_1.setForeground(new Color(153, 0, 153));
		lblNewLabel_1_1_1.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(508, 115, 173, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(79, 350, 173, 167);
		ImageIcon icon3 = new ImageIcon(getClass().getResource("rojacape.jpg"));
		ImageIcon img3 = new ImageIcon(
				icon3.getImage().getScaledInstance(btnNewButton_3.getWidth(), btnNewButton_3.getHeight(), Image.SCALE_SMOOTH));
		btnNewButton_3.setIcon((img3));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sonido sound = new Sonido();
				sound.ReproducirSonido("src/caperucita.wav");
			}
		});
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Duraci\u00F3n: 8 min");
		lblNewLabel_1_2.setForeground(new Color(153, 0, 153));
		lblNewLabel_1_2.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(79, 330, 173, 20);
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBounds(293, 350, 173, 167);
		ImageIcon icon4 = new ImageIcon(getClass().getResource("jengibre.jpg"));
		ImageIcon img4 = new ImageIcon(
				icon4.getImage().getScaledInstance(btnNewButton_4.getWidth(), btnNewButton_4.getHeight(), Image.SCALE_SMOOTH));
		btnNewButton_4.setIcon((img4));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sonido sound = new Sonido();
				sound.ReproducirSonido("src/jengi.wav");
			}
		});
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Duraci\u00F3n: 8 min");
		lblNewLabel_1_1_2.setForeground(new Color(153, 0, 153));
		lblNewLabel_1_1_2.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblNewLabel_1_1_2.setBounds(293, 332, 173, 20);
		contentPane.add(lblNewLabel_1_1_2);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBounds(508, 350, 173, 167);
		ImageIcon icon5 = new ImageIcon(getClass().getResource("doradoh.jpg"));
		ImageIcon img5 = new ImageIcon(
				icon5.getImage().getScaledInstance(btnNewButton_5.getWidth(), btnNewButton_5.getHeight(), Image.SCALE_SMOOTH));
		btnNewButton_5.setIcon((img5));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sonido sound = new Sonido();
				sound.ReproducirSonido("src/huevo.wav");
			}
		});
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Duraci\u00F3n: 7 min");
		lblNewLabel_1_1_2_1.setForeground(new Color(153, 0, 153));
		lblNewLabel_1_1_2_1.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblNewLabel_1_1_2_1.setBounds(508, 332, 173, 20);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Regresar", "Salir"}));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = comboBox.getSelectedItem().toString();
				
				if(mensaje.equals("Regresar")) {
					JuegosMenu jM = new JuegosMenu();
					jM.setVisible(true);
					dispose();	
				}
				
				if(mensaje.equals("Salir")) {
					System.exit(0);
				}
			}
		});
		comboBox.setBounds(0, 0, 92, 21);
		contentPane.add(comboBox);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 744, 549);
		ImageIcon icon6 = new ImageIcon(getClass().getResource("mini.jpg"));
		ImageIcon img6 = new ImageIcon(icon6.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img6));
		contentPane.add(lblFondo);
	}
}
