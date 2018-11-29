package fr.dauphine.ja.DUANMengzhao.td00;

import junit.framework.Test; //Exo3 Q1 td00bis
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPrimeCollection()
    {
        assertTrue( true );
    }
    
    public void test0IsPrime() {
    	PrimeCollection prime = new PrimeCollection();
    	prime.initRandom(10,50);
    	assertFalse(prime.isPrime(0));
    }
    
    public void testTwoIsPrime() {
    	PrimeCollection prime = new PrimeCollection();
    	prime.initRandom(10,50);
    	assertTrue(prime.isPrime(2));
    }
    
    public void test9IsNotPrime() {
    	PrimeCollection prime = new PrimeCollection();
    	prime.initRandom(10,50);
    	assertFalse(prime.isPrime(9));
    }
}
