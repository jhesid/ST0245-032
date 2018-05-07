/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_5;

import java.util.*;
/**
 *
 * @author Mariaelvira
 */
public class DigraphAM extends Digraph{
    public int[][] matriz;
    public DigraphAM(int vertices){
        super(vertices);
        matriz = new int[vertices][vertices];
    }
    @Override 
    public  void addArc(int source, int destination, int weight){
        matriz[source][destination] = weight;
    }
    @Override 
    public ArrayList<Integer> getSuccessors(int vertice){
        ArrayList<Integer> successors = new ArrayList<>();
        for(int i = 0; i< matriz.length;i++){
            if(matriz[vertice][i]!=0){
                successors.add(i);
            }
        }
        return successors;
    }
    @Override 
    public int getWeight(int source, int destination){
        return matriz[source][destination];
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