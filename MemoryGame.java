import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Javier Aguilar 
public class MemoryGame {
	
	JFrame ventana;
	JPanel panelP;
	JLabel fondoP;
	JLabel botonJugar;
	
	JPanel panelJuego;
	JLabel juego[][];
	int num [][];
	String usuario;
	Random aleatorio;
	
	public MemoryGame() {
		//ventana Principal
		ventana= new JFrame("Juego de Memoria");
		ventana.setSize(600, 600);
		ventana.setLayout(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		
		//Jpanel presentacion
		panelP= new JPanel();
		panelP.setSize(ventana.getWidth(), ventana.getHeight());
		panelP.setLocation(0, 0);
		panelP.setLayout(null);
		panelP.setVisible(true);
		
		
		//fondo principal
		fondoP=new JLabel();
		fondoP.setSize(ventana.getWidth(), ventana.getHeight());
		fondoP.setLocation(0,0);
		fondoP.setIcon(new ImageIcon("imagenes/portada.jpg"));
		fondoP.setVisible(true);
		panelP.add(fondoP,0);
		
		
		// boton de jugar
		botonJugar=new JLabel();
		botonJugar.setSize(225, 224);
		botonJugar.setLocation(25,0);
		botonJugar.setIcon(new ImageIcon("imagenes/jugar.png"));
		botonJugar.setVisible(true);
		panelP.add(botonJugar,0);
		
		panelJuego= new JPanel();
		panelJuego.setSize(ventana.getWidth(), ventana.getHeight());
		panelJuego.setLocation(0, 0);
		panelJuego.setLayout(null);
		panelJuego.setVisible(true);
		
		num =new int[4][5];
		aleatorio=new Random();
		this.num_Aleatorios();
		
		
		botonJugar.addMouseListener (new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				//System.out.print("se presiono");
				
				
				
				
			}
		
		});
		
		
		
			
		
		ventana.add(panelP);
		ventana.setVisible(true);
		
	}
	
	public void num_Aleatorios() {
		int veces=0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				num[i][j]=0;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				num[i][j]= aleatorio.nextInt(10)+1;
				do {
					veces=0;
				
					for (int k = 0; k < 4; k++) {
						for (int l = 0; l < 5; l++) {
							if(num[i][j]== num[k][l]) {
								veces+=1;
							}
						}
					}
					if(veces==3) {
						num[i][j]= aleatorio.nextInt(10)+1;
					}
				
				}while(veces==3);
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(num[i][j]+"   ");
			}
			System.out.println("");
		}
			
	}
}
