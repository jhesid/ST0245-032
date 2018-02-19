
package laboratorio_1;

/**
 *
 * @author Cristian Rendon && Jhesid Suarez
 * @version 1
 */
public class CodingBat {
    
    ////////////////////////////////////////////
    ///////EJERCICIOS DE RECURSION 1////////////
    ///////////////////////////////////////////
    
    /**
     * 
     * @param n 
     * @return Boolean
     * 
     */

    public int factorial(int n) {
        //verifica que no sea 0
        if (n <= 1) {
            return 1;
        } 
        else{
            return n * factorial(n-1);
        }    
    }
//---------------------------------------------------------
    /**
     * 
     * @param bunnies
     * @return 
     */
    public int bunnyEars(int bunnies) {
        return ears(bunnies);
    }
    
    public int ears(int bun) {
        int cont = 0;
        //se verifica el numero ingresado no sea 0
        if (bun != 0) {
            //añade 2 a la cuenta cada que se repite el ciclo(mientras halla conejos)
            cont = 2 + ears(bun - 1);
        }
        return cont;
    }
//---------------------------------------------------------
    /**
     * 
     * @param n
     * @return 
     */
    public int sumDigits(int n) {
        return suma(n);
    }
    int suma(int n) {
        int sum = 0;
        //verifica que el numero ingresado o numero restantes no sea igual a 0
        if (n > 0) {
            //obtiene el ultimo numero de el grupo de numeros, y saca los demas para repetir el proceso y sumarlo
            sum = (n % 10) + suma(n / 10);
        }
        return sum;
    }
//---------------------------------------------------------
    /**
     * 
     * @param base
     * @param n
     * @return 
     */
    public int powerN(int base, int n) {
        return pot(base, n);
    }

    int pot(int b, int n) {
        int con = 1;
        //verifica que el numero de potencias a realizar no sea 0
        if (n != 0) {
            //realiza la potencia 
            con = b * pot(b, n - 1);
        }
        return con;

    }

//---------------------------------------------------------
    /**
     * 
     * @param bunnies
     * @return 
     */    
    public int bunnyEars2(int bunnies) {
        return ears2(bunnies);
    }

    public int ears2(int bun){
        int cont =0;
        int a=bun%2;
        //verifica que queden numeros o conejos
        if(bun!=0){
            //verifica si es par
            if(a!=0){
            //realiza la suma
            cont=2+ears2(bun-1);
            }
        //verifica si es impar
            if(a==0){
                //realiza la suma
                cont=3+ears2(bun-1);
            }
        }
        return cont;
    }
    
    
    
    
    
    
    ////////////////////////////////////////////
    ///////EJERCICIOS DE RECURSION 2////////////
    ///////////////////////////////////////////
    
    //------------------------------------------------------------------------------------------------------- 
    /**
     * groupSum5()
     * @param start
     * @param nums
     * @param target
     * @return 
     */
    
    
    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length){
            return target == 0;
        }
        // Se evalua si hay un multiplo de 5 y si el siguiente numero es 1
        else if( nums[start] % 5 == 0 && (start < nums.length - 1) && (nums[start+1] == 1) ){
            // Se suma  2 a start para omitir el 1
            return groupSum5(start + 2, nums, target - nums[start]);
        }
        else if(nums[start] % 5 == 0){
            // Si solo hay un multiplo de 5 entonces se llama el algoritmo sumando obligaoriamente el multiplo (sin el or)
            return groupSum5(start + 1, nums, target - nums[start]);
        }
        else{
            // De no ocurrir ninguno de los casos anteriores el algoritmo se comporta como un groupSum()
            return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
        }
    }
    //-------------------------------------------------------------------------------------------------------
    /**
     * groupSum6()
     * @param start
     * @param nums
     * @param target
     * @return 
     */
    
    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length){
            return target == 0;
        }
        else if(nums[start] == 6){
            // Si solo hay un 6 entonces se llama el algoritmo sumando obligaoriamente el 6 (sin el or)
            return groupSum6(start + 1, nums, target - nums[start]);
        }
        else{
            // De no ocurrir ninguno de los casos anteriores el algoritmo se comporta como un groupSum()
            return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
        }
    }
    //-------------------------------------------------------------------------------------------------------

    /**
     * groupSumClump()
     * @param start
     * @param nums
     * @param target
     * @return 
     */
    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length){
            return target == 0;
        }
        else{
          int i = 1;
          // Aumenta la variable i cada vez que halla un numero igual en la siguiente posicion
          while ( (start + i) < nums.length && nums[start] == nums[start + i]){
            i++;
            
          }
          // Sin importar si hay o no numeros drepetidos la variable i le dira al codigo que hacer  
          return groupSumClump(start + i, nums, target - i*nums[start]) || groupSumClump(start + i, nums, target);
        }
    }
    
    //-------------------------------------------------------------------------------------------------------
    /**
     * groupNoAdj()
     * @param start
     * @param nums
     * @param target
     * @return 
     */
     
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length){
            return target == 0;
        }
        else{
            // Se hace el llamdo pero se suman 2 a start cuando se resta el numero a target
            return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target);
        }
    }
    
    /**
     * splitArray
     * @param nums
     * @return  
     */
    
    public boolean splitArray(int[] nums) {
        return splitArrayAux(0, 0, nums, 0);
    }
    
    /**
     * 
     * @param s1
     * @param s2
     * @param nums
     * @param start
     * @return 
     */
    public boolean splitArrayAux(int s1, int s2, int[] nums, int start) {
        if(start >= nums.length){
            return s1 == s2;
        }
        else{
            return splitArrayAux(s1 + nums[start], s2, nums, start + 1) || splitArrayAux(s1, s2 + nums[start], nums, start + 1);
        }
           
    /**
     * El codigo de splitarrays se basa en el codigo de:
     * Title: splitArray.java
     * Author: mirandaio
     * Date: 2013
     * Code version: 1
     * Availability: https://github.com/mirandaio/codingbat/blob/master/java/recursion-2/splitArray.java
     */
    }
    
    
}
