package fr.dauphine.ja.DUANMengzhao.td01.model;

public class TestPoint {
	
    public static void main( String[] args )
    {
    	//Point p0 = new Point(); //ne fonctionne pas car le constructeur par défaut se disparait
        Point p = new Point(1,2); 
        System.out.println(p.getX()+" "+p.getY());
    }
}
