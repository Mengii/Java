package fr.dauphine.ja.DUANMengzhao.td01.model;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		//test class Point
		Point p1 = new Point(1,2);
		Point p2=p1;
		Point p3 = new Point(1,2);
		System.out.println(p1.isSameAs(p2)); //exo2.2
        System.out.println(p1.isSameAs(p3));
		System.out.println("Nombre de points crées : "+Point.cpt);
		//exo2.3
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2)); //0
		System.out.println(list.indexOf(p3)); //0
		System.out.println(list.indexOf(p1)); //0
		
		//test class LigneBrisee
		LigneBrisee ligne = new LigneBrisee();
		ligne.add(p1);
		ligne.add(p2);
		ligne.add(p3);
		//ligne.add(null); //exception exo3.5
		System.out.println("capacity = "+ligne.pointCapacity()); //exo3.3
		System.out.println("number of actuel points : "+ligne.nbPoints()); //exo3.3
		System.out.println(ligne.contains(p2)); //exo3.4
		System.out.println(ligne.contains(null)); //exo3.5
		
		//test class Circle	
		//exo4.5
		Circle c = new Circle(p1,1);
		Circle c2 = new Circle(p1,2);
		System.out.println(c2.getCenter());
		c2.translate(1,1);
		System.out.println(c2.getCenter());
		System.out.println(c+", "+c2); 
		//exo4.6
		Circle c3 = new Circle(new Point(1,2),1);
		c3.getCenter().translate(1, 1);
		System.out.println(c3);
		//exo4.8
		Point p = new Point(1,3);
		System.out.println(c.contains(p));
		//exo4.9
		System.out.println(Circle.contains2(p, c, c2));
		
		//test class Ring
		Point p4 = new Point(0,0);
		Ring r = new Ring(p4, 2, 1);
		Ring r2 = new Ring(p4, 2, 1);
		Point p5 = new Point(1,2);
		System.out.println(r);
		System.out.println(r2);
		System.out.println(r.equals(r2)); //exo5.3
		System.out.println(r.contains(p5)); //exo5.5
		System.out.println(Ring.contains2(p5,r,r2)); //exo5.6
	}
}
