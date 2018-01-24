public class Counter {
	
	private String id;
	private int valor;
	
	// Constructor
	public Counter(String id) {
		this.id = id;
		this.valor = 0;
	}

	// Incrementar
	public void incrementar() {
		valor = valor + 1; 
	}
	
	// Numero de incrementos desde creacion
	public int incrementos() {
		return valor - 0;
	}
	
	// Representacion en caracteres
	public String toString() {
		return Integer.toString(valor) + " " + id;
	}
	
	
}
