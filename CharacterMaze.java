import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class CharacterMaze {
	
	private int x = 20;
	private int y = 20;
	private int xSegunda = 0;
	private int ySegunda = 0;
	private int width = 20;
	private int height = 20;
	private int personaje = 20;
	
	Juego4 j4 = new Juego4();
	
	private int[][] maze = j4.maze();
	
	public void paint(Graphics dibujo) {
		dibujo.setColor(Color.yellow);
		dibujo.fillRect(x, y, width, height);
		
		dibujo.setColor(Color.white);
		dibujo.fillOval(x+7, y+8, 5, 5);
	}
	
	public void mover(KeyEvent evento) {
		
		if(evento.getKeyCode() == 38) {//w
			if(maze[(y/20) - 1][x/20] != 1) {
				y -= personaje;
			}
		}
		
		if(evento.getKeyCode() == 37) {//a
			if(maze[y/20][(x/20) - 1] != 1) {
				x -= personaje;
			}
		}

		if(evento.getKeyCode() == 40) {//s
			if(maze[(y/20) + 1][x/20] != 1) {
				y += personaje;
			}
		}

		if(evento.getKeyCode() == 39) {//d
			if(maze[y/20][(x/20) + 1] != 1) {
				x += personaje;
			}
		}
		
		if(evento.getKeyChar() == 'w') {//w
			if(maze[(y/20) - 1][x/20] != 1) {
				y -= personaje;
			}
		}
		
		if(evento.getKeyChar() == 'a') {//a
			if(maze[y/20][(x/20) - 1] != 1) {
				x -= personaje;
			}
		}

		if(evento.getKeyChar() == 's') {//s
			if(maze[(y/20) + 1][x/20] != 1) {
				y += personaje;
			}
		}

		if(evento.getKeyChar() == 'd') {//d
			if(maze[y/20][(x/20) + 1] != 1) {
				x += personaje;
			}
		}
		
		if(xSegunda == 422 && ySegunda == 255) {//475, 335  422, 255
			Laberinto.niveles();
			x = 20;
			y = 20;
		}
	}
}
