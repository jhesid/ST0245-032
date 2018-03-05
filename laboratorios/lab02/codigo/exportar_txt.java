package lab2;

import java.io.*;

import javax.swing.JOptionPane;

/*
 * Laboratorio 2
 * Cristian Camilo Rendon Cardona
 * Jhesid Steven Suarez Berrio
 */


public class exportar_txt {
	
	public static void escribir(String nombre,long[] t,long[] n) {
		
		File f;
		FileWriter w;
		BufferedWriter bw;
		PrintWriter wr;
		
		try {
			
			f = new File(nombre);
			w = new FileWriter(f);
			bw = new BufferedWriter(w);
			wr = new PrintWriter(bw);
			
			wr.write(n[0] + " ");
			
			for (int i = 1; i < n.length; i++) {
				wr.append(n[i] + " ");
			}
			
			wr.append("\n" + t[0] + " ");
			for (int i = 1; i < t.length; i++) {
				wr.append(t[i] + " ");
			}
			
		
			wr.close();
			bw.close();
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "Ha ocurrido un error " + e);
			
		}
	}

}

/* 
 * This code was extracted from> https://www.youtube.com/watch?v=xIejsX1Uh10&t=628s
*/