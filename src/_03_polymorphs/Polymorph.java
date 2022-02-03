package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    
    public int getX() {
	      return x;
	   }
    public void setX( int newX) {
        x = newX;
     }
    public int getY() {
	      return y;
	   }
  public void setY( int newY) {
      y = newY;
   }
  
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
   	 
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
}
