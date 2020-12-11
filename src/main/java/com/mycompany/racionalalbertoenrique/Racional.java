/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racionalalbertoenrique;

import java.util.Random;

/**
 *
 * @author alberto
 */
public class Racional {
        

    private int numerador;
    private int denominador;

    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;

        if (denominador == 0) {
            this.denominador = 1;
        } else {
            this.denominador = denominador;
        }

    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {

        if (denominador == 0) {
            this.denominador = 1;
        } else {
            this.denominador = denominador;
        }
    }

    public void ImprimirPorConsola() {
        System.out.println("Numero racional " + numerador + "/" + denominador);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    public void suma(Racional x) {
        if (denominador == x.getDenominador()) {
            this.numerador = (numerador + x.getNumerador());
            this.denominador = denominador;
        } else {
            this.numerador = ((numerador * x.getDenominador()) + (x.getNumerador() * denominador));
            this.denominador = (denominador * x.getDenominador());
        }

        System.out.println(numerador + "/" + denominador);
    }

    public void resta(Racional x) {
        if (denominador == x.getDenominador()) {
            this.numerador = (numerador - x.getNumerador());
            this.denominador = denominador;
        } else {
            this.numerador = ((numerador * x.getDenominador()) - (x.getNumerador() * denominador));
            this.denominador = (denominador * x.getDenominador());
        }

        System.out.println(numerador + "/" + denominador);
    }

    public void producto(Racional x) {
        this.numerador = numerador * x.getNumerador();
        this.denominador = denominador * x.getDenominador();

        System.out.println(numerador + "/" + denominador);
    }

    public void division(Racional x, Racional y) {
        this.numerador = x.getNumerador() * y.getDenominador();
        this.denominador = x.getDenominador() * y.getNumerador();

        System.out.println(numerador + "/" + denominador);
    }

    public void igualdad(Racional x, Racional y) {
        if ((x.getNumerador() + y.getDenominador()) == (x.getDenominador() + y.getNumerador())) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
    
    public void aleatorio(){
       Random r = new Random();
       
       this.numerador = r.nextInt();
       this.denominador= r.nextInt() + 1;
       
       
    }

}
