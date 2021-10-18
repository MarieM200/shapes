package model;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Shapes{
	private Point center;
	private int radius;
	
	public Circle(Point p, int r) {
		// TODO Auto-generated constructor stub
		this.center = new Point(p.getX(), p.getY());//correction
		this.radius = r;	
	}
	
	public double area() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	@Override
	public void draw(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
	     g2d.drawOval(this.getCenter().getX(), this.getCenter().getY(), this.radius, 100);
	}
	
	@Override
	public void update(Graphics g, int x, int y){
		g.drawOval(x, y,  this.radius, 100);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "centre : (" + this.center.getX() + "," + this.center.getY() + "), radius : " + this.radius + " area : " + this.area();
	}
	
	public void translate(int dx, int dy) {
		this.center.translate(dx, dy);
	}
	
	public Point getCenter() {
		return this.center;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public boolean contains(Point p) {
		double temp, temp2;
		temp = p.getX() - this.center.getX();
		temp = Math.pow(temp, 2);
		temp2 = p.getY() - this.center.getY();
		temp2 = Math.pow(temp2, 2);
		temp = temp + temp2;
		if (temp < Math.pow(this.radius, 2)) return true;
		return false;
	}
}
