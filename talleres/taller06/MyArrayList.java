/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_6;
import java.util.Arrays;


public class MyArrayList {
    
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int elements[]; 
    
    // Inicializa los atributos size en cero y elements como un arreglo de tamaño  DEFAULT_CAPACITY. No, no recibe parámetros. public MiArrayList() {}          // Retorna el tamaño de la lista public int size() {}          // Agrega un elemento e a la última posición de la lista public void add(int e) {}          // Retorna el elemento que se encuentra en la posición i de la lista public int get(int i) {}          // Agrega un elemento e en la posición index de la lista
    public MyArrayList() {
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }     

    
    // Retorna el tamano de la lista 
    public int size() {
    	return size;
    }   
    
    // Agrega un elemento e a la ultima posicion de la lista
    public void add(int e) {
    	// En caso de que el arreglo este lleno
        if ( size() >= elements.length){
            // Duplicar
            elements = Arrays.copyOf(elements,elements.length * 2);
        }
        // Agregar el valor
        elements[size()] = e;
        size++;
    }    
    
    
    // Retorna el elemento que se encuentra en la posicion i de la lista 
    public int get(int i) throws Exception{
        if ((i <= size() - 1) && (i >= 0) ){
            return elements[i];
        }
        else{ 
            throw new Exception("Out of bounds");
        }
    }

    
    
    
    // Agrega un elemento e en la posicion index de la lista
    public void add( int e,int index) throws Exception{
        if ((index <= size() - 1) && (index >= 0)){
            // En caso de que el arreglo este lleno
            if (elements.length == size()){
                // Duplicar
                elements = Arrays.copyOf(elements,elements.length * 2);
            }
            // Mover los valores
            for (int i = size(); i >= index; i--){
                elements[i] = elements[i - 1];
            }
        elements[index]=e;
        size++;
        
        }
        else{
            throw new Exception("Out of bounds");
        }
    } 
    
}
