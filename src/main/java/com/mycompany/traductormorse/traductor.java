/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.traductormorse;

/**
 *
 * @author Alexis Gonzalez
 */
public class traductor {
   // arreglo declarando simbolos codigos morse
    String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
        "--", "-.", "--.--", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
   //arreglo declarando letras abecedario
    String[] palabras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q",
        "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    // variables para capturar traduccion
    String traduccion = "";
    String traduccion2 = "";
   // metodo que recibe el parametro "dato" para recorrer e
    //imprimir  traduccion a español
    
    public String traducirEspañol(String dato) {
        String[] palabra;

        palabra = dato.split(" ");

        for (int i = 0; i < palabra.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (palabra[i].equals(morse[j])) {
                    traduccion = traduccion + palabras[j] + " ";
                }
            }
        }

        return traduccion;

    }
    // metodo que recibe el parametro "dato2" para recorrer e imprimir  traduccion a Morse

    public String traducirMorse(String dato2) {

        String mayuscula = "";
        String letra = "";

        mayuscula = dato2.toUpperCase();
        for (int i = 1; i < dato2.length(); i++) {
            letra = mayuscula.substring(i - 1, i);

            for (int j = 0; j < palabras.length; j++) {

                if (letra.equals(palabras[j])) {
                    traduccion2 = traduccion2 + morse[j] + " | ";
                }
            }
        }

        return traduccion2;
    }
}
