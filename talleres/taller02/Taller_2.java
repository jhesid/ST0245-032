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
public class Taller_2 {

public static boolean ejercicio1(){
		int a, b, c, d;
		a=Taller2.gcd(12,36);
		b=Taller2.gcd(8,12);
		c=Taller2.gcd(72,108);
		d=Taller2.gcd(162, 270);
		if(a==12 && b==4 && c==36 && d==54)
			return true;
		return false;
	}
	
	
	public static boolean ejercicio3(){
		boolean a, b, c, d;
		a=Taller2.SumaGrupo(0, new int[] {2, 4, 8}, 9);
		b=Taller2.SumaGrupo(0, new int[] {2, 4, 8}, 8);
		c=Taller2.SumaGrupo(0, new int[] {10, 2, 2, 5}, 9);
		d=Taller2.SumaGrupo(0, new int[] {10, 2, 2, 5}, 17);
		if(!a && b && c && d)
			return true;
		return false;
	}
        
     /*   public static void ejercicio4(){
		System.out.println("Para la cadena 'abc' el resultado debe ser similar a:");
		System.out.println("a, ab, abc, ac, b, bc, c");
		Taller2.combinations("abc");

		System.out.println("Para la cadena 'Eafit' el resultado debe ser similar a:");
		System.out.println("E, Ea, Eaf, Eafi, Eafit, Eaft, Eai, Eait, Eat, Ef, Efi, Efit, Eft, Ei, Eit, Et, a, af, afi, afit, aft, ai, ait, at, f, fi, fit, ft, i, it, t");
		Taller2.combinations("Eafit");
		
		System.out.println("Para la cadena 'Hola' el resultado debe ser similar a:");
		System.out.println("H, Ho, Hol, Hola, Hoa, Hl, Hla, Ha, o, ol, ola, oa, l, la, a");
		Taller2.combinations("Hola");

		System.out.println("Para la cadena 'Hi' el resultado debe ser similar a:");
		System.out.println("a, ab, abc, ac, b, bc, c");
		Taller2.combinations("H, Hi, i");
	}*/
    public static void main(String[] args) {
        // TODO code application logic here
        if (Taller_2.ejercicio1()==true) {
            System.out.println("ji");
            
        }else{
            System.out.println("nel");
        }        if (Taller_2.ejercicio3()==true) {
            System.out.println("ji");
            
        }else{
            System.out.println("nel");
        }
    }
    
}
