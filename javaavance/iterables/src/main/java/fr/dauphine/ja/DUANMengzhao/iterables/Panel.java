package fr.dauphine.ja.DUANMengzhao.iterables;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Panel {
	
	public static Iterator<Integer> panel1 (final int start, final int end){
		if(start>end) throw new IllegalArgumentException();
		return new Iterator<Integer>() {
			int i = start;
			
			@Override
			public boolean hasNext() {
				return (i<=end);
			}

			@Override
			public Integer next() {
				if(!hasNext()) throw new NoSuchElementException();
				return i++;
			}
			
		};
	}

	public static Iterable<Integer> panel2 (final int start, final int end){
		if(start>end) throw new IllegalArgumentException();
		return new Iterable<Integer>() {

			@Override
			public Iterator<Integer> iterator() {
				return panel1(start,end);
			}
			
		};
	}
	
	
	public static List<Integer> panel(final int min, final int max) {
		if(max<min)throw new IllegalArgumentException();
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int i) { //retourne le type des élts de la list
				return min+i;
			}

			@Override
			public int size() {
				return max-min+1;
			}
			
		};
	}
	
	public static void main(String[] args) {
		
		//exo1.2
		Iterator<Integer> it = panel1(1,5);
		for(;it.hasNext();) System.out.println(it.next());
		
		//exo1.3
		for(int i:panel2(1,5)) {
			System.out.println(i);
		}
		
		List<Integer> l = panel(3,6);
		for(int i:l) System.out.println(i);
		//System.out.println(l.size());
	}

	
}
