
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
     
     public static void combinations(String s){
    	 
    	combinationsAux("",s);
     }
     
     
     public static void combinationsAux(String base, String s) {
    	 
    	 if (s.length() == 0) {
    		 System.out.print(base + " ");
    	 }
    	 else {
    		 combinationsAux(base + s.charAt(0), s.substring(1));
    		 combinationsAux(base,s.substring(1));
    	 }
    	 
     }
     
}