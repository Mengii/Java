package fr.dauphine.ja.DUANMengzhao.td01.model;

import java.util.Random;

public class Ring extends Circle {
	private int ri; //rayon interne
	public Ring(Point center, int r, int ri) {
		super(center,r);
		this.ri=ri;
	}
	
	//MVC
	public Ring(int xMax, int yMax) {
		super(xMax,yMax);
		Random rand = new Random();
		this.ri = rand.nextInt(200);
	}
	
	public int getRi() {
		return ri;
	}
	
	//exo5.3
	public boolean equals(Ring ring) {
		if(this.getCenter().isSameAs(ring.getCenter())&&this.getR()==ring.getR()&&this.ri==ring.ri) {
			return true;
		}
		return false;
	}
	
	//exo5.4
	@Override
	public String toString() {
		return "Anneau de centre "+getCenter().toString()+" rayon = "+this.getR()+" et rayon interne = "+this.ri;
	}
	
	//exo5.5
	@Override
	public boolean contains(Point p){
		return super.contains(p) && this.getCenter().distance(p)>=this.ri;				
	}
	
	//exo5.6
	public static boolean contains2(Point p, Ring...rings) {
		for(Ring r:rings) {
			if(r.getCenter().distance(p)<=r.getR()&&r.getCenter().distance(p)>=r.ri) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Point p = new Point(0,0);
		Ring r = new Ring(p, 2, 1);
		Ring r2 = new Ring(p, 2, 1);
		Point p2 = new Point(1,2);
		System.out.println(r);
		System.out.println(r2);
		System.out.println(r.equals(r2));
		System.out.println(r.contains(p2));
		System.out.println(contains2(p2,r,r2));
	}
}
