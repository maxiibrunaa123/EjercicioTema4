package com.maxi;

/*
En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:

String[] nombres = {"", "", "", ""}

 */

public class BucleMain {
    public static void main(String[] args) {

        String[] saludos = {"Hola","buenos","dias"};

        for (String saludo:saludos) {
            System.out.print(" " + saludo);
        }

    }
}
