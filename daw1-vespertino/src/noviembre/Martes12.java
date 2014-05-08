package noviembre;

import octubre.Jueves31;

public class Martes12 {
/*
 * Sumar una serie de números enteros positivos hasta que el número introducido sea el 0
 * Para generar los números se utilizará la utilidad Jueves31.random(). 
 * Como salida imprimir la suma.
 * 
 * ALGORITMO
 * generar un número
 * mientras no sea 0 hacer
 * lo sumo
 * generar un número
 * finmientras
 * imprimir la suma
 */
	public static void main(String[] args) {
		//Declarar las variables
		int n = 0;
		int suma = 0; //Se inicializa a 0 por que es el valor en el que empieza al no haber leído aún números.
		//Implementamos el algoritmo		
		n  = Jueves31.random(0, 10);
		//Vamos a visualizar los números que se van creando:
		System.out.print(n + "\t");
		while (n != 0) {
			//suma = suma + n; ESTA ORDEN ES IGUAL QUE LA DE ABAJO
			suma += n;
			n  = Jueves31.random(0, 10);
			System.out.print(n + "\t");
		}
		System.out.println("\n\nLa suma de la serie de números es: " + suma);
	}

}
