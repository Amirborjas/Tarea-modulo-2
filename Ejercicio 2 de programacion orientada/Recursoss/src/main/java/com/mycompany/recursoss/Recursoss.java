/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursoss;

/**
 *
 * @author amire
 */
public class Recursoss {

    public static void main(String[] args) {
        Recursos recursos = new Recursos ();
        
        System.out.println(recursos.obtenerMensaje());
        
        int edad = 22;
        System.out.println("Edad:" + edad + " - " + recursos.verificarEdad(edad));
        
        
        int numero1 = 3;
        int numero2 = 2;
        System.out.println("Multiplicacion:" + recursos.multiplicar(numero1, numero2));
        
        
        int x = 10;
        int[] lista = recursos.generarLista(x);
        System.out.println("Lista generada :");
        for(int num : lista){
            System.out.print(num + "");
        } 
    }
}
