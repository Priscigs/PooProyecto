import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;

public class CrearCuenta extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField passwordField;
	private JTextField txtNombre;
	private JPasswordField passwordField_1;
	private JTextField txtCorreo;
	private JTextField txtNino;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearCuenta frame = new CrearCuenta();
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
	public CrearCuenta() {
		setTitle("Crear Cuenta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
		lblNewLabel.setBounds(73, 55, 132, 28);
		contentPane.add(lblNewLabel);

		txtUser = new JTextField();
		txtUser.setFont(new Font("Dialog", Font.BOLD, 15));
		txtUser.setBounds(247, 64, 96, 19);
		contentPane.add(txtUser);
		txtUser.setColumns(10);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
		lblContrasea.setBounds(73, 105, 132, 19);
		contentPane.add(lblContrasea);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Dialog", Font.BOLD, 15));
		passwordField.setBounds(247, 109, 96, 19);
		contentPane.add(passwordField);

		JLabel lblNombre = new JLabel("<html>Nombre Encargado<html>");
		lblNombre.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
		lblNombre.setBounds(73, 220, 132, 46);
		contentPane.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Dialog", Font.BOLD, 15));
		txtNombre.setColumns(10);
		txtNombre.setBounds(247, 222, 96, 19);
		contentPane.add(txtNombre);

		JLabel lblConfirmarContrasea = new JLabel("<html>Confirmar Contrase\u00F1a<html>");
		lblConfirmarContrasea.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
		lblConfirmarContrasea.setBounds(73, 152, 132, 43);
		contentPane.add(lblConfirmarContrasea);

		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Dialog", Font.BOLD, 15));
		passwordField_1.setBounds(247, 156, 96, 19);
		contentPane.add(passwordField_1);

		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
		lblCorreo.setBounds(73, 291, 132, 28);
		contentPane.add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Dialog", Font.BOLD, 15));
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(247, 295, 96, 19);
		contentPane.add(txtCorreo);
		
		txtNino = new JTextField();
		txtNino.setFont(new Font("Dialog", Font.BOLD, 15));
		txtNino.setColumns(10);
		txtNino.setBounds(247, 344, 96, 19);
		contentPane.add(txtNino);
		
		InicioSesion iS = new InicioSesion();

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBackground(new Color(153, 204, 255));
		btnRegistrar.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Instanciar usuarios y sqlusuarios
				SQLUsuarios sqlU = new SQLUsuarios();
				Usuarios u = new Usuarios();

				//Convierto en String la contraseña
				String contra = new String(passwordField.getPassword());
				String contraCon = new String(passwordField_1.getPassword());

				//Verificar que se llenen todos los datos
				if (txtUser.getText().equals("") || contra.equals("") || contraCon.equals("")
						|| txtNombre.getText().equals("") || txtCorreo.getText().equals("") || 
						txtNino.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Por favor llenar todos los campos");
				} else {
					
					//Verificación de contraseñas iguales
					if (contra.equals(contraCon)) {
						
						//Verificación de usuarios no repetidos
						if (sqlU.verificarUsuario(txtUser.getText()) == 0) {
							// String newP = Cifrado.sha1(contra);
							u.setUser(txtUser.getText());
							u.setPassword(contra);
							u.setNombre(txtNombre.getText());
							u.setCorreo(txtCorreo.getText());
							u.setNombreN(txtNino.getText());
							
							//Creación de la cuenta del usuario
							if (sqlU.register(u)) {
								JOptionPane.showMessageDialog(null, "Cuenta creada con éxito");
								iS.setVisible(true);
								dispose();
							} else {
								JOptionPane.showMessageDialog(null,
										"Intente de nuevo, hubo un error en la creación de la cuenta");
							}
						} else {
							JOptionPane.showMessageDialog(null, "El usuario ya existe, intente de nuevo");
						}

					} else {
						JOptionPane.showMessageDialog(null, "Intente de nuevo, las contraseña no coinciden");
					}
				}

				//Borrar datos
				txtUser.setText(null);
				passwordField.setText(null);
				passwordField_1.setText(null);
				txtNombre.setText(null);
				txtCorreo.setText(null);
				txtNino.setText(null);
			}
		});
		btnRegistrar.setBounds(134, 412, 138, 43);
		contentPane.add(btnRegistrar);
		
		JLabel lblnombreDelNioa = new JLabel("<html>Nombre del ni\u00F1o/a<html>");
		lblnombreDelNioa.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
		lblnombreDelNioa.setBounds(73, 343, 121, 45);
		contentPane.add(lblnombreDelNioa);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFondo.setBounds(0, 0, 436, 507);
		ImageIcon icon = new ImageIcon(getClass().getResource("fondoCarro.jpg"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
	}
}
