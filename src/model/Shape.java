package model;

import java.awt.Graphics;

public interface Shape {
	public void draw(Graphics g);
	
	public void update(Graphics g, int x, int y);
}
