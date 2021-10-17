package user;

import java.awt.Dimension;

import javax.swing.JFrame;

import controller.MouseController;
import model.Circle;
import model.Point;
import view.MyDisplay;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(new Point(150, 150), 100);
		
		JFrame frame = new JFrame("Java Avancee - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay(c);
		MouseController m = new MouseController(c, d);
		frame.add(d);
		frame.addMouseMotionListener(m);
		
	}

}
