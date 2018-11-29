package fr.dauphine.ja.DUANMengzhao.td00;
import java.util.ArrayList;
import java.util.Random;

/**
 * recherche de nombres premiers
 *
 */
public class PrimeCollection 
{
	//exo1
	ArrayList<Integer> numbers;
	
	public PrimeCollection() {
		numbers = new ArrayList<Integer>();
	}
	
	//exo2
	public void initRandom(int n, int m){
		Random rand = new Random();
		for(int i=0;i<n;i++) {
			int randomNum = rand.nextInt((m-1)+1)+1;  
			numbers.add(randomNum);
			//System.out.println(randomNum);
		}
 	}
	
	//exo3
	protected boolean isPrime(int p) {
		boolean flag = true;
		if (p<2) {
			flag = false;
			System.out.println(flag);
			return flag;
		} else {
			for (int i=2; i<=Math.sqrt(p); i++) {
				if (p%i==0) {
					flag = false;
					break;
				}
			}
		}
		System.out.println(flag);
		return flag;
	}
	
	//exo4
	public void printPrimes() {
		for(int i=0; i<numbers.size();i++) {
			int num = numbers.get(i).intValue();
			isPrime(num);
		}	
	}
	
    public static void main( String[] args )
    {
    	//exo5
    	PrimeCollection prime = new PrimeCollection();
        prime.initRandom(100,2000);
        System.out.println(prime.numbers);
        
        //prime.isPrime(1);
        prime.printPrimes();
    }
    
}
