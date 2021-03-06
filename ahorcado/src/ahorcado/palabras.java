//Paquetes de mi Clase Palabras.
package ahorcado;
//Importes de mi Clase Palabras.
import static java.lang.Character.toLowerCase;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 * @author Genderson Porras
 * @date ***
 *
 */
public class Palabras {

    //Arreglo de tipo String llamado listapalabras.
    String[] listapalabras;
    char letra; //variable char llamado letra
    String aleatoria;//String llamado aleatoria
    int numrandom;//variable tipo int llamado numrandom
    int contador;//variable tipo int llamado contador
    /**
     * Constructor vacio.
     *
     */
    public Palabras() {
    }
    /**
     * Constructor de mi clase Palabras.
     *
     * @param listapalabras
     * @param letra
     * @param aleatoria
     *
     */
    public Palabras(int numrandom, String[] listapalabras, char letra, String aleatoria, int contador) {
        this.listapalabras = new String[10];
        this.listapalabras[0] = "yuca";
        this.listapalabras[1] = "gato";
        this.listapalabras[2] = "tren";
        this.listapalabras[3] = "arbol";
        this.listapalabras[4] = "auto";
        this.listapalabras[5] = "clavo";
        this.listapalabras[6] = "nido";
        this.listapalabras[7] = "trapo";
        this.listapalabras[8] = "tanque";
        this.listapalabras[9] = "juan";
        this.letra = letra;
        this.numrandom = (int) (Math.random() * 10);
        this.aleatoria = this.listapalabras[this.numrandom];
        this.contador = 11;
    }
    /**
     * Metodo get para variable listapalabras.
     * @return listapalabras. 
     **/
    public String[] getListapalabras() {
        return listapalabras;
    }
    
    /**
     *metodo set lista para la variable  listapalabras
     * @param listapalabras
     */
    public void setListapalabras(String[] listapalabras) {
        this.listapalabras = listapalabras;
    }
    /**
     * Metodo get para la variable letra.
     * @return letra
     **/
    public char getLetra() {
        return letra;
    }

    /**
     *mtodo set para la variable leletra
     * @param letra
     */
    public void setLetra(char letra) {
        this.letra = letra;
    }

    /**
     *metodo get para la variable aleatoria
     * @return
     */
    public String getAleatoria() {
        return aleatoria;
    }
    
    /**
     *metodo set para la variable aleatoria
     * @param aleatoria
     */
    public void setAleatoria(String aleatoria) {
        this.aleatoria = aleatoria;
    }

    /**
     *metodo get para la vriable numramdom
     * @return
     */
    public int getNumrandom() {
        return numrandom;
    }

    /**
     *metodo set parala variable numrandom
     * @param numrandom
     */
    public void setNumrandom(int numrandom) {
        this.numrandom = numrandom;
    }

    /**
     *metodo get para la variable contados
     * @return
     */
    public int getContador() {
        return contador;
    }

    /**
     *metodo set para la variable contador
     * @param contador
     */
    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public void Adivina() {
        System.out.println("Usted posee " + contador + " intentos");//mensaje de cuantos intentos tiene
        char oculta[] = getAleatoria().toCharArray();//la palabra va aparecer en un arreglo de caracteres
        for (int i = 0; i < getAleatoria().length(); i++) {//ciclo for para get aleatoria rellena la palabra con esos caracteres
                oculta[i] = '_';//caracter oculto va a ser igual a ese caracter
            }       
        System.out.println(Arrays.toString(oculta));
        while (contador != 0) {//mientras contador es diferente a 0
            if (!(Arrays.toString(oculta).contains("_"))) {//
                JOptionPane.showMessageDialog(null, "You Winner", "Fin", JOptionPane.WARNING_MESSAGE);
                break;
            }
            //Carga el primer caracter en la variable letra y la trasforma a minuscula.
            setLetra(toLowerCase(JOptionPane.showInputDialog("Ingrese una letra").charAt(0)));
            if (getAleatoria().contains(String.valueOf(letra))) {//si aleatoria contiene el valor de letra
                int index = getAleatoria().indexOf(letra);//int index va se igual a aleatoria pero con la letra que se acerto
                oculta[index] = letra;
                System.out.println(Arrays.toString(oculta));//me da mensaje del arreglo de la palabra ocultacon la letra si acerto
            } else {//de lo contrario
                JOptionPane.showMessageDialog(null, "Letra Incorrecta, Intente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);//imprime un aviso que la letra que se inserto esta incoreccta
                contador = contador - 1;//se descontara un intento
                System.out.println("Tienes: "+contador+" intentos restantes");//mensaje de cuantos intentos le quedan
            }
        }
        if (contador == 0) {//si el contador llega a cero
             JOptionPane.showMessageDialog(null, "Game Over", "Fin", JOptionPane.ERROR_MESSAGE);//imprime que ha perdido
        }
        Menu m = new Menu();//menu para reiniciar o salir del juego
        m.Menu();
    }
}
