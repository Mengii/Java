package fr.dauphine.ja.DUANMengzhao.iterables;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public class Mult {
	public static List<Integer> mult(int coef, final List<Integer> l) {
		
		if(l instanceof RandomAccess) {
			
			return new AbstractList<Integer>() {

				@Override
				public Integer get(int i) {
					int e = l.get(i);
					return e*coef;
				}

				@Override
				public int size() {
					return l.size();
				}
				
			};
			
		} else {
			
			return new AbstractSequentialList<Integer>() {

				@Override
				public ListIterator<Integer> listIterator(int i) {
					return new ListIterator<Integer>() {
						
						@Override
						public Integer next() {
							if(!hasNext()) throw new NoSuchElementException();
							int v = i*coef;
							return v++;
						}

						@Override
						public boolean hasNext() {
							return i<=l.size();
						}
						
						@Override
						public void add(Integer arg0) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public boolean hasPrevious() {
							// TODO Auto-generated method stub
							return false;
						}

						@Override
						public int nextIndex() {
							// TODO Auto-generated method stub
							return 0;
						}

						@Override
						public Integer previous() {
							// TODO Auto-generated method stub
							return null;
						}

						@Override
						public int previousIndex() {
							// TODO Auto-generated method stub
							return 0;
						}

						@Override
						public void remove() {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void set(Integer arg0) {
							// TODO Auto-generated method stub
							
						}
						
					};
				}
				
				@Override
				public int size() {
					return l.size();
				}
				
			};
		}
		
	}
	
	public static void main(String[] args) {
		
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
		System.out.println();
		
		//exo2.3
		ArrayList<Integer> al1 = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			al1.add(i);
		}
		long t0 = System.nanoTime();
		List<Integer> ret2 = Mult.mult(2, al1);
		long sum=0;
		for(int val : ret2) {
			sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));
		
		LinkedList<Integer> ll1 = new LinkedList<>();
		for (int i = 0; i < 1000000; i++) {
			ll1.add(i);
		}
		t0 = System.nanoTime();
		sum=0;
		ret2 = Mult.mult(2, ll1);
		for(int val : ret2) {
			sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));
		
	}

}
