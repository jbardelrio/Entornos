package noviembre;

import octubre.Jueves31;

public class Martes12c {
/*
 * Sumar una serie de n�meros enteros positivos hasta que el n�mero introducido sea el 0
 * Para generar los n�meros se utilizar� la utilidad Jueves31.random(). 
 * Como salida imprimir la suma.
 * 
 * ALGORITMO
 * mientras el numero no sea 0 hacer
 * lo sumo
 * finmientras
 */
	public static void main(String[] args) {
		//Declarar las variables
		int n = 0;
		int suma = 0; //Se inicializa a 0 por que es el valor en el que empieza al no haber le�do a�n n�meros.
		//Implementamos el algoritmo		
		while ((n = Jueves31.random(0, 4)) != 0) {
			System.out.print(n + "\t");
			suma += n;
		}
		System.out.println("\n\nLa suma de la serie de n�meros es: " + suma);
	}
}
