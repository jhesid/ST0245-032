/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_4;

/**
 *
 * @author cl18417
 */
class Arbol {
    private Nodo raiz;

    private boolean buscar(Nodo nodo, int n) {
         if (nodo == null){
            return false;
        }
        
        if (nodo.dato == n){
            return true;
        }
       
        if (nodo.dato > n){
            return buscar(nodo.izquierda, n);
        }
        return buscar(nodo.derecha, n);
    }

    public boolean buscar(int n) {
        return buscar(raiz, n);
    }
    
    public void insertar(int n) {
        if (raiz == null) {
            raiz = new Nodo(n);
        } else {
            insertar(raiz, n);
        }
    }
    
    public void insertar(Nodo nodo, int n) {
        if (nodo.dato == n) {
            return;
        }
        if (n > nodo.dato) {
            if (nodo.derecha == null) {
                nodo.derecha = new Nodo(n);
            } else {
                insertar(nodo.derecha, n);
            }
        } else {
            if (nodo.izquierda == null) {
                nodo.izquierda = new Nodo(n);
            } else {
                insertar(nodo.izquierda, n);
            }
            

        }
    }
    
    public void eliminar(int n) {
        if (buscar(n)) {
          eliminar(raiz, n);  
        }
    }

    public void eliminar(Nodo nodo, int n){
        if (n > nodo.dato){
            Nodo temp = nodo.derecha;
            if (temp.dato == n){
                if (!(temp.izquierda == null)){
                    nodo.derecha = temp.izquierda;
                }else if (!(temp.derecha == null)){
                    nodo.derecha = temp.derecha;
                }else{
                    nodo.derecha = null;
                }
                temp.derecha = null;
                temp.izquierda = null;
                    
            }else{
                eliminar(nodo.derecha, n);
            }
        }
        else if (n < nodo.dato){
            Nodo temp = nodo.izquierda;
            if (temp.dato == n){
                if (!(temp.izquierda == null)){
                    nodo.izquierda = temp.izquierda;
                }else if (!(temp.derecha == null)){
                    nodo.izquierda = temp.derecha;
                }else{
                    nodo.izquierda = null;
                }
                temp.derecha = null;
                temp.izquierda = null;    
            }else{
                eliminar(nodo.izquierda, n);
            }
            
        }
    }
    
    private void PreOrden(Nodo node) {
        if (node != null) {
            System.out.println(node.dato);
            PreOrden(node.izquierda);
            PreOrden(node.derecha);
        }
    }

    private void PosOrden(Nodo node) {
        if (node != null) {
            PosOrden(node.izquierda);
            PosOrden(node.derecha);
            System.out.println(node.dato);
        }
    }
    
    void PreOrden(){
        PreOrden(raiz);
    }
    
    void PosOrden(){
        PosOrden(raiz);
    }

    
}
