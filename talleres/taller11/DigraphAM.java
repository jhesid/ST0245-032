package taller11;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

public class DigraphAM extends Graph
{ //hecho por luis
   private int[][] matriz; 
   
   public DigraphAM(int size)
   {
       super(size);
       matriz= new int[size][size];

   }
   
   public int getWeight(int source, int destination)
   {//hecho por luis
     return matriz[source][destination];
    }
   
   public void addArc(int source, int destination, int weight)
   {//hecho por luis
    matriz[source][destination]=weight;
   }
  
   public ArrayList<Integer> getSuccessors(int vertex)
   {//hecho por luis
       ArrayList<Integer> lista=new ArrayList<Integer>();
       for(int i=0;i<lista.size();i++)
          if(matriz[vertex][i]>0) 
             lista.add(i);
       return lista;
   }
}
