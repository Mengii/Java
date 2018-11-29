package fr.dauphine.ja.DUANMengzhao.td01.view;

import java.awt.Color;
import java.awt.Graphics;

import fr.dauphine.ja.DUANMengzhao.td01.model.Circle;
import fr.dauphine.ja.DUANMengzhao.td01.model.Point;

public class CircleDrawer extends Drawer {
	/**
	 * displays circles
	 */
    private Circle circle;
       
	public CircleDrawer(Circle c) {
		this.circle=c;
		Drawer.allDrawers.add(this);
	}
	
	public void drawMe(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawOval(circle.getCenter().getX()-circle.getR()/2, circle.getCenter().getY()-circle.getR(),circle.getR(), circle.getR());
	}
	
}
