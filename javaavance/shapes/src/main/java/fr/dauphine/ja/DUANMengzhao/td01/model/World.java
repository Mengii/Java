package fr.dauphine.ja.DUANMengzhao.td01.model;

import java.util.ArrayList;

public class World {
	/**
	 * all the shapes of model
	 */
	
	private ArrayList<Shape> shapes;
	private ArrayList<Shape> shapesSelected;
	
	public World() {
		shapes = new ArrayList<Shape>();
		shapesSelected = new ArrayList<Shape>();
	}
	
	public void addShape(Shape shape) {
		shapes.add(shape);
	}
	
	/*
	 * When mouse in the zone of one shape 
	 */
	public void dragged(int x, int y) {
		for(Shape s:shapes) {
			if(s.contains(x,y)) {
				shapesSelected.add(getShape(x,y));
			}
		}
	}
	
	public Shape getShape(int x, int y) {
		for(Shape s:shapes) {
			if(s.contains(x,y)) return s;
		}
		return null;
	}
	
	public void moveShapeSelected(int x, int y) {
		for(Shape s:shapes) 
			s.move(x,y);
	}
	
	public void releaseShapes() {
		shapesSelected.clear();
	}

	public void removeShapes() {
		for(Shape s:shapesSelected) {
			removeShape(s);
		}
		shapesSelected.clear();
	}
	
	public void removeShape(Shape shape) {
		int i;
		if((i=shapes.indexOf(shape))!= -1)
			shapes.remove(i);
	}
	
	public void removeShapes(int x, int y) {
		Shape shape = null;
		for(int i=0;i<shapes.size();i++) 
			shape = shapes.get(i);
			if(shape.contains(x, y)) {
				removeShape(shape);
			}
	}
}
