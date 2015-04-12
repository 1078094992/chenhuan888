package game;

import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Tetris extends JFrame {
	public Tetris(){
	TetrisPanel tpanel=new TetrisPanel();
	this.add(tpanel);
	}
	
	private class TetrisPanel extends Panel{
		
	}
	public static void main(String[] args) {
			JFrame frame=new JFrame();
			JMenuBar menubar= new JMenuBar();
			frame.setJMenuBar(menubar);
			
			JMenu game=new JMenu("Game");
			game.add("New game");
		    game.add("Stop");
            game.add("Comtinue");
			game.add("Exit");
			
			JMenu help=new JMenu("Help");
			help.add("About");
			
			menubar.add(game);
			menubar.add(help);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(400,600);
			frame.setLocationRelativeTo(null);
			frame.setTitle("Tetris");
			frame.setVisible(true);
			frame.setResizable(false);
		}

	}

 
