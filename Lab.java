import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Lab extends JFrame{

	Laberinto lab = new Laberinto();
	Laberinto maze = new Laberinto();
	CharacterMaze cM = new CharacterMaze();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab lab = new Lab();
					lab.setVisible(true);
					lab.setSize(475, 335);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lab() {
		this.getContentPane().add(maze);
		this.setResizable(true);
		//setMinimumSize(new Dimension (475, 335));
		//setBounds(100, 100, 475, 335);
	}

}
