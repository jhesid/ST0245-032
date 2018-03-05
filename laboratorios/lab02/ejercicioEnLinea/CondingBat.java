package lab2;

/*
 * Laboratorio 2
 * Cristian Camilo Rendon Cardona
 * Jhesid Steven Suarez Berrio
 */

public class CondingBat {
	///////////////////////////////////////
	//////////// Array 2 /////////////////
	/////////////////////////////////////

	// =====================================
	// either24
	// =====================================

	public boolean either24(int[] nums) {
		int a=0;
		int b=0;
		for (int i =0;i<nums.length-1;i++){
			if((nums[i]==nums[i+1])&&(nums[i]==2)){
				a=1;
			}
			else if((nums[i]==nums[i+1])&&(nums[i]==4)){
				b=1;
			}
		}
		if((a==1)&&(b==1)){
			return false;
		}
		else if((a==1)||(b==1)){
			return true;
		}
		return false;
	}

	// =====================================
	// only14
	// =====================================

	public boolean only14(int[] nums) {
		boolean a = true;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i]!=1)&&(nums[i]!=4)){
				a = false;
				break;
			}
		}
		return a;
	}

	// =====================================
	// tripleUp
	// =====================================	
	
	public boolean tripleUp(int[] nums) {
		boolean a=false;
		for(int i=0;i<nums.length-2;i++){
			if((nums[i]==(nums[i+1]-1))&&(nums[i+1]==(nums[i+2]-1))){
				a=true;
			}
		}
		return a;
	}
	
	// =====================================
	// fizzArray2
	// =====================================
	
	public String[] fizzArray2(int n) {
		String[] a=new String[n];
		for(int i=0;i<a.length;i++){
			a[i]=String.valueOf(i);
		}
		return a;
	}
	
	
	// =====================================
	// fizzArray
	// =====================================
	
	public int[] fizzArray(int n) {
		int[] a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=i;
		}
		return a;
	}

	

	///////////////////////////////////////
	//////////// Array 3 /////////////////
	/////////////////////////////////////

	// =====================================
	// countClumps
	// =====================================


	public int countClumps(int[] nums) {
		// Inicializar el contrador
		int cont = 0;
		if (nums.length != 0){
			// Variable temporal que almacena el valor anterior
			int temp;

			temp = nums[0];
			// Esta variable boolean para contar solo una vez
			boolean b = false;

			for (int i = 1; i < nums.length; i++){
				if ((temp == nums[i]) && (b == false)){
					cont++;
					b = true;
				}
				// Cuando el numero es diferente el temporizzador se actualiza
				if (nums[i] != temp){
					temp = nums[i];
					b = false;
				}
			}
		}
		return cont;
	}	

	// =====================================
	// SquareUp
	// =====================================

	public int[] squareUp(int n) {
		int[] A = new int[n*n];
		for (int i = 0; i < n; i++){
			for (int j = 1;j <= i + 1; j++){
				A[(n*(i+1))-j] = j;
			}
		}
		return A;
	}

	// =====================================
	// linearIn
	// =====================================

	public boolean linearIn(int[] outer, int[] inner) {
		int comp;
		int cont = 0;
		boolean entro;
		for (int i = 0; i < inner.length; i++){
			comp = inner[i];
			entro = false;
			for (int j = 0; j < outer.length; j++){
				if (comp == outer[j] && !entro){
					cont++;
					entro = true;
				}
			}
		}
		return cont == inner.length;
	}


	// =====================================
	// maxSpan
	// =====================================


	public int maxSpan(int[] nums) {
		int cont = 0;
		if ((nums.length != 0)  &&(nums[0] == nums[nums.length-1])){
			cont++;
		}
		for (int i = 0; i < nums.length - 1; i++){
			cont++;
		}
		return cont;
	}

	// =====================================
	// SeriesUp
	// =====================================
	

	public int[] seriesUp(int n) {
		  int[] A = new int[n*(n+1)/2];
		  int i = n*(n+1)/2;
		  while (i > 0){
		    for (int j = n; j > 0; j-- ){
		      A[i - (n -j + 1)] = j;
		    }
		    n--;
		    i = n*(n+1)/2; 
		  }
		  return A;
		}


}
