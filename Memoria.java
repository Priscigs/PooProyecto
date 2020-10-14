import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

//Javier Aguilar 
public class Memoria{

	JFrame ventana;
	JPanel panelP;
	JLabel fondoP;
	JLabel botonJugar;
	JLabel nombreJ;
	JPanel panelJuego;
	JLabel fondoJ;
	JLabel juego[][];
	int num[][];
	int matAux[][];
	String usuario;
	Random aleatorio;
	Timer tiempo, tiempoE1;
	JLabel cronometro;
	int min, seg, contador, contadorS, x1, x2, num1, antx, anty, num2, newx, newy;

	public Memoria() {
		// ventana Principal
		ventana = new JFrame("Juego de Memoria");
		ventana.setSize(600, 600);
		ventana.getContentPane().setLayout(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);

		// Jpanel presentacion
		panelP = new JPanel();
		panelP.setSize(ventana.getWidth(), ventana.getHeight());
		panelP.setLocation(0, 0);
		panelP.setLayout(null);
		panelP.setVisible(true);

		// fondo principal
		fondoP = new JLabel();
		fondoP.setSize(ventana.getWidth(), ventana.getHeight());
		fondoP.setLocation(0, 0);
		fondoP.setIcon(new ImageIcon("imagenes/Portada1.jpg"));
		fondoP.setVisible(true);
		panelP.add(fondoP, 0);

		// boton de jugar
		botonJugar = new JLabel();
		botonJugar.setSize(120, 200);
		botonJugar.setLocation(490, 15);
		botonJugar.setIcon(new ImageIcon("imagenes/jugar.png"));
		botonJugar.setVisible(true);
		panelP.add(botonJugar, 0);

		panelJuego = new JPanel();
		panelJuego.setSize(ventana.getWidth(), ventana.getHeight());
		panelJuego.setLocation(0, 0);
		panelJuego.setLayout(null);
		panelJuego.setVisible(true);

		// fondo de juego
		fondoJ = new JLabel();
		fondoJ.setSize(ventana.getWidth(), ventana.getHeight());
		fondoJ.setLocation(0, 0);
		fondoJ.setIcon(new ImageIcon("imagenes/FondoJ.jpg"));
		fondoJ.setVisible(true);
		panelJuego.add(fondoJ, 0);

		// nombre del jugador
		nombreJ = new JLabel();
		nombreJ.setSize(150, 20);
		nombreJ.setLocation(20, 10);
		nombreJ.setForeground(Color.BLACK);
		nombreJ.setVisible(true);
		panelJuego.add(nombreJ, 0);

		// nombre del jugador
		cronometro = new JLabel();
		cronometro.setSize(150, 20);
		cronometro.setLocation(ventana.getWidth() - 200, 10);
		cronometro.setForeground(Color.BLACK);
		cronometro.setVisible(true);
		panelJuego.add(cronometro, 0);

		num = new int[4][5];
		matAux = new int[4][5];
		aleatorio = new Random();
		this.num_Aleatorios();

		// matriz imagenes
		JLabel[][] matriz = new JLabel[4][5];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = new JLabel();
				matriz[i][j].setBounds(85 + (i * 100), 35 + (j * 100), 100, 100);
				matriz[i][j].setIcon(new ImageIcon("imagenes/" + matAux[i][j] + ".jpg"));
				matriz[i][j].setVisible(true);
				panelJuego.add(matriz[i][j], 0);
			}

		}
		// Tiempo de juego
		min = 0;
		seg = 0;
		tiempo = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				seg++;
				if (seg == 60) {
					min++;
					seg = 0;
				}
				cronometro.setText("Tiempo: " + min + ":" + seg);
			}
		});
		// Tiempo de espera
		contadorS = 0;
		Timer tiempoE = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contadorS++;

			}
		});
		tiempoE.start();
		tiempoE.stop();
		contadorS = 0;
		// Evento clic cartas
		contador = 0;
		x1 = 0;
		x2 = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j].addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						for (int j2 = 0; j2 < 4; j2++) {
							for (int j3 = 0; j3 < 5; j3++) {
								if (e.getSource() == matriz[j2][j3]) {
									// System.out.println(j2+" "+j3);

									if (matAux[j2][j3] == 0 && contador != 2) {
										matAux[j2][j3] = num[j2][j3];
										matriz[j2][j3].setIcon(new ImageIcon("imagenes/" + matAux[j2][j3] + ".jpg"));
										contador++;
										num2 = num[j2][j3];
										newx = j2;
										newy = j3;
										if (contador == 1) {
											num1 = num[j2][j3];
											antx = j2;
											anty = j3;
										}

										tiempoE1 = new Timer(500, new ActionListener() {
											public void actionPerformed(ActionEvent e) {

												if (contador == 2 && x2 == 0) {
													tiempoE.restart();
													x2 = 1;
												}
												if (contador == 2 && contadorS == 1) {
													tiempoE.stop();
													contadorS = 0;
													if (matAux[newx][newy] == matAux[antx][anty]) {
														matAux[newx][newy] = -1;
														matAux[antx][anty] = -1;
														matriz[newx][newy].setIcon(new ImageIcon(
																"imagenes/" + matAux[newx][newy] + ".jpg"));
														matriz[antx][anty].setIcon(new ImageIcon(
																"imagenes/" + matAux[antx][anty] + ".jpg"));
														contador = 0;
														int veces = 0;
														for (int m = 0; m < 4; m++) {
															for (int n = 0; n < 5; n++) {
																if (matAux[m][n] == -1) {
																	veces++;
																}
															}
														}
														if (veces == 20) {
															tiempo.stop();
															JOptionPane.showMessageDialog(ventana,
																	"Felecidades Ganaste, Tiempo: " + min + ":" + seg);
														}
													}
													for (int j4 = 0; j4 < 4; j4++) {
														for (int j5 = 0; j5 < 5; j5++) {
															if (matAux[j4][j5] != 0 && matAux[j4][j5] != -1) {
																matAux[j4][j5] = 0;
																matriz[j4][j5].setIcon(new ImageIcon(
																		"imagenes/" + matAux[j4][j5] + ".jpg"));
																contador = 0;
															}
														}
													}
													tiempoE1.stop();
													x2 = 0;
												}
											}
										});
										if (x1 == 0) {
											tiempoE1.start();
											x1 = 1;
										}
										if (contador == 2) {
											tiempoE.restart();
										}
									}

								}
							}
						}
					}
				});
			}
		}

		botonJugar.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				// System.out.print("se presiono");

				usuario = JOptionPane.showInputDialog(ventana, "Nombre del Jugador", "Escribe aqui...");
				while (usuario == null || usuario.compareTo("Escribe aqui...") == 0 || usuario.compareTo("") == 0) {
					usuario = JOptionPane.showInputDialog(ventana, "Debe ingresar usuario", "Escriba aqui..");
				}
				nombreJ.setText("Jugador: " + usuario);
				tiempo.start();
				panelP.setVisible(false);
				ventana.getContentPane().add(panelJuego);
				panelJuego.setVisible(true);

			}

		});

		ventana.getContentPane().add(panelP);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = comboBox.getSelectedItem().toString();
				
				if(mensaje.equals("Regresar")) {
					Juegos j = new Juegos();
					j.setVisible(true);	
				}
				
				if(mensaje.equals("Salir")) {
					System.exit(0);
				}
			}
		});
		comboBox.setFont(new Font("Segoe UI", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Regresar", "Salir"}));
		comboBox.setBounds(0, 0, 92, 21);
		panelP.add(comboBox);
		ventana.setVisible(true);

	}

	public void num_Aleatorios() {
		int veces = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				num[i][j] = 0;
				matAux[i][j] = 0;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				num[i][j] = aleatorio.nextInt(10) + 1;
				do {
					veces = 0;

					for (int k = 0; k < 4; k++) {
						for (int l = 0; l < 5; l++) {
							if (num[i][j] == num[k][l]) {
								veces += 1;
							}
						}
					}
					if (veces == 3) {
						num[i][j] = aleatorio.nextInt(10) + 1;
					}

				} while (veces == 3);
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(num[i][j] + "   ");
			}
			System.out.println("");
		}

	}
}