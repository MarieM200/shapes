package controller;

import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import model.Circle;
import model.Point;
import view.MyDisplay;

public class MouseController implements MouseMotionListener{
	
	private MyDisplay d;
	
	public MouseController(MyDisplay d) {
		// TODO Auto-generated constructor stub
		this.d = d;
	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		this.d.update_graph(e.getX(), e.getY());
	}
	
	@Override
	public void mouseDragged(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
	}
}
