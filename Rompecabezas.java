import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class Rompecabezas extends JFrame {

	private JPanel contentPane;
	String usuario;
	JFrame ventana;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rompecabezas frame = new Rompecabezas();
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
	public Rompecabezas() {
		setTitle("Rompecabezas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(730, 100, 792, 677);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton B1 = new JButton("");

		B1.setBounds(5, 30, 256, 202);
		ImageIcon icon = new ImageIcon(getClass().getResource("tres.jpg"));
		ImageIcon img = new ImageIcon(
				icon.getImage().getScaledInstance(B1.getWidth(), B1.getHeight(), Image.SCALE_SMOOTH));
		contentPane.setLayout(null);
		B1.setIcon((img));
		B1.setVisible(false);
		contentPane.add(B1);

		JButton B2 = new JButton("");

		B2.setBounds(261, 30, 256, 202);
		ImageIcon icon2 = new ImageIcon(getClass().getResource("ocho.jpg"));
		ImageIcon img2 = new ImageIcon(
				icon2.getImage().getScaledInstance(B2.getWidth(), B2.getHeight(), Image.SCALE_SMOOTH));
		B2.setIcon((img2));
		B2.setVisible(false);
		contentPane.add(B2);

		JButton B3 = new JButton("");

		B3.setBounds(517, 30, 256, 202);
		ImageIcon icon3 = new ImageIcon(getClass().getResource("siete.jpg"));
		ImageIcon img3 = new ImageIcon(
				icon3.getImage().getScaledInstance(B3.getWidth(), B3.getHeight(), Image.SCALE_SMOOTH));
		B3.setIcon((img3));
		B3.setVisible(false);
		contentPane.add(B3);

		JButton B4 = new JButton("");

		B4.setBounds(5, 235, 256, 202);
		ImageIcon icon4 = new ImageIcon(getClass().getResource("dos.jpg"));
		ImageIcon img4 = new ImageIcon(
				icon4.getImage().getScaledInstance(B4.getWidth(), B4.getHeight(), Image.SCALE_SMOOTH));
		B4.setIcon((img4));
		B4.setVisible(false);
		contentPane.add(B4);

		JButton B5 = new JButton("");

		B5.setBounds(261, 235, 256, 202);
		ImageIcon icon5 = new ImageIcon(getClass().getResource("seis.jpg"));
		ImageIcon img5 = new ImageIcon(
				icon5.getImage().getScaledInstance(B5.getWidth(), B5.getHeight(), Image.SCALE_SMOOTH));
		B5.setIcon((img5));
		B5.setVisible(false);
		contentPane.add(B5);

		JButton B6 = new JButton("");

		B6.setBounds(517, 235, 256, 202);
		ImageIcon icon6 = new ImageIcon(getClass().getResource("uno.jpg"));
		ImageIcon img6 = new ImageIcon(
				icon6.getImage().getScaledInstance(B6.getWidth(), B6.getHeight(), Image.SCALE_SMOOTH));
		B6.setIcon((img6));
		B6.setVisible(false);
		contentPane.add(B6);

		JButton B7 = new JButton("");

		B7.setBounds(5, 440, 256, 202);
		ImageIcon icon7 = new ImageIcon(getClass().getResource("cinco.jpg"));
		ImageIcon img7 = new ImageIcon(
				icon7.getImage().getScaledInstance(B7.getWidth(), B7.getHeight(), Image.SCALE_SMOOTH));
		B7.setIcon((img7));
		B7.setVisible(false);
		contentPane.add(B7);

		JButton B8 = new JButton("");

		B8.setBounds(261, 440, 256, 202);
		ImageIcon icon8 = new ImageIcon(getClass().getResource("cuatro.jpg"));
		ImageIcon img8 = new ImageIcon(
				icon8.getImage().getScaledInstance(B8.getWidth(), B8.getHeight(), Image.SCALE_SMOOTH));
		B8.setIcon((img8));
		B8.setVisible(false);
		contentPane.add(B8);

		JButton B9 = new JButton("");

		B9.setBounds(517, 440, 256, 202);
		ImageIcon icon9 = new ImageIcon(getClass().getResource("nueve.jpg"));
		ImageIcon img9 = new ImageIcon(
				icon9.getImage().getScaledInstance(B9.getWidth(), B9.getHeight(), Image.SCALE_SMOOTH));
		B9.setIcon((img9));
		B9.setVisible(false);
		contentPane.add(B9);

		JComboBox comboBox = new JComboBox();
		TiempoFYC tiempo = new TiempoFYC();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = comboBox.getSelectedItem().toString();
				
				if (mensaje.equals("Jugar")) {
					
					// Instanciar fecha
					Date fecha = new Date();
					DateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					
					//Instanciar usuarios y sqlusuarios
					SQLUsuarios sqlU = new SQLUsuarios();
					Usuarios u = new Usuarios();
					
					usuario = JOptionPane.showInputDialog(ventana, "Nombre del Jugador", "Escribe aqui...");
					while (usuario == null || usuario.compareTo("Escribe aqui...") == 0 || usuario.compareTo("") == 0) {
						usuario = JOptionPane.showInputDialog(ventana, "Debe ingresar usuario", "Escriba aqui..");
					}
					
					//Verificación de todos los campos
					if(!usuario.equals("")) {
						u.setNombreN(usuario);
						u.setInicioTRompe(formato.format(fecha));
						System.out.println(formato.toString());
						
						//Se abre la nueva pestaña en caso que sea correcto el login
						if (sqlU.cronoInicioRompe(u)) {
							tiempo.setVisible(true);
							Sonido sound = new Sonido();
							sound.ReproducirSonido("src/008699998_prev.wav");
						}
						else {
							JOptionPane.showMessageDialog(null, "Datos incorrectos, intente de nuevo");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Llenar los campos por favor");

					}
					
					B1.setVisible(true);
					B2.setVisible(true);
					B3.setVisible(true);
					B4.setVisible(true);
					B5.setVisible(true);
					B6.setVisible(true);
					B7.setVisible(true);
					B8.setVisible(true);
					B9.setVisible(false);
				}
				
				if (mensaje.equals("Ayuda")) {
					InfoRompe iR = new InfoRompe();
					iR.setVisible(true);
				}

				if (mensaje.equals("Regresar")) {
					Juegos jM = new Juegos();
					jM.setVisible(true);
					tiempo.setVisible(false);
					dispose();
				}

				if (mensaje.equals("Salir")) {
					System.exit(0);
				}
			}
		});
		comboBox.setFont(new Font("Segoe UI", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Jugar", "Ayuda", "Regresar", "Salir"}));
		comboBox.setBounds(5, 0, 101, 21);
		contentPane.add(comboBox);


		B9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B6.isVisible() == false) {
					B6.setIcon(B9.getIcon());
					B9.setVisible(false);
					B6.setVisible(true);
				} else if (B8.isVisible() == false) {
					B8.setIcon(B9.getIcon());
					B9.setVisible(false);
					B8.setVisible(true);
				}
			}
		});

		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B9.isVisible() == false) {
					B9.setIcon(B8.getIcon());
					B8.setVisible(false);
					B9.setVisible(true);
				} else if (B7.isVisible() == false) {
					B7.setIcon(B8.getIcon());
					B8.setVisible(false);
					B7.setVisible(true);
				} else if (B5.isVisible() == false) {
					B5.setIcon(B8.getIcon());
					B8.setVisible(false);
					B5.setVisible(true);
				}
			}
		});

		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B8.isVisible() == false) {
					B8.setIcon(B7.getIcon());
					B7.setVisible(false);
					B8.setVisible(true);
				}
				if (B4.isVisible() == false) {
					B4.setIcon(B7.getIcon());
					B7.setVisible(false);
					B4.setVisible(true);
				}
			}
		});

		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B9.isVisible() == false) {
					B9.setIcon(B6.getIcon());
					B6.setVisible(false);
					B9.setVisible(true);
				} else if (B3.isVisible() == false) {
					B3.setIcon(B6.getIcon());
					B6.setVisible(false);
					B3.setVisible(true);
				} else if (B5.isVisible() == false) {
					B5.setIcon(B6.getIcon());
					B6.setVisible(false);
					B5.setVisible(true);
				}
			}
		});

		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B2.isVisible() == false) {
					B2.setIcon(B5.getIcon());
					B5.setVisible(false);
					B2.setVisible(true);
				} else if (B4.isVisible() == false) {
					B4.setIcon(B5.getIcon());
					B5.setVisible(false);
					B4.setVisible(true);
				} else if (B6.isVisible() == false) {
					B6.setIcon(B5.getIcon());
					B5.setVisible(false);
					B6.setVisible(true);
				} else if (B8.isVisible() == false) {
					B8.setIcon(B5.getIcon());
					B5.setVisible(false);
					B8.setVisible(true);
				}
			}
		});

		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B1.isVisible() == false) {
					B1.setIcon(B4.getIcon());
					B4.setVisible(false);
					B1.setVisible(true);
				} else if (B5.isVisible() == false) {
					B5.setIcon(B4.getIcon());
					B4.setVisible(false);
					B5.setVisible(true);
				} else if (B7.isVisible() == false) {
					B7.setIcon(B4.getIcon());
					B4.setVisible(false);
					B7.setVisible(true);
				}
			}
		});

		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B2.isVisible() == false) {
					B2.setIcon(B3.getIcon());
					B3.setVisible(false);
					B2.setVisible(true);
				} else if (B6.isVisible() == false) {
					B6.setIcon(B3.getIcon());
					B3.setVisible(false);
					B6.setVisible(true);
				}
			}
		});

		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B1.isVisible() == false) {
					B1.setIcon(B2.getIcon());
					B2.setVisible(false);
					B1.setVisible(true);
				} else if (B3.isVisible() == false) {
					B3.setIcon(B2.getIcon());
					B2.setVisible(false);
					B3.setVisible(true);
				} else if (B5.isVisible() == false) {
					B5.setIcon(B2.getIcon());
					B2.setVisible(false);
					B5.setVisible(true);
				}
			}
		});

		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (B2.isVisible() == false) {
					B2.setIcon(B1.getIcon());
					B1.setVisible(false);
					B2.setVisible(true);
				} else if (B4.isVisible() == false) {
					B4.setIcon(B1.getIcon());
					B1.setVisible(false);
					B4.setVisible(true);
				}
			}
		});
	}
}
