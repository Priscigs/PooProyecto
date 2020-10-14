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

public class CrearCuenta extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField passwordField;
	private JTextField txtNombre;
	private JPasswordField passwordField_1;
	private JTextField txtCorreo;

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
		setBounds(100, 100, 442, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Leelawadee", Font.BOLD, 14));
		lblNewLabel.setBounds(95, 58, 62, 28);
		contentPane.add(lblNewLabel);

		txtUser = new JTextField();
		txtUser.setFont(new Font("Leelawadee", Font.BOLD, 14));
		txtUser.setBounds(247, 64, 96, 19);
		contentPane.add(txtUser);
		txtUser.setColumns(10);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Leelawadee", Font.BOLD, 14));
		lblContrasea.setBounds(95, 108, 77, 19);
		contentPane.add(lblContrasea);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Leelawadee", Font.BOLD, 14));
		passwordField.setBounds(247, 109, 96, 19);
		contentPane.add(passwordField);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Leelawadee", Font.BOLD, 14));
		lblNombre.setBounds(95, 221, 77, 19);
		contentPane.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Leelawadee", Font.BOLD, 14));
		txtNombre.setColumns(10);
		txtNombre.setBounds(247, 222, 96, 19);
		contentPane.add(txtNombre);

		JLabel lblConfirmarContrasea = new JLabel("<html>Confirmar Contrase\u00F1a<html>");
		lblConfirmarContrasea.setFont(new Font("Leelawadee", Font.BOLD, 14));
		lblConfirmarContrasea.setBounds(95, 155, 96, 36);
		contentPane.add(lblConfirmarContrasea);

		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Leelawadee", Font.BOLD, 14));
		passwordField_1.setBounds(247, 156, 96, 19);
		contentPane.add(passwordField_1);

		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Leelawadee", Font.BOLD, 14));
		lblCorreo.setBounds(95, 264, 77, 28);
		contentPane.add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Leelawadee", Font.BOLD, 14));
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(247, 270, 96, 19);
		contentPane.add(txtCorreo);
		
		InicioSesion iS = new InicioSesion();

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Leelawadee", Font.BOLD, 14));
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
						|| txtNombre.getText().equals("") || txtCorreo.getText().equals("")) {
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
			}
		});
		btnRegistrar.setBounds(162, 302, 103, 43);
		contentPane.add(btnRegistrar);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 436, 377);
		ImageIcon icon = new ImageIcon(getClass().getResource("crearcion.jpg"));
		ImageIcon img = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
		lblFondo.setIcon((img));
		contentPane.add(lblFondo);
	}
}
