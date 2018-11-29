package fr.dauphine.ja.DUANMengzhao.td01.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

import fr.dauphine.ja.DUANMengzhao.td01.model.Point;
import fr.dauphine.ja.DUANMengzhao.td01.model.World;
import fr.dauphine.ja.DUANMengzhao.td01.view.CircleDrawer;
import fr.dauphine.ja.DUANMengzhao.td01.view.MyDisplay;

public class MouseController implements MouseMotionListener, MouseListener {
	/**
	 * translates shapes with mouse
	 */
	private MyDisplay display;
	private World world;
	private boolean someShapeSelected = false;
	
	public MouseController(MyDisplay display, World world) {
		this.display = display;
		this.world = world;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		//System.out.println("Mouse dragged : ("+e.getX()+", "+e.getY()+")");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//System.out.println("Mouse moved : ("+e.getX()+", "+e.getY()+")");
		if(someShapeSelected) {
			world.moveShapeSelected(e.getX(), e.getY());
			display.repaint();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1) {
			someShapeSelected = !someShapeSelected;
			if(someShapeSelected)
				world.dragged(e.getX(), e.getY());
			else
				world.releaseShapes();
		} 
		else if(e.getButton() == MouseEvent.BUTTON3) {
			if(someShapeSelected) {
				world.removeShapes();
				someShapeSelected = false;
			} else {
				world.removeShapes(e.getX(), e.getY());
			}
		}
		display.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
