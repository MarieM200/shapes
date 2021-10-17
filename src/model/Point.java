package model;

public class Point {
	private int x;
	private int y;
	
	public Point(int px, int py) {
		// TODO Auto-generated constructor stub
		this.x = px;
		this.y = py;
	}
	
	public Point(Point p2) {
		// TODO Auto-generated constructor stub
		this.x = p2.x;
		this.y = p2.y;
	}
	
	public void afficher() {
		//Point p = new Point();
		System.out.println(this.x + " " + this.y);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + this.x + "," + this.y + ")";
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean isSameAs(Point p) {
		if(p.x == this.x && p.y==this.y) return true;
		return false;
	}
	
	public Point translate(int dx, int dy) { 
		Point p = new Point(this.x + dx, this.y + dy);//correction
		return p;
	}
	
}
