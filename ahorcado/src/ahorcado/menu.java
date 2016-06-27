//Paquetes de mi clase menu.
package ahorcado;
//Importes de mi clase Menu.
import javax.swing.JOptionPane;
/**
 *
 * @author gende
 **/
public class Menu {
    //Variable de tipo entero llamada opc.
    int opc = Integer.parseInt(JOptionPane.showInputDialog("Presione 1 Para jugar, 2 para salir"));
    //
    int numrandom;
    //
    String[] listapalabras;
    //
    char letra;
    //
    String aleatoria;
    //
    int contador;
    /**
     * Menu de mi clase Menu.
     **/
    public void Menu() {
        switch (opc) {
            case 1:
                Palabras p = new Palabras(numrandom, listapalabras, letra, aleatoria, contador);
                p.Adivina();
                break;
            case 2:
                System.exit(0);
                break;
        }
    }
}