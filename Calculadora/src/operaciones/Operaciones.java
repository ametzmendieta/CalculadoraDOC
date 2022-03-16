package operaciones;
public class Operaciones{
	
	/**
	 * Llegan dos valores desde parametro, declara un int en donde suma dichos parametros y se queda con ese valor.
	 * @param valor1
	 * @param valor2
	 * @return Devuelve la suma de ambos parametros.
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
    /**
	 * Llegan dos valores desde parametro, declara un int en donde resta dichos parametros y se queda con ese valor.
	 * @param valor1
	 * @param valor2
	 * @return Devuelve la resta de ambos parametros.
	 */
    
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    
    /**
	 * Llegan dos valores desde parametro, declara un int en donde multiplica dichos parametros y se queda con ese valor.
	 * @param valor1
	 * @param valor2
	 * @return Devuelve el resultado de lo multiplicado.
	 */
    
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    
    /**
	 * Llegan dos valores desde parametro, declara un int en donde divide dichos parametros y se queda con ese valor.
	 * @param valor1
	 * @param valor2
	 * @return Devuelve la division de ambos parametros.
	 */
    
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
    /**
	 * Llegan dos valores desde parametro, declara un int en donde saca el resto de dichos parametros y se queda con ese valor.
	 * @param valor1
	 * @param valor2
	 * @return Devuelve el resto de ambos parametros.
	 */
    
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}