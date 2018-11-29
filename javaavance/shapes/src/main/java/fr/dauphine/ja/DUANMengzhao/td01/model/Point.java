package fr.dauphine.ja.DUANMengzhao.td01.model;

import java.util.ArrayList;

public class Point extends Shape{
	private int x;
	private int y;
	public static int cpt=0; //exo1.7
	private static ArrayList<Point> list = new ArrayList<Point>(); //exo2.3bis
	
	//exo1.6
	public Point(int x, int y) { 
		this.x=x;
		this.y=y;
		cpt++; //exo1.7
	}
	
	
	//exo1.4
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	//exo1.8
	public Point(Point p) { //constructeur copie
		this.x=p.x;
		this.y=p.y;
	}
	
	//exo1.9
	@Override
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
	
	//exo2.2
	public boolean isSameAs(Point p) {
		if(this.x==p.x&&this.y==p.y) {
			return true;
		}
		else return false;
	}
	
	//exo2.3
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Point)) return false;
		Point p = (Point)o;
		return isSameAs(p);
	}
	
	//exo4.1
	public void translate(double dx,double dy){
		x+=dx;
		y+=dy;
	}
	
	public double distance(Point p) {
		double disX = p.getX()-this.x;
		double disY = p.getY()-this.y;
		return Math.sqrt(disX*disX+disY*disY);
	}
	
    public static void main( String[] args )
    {
        //Point p = new Point();
    	Point p = new Point(3,2);  //exo1.6  	
        //System.out.println(p.x+" "+p.y);
        
        //exo1.8
    	/*
        Point p1 = new Point(5,6);
        //Point p2 = new Point(p1);
         */
        //System.out.println("Nombre de points crées : "+cpt); //exo1.7
        //System.out.println(p1); //exo1.9
        //System.out.println(p1.x+" "+p1.y);
        //System.out.println(p2.x+" "+p2.y);
        
        //exo2.1
        Point p1 = new Point(1,2);
        Point p2 = p1;
        Point p3 = new Point(1,2);  
        System.out.println("Nombre de points crées : "+cpt);
        //System.out.println(p1==p2); 
        //System.out.println(p1==p3);
        
        //exo2.2
        //System.out.println(p1.isSameAs(p2));
        //System.out.println(p1.isSameAs(p3));
        
        /*
        //exo2.3
        ArrayList<Point> list = new ArrayList<>();
        list.add(p1);
        System.out.println(list.indexOf(p2));
        System.out.println(list.indexOf(p3));
        */
        
        //exo2.3bis
        list.add(p1);
        System.out.println(list.indexOf(p1)); //0
        System.out.println(list.indexOf(p2)); //0
        System.out.println(list.indexOf(p3)); //0 
        
        /*
        //exo4.1
        System.out.println(p3);
        p3.translate(1, 1);
        System.out.println(p3);
        */
        
        //System.out.println(p.translate(2, 5));
        System.out.println(p);
        p.translate(1,2);       
        System.out.println(p);
    }


	@Override
	public boolean contains(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}


	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}


}
