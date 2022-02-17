package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	ArrayList<Polymorph> Morphs;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		window.addMouseMotionListener(this);

		Morphs = new ArrayList<>();
		Morphs.add(new BluePolymorph(50, 50));
		Morphs.add(new RedMorph(100, 50));
		Morphs.add(new MovingMorph(150, 50));
		Morphs.add(new MouseMorph(200, 50));

		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for (int i = 0; i < Morphs.size(); i++) {
			Morphs.get(i).draw(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (int i = 0; i < Morphs.size(); i++) {
			Morphs.get(i).update();
		}

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int mouseX = arg0.getX();
		int mouseY = arg0.getY();
		for (int i = 0; i < Morphs.size(); i++) {
			Morphs.get(i).follow(mouseX, mouseY);
		}
	}
}
