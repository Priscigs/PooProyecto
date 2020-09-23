import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Laberinto extends JPanel{
	
	CharacterMaze cM = new CharacterMaze();
	Juego4 j4 = new Juego4();
	
	public JButton button;
	public static int level = 1;
	
	public static void main(String[] args) {
		JFrame lab = new JFrame();
		Laberinto maze = new Laberinto();
		lab.add(maze);
		lab.setSize(475, 335);
		lab.setLocation(300, 200);
		lab.setVisible(true);
		
		lab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				Logger.getLogger(Laberinto.class.getName()).log(Level.SEVERE, null, e);
				e.printStackTrace();
			}
			maze.repaint();

			if(getNivel() > 4) {
				JOptionPane.showMessageDialog(null, "Felicidades, ¡GANASTE! \nTerminó el juego");
				System.exit(0);
			}
		}
	}
	
	public Laberinto() {
		
		JButton btnNewButton = new JButton("hola");
		btnNewButton.setBounds(450, 370, 100, 50);
		add(btnNewButton);
		
		addKeyListener(new KeyListener(){

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				cM.mover(e);
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		setFocusable(true);
	}
	
	public static int niveles() {
		return level++;
	}
	
	public void paint(Graphics dibujo) {
		cM.paint(dibujo);
		j4.paint(dibujo);
	}
	
	public static int getNivel() {
		return level;
	}
}
