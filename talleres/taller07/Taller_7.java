/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller7;

/**
 *
 * @author cl18417
 */
public class Taller_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedListMauricio b = new LinkedListMauricio();
        LinkedListMauricio c = new LinkedListMauricio();
        
    	/*
    	// LLenar la lista
    	for (int i = 0; i < 50; i++) {
    		int[] a = Aleatorio.alea(1, 100);
    		b.insert(a[0],i);
    	}
    	
    	for (int i = 0; i < 50; i++) {
    		int[] a = Aleatorio.alea(1, 100);
    		c.insert(a[0],i);
    	}
    	*/
        
        b.insert(2, 0);
        b.insert(3, 1);
        b.insert(7, 2);
        
        b.remove(1);
    	
        c.insert(2, 0);
        c.insert(3, 1);
        c.insert(7, 2);
    	
        c.remove(1);
        
        boolean h = b.equal(c);
    	if (h){
    		System.out.println("Good");
    	}
    	
    
    	
    }
    
}
