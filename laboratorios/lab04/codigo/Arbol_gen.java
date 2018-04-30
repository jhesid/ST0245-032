/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_4;

/**
 *
 * @author CristianCamilo&&Jhesid
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
        
        // Bisabuelos por parte de mama de mama
        Node bisabuelamm = new Node("Laura");
        Node bisabuelomm = new Node("Luis");
        
        // Bisabuelos papa de mi mama
        Node bisabuelapm = new Node("Esperanza");
        Node bisabuelopm = new Node("Arnoldo");
        
        
        // Bisabuelo por parte de papa de mi papa
        Node bisabuelopp =   new Node("Jesusito");
        
        // Dara las relaciones
        raiz = YO;
        raiz.izquierda = mama;
        raiz.derecha = papa;
        
        mama.izquierda = abuelam;
        mama.derecha = abuelom;
        
        
        papa.izquierda = abuelap;
        papa.derecha = abuelop;
        
        abuelam.izquierda =bisabuelamm;
        abuelam.derecha = bisabuelomm;
        
        abuelom.izquierda = bisabuelapm;
        abuelom.derecha = bisabuelopm;
        
        abuelop.derecha = bisabuelopp;
        
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
