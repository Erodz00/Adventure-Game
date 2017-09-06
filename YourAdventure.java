import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class YourAdventure extends JComponent implements MouseListener {

	public static String nameOfApp = "Programming a Game, the Game";
	
	
	public YourAdventure() {
		addMouseListener(this);
	}
	
	public void paint(Graphics g) {
        Font font = new Font("Comic Sans MS", Font.BOLD, 40);
        g.setFont(font);
        g.setColor(Color.decode("#551A8B"));
   
		g.drawString("Programming a game, The Game", 300, 50);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX() + ", " + e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(nameOfApp);
		frame.setResizable(false);
		frame.getDefaultCloseOperation();
		frame.add(new YourAdventure());
		frame.setSize(1280, 720);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.decode("#f44e42"));
	}

}