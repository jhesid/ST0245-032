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
public class BinaryTree {
    
    
    public static void abuela_materna(Arbol_gen arbol){
        Node persona = arbol.raiz;
        Node mama = persona.izquierda;
        Node abuela = mama.izquierda;
        
        if (mama.izquierda == null){
            System.out.println("No se onoce la abuela");
        }
        else{
            System.out.println(abuela.dato);
        }
    }
    
}
