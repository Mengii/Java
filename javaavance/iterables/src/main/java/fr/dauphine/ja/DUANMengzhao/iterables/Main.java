package fr.dauphine.ja.DUANMengzhao.iterables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("test Panel :");
		//exo1.2
		Iterator<Integer> it = Panel.panel1(1,5);
		for(;it.hasNext();) System.out.print(it.next()+";");
		
		System.out.println();
		
		//exo1.3
		for(int i:Panel.panel2(1,5)) {
			System.out.print(i+";");
		}
		
		System.out.println();
					
		List<Integer> l = Panel.panel(3,6);
		for(int i:l) System.out.print(i+";");
		//System.out.println(l.size());
		
		System.out.println();
		System.out.println();
		
		System.out.println("test Mult :");
		//exo2.2
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<10;i++) {
			al.add(i);
			System.out.print(al.get(i)+";");
		}
		System.out.println();
		System.out.println("=>");
		List<Integer> ret = Mult.mult(2, al);
		for(int i=0;i<ret.size();i++) System.out.print(ret.get(i)+";");
				
		System.out.println();
		System.out.println();
				
		LinkedList<Integer> ll = new LinkedList<>();
		for(int i=0;i<10;i++) {
			ll.add(i);
			System.out.print(ll.get(i)+";");
		}
		System.out.println();
		System.out.println("=>");
		List<Integer> ret1 = Mult.mult(2, ll);
		for(int i=0;i<ret.size();i++) System.out.print(ret1.get(i)+";");
		System.out.println();
	}
		
}
