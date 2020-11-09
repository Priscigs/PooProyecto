import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;

public class TiempoFYC extends JFrame {

	private JPanel contentPane;
	private Timer tiempo;
	int hora, seg, min;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TiempoFYC frame = new TiempoFYC();
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
	public TiempoFYC() {
		setTitle("Tiempo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 249);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 160, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel cronometro = new JLabel("");
		cronometro.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 50));
		cronometro.setBounds(30, 60, 352, 70);
		contentPane.add(cronometro);

		// Tiempo de juego
		hora = 0;
		min = 0;
		seg = 0;
		tiempo = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				++seg;
				if(seg == 60) {
					seg = 0;
					min++;
					if (min == 60) {
						hora++;
						min = 0;
					}
				}
				cronometro.setText("Tiempo: " + (hora<=9?"0":"") + hora + ":" + (min<=9?"0":"") + min + ":" + (seg<=9?"0":"") + seg);
				
			}
		});
		
		tiempo.start();
	}

}
