package lab2;

/*
 * Laboratorio 2
 * Cristian Camilo Rendon Cardona
 * Jhesid Steven Suarez Berrio
 */

public class CalculoTiempo {

	public static void main(String arg[]) {

		/////////////////////////////////////////////
		////////// Tiempo de recursion /////////////
		///////////////////////////////////////////
		
		// =========================================
		// Definicion de variables
		// =========================================
		int n;

		long[] number = new long[30];
		int[] A;


		// =========================================
		// Array sum recursivo
		// =========================================

		int max = 11;							// Max val para aleatorio
		int ini = 100000;						// tamano inicial del arreglo
		int finali = 10000000;					// Tamano final del arreglo 
		int step = 333333;					// delta de tamaño
		long[] time_a = new long[finali/step];

		n = 0;
		for (int i = ini; i < finali;i = i + step) {
			A = Aleatorio.alea(i, max);

			long ahora = System.currentTimeMillis();
			Onotation.ArraySum_r(A,0);
			long despues =  System.currentTimeMillis();
			time_a[n] = despues - ahora;
			number[n] = i; 
			n++;


		}
		System.out.println("Acaba arsum_r");
		exportar_txt.escribir("arsum_r.txt", time_a,number);
		
		// =========================================
		// Array max recursivo
		// =========================================
		

		max = 11;							// Max val para aleatorio
		ini = 10000;						// tamano inicial del arreglo
		finali = 10000000;					// Tamano final del arreglo 
		step = 100000;					// delta de tamaño
		time_a = new long[finali/step+1];
		number = new long[finali/step+1];

		n = 0;
		for (int i = ini; i < finali;i = i + step) {
			A = Aleatorio.alea(i, max);

			long ahora = System.currentTimeMillis();
			Onotation.ArrayMax_r(A,A.length-1);
			long despues =  System.currentTimeMillis();
			time_a[n] = despues - ahora;
			number[n] = i; 
			n++;


		}
		System.out.println("Acaba arrmax");
		exportar_txt.escribir("arrmax_r.txt", time_a,number);
		
		
	
		// =========================================
		// Fibonacci
		// =========================================
		
		n = 1;
		for (int i = 1; i <= 50; i++) {
			long ahora = System.currentTimeMillis();
			Onotation.fibonacci(i);
			long despues =  System.currentTimeMillis();
			time_a[n] = despues - ahora;
			number[n] = i; 
			n++;
		}


		System.out.println("Acaba fibo");
		exportar_txt.escribir("fibonacci.txt", time_a,number);
		
// -------------------------------------------------------------------



		/////////////////////////////////////////////
		////////// Tiempo de los ciclos/////////////
		///////////////////////////////////////////


		// =========================================
		// ArraySum
		// =========================================

		// Para oredenar los numeros de un arreglo


		ini = 100000;
		step = 3333333;
		finali = 100000000;
		
		long[] time_o = new long[30];
		long[] number_o = new long[30];
		n = 0;
		for (int i = ini;i < finali;i = i +step) {
			A = Aleatorio.alea(i, max);

			long ahora = System.currentTimeMillis();
			Onotation.ArraySum(A);
			long despues =  System.currentTimeMillis();
			time_o[n] = despues - ahora;
			number_o[n] = i; 
			n++; 
		}
		
		System.out.println("Acaba arsum");
		exportar_txt.escribir("arsum.txt", time_o,number_o);

		
		// =========================================
		// ArrayMax
		// =========================================
		
		max = 11;							// Max val para aleatorio
		ini = 100000;						// tamano inicial del arreglo
		finali = 100000000;					// Tamano final del arreglo 
		step = 1000000;					// delta de tamaño
		time_a = new long[finali/step+1];
		number = new long[finali/step+1];

		n = 0;
		for (int i = ini; i < finali;i = i + step) {
			A = Aleatorio.alea(i, max);

			long ahora = System.currentTimeMillis();
			Onotation.ArrayMax(A);
			long despues =  System.currentTimeMillis();
			time_a[n] = despues - ahora;
			number[n] = i; 
			n++;


		}
		System.out.println("Acaba arrmax");
		exportar_txt.escribir("arrmax.txt", time_a,number);
		
		// =========================================
		// InsertionSort
		// =========================================
		
		
		max = 11;							// Max val para aleatorio
		ini = 10000;						// tamano inicial del arreglo
		finali = 100000;					// Tamano final del arreglo 
		step = 1000;					// delta de tamaño
		time_a = new long[finali/step+1];
		number = new long[finali/step+1];

		n = 0;
		for (int i = ini; i < finali;i = i + step) {
			A = Aleatorio.alea(i, max);

			long ahora = System.currentTimeMillis();
			Onotation.Ordenar(A);
			long despues =  System.currentTimeMillis();
			time_a[n] = despues - ahora;
			number[n] = i; 
			n++;


		}
		System.out.println("Acaba insertion");
		exportar_txt.escribir("ord.txt", time_a,number);
		

	}

}
