
package taller_3;

public class Taller3 {
	
	
	public static void torresDeHannoi(int n) {
		torresDeHannoiAux(n, 1, 2, 3);
	}
	
	
	
	private static void torresDeHannoiAux(int n, int origen, int intermedio, int destino) {
		
		if (n == 1) {
			System.out.println("Mover de " + origen + " a " + destino);
		}
		else {
			// Moueve todas las fichas excepto la ultima, al intermedio
			torresDeHannoiAux(n - 1, origen, destino, intermedio);
			
			System.out.println("Mover de " + origen + " a " + destino);
			
			// Mueve las fichas del intermedio al final
			torresDeHannoiAux(n - 1, intermedio, origen, destino);
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
			combinationsAux(base              , s.substring(1));
			
		}
	}
	
	
	public static void permutation(String s) {
		permutationAux(" ",s);
	}
	
	public static void permutationAux(String base, String s) {
		
		if (s.length() == 0) {
			System.out.print(base + " ");
		}
		else {
			//permutationAux(base + s.charAt(0), s.substring(1));
			
			for (int i = 0; i < s.length();i++) {
				permutationAux(base + s.charAt(i), s.replace(Character.toString(s.charAt(i)),""));
			}
			
			
			
		}
		
		
	}
	
	
	
	
}

