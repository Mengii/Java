package fr.dauphine.ja.DUANMengzhao.td01.model;

import java.util.LinkedList;
import java.util.Objects;

public class LigneBrisee extends Shape{
	/*
	private int taille;
	private Point[] tab; 
	private int i=0; //indice du element de tableau
	
	public LigneBrisee(Point p, int taille) {
		this.taille=taille;
		this.tab = new Point[taille];
	}
	
	//exo3.2
	private void add(Point p) {
		try {
			tab[i]=p;
			i++;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Pour le "+(i+1)+"ème élément : capacité dépassée !");;
		}
	}
	*/
	
	
	//exo3.6
	private LinkedList<Point> ligne;
	public LigneBrisee() {
		this.ligne = new LinkedList<Point>();
	}
	
	//exo3.6
	public void add(Point p) {
		Objects.requireNonNull(p);
		this.ligne.add(p);
	}
	
    
	public int pointCapacity() {
		//return this.taille; //exo3.3
		return ligne.size(); //exo3.6
	}
	
	public int nbPoints() {
		int nb=0;
		/*
		// exo3.3
		for(int i=0;i<tab.length;i++) {
			if(tab[i]!=null)nb++;
		}
		return nb;
		*/
		
		//exo3.6
		for(int i=0;i<ligne.size();i++) {
			if(ligne.get(i)!=null)nb++;
		}
		return nb;
		
	}
	
	//exo3.4
	public boolean contains(Point p) {
		boolean flag = false;
		/*
		for(Point point:this.tab) {
			if(point==p) flag=true;
		}
		*/
		
		//exo3.6
		for(Point point:ligne) {
			if(point==p) flag=true;
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = new Point(3,4);
		Point p3 = new Point(5,6);
		Point p4 = new Point(7,8); //exo3.4
		/*
		// exo3.1 - exo3.5
		LigneBrisee ligne = new LigneBrisee(p1,3); 
		ligne.add(p1);
		ligne.add(p2);
		//ligne.add(p3);
		ligne.add(null); //exo3.5
		for(int i=0; i<ligne.taille; i++) System.out.println(ligne.tab[i]);
		*/
		
		LigneBrisee ligne = new LigneBrisee(); //exo3.6
		ligne.add(p1);
		ligne.add(p2);
		ligne.add(p3);
	    //ligne.add(null);
	    
		System.out.println("capacity = "+ligne.pointCapacity()); //exo3.3
		System.out.println("number of actuel points : "+ligne.nbPoints()); //exo3.3
		System.out.println(ligne.contains(p2)); //exo3.4
		System.out.println(ligne.contains(p4)); //exo3.4
		System.out.println(ligne.contains(null)); //exo3.5
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

}
