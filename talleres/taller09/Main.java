/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller9;

/**
 *
 * @author cl18417
 */
import java.util.HashMap;
import java.util.Set;
public class Main {
	static HashMap<String,String> empresas = new HashMap<String, String>();
	public static void main(String args []){
		Taller9.agregar(empresas, "Google", "Estados Unidos");
		Taller9.agregar(empresas, "La locura", "Colombia");
		Taller9.agregar(empresas, "Nokia", "Finlandia");
		Taller9.agregar(empresas, "Sony", "Japon");
		Taller9.buscar(empresas, "Google");
		Taller9.buscar(empresas, "Samsung");
		Taller9.contienekey(empresas, "Japon");
		Taller9.contienekey(empresas, "Jamaica");
	
    }
}
