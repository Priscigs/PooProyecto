import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

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
		setTitle("Descripci\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		MainMenu mM = new MainMenu();
		
		JLabel lblNewLabel = new JLabel("\r\nPequegames es un programa con juego infantiles \r\ndesarrollado para que el tiempo de sus ninios \r\npasen frente a la pantalla sea lo mas divertido y\r\nbeneficioso para ellos. Enfoncadose en el desarrollo \r\nde sus actividades cognitivas.");
		lblNewLabel.setToolTipText("\r\n");
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 416, 196);
		contentPane.add(lblNewLabel);
		
		//MenuPrincipal mM = new MenuPrincipal();
		
		JButton btnRegresar = new JButton("Regresar a Menu de Inicio");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mM.setVisible(true);
				//dispose();
			}
		});
		btnRegresar.setBounds(121, 232, 213, 21);
		contentPane.add(btnRegresar);
	}

}
