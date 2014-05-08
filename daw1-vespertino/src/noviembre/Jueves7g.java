package noviembre;

import octubre.Jueves31;

public class Jueves7g {
/*
 * Generar 3 números enteros entre 1 y 5 que sean distintos entre sí.
 * Generar a
 * repetir
 * generar b
 * hasta que b sea distinto de a
 * repetir
 * generar c
 * hasta que c sea distinto de a y b
 */
	//ESTA VERSIÓN ES PARA VER LAS VECES QUE REPITE EL OLGORITMO PARA SACAR LOS 3 NÚMEROS DISTINTOS
	public static void main(String[] args) {
		//Declarar las variables
		int a = 0;
		int b = 0;
		int c = 0;
		//Implementar el código
			a = Jueves31.random(1, 3);
		do {
			System.out.println(a + " " + (b = Jueves31.random(1, 3)));
		} while (b == a);
		do {
			c = Jueves31.random(1, 3);
			System.out.println(a + " " + b + " " + c);
		} while (c == a || c == b);
		//Ahora imprimimos los números para ver su valor
		System.out.println(a + " " + b + " " + c);

	}

}