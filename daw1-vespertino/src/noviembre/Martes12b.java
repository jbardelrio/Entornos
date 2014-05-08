package noviembre;

import octubre.Jueves31;

public class Martes12b {
/*
 * Sumar una serie de n�meros enteros positivos hasta que el n�mero introducido sea el 0
 * Para generar los n�meros se utilizar� la utilidad Jueves31.random(). 
 * Como salida imprimir la suma.
 * 
 * ALGORITMO
 * hacer
 * generar n�mero
 * si no es 0 entonces
 * 	lo sumo
 * finsi
 * mientras no sea 0
 * imprimir la suma
 */
	public static void main(String[] args) {
		//Declarar las variables
		int n = 0;
		int suma = 0; //Se inicializa a 0 por que es el valor en el que empieza al no haber le�do a�n n�meros.
		//Implementamos el algoritmo
		do {
			n  = Jueves31.random(0, 10);
			System.out.print(n + "\t");
			//OJO CON ESTO DE ABAJO, LO PONEMOS PORQUE SINO, SUMARIA EL 0 EN CASO DE SALIR, Y SI FUESE OTRO N�MERO EL
			//QUE NO QUEREMOS QUE SALGA EN VEZ DEL 0 SALDR�A SUMADO
			if (n != 0) {
				suma += n;
			}
		} while (n != 0);
		System.out.println("\n\nLa suma de la serie de n�meros es: " + suma);
	}

}