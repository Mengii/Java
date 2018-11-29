package fr.dauphine.ja.DUANMengzhao.td01.view;

import java.awt.Graphics;
import java.util.ArrayList;

public abstract class Drawer {
	/**
	 * all the display of shapes
	 */
	static ArrayList<Drawer> allDrawers = new ArrayList<Drawer>();
	
	protected abstract void drawMe(Graphics g);
}
