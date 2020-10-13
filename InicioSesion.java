import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class InicioSesion extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtContra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
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
	public InicioSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUser = new JTextField();
		txtUser.setBounds(188, 57, 96, 19);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(65, 60, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(65, 106, 70, 13);
		contentPane.add(lblContrasea);
		
		JuegosMenu jM = new JuegosMenu();
		
		JButton btnInicio = new JButton("Iniciar Sesi\u00F3n");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Instanciar fecha
				Date fecha = new Date();
				DateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				
				//Instancias usuarios y sqlusuarios
				SQLUsuarios sqlU = new SQLUsuarios();
				Usuarios u = new Usuarios();
				
				//convierto en String la contraseña
				String contra = new String(txtContra.getPassword());
				
				//Verificación de datos
				if(!txtUser.getText().equals("") && !contra.equals("")) {
					//String newP = Cifrado.sha1(contra);
					u.setUser(txtUser.getText());
					u.setPassword(contra);
					u.setSesion(formato.format(fecha));
					
					//Se abre la nueva pestaña en caso que sea correcto el login
					if(sqlU.inicioSesion(u)) {
						jM.setVisible(true);
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Datos incorrectos, intente de nuevo");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Llenar los campos por favor");

				}
				
				//Borrar datos
				txtUser.setText(null);
				txtContra.setText(null);
			}
		});
		btnInicio.setBounds(81, 191, 108, 29);
		contentPane.add(btnInicio);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(245, 191, 108, 29);
		contentPane.add(btnSalir);
		
		txtContra = new JPasswordField();
		txtContra.setBounds(188, 103, 96, 19);
		contentPane.add(txtContra);
	}

}
