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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(37, 25, 45, 13);
		contentPane.add(lblNewLabel);

		txtUser = new JTextField();
		txtUser.setBounds(154, 22, 96, 19);
		contentPane.add(txtUser);
		txtUser.setColumns(10);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(37, 63, 45, 13);
		contentPane.add(lblContrasea);

		passwordField = new JPasswordField();
		passwordField.setBounds(154, 60, 96, 19);
		contentPane.add(passwordField);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(37, 143, 45, 13);
		contentPane.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(154, 140, 96, 19);
		contentPane.add(txtNombre);

		JLabel lblConfirmarContrasea = new JLabel("<html>Confirmar Contrase\u00F1a<html>");
		lblConfirmarContrasea.setBounds(37, 92, 62, 41);
		contentPane.add(lblConfirmarContrasea);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(154, 96, 96, 19);
		contentPane.add(passwordField_1);

		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(37, 186, 45, 13);
		contentPane.add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(154, 183, 96, 19);
		contentPane.add(txtCorreo);

		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setBounds(136, 233, 85, 21);
		contentPane.add(btnNewButton);
	}
}
