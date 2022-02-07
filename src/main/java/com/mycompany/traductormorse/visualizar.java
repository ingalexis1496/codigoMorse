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
//clase para imprimir traducciones
public class visualizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //instanciando objeto
        traductor traduccion = new traductor();
		
		String palabras = "";	
                String palabras2 = "";		
		
		
		//palabra en codigo morse
               palabras = traduccion.traducirEspañol("- .-. .-  -.. ..- ..- "
                        +   "-.-. -.-. .. ---  -. . ... .--. .- -. --- .-..  ");
               //traduccion palabra a español
               System.out.println(palabras);
                //palabra español 
                palabras2 = traduccion.traducirMorse("TRADUCCION MORSE ");
		//palabra traducida a codigo morse
                System.out.println(palabras2);
    }
    
}
