package controller;

import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import model.Circle;
import model.Point;
import view.MyDisplay;

public class MouseController implements MouseMotionListener{
	
	private Circle c;
	private MyDisplay d;
	
	public MouseController(Circle c, MyDisplay d) {
		// TODO Auto-generated constructor stub
		this.c = c;
		this.d = d;
	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		this.d.update_circle(e.getX(), e.getY());
	}
	
	@Override
	public void mouseDragged(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
	}
}
