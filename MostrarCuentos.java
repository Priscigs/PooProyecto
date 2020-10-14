import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class MostrarCuentos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarCuentos frame = new MostrarCuentos();
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
	public MostrarCuentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Pinocho p = new Pinocho();
		
		JButton btnNewButton = new JButton("Pinocho");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnNewButton.setBounds(192, 108, 137, 60);
		contentPane.add(btnNewButton);
		
		LiebreTortuga lT = new LiebreTortuga();
		
		JButton btnlaLiebreY = new JButton("<html>La Liebre y la Tortuga<html>");
		btnlaLiebreY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lT.setVisible(true);
			}
		});
		btnlaLiebreY.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnlaLiebreY.setBounds(192, 177, 137, 60);
		contentPane.add(btnlaLiebreY);
		
		Patito pa = new Patito();
		
		JButton btnelPatitoFeo = new JButton("<html>El Patito Feo<html>");
		btnelPatitoFeo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pa.setVisible(true);
			}
		});
		btnelPatitoFeo.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnelPatitoFeo.setBounds(192, 247, 137, 60);
		contentPane.add(btnelPatitoFeo);
		
		JLabel lblNewLabel = new JLabel("Cuentos");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblNewLabel.setBounds(177, 28, 207, 57);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
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
		comboBox.setFont(new Font("Segoe UI", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Regresar", "Salir"}));
		comboBox.setBounds(0, 0, 92, 21);
		contentPane.add(comboBox);
		
		Cerditos cer = new Cerditos();
		
		JButton btnLosTresCerditos = new JButton("Tres Cerditos");
		btnLosTresCerditos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cer.setVisible(true);
				dispose();
			}
		});
		btnLosTresCerditos.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnLosTresCerditos.setBounds(192, 317, 137, 60);
		contentPane.add(btnLosTresCerditos);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 519, 419);
		ImageIcon icon = new ImageIcon(getClass().getResource("cuentos.jpg"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
	}
}
