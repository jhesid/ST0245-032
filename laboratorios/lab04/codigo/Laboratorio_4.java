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
public class Laboratorio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol_gen arbol_Cristian = new Arbol_gen();
        
        System.out.println("Verificar si los nombres se guardaron");
        
        boolean a = arbol_Cristian.buscar("Jesus");
        System.out.println(a);
        
        boolean b = arbol_Cristian.buscar("Beatriz");
        System.out.println(b);
        
        
        boolean c = arbol_Cristian.buscar("Cristian");
        System.out.println(c);
        
        
        boolean d = arbol_Cristian.buscar("Jesusito");
        System.out.println(d);
        
        boolean e = arbol_Cristian.buscar("No_esta_en_mi_arbol");
        System.out.println(e);
        
        
        
        System.out.println("====================================");
        System.out.println("Punto 2. busqueda binaria");
        System.out.println("====================================");
        
        Arbol busqueda = new Arbol();
        
        busqueda.insertar(50);
        busqueda.insertar(30);
        busqueda.insertar(24);
        busqueda.insertar(5);
        busqueda.insertar(28);
        busqueda.insertar(45);
        busqueda.insertar(98);
        busqueda.insertar(52);
        busqueda.insertar(60);

                
        
        
        System.out.println("PreOrden");
        
        busqueda.PreOrden();
        
        System.out.println("===================================");
        System.out.println("PosOrden");
             
        busqueda.PosOrden();
        
    }
    
}
