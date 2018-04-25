package taller11;

import java.util.ArrayList;
import java.util.LinkedList;

public class DigraphAL extends Graph{
     private LinkedList lista=new LinkedList(); 
      private int[][] matriz; 

    public DigraphAL(int vertices) {
        super(vertices);
           matriz= new int[vertices][vertices];
    }
    

     public int getWeight(int source, int destination){
     return matriz[source][destination];
    }
   
   public void addArc(int source, int destination, int weight){
    matriz[source][destination]=weight;
   }
       public ArrayList<Integer> getSuccessors(int vertex){
       ArrayList<Integer> lista=new ArrayList<Integer>();
       lista.add(vertex);
       for(int i=0;i<lista.size();i++)
          if(matriz[vertex][i]>0) 
             lista.add(i);
       return lista;
   }
  


}
