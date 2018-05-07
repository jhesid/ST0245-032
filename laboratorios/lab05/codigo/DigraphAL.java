/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_5;

import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Mariaelvira
 */
public class DigraphAL extends Digraph{
    LinkedList<Pareja>[] list;
    public DigraphAL(int vertices){
        super(vertices);
        list = new LinkedList[vertices];
        for(int i = 0; i<list.length;i++){
            list[i] = new LinkedList<>();
        }
    }
    @Override 
    public  void addArc(int source, int destination, int weight){
        list[source].add(new Pareja(destination,weight));
    }
    @Override 
    public ArrayList<Integer> getSuccessors(int vertice){
        ArrayList<Integer> alist = new ArrayList();
        for(Pareja n : list[vertice]){
            alist.add(n.vertice);
        }
        return alist;
    }
    @Override 
    public int getWeight(int source, int destination){
        for(Pareja n : list[source]){
            if(n.vertice==destination) return n.peso;
        }
        return 0;
    }
    @Override 
    public  int size() {return size;}
}

/* 
Title: Laboratorio 5 - Codigo
Author: <Agustin Restrepo, Sebastian Gonzales> 
Date: <date> 06/05/2018
Code version: 1
Availability: https://github.com/arestrepoc/ST0245-032/tree/master/laboratorios/lab05/codigo
*/