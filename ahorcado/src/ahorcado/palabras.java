/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Random;

/**
 *
 * @author gende
 */
public class palabras {
private String[] listapalabras;        
private String escogerpalabra;
private String palabraEscogida; ;
private int numeroRandom = 1+ new Random().nextInt(listapalabras.length);    
//contador vacio
    public palabras() {
    String[] listaPalabras = null;
        this.palabraEscogida = listaPalabras[numeroRandom];
        this.listapalabras = new String[]{"teleferico", "televisor", "computador", "coche", "antropologia", "rusia", "hungria", "gorilla", "polonia", "arbol"};
    }
//contador lleno

    public palabras(String[] listapalabras, String escogerpalabra, String palabraEcogida) {
    String[] listaPalabras = null;
        this.palabraEscogida = listaPalabras[numeroRandom];
        this.listapalabras = listapalabras;
        this.escogerpalabra = escogerpalabra;
        this.palabraEscogida = palabraEcogida;
    }
//SETS Y GETS

    /**
     *Metodo get para la variable listapalabras
     * @return
     */
    public String[] getListapalabras() {
        return listapalabras;
    }

    /**
     *Metodo set pars la variable listapalabras
     * @param listapalabras
     */
    public void setListapalabras(String[] listapalabras) {
        this.listapalabras = listapalabras;
    }

    /**
     *Metodo get para la variable esogerPalabra
     * @return
     */
    public String getEscogerpalabra() {
        return escogerpalabra;
    }

    /**
     *Metodo set para la variable escogerPalabra
     * @param escogerpalabra
     */
    public void setEscogerpalabra(String escogerpalabra) {
        this.escogerpalabra = escogerpalabra;
    }

    /**
     *Metodo get para la variable palabraEscogida
     * @return
     */
    public String getPalabraEcogida() {
        return palabraEscogida;
    }

    /**
     *metodo set para  variable palabraEscogida
     * @param palabraEcogida
     */
    public void setPalabraEcogida(String palabraEcogida) {
        this.palabraEscogida = palabraEcogida;
    }

    /**
     *metodo get para la variable numeroRandom
     * @return
     */
    public int getNumeroRandom() {
        return numeroRandom;
    }

    /**
     *Metodo set para variable numeroRandom
     * @param numeroRandom
     */
    public void setNumeroRandom(int numeroRandom) {
        this.numeroRandom = numeroRandom;
    }

    
    //metodos especificos
    public String[] ListaPalabras(String[] listaPalabras){
        String[] Listapalabras = listaPalabras; //Defino la variable a usar
        Listapalabras = listapalabras; //Ejecuto el método
        return Listapalabras; //Devuelvo la variable llena
        }
    
        public String escogerPlabra(String escogerpalabra){
        String escogerPalabra = escogerpalabra ; //Defino la variable a usar
    String[] listaPalabras = null;
         escogerPalabra = listaPalabras[numeroRandom];  //Ejecuto el método
        return escogerPalabra; //Devuelvo la variable llena  
    }
     
 
        
    
    
    
    
    
    



}
