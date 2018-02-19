/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_1;

/**
 *
 * @author Cristian Rendon & Jhesid Suarez
 * @version 1
 */
public class Laboratorio_1 {
    

    // Calcula la suma de los elementos de un arreglo recursivamente
    public static int ArraySum(int[] A, int n){
        if (n < A.length  - 1){
            return A[n] + ArraySum(A,n+1);
        }
        else{
            return A[n];
        }
    }
    
    // Encuentra el maximo valor de un arrglo 
    public static int ArrayMax(int[] A, int n){
        int temp,max;
        // Se guarda el ultimo valor del arreglo
        max = A[n];
    
        if (n != 0){
            // Se almacena la siguiente posicion en temp
            temp = ArrayMax(A,n-1);
            // Si temp es mayopr entonces es el actual maximo
            if (temp > max){
                max = temp;
            }
        }
        return max;
    }
    
    // Muestra el ensesimo valor de la serie fibonacci
    public static long fibonacci(int n) {
        if (n <= 1){
            return n;
        }
        else return fibonacci(n-1) + fibonacci(n-2);
    }
    
    
    
}
