/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_4;

/**
 *
 * @author CristianCamilo
 */
public class Arbol_gen {
    public Node raiz;
    
    public Arbol_gen(){
        // Crear cada nodo independiente
        Node YO = new Node("Cristian");
        
        // Padres
        Node papa = new Node("Jesus");
        Node mama = new Node("Beatriz");
        
        // Abuelos por parte de mama
        Node abuelam = new Node("Libia");
        Node abuelom = new Node("Alfredo");
        
        // Abuelos por parte de papa
        Node abuelop = new Node("Alcides");
        Node abuelap = new Node("Crispiniana");
        
        // Bisabuelos por parte de mama mama
        Node bisabuelomm = new Node("Laura");
        
        
        
        
        // Dara las relaciones
        raiz = YO;
        raiz.izquierda = mama;
        raiz.derecha = papa;
        
        //mama.izquierda = abuelam;
        mama.derecha = abuelom;
        
        papa.izquierda = abuelap;
        papa.derecha = abuelop;
        
        
        
    }
    
    public boolean buscar(Node nodo, String n) {
         if (nodo == null){
            return false;
        }
         else if(nodo.dato.equals(n)){
            return true;
        }
         else{
             return buscar(nodo.izquierda, n) || buscar(nodo.derecha,n);
         }
       
    }
    
    public boolean buscar(String n){
        return buscar(raiz,n);
    }

    
}
