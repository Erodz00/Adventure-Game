package adventuurueererere;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class YourAdventure extends JComponent implements MouseListener {

	public static String nameOfApp = "Programming a Game, the Game";

	int state = 0;
	int x = 20;
	
	public YourAdventure() {
		addMouseListener(this);
	}

	public void paint(Graphics g) {
		if (state == 0) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.decode("#551A8B"));
			g.drawString("Skyrim, A text based Intereptation", 300, 50);
			g.setColor(Color.BLACK);
			g.drawString("Start", 330, 350);
			g.drawString("Load", 760, 350);
		} else if (state == 1) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.decode("#551A8B"));
			g.drawString("Let's choose your Race, What Race are you?", x, 50);
			g.setColor(Color.BLACK);
			g.drawString("Nord", x, 100);
			g.drawString("Elf", x, 150);
			g.drawString("Khajit", x, 200);
			g.drawString("Argonian", x, 250);
		} else if (state == 2) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.decode("#551A8B"));
			g.drawString("Let's choose your Race, What Race are you?", x, 50);
			g.setColor(Color.BLACK);
			g.drawString("Nord", x, 100);
			g.drawString("Elf", x, 150);
			g.drawString("Khajit", x, 200);
			g.drawString("Argonian", x, 250);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX() + ", " + e.getY());
		if (state == 0 && e.getX() >= 330 && e.getY() >= 315 && e.getX() <= 420 && e.getY() <= 350) {
			state++;
		} else if (state == 1 && e.getX() >= 330 && e.getY() >= 315 && e.getX() <= 420 && e.getY() <= 350) {
			state++;
		}
		repaint();
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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new YourAdventure());
		frame.setSize(1280, 720);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.decode("#f44e42"));
	}
	
}