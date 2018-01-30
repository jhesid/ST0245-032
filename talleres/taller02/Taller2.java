/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_2;

/**
 *
 * @author cl18417
 */
public class Taller2 {
    
     public static int gcd(int p,int q){
        if (q == 0){
            return p;
        }else{
            return gcd(q,p%q);
    }
    }
 
     public static boolean SumaGrupo(int start,int[]nums,int target){
         if (start >= nums.length) {
             return target == 0;
         }else{
         return SumaGrupo(start + 1,nums,target - nums[start]) || SumaGrupo(start + 1,nums,target);
         }
     }
     
}
