package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JOptionPane;

public class BluePolymorph extends Polymorph{

	BluePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), 50, 50);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void follow(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clicked(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}
class RedMorph extends Polymorph {
	RedMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(getX(), getY(), 50, 50);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void follow(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clicked(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}
class MovingMorph extends Polymorph {
	MovingMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), 50, 50);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		Random randX = new Random();
		int newX = randX.nextInt(450);
		Random randY = new Random();
		int newY = randY.nextInt(450);
		setX(newX);
		setY(newY);
	}

	@Override
	public void follow(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clicked(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}
class MouseMorph extends Polymorph{
	MouseMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.orange);
		g.fillRect(getX(), getY(), 50, 50);
	}

	@Override
	public void follow(int x, int y) {
		// TODO Auto-generated method stub
		setX(x);
		setY(y);
	}

	@Override
	public void clicked(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}
class MessageMorph extends Polymorph{

	MessageMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.magenta);
		g.fillRect(getX(), getY(), 50, 50);
	}

	@Override
	public void follow(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clicked(int mouseX, int mouseY) {
		// TODO Auto-generated method stub
		if(getX() < mouseX && mouseX < getX()+50) {
			if(getY() < mouseY && mouseY < getY()+50) {
			JOptionPane.showMessageDialog(null, "Hello");
			}
		}
	}
}