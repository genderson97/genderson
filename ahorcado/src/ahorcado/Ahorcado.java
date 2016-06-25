/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gende
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        String [] listaPalabras = {"avion","barco","computadora","dinosaurio","elefante","foca","gato","hielo","iguana","jabon"};
        
        //Elegimos un numero random, que sera el numero de palabra que legiremos de la lista de palabras
        int numeroRandom = 1 + new Random().nextInt(listaPalabras.length);
        
        String palabraEscogida = listaPalabras[numeroRandom];//Guardamos la palabra escogida por la pc en una variable
        System.out.println("Esta palabra tiene "+palabraEscogida.length()+" letras");
        String[] palabra = new String[palabraEscogida.length()];//si se llena todos los espacios de este array es que ha ganado el juego
        imprimirPalabra(palabra);//Mostramos las rayitas
        int vidas = 11;//Contador de vidas
        
        
        
        
        
        
        

}

    private static void imprimirPalabra(String[] palabra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
  }
    

