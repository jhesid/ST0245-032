
package taller9;

import java.util.HashMap;

/**
 *
 * @author 
 */
public class Taller9{
	
    //pedrito 2
    public static void agregar(HashMap empresas,String key, String value){
        empresas.put(key, value);
        
    }
   
    //pedrito 3
    public static void buscar(HashMap empresas,String key){
       String a = (String) empresas.get(key);
       if (a == null) {
    	   System.out.println("La empresa " + key + " no se encunetra almacenada" );
       }
       else {
    	   System.out.println("La empresa "+ key + " pretenece a " + a);
       }
    }
  
    //pedrito 4
    public static void contienekey(HashMap empresas,String value){
    	if (empresas.containsValue(value) == false) {
    		System.out.println("No hay empresa en " + value);
    	}
    	else {
    		for (Object o : empresas.keySet()) {
    		      if (empresas.get(o).equals(value)) {
    		        System.out.println("En " + value + " esta la empresa " + o);
    		      }
    		    }
    		    
    	}
    	
    } 
    // El ciclo para hallar el key de pedrito 4 fue extraido de: http://www.java2s.com/Code/Java/Collections-Data-Structure/GetakeyfromvaluewithanHashMap.htm
    
}