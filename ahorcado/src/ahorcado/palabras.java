/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * @author gende
 */
public class palabras {
    private String[] arreglo;
    private String elegida;
    private String[] palabraFormada;

    public palabras() 
    {
    arreglo = new String[10];
    arreglo[0] = "teleferico";
    arreglo[1] = "coche";
    arreglo[2] = "zapato";     
    arreglo[3] = "terremoto";
    arreglo[4] = "electricidad";
    arreglo[5] = "velocidad";
    arreglo[6] = "computador";       
    arreglo[7] = "televisor";
    arreglo[8] = "abanico";
    arreglo[9] = "jirafa";  
    elegida = escogerPalabra();
    palabraFormada = new String[elegida.length()];
    llenarPalabraFormada();
    
    }
   
    
   }
    
    
    

