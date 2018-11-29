package fr.dauphine.ja.DUANMengzhao.td01.model;

import java.util.Random;

public class Circle extends Shape {
	private Point center;
	private int r; //rayon 
	
	public Circle(Point center, int r) {		
		this.center = new Point(center);
		this.r = r;
	}
	
	//MVC
	public Circle(int xMax, int yMax) {
		Random rand = new Random();
		this.center = new Point(rand.nextInt(xMax), rand.nextInt(yMax));
		this.r = rand.nextInt(300);
	}
	
	public int getR() {
		return this.r;
	}
	
	//exo4.3
	@Override
	public String toString() {
		return "Circle de centre "+center.toString()+" et de rayon "+r;
	}
	
	//exo4.4 - exo4.5
	public void translate(int dx, int dy) {
		center.translate(dx, dy);
	}
		
	//exo4.6
	public Point getCenter() {
		return new Point(center.getX(),center.getY());
	}
	
	//exo4.7
	public double surface() {
		return 3.14 * Math.pow(r, 2);
	}
		
	//exo4.8
	public boolean contains(Point p) {
		double disX = p.getX()-this.center.getX();
		double disY = p.getY()-this.center.getY();
		if(Math.sqrt(disX*disX+disY*disY)<=this.r){
			return true;
		}
		return false;
	}
	
	public boolean contains(int x, int y) {
		return contains(new Point(x,y));
	}
	
	//exo4.9
	public static boolean contains2(Point p, Circle...circles) {
		for(Circle cir:circles) {
			if(Math.sqrt(((p.getX()-cir.center.getX())*(p.getX()-cir.center.getX()))+((p.getY()-cir.center.getY())*(p.getY()-cir.center.getY())))<=cir.r){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {	
		
		//exo4.5
		Point p = new Point(1,2);
		Circle c = new Circle(p,1);
		Circle c2 = new Circle(p,2);
		System.out.println(c2.getCenter());
		c2.translate(1,1);
		System.out.println(c2.getCenter());
		System.out.println(c+", "+c2); 
		
		/*
		//exo4.8
		Point p1 = new Point(1,1.5);
		System.out.println(c.contains(p1));
		//exo4.9
		System.out.println(contains2(p1, c, c2));
		*/
		//exo4.6
		Circle c3 = new Circle(new Point(1,2),1);
		System.out.println(c3.getCenter());
		c3.getCenter().translate(1,1);
		System.out.println(c3.getCenter());
		System.out.println(c);
		
	}

	@Override
	public void move(int x, int y) {
		center.setX(x);
		center.setY(y);
	}
}
