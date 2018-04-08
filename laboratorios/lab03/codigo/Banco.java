package laboratorio3;

public class Banco {

	public static void atender(LinkedListMauricio F1, LinkedListMauricio F2, LinkedListMauricio F3, LinkedListMauricio F4) {

		// Cajeros 1 y 2
		LinkedListMauricio C1 = new LinkedListMauricio();
		LinkedListMauricio C2 = new LinkedListMauricio();

		boolean cajero = false;
		boolean salir = false;
		while (!salir) {
			for (int i = 1; i <= 4;i++) {
				switch (i) {
				case 1:
					if (F1.size() != 0) {
						if (!cajero) {
							C1.insert(F1.get(0), 0);
							cajero = true;
						}
						else {
							C2.insert(F1.get(0), 0);
							cajero = false;
						}
						F1.remove(0);

					}
					break;
				case 2:
					if (F2.size() != 0) {
						if (!cajero) {
							C1.insert(F2.get(0), 0);
							cajero = true;
						}
						else {
							C2.insert(F2.get(0), 0);
							cajero = false;
						}
						F2.remove(0);
					}
					break;

				case 3:
					if (F3.size() != 0) {
						if (!cajero) {
							C1.insert(F3.get(0), 0);
							cajero = true;
						}
						else {
							C2.insert(F3.get(0), 0);
							cajero = false;
						}
						F3.remove(0);
					}
					break;

				case 4:
					if (F4.size() != 0) {
						if (!cajero) {
							C1.insert(F4.get(0), 0);
							cajero = true;
						}
						else {
							C2.insert(F4.get(0), 0);
							cajero = false;
						}
						F4.remove(0);
					}
					break;

				}//Casse
			}//For
			if ( (F1.size()==0)&& (F2.size()==0)&&(F3.size()==0)&& (F4.size()==0) ) {
				salir = true;
			}//if
		}// While
		
		// Imprimir
		if ( (C1.size()==0)&& (C2.size()==0) ) {
			System.out.println("No hubo clientes por atender");
		}
		else {
			System.out.println("Los clientes atendidos por la caja 1 en orden de derecha a izquierda");
			for (int i = 0;i<C1.size();i++) {
	        	System.out.print(C1.get(i) + " ");
	        }
			System.out.println(" ");
			System.out.println("Los clientes atendidos por la caja 2 de derecha a izuqierda");
			for (int i = 0;i<C2.size();i++) {
	        	System.out.print(C2.get(i) + " ");
	        }
		}

	}

}
