package principal;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import logs.FormatoHTML;
import menu.Menu;
import operaciones.Operaciones;

public class Calculadora{
	private static final Logger LOGGER = Logger.getLogger(Calculadora.class.getName());
    public static void main(String[] args) {   
    	
    	/**
    	 * Declara un array int de dos posiciones. Llama a dos metodos. El primero devuelve dos numeros, el segundo metodo devuelve un signo de suma, resta etc..
    	 * Dependiendo el signo que introduce, mediante varios ifs escogerá el calculo que debe hacer el programa con dichos numeros, devolviendo finalmente el resultado.
    	 */
    	configurarLog();
    	
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
       
        
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
            try {
            	
            
            if (operacion.equalsIgnoreCase("+")){
                resultado = operaciones.sumar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("-")){
                resultado = operaciones.restar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("*")){
                resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("/")){
                resultado = operaciones.dividir(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("%")){
                resultado = operaciones.resto(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else {
                System.out.println ("Operación no válida");
            }
            LOGGER.log(Level.FINE, "Operacion: " + operacion + " operando 1: " + operandos[0] + " operando 2: " + operandos[1] + " Resultado: " + resultado);
            } catch(ArithmeticException e) {
            	System.out.println("Operacion no valida " + e.getMessage());
            	LOGGER.log(Level.WARNING, "Division entre cero");
            }
        }   while (menu.repetir());
    }
    
    public static void configurarLog() {
    	
    	LOGGER.setUseParentHandlers(false);
    	
    	 Handler fileHandler = null;
         Handler consoleHandler = new ConsoleHandler();
         
         LOGGER.addHandler(consoleHandler);
         
         try {
           fileHandler = new FileHandler("./logOperaciones.html");
         } catch(IOException exception){
             LOGGER.log(Level.SEVERE, "Ocurrio un error en FileHandler.", exception);
         }
         
         fileHandler.setFormatter(new FormatoHTML());
    
         
         
         LOGGER.addHandler(fileHandler);
         
         
         consoleHandler.setLevel(Level.WARNING);
         fileHandler.setLevel(Level.FINE);
         
         LOGGER.setLevel(Level.FINE);
    }
}