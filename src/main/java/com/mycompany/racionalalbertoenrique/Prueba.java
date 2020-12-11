/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racionalalbertoenrique;

/**
 *
 * @author enrique
 */
public class Prueba {

    public static void main(String[] args) {
        Racional r1 = new Racional(4, 7);
        Racional r2 = new Racional(5, 7);
        
        r1.ImprimirPorConsola();
        System.out.println("");
        
        System.out.println("Suma");
        r1.suma(r2);
        System.out.println("");
        
        System.out.println("toString");
        System.out.println(r1.toString());
        System.out.println("");
        
        System.out.println("Resta");
        r1.resta(r2);
        System.out.println("");
        
        System.out.println("Multiplicación");
        r1.producto(r2);
        System.out.println("");
        
        System.out.println("División");
        r1.division(r2,r1);
        System.out.println("");
    }

}
