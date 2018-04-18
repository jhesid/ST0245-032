/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller10;

/**
 *
 * @author CristianCamilo
 */
public class Taller10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Arbol A = new Arbol();
       
       A.insertar(6);
       A.insertar(3);
       A.insertar(5);
       A.insertar(8);
       A.insertar(7);
       A.eliminar(8);
       
       boolean f = A.buscar(7);
       
        System.out.println(f);
    }
    
    
    
}
