/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_5;


import java.util.ArrayList;
/**
 * Abstract class for implementations of Digraphs
 * 
 * @author Mauricio Toro
 * @version 1
 */
public abstract class Digraph
{
   protected int size;
   
   public  Digraph(int vertices) 
   {
       size = vertices;
   }
   public  abstract void addArc(int source, int destination, int weight);
   public abstract ArrayList<Integer> getSuccessors(int vertice);
   public abstract int getWeight(int source, int destination);
   public  int size() {return size;}
}

/* 
Title: Laboratorio 5 - Codigo
Author: <Agustin Restrepo, Sebastian Gonzales> 
Date: <date> 06/05/2018
Code version: 1
Availability: https://github.com/arestrepoc/ST0245-032/tree/master/laboratorios/lab05/codigo
*/