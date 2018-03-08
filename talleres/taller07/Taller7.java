/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller7;

import Taller7.Aleatorio;
import Taller7.LinkedListMauricio;

/**
 *
 * @author jssuarezb
 */
public class Taller7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         LinkedListMauricio b = new LinkedListMauricio();
    	
    	// LLenar la lista
    	for (int i = 0; i < 50; i++) {
    		int[] a = Aleatorio.alea(1, 100);
    		b.insert(a[0],i);
    	}
    
    	System.out.println(b.get(30));
        
        LinkedListMauricio j = new LinkedListMauricio();
        LinkedListMauricio c = new LinkedListMauricio();
        
   
        
        j.insert(2, 0);
        j.insert(3, 1);
        j.insert(7, 2);
        
        j.remove(1);
    	
        c.insert(2, 0);
        c.insert(3, 1);
        c.insert(7, 2);
    	
        c.remove(1);
        
        boolean h = b.equal(c);
    	if (h){
    		System.out.println("Good");
    	}
    }
    
    public int punto3(LinkedListMauricio a){
    int i=0;
    int size=a.size();
    int con=0;
    con=repu3(a,i,con,size);
    return con;
    }
    public int repu3(LinkedListMauricio a,int i, int con,int size){
        if (i<size) {
            
                if (a.get(i)>con) {
                    con=a.get(i);
                }
                i=i+1;
                con=repu3(a,i,con,size);
            }
           return con; 
        }
  
    }

