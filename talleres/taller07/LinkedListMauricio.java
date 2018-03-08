
package Taller7;

import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
public class LinkedListMauricio {
private Node first;
private int size;

    public LinkedListMauricio()
    {
	size = 0;
	first = null;	
    }

	/**
	 * Returns the node at the specified position in this list.
	 * @param index - index of the node to return
	 * @return the node at the specified position in this list
	 * @throws IndexOutOfBoundsException
	 */
	private Node getNode(int index) throws IndexOutOfBoundsException {
		if (index >= 0 && index < size) {
			Node temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * Returns the element at the specified position in this list.
	 * @param index - index of the element to return
	 * @return the element at the specified position in this list
	 */
	public int get(int index) {
		Node temp = null;
		try {
			temp = getNode(index);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.exit(0);
		}

		return temp.data;
	}

    // Retorna el tamaño actual de la lista
    public int size()
    {
        return this.size;
    }

    // Inserta un dato en la posición index
    public void insert(int data, int index) {
        try {
            if (index == 0) {
                Node nuevo = new Node(data);
                if (size() != 0) {
                    nuevo.next = this.first;
                }
                this.first = nuevo;
            } else {
                Node nuevo = new Node(data);
                Node temp = getNode(index - 1);
                nuevo.next = temp.next;
                temp.next = nuevo;
            }
            size++;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();

        }
    }

    // Borra el dato en la posición index
    public void remove(int index)
    {

    	try {
    		Node temp = getNode(index-1);
    		Node a_borr = getNode(index);
    		temp.next = a_borr.next;
    		a_borr.next = null;    		
    		size--;
    	} catch (IndexOutOfBoundsException e) {
    		e.printStackTrace();

    	}

    }
    

    // Verifica si está un dato en la lista
    public boolean contains(int data)
    {
    	boolean t = false;
    	for (int i = 0; i < this.size ; i++) {
    		int temp = get(i);
    		if (temp == data) {
    			t = true;
    			break;
    		}
    	}
    	return t;
    }
    
    
    public boolean equal(LinkedListMauricio otraList) {
    	if (size() == otraList.size()) {
    		int cont = 0;
    		for (int i = 0; i < size(); i++) {
    			if (get(i) == otraList.get(i)) {
    				cont++;
    			}
    		}
    		return (cont == size());
    	}
    	else {
    		return false;
    	}
    }

}



