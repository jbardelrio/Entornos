package noviembre;

import octubre.Jueves31;

public class Jueves7h {
/*
 * Generar 3 n�meros enteros entre 1 y 5 que sean distintos entre s�.
 * Generar a
 * repetir
 * generar b
 * hasta que b sea distinto de a
 * repetir
 * generar c
 * hasta que c sea distinto de a y b
 */
	//ESTA VERSI�N ES PARA USAR LOS N�MEROS M�GICOS. ESTO PERMITIR�A M�S FACILMENTE CAMBIAR EL RANGO, SIN TENER QUE 
	//HACERLO EN CADA UNA DE LAS VECES, SOLO LO TENDR�AMOS QUE HACER UNA VEZ
	public static void main(String[] args) {
		//Declarar las variables
		int a = 0;
		int b = 0;
		int c = 0;
		final int base = 1;
		final int rango = 5;
		
		//Implementar el c�digo
			a = Jueves31.random(base, rango);
		do {
			System.out.println(a + " " + (b = Jueves31.random(base, rango)));
		} while (b == a);
		do {
			c = Jueves31.random(base, rango);
			System.out.println(a + " " + b + " " + c);
		} while (c == a || c == b);
		//Ahora imprimimos los n�meros para ver su valor
		System.out.println(a + " " + b + " " + c);

	}

}