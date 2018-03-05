package lab2;

/*
 * Laboratorio 2
 * Cristian Camilo Rendon Cardona
 * Jhesid Steven Suarez Berrio
 */

public class Onotation {

	////////////////////////////////////////////
	////////////// Recusrsion /////////////////
	//////////////////////////////////////////

	// ===========================================
	// Array sum
	// ===========================================

	public static int ArraySum_r(int[] A, int n){
		if (n < A.length  - 1){
			return A[n] + ArraySum_r(A,n+1);
		}
		else{
			return A[n];
		}
	}

	// ===========================================
	// Array max
	// ===========================================
	public static long ArrayMax_r(int[] A,long n){
		long max,temp;

		max = A[(int) n];

		if (n != 0){
			temp = ArrayMax_r(A,n-1);
			if (temp > max){
				max = temp;
			}
		}

		return max;
	}

	// ===========================================
	// Fibonacci
	// ===========================================

	public static long fibonacci(int n) {
		if (n <= 1){
			return n;
		}
		else return fibonacci(n-1) + fibonacci(n-2);
	}



	////////////////////////////////////////////
	///////////// NO Recusrsion ///////////////
	//////////////////////////////////////////	

	// ===========================================
	// Array sum
	// ===========================================
	public static int ArraySum(int[] A) {
		int sum, n;
		n = A.length;
		sum = 0;

		for (int i = 0; i < n;i++) {
			sum = sum + A[i];
		}
		return sum;
	}

	// ===========================================
	// Insertion Sort
	// ===========================================

	public static int[] Ordenar(int[] A){
		int j;
		int temp;
		int n = A.length;
		for (int i = 0; i < n;i++) {
			j = i;
			while (j > 0 && A[j-1] > A[j]) {
				temp = A[j];
				A[j] = A[j-1];
				A[j-1] = temp;
				j = j - 1;

			}
		}
		return A;
	}

	// ===========================================
	// Array max
	// ===========================================

	public static int ArrayMax(int A[]) {
		int max, temp;
		max = A[0];
		for (int i = 1; i < A.length; i++) {
			temp = A[i];
			if (temp > max) {
				max = temp;
			}
		}
		return max;
	}

	

}
