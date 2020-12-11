/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racionalalbertoenrique;

import java.text.DecimalFormat;

/**
 *
 * @author alber
 */
public class AppRacional {
    public static void main(String[] args) {
        DecimalFormat formateador = new DecimalFormat("####.##");
        
        Racional z = new Racional(4, 5);
        Racional k = new Racional(3, 4);
        
        Racional r = new Racional();        
        r.aleatorio();
        
        formateador.format(z.getDenominador());
        formateador.format(z.getNumerador());
        z.ImprimirPorConsola();
        
        formateador.format(k.getDenominador());
        formateador.format(k.getNumerador());
        k.ImprimirPorConsola();
        
        formateador.format(r.getDenominador());
        formateador.format(r.getNumerador());
        r.ImprimirPorConsola();
        
    }
}
