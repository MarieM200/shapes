package view;

//import java.awt.Dimension;
//import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import model.Circle;

public class MyDisplay extends JPanel{
	
	private Circle c;
	
	public MyDisplay(Circle c) {
		// TODO Auto-generated constructor stub
		this.c = c;
	}
	
	@Override
	 public void paint(Graphics g) {
	     //Graphics2D g2d = (Graphics2D) g;
	     //g2d.drawOval(c.getCenter().getX(), c.getCenter().getY(), c.getRadius(), 100);
	     // remarque : le draw doit etre dans circle car si on veut ajouter d'autres formes, cela ne fonctionnera pas
		c.draw(g);
	 }
	
	public void update_circle(int x, int y) {
		Graphics g;
		g = this.getGraphics();
		g.clearRect(0, 0, getWidth(), getHeight());
		c.update(g, x, y);
		
	}
	
	 /*@Override
	 public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 g.drawLine(20, 50, 460, 50);
	 }*/
	
	 /*public static void main(String []args){
		 JFrame frame = new JFrame("Java Avancee - Graphic Display");
		 frame.setSize(new Dimension(500,500));
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 Circle c = new Circle(new Point(150, 150), 100);
		 
		 MyDisplay d = new MyDisplay(c); //1e appel de paintComponent
		 frame.add(d); //2e appel et affichage
	  }*/

}
