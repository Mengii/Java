package fr.dauphine.ja.DUANMengzhao.td01.view;

import java.awt.Color;
import java.awt.Graphics;

import fr.dauphine.ja.DUANMengzhao.td01.model.Point;
import fr.dauphine.ja.DUANMengzhao.td01.model.Ring;

public class RingDrawer extends Drawer{
	/**
	 * displays rings
	 */
	
	private Ring ring;
		
	public RingDrawer(Ring r) {
		this.ring=r;
		Drawer.allDrawers.add(this);
	}
		
	public void drawMe(Graphics g) {
		g.setColor(Color.RED);
		g.drawOval(ring.getCenter().getX()-ring.getR(), ring.getCenter().getY()-ring.getR(), ring.getR()*2, ring.getR()*2);
		g.drawOval(ring.getCenter().getX()-ring.getRi(), ring.getCenter().getY()-ring.getRi(), ring.getRi()*2, ring.getRi()*2);
	}
}
