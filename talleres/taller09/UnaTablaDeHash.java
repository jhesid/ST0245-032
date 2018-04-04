package taller9;
//Una tabla de hash donde la llave es un String y el valor un int.
public class UnaTablaDeHash
{
   // Ojo, esta tabla definida así no permite manejar las colisiones
   private int[] tabla;

   public UnaTablaDeHash(){
      tabla = new int[10];
   }

   // Ojo, esta función hash es muy ingenua
   private int funcionHash(String k){       
       long val = 0;
       for (int i = 0; i < k.length(); i++){
        val = val + k.charAt(i)*31^(k.length()-i-1); 
       }
       val = val + k.charAt(0);
       return (int) val % 10;
   }

   // Ojo con las colisiones
   public int get(String k){
       int i = funcionHash(k);
       return tabla[i];
   }

   // Ojo con las colisiones
   public void put(String k, int v){
      int i = funcionHash(k);
      tabla[i] = v;
   }
}