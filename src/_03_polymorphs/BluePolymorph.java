package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

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
		
	}
}