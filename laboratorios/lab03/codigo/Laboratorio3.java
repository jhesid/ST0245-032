package laboratorio3;
import java.util.*;
import java.lang.IndexOutOfBoundsException;



/**
 * Laboratorio 3 Linked List ans Array List
 * Cristian Rendon && Jhsid Suarez
 * 
 */


public class Laboratorio3 {


	/**
	 * Returns the product of the numbers in the list. 
	 * @param list - List of integers.
	 * @return An integer.
	 */

	/*
	public static int multiply(List<Integer> list) {

	}
	 */
	/**
	 * Tests the methods.
	 * @param args
	 */

	//1.1)

	static int multiply(LinkedList<Integer> a){
		int m=0;
		int mult=proceso(a,m);

		return mult;
	}
	static int proceso(LinkedList<Integer> a,int m){
		if(a.isEmpty()!=true){
			m=a.pop()*proceso(a,m);
		}
		return m;
	}

	//-------------------------------------------------------------------
	//1.2)

	static void smartInsert(LinkedList<Integer> a, int n){
		for (int i = 0; i < a.size(); i++) {
			int z=(int)a.get(i);
			if (z==n) {
				break;
			}
			if ((z!=n)&&(i==a.size()-1)) {
				a.add(n);
			}
		}

	}
	//--------------------------------------------------------------------

	//1.3)

	static int pivote(LinkedList<Integer> a) throws IndexOutOfBoundsException {
		if (a.size() > 0) {
			int sumd;
			int sumi;
			int diff;
			int temp = 0;
			int index = 0;
			for (int i = 0;i < a.size();i++) {
				sumd = 0;
				sumi = 0;
				diff = 0;
				if ((i == 0) && a.size() > 1 ) {
					for (int j = i + 1;j < a.size();j++) {
						sumd = sumd + a.get(j);
					}
					temp = sumd;
				}
				else {
					for (int j = 0; j < i;j++) {
						sumi = sumi + a.get(j);
					}
					for (int j = i + 1; j < a.size(); j++) {
						sumd = sumd + a.get(j);
					}
					diff = Math.abs(sumd-sumi);
					if (diff < temp) {
						temp = diff;
						index = i;
					}
				}


			}
			return index;

		}
		else {
			throw new IndexOutOfBoundsException();
		}
	}


	//-------------------------------------------------------------------
	// 1.4)

	public static class neveras {
		private int serial;
		private String descripcion;

		public neveras(int serial,String descripcion){
			this.serial=serial;
			this.descripcion=descripcion;
		}
		public int getserial(){
			return this.serial;
		}
		public String getdescripcion(){
			return this.descripcion;
		}

	}

	public static class tienda {
		private String nombre;
		private int numneveras;

		public tienda(int numneveras,String nombre){
			this.nombre=nombre;
			this.numneveras=numneveras;

		}
		public int getnumneveras(){
			return this.numneveras;
		}
		public String getnombre(){
			return this.nombre;
		}
	}

	//----------------------------------------------------------------

	public static void main(String[] args) {

		//////////////////////////////////////////////////
		// Prueba 1.1
		/////////////////////////////////////////////////

		System.out.println("========================================================== ");
		System.out.println("Punto 1.1");

		LinkedList<Integer> linked = new LinkedList<>();
		linked.addAll(Arrays.asList(new Integer[] {1, 3, 5, 7}));

		ArrayList<Integer> array = new ArrayList<>();
		array.addAll(Arrays.asList(new Integer[] {2, 4, 6, 8}));

		// Multiply

		System.out.println(multiply(linked));
		//System.out.println(multiply(array));

		System.out.println("========================================================== ");

		////////////////////////////////////////////////
		// 3, Probar el pivote
		///////////////////////////////////////////////

		System.out.println("========================================================== ");
		System.out.println("Punto 1.3 ");

		int pivot;
		LinkedList<Integer> viga = new LinkedList<>();
		viga.addAll(Arrays.asList(new Integer[] {10, 20, 5, 3, 20, 10}));

		pivot = pivote(viga);

		System.out.println("Pivote: " + pivot);

		int pivot2;


		LinkedList<Integer> viga2 = new LinkedList<>();
		viga2.addAll(Arrays.asList(new Integer[] {10, 2, 4, 8}));
		pivot2 = pivote(viga2);
		System.out.println("Pivote2: " + pivot2);

		System.out.println("========================================================== ");

		////////////////////////////////////////////////////////////
		// Prueba neveras
		////////////////////////////////////////////////////////////

		LinkedList<neveras> a = new LinkedList<>();
		neveras nevera1 = new neveras(1,"a");
		a.add(nevera1);
		neveras nevera2= new neveras(2,"b");
		a.add(nevera2);
		neveras nevera3=new neveras(3,"c");
		a.add(nevera3);
		neveras nevera4=new neveras(4,"d");
		a.add(nevera4);
		neveras nevera5=new neveras(5,"e");
		a.add(nevera5);
		neveras nevera6=new neveras(6,"f");
		a.add(nevera6);
		neveras nevera7=new neveras(7,"g");
		a.add(nevera7);
		neveras nevera8=new neveras(8,"h");
		a.add(nevera8);
		neveras nevera9=new neveras(9,"i");
		a.add(nevera9);
		neveras nevera10=new neveras(10,"a");
		a.add(nevera10);

		LinkedList<tienda> b=new LinkedList<>();
		tienda tienda1=new tienda(1,"pedro");
		b.add(tienda1);
		tienda tienda2=new tienda(2,"jacinto");
		b.add(tienda2);
		tienda tienda3=new tienda(3,"pedro");
		b.add(tienda3);
		tienda tienda4=new tienda(4,"rodrigo");
		b.add(tienda4);


		////////////////////////////////////////////////////////////
		// Ejercicio 1,5. 
		///////////////////////////////////////////////////////////

		LinkedListMauricio L1 = new LinkedListMauricio();
		LinkedListMauricio c = new LinkedListMauricio();


		// Agregar y L1orrar un elemento cuando esta vacia
		L1.insert("7", 0);
		c.remove(0); // DeL1e sacar error

		// Llenar la lista
		for (int i = 0;i<10;i++) {
			L1.insert("L1", i);
			c.insert("L2", i);
		}


		//insertar/eliminr el primer elemento de la lista
		L1.insert("123", 0);
		c.remove(0);

		System.out.print("L1: ");

		//Imprimir
		for (int i = 0;i<L1.size();i++) {
			System.out.print(L1.get(i) + " ");
		}

		System.out.println(" ");
		System.out.print("c: ");

		for (int i = 0;i<c.size();i++) {
			System.out.print(c.get(i) + " ");
		}

		// Insertar/L1orraar el ultmo eemento de la lista


		c.insert("7", 9);
		L1.remove(12); // Debe arrojar error

		System.out.println(" ");
		System.out.print("L1: ");

		//Imprimir
		for (int i = 0;i<L1.size();i++) {
			System.out.print(L1.get(i) + " ");
		}

		System.out.println(" ");
		System.out.print("c: ");

		for (int i = 0;i<c.size();i++) {
			System.out.print(c.get(i) + " ");
		}



		LinkedListMauricio F1 = new LinkedListMauricio();
		LinkedListMauricio F2 = new LinkedListMauricio();
		LinkedListMauricio F3 = new LinkedListMauricio();
		LinkedListMauricio F4 = new LinkedListMauricio();

		// El orden de cada fila es de izquierda a derecha

		F1.insert("Laura", 0);
		F1.insert("Jhesid", 0);
		F1.insert("Mauricio", 0);
		F2.insert("critian", 0);
		F3.insert("Jordn", 0);
		F4.insert("Pipo", 0);
		F4.insert("Claus", 0);

		Banco.atender(F1, F2, F3, F4);



	}

}