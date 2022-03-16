package menu;
import java.util.Scanner;
public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    /**
     * Crea un array de dos posiciones, despues pide un numero para cada posicion del array y los mete en su interior.
     * @return Devuelve el array.
     */
    
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    
    /**
     * Enseña las opciones para el calculo matematico. Despues te pide que metas un string con una de las opciones. Si pones una opcion diferente a las mostradas
     * desde el SOP, te vovlerá a pedir todo el rato en bucle hasta que metas una opción valida.
     * @return Devuelve el string con la opción valida.
     */
    
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    
    /**
     * Te pregunta si quieres continuar con el programa, al final te pide tu respuesta. Filtra el tener que meter obligatoriamente si si o no, hasta que
     * metas una respuesta valida. Si la respuesta es que sí, devuelve un booleano true.
     * @return
     */
    
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("¿Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}