/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

import org.omg.CORBA.Any;

/**
 *
 * @author cl18417
 */
public class Node {
    public String data;
    public Node next;
    public Node anterior;
  
    public Node(String d){
        this.data = d;
        this.next = null;
        this.anterior = null;
    }
}
