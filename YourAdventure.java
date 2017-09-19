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
	String race = "default";
	String abil = "default";


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
			g.drawString("I see, so you are a " + race + " correct?", x, 50);
			g.setColor(Color.BLACK);
			g.drawString("Yes", x, 100);
			g.drawString("No", x, 150);
		} else if (state == 3) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.decode("#551A8B"));
			g.drawString("What Class do you wish to be?", x, 50);
			g.setColor(Color.BLACK);
			g.drawString("Warrior", x, 100);
			g.drawString("Archer", x, 150);
			g.drawString("Mage", x, 200);
		} else if (state == 4) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.decode("#551A8B"));
			g.drawString("So you are a " + race + " " + abil + " then?", x, 50);
			g.setColor(Color.BLACK);
			g.drawString("Yes", x, 100);
			g.drawString("No", x, 150);
		} else if (state == 5) {
			Font font = new Font("Impact", Font.BOLD, 40);
			g.setFont(font);
			g.setColor(Color.decode("#551A8B"));
			g.drawString("cok", x, 50);
			g.setColor(Color.BLACK);
			g.drawString("Yes", x, 100);
			g.drawString("No", x, 150);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX() + ", " + e.getY());
		
		if(e.getX() >= 1120 && e.getY() >= 537 && e.getX() <= 1269 && e.getY() <= 688){
			state=3;
		}
		
		if (state == 0 && e.getX() >= 330 && e.getY() >= 315 && e.getX() <= 420 && e.getY() <= 350) {
			state++;
			System.out.print(state);

		} else if (state == 1 && e.getX() >= 20 && e.getY() >= 66 && e.getX() <= 105 && e.getY() <= 101) {
			race = "Nord";
			state++;
			System.out.print(state);
		} else if (state == 1 && e.getX() >= 20 && e.getY() >= 120 && e.getX() <= 70 && e.getY() <= 151) {
			race = "Elf";
			state++;
			System.out.print(state);

		} else if (state == 1 && e.getX() >= 20 && e.getY() >= 166 && e.getX() <= 130 && e.getY() <= 201) {
			race = "Khajit";
			state++;
			System.out.print(state);

		} else if (state == 1 && e.getX() >= 20 && e.getY() >= 215 && e.getX() <= 184 && e.getY() <= 252) {
			race = "Argonian";
			state++;
			System.out.print(state);

		} else if (state == 2 && e.getX() >= 20 && e.getY() >= 66 && e.getX() <= 84 && e.getY() <= 99) {
			state++;
			System.out.print(state);
		} else if (state == 2 && e.getX() >= 20 && e.getY() >= 116 && e.getX() <= 68 && e.getY() <= 150) {
			state--;
			System.out.print(state);
		} else if (state == 3 && e.getX() >= 20 && e.getY() >= 66 && e.getX() <= 161 && e.getY() <= 100) {
			state++;
			abil="Warrior";
		} else if (state == 3 && e.getX() >= 20 && e.getY() >= 117 && e.getX() <= 141 && e.getY() <= 152) {
			state++;
			abil="Archer";
		} else if (state == 3 && e.getX() >= 20 && e.getY() >= 166 && e.getX() <= 117 && e.getY() <= 203) {
			state++;
			abil="Mage";
		} else if (state == 4 && e.getX() >= 20 && e.getY() >= 66 && e.getX() <= 84 && e.getY() <= 99) {
			state++;
			System.out.print(state);
		} else if (state == 4 && e.getX() >= 20 && e.getY() >= 116 && e.getX() <= 68 && e.getY() <= 150) {
			state--;
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
