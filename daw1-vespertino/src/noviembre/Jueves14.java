package noviembre;

import octubre.Jueves31;

public class Jueves14 {
/*
 *Estructuras de datos:
 *Pueden ser EST�TICAS O DIN�MICAS:
 *EST�TICAS: Son aquellas que no cambian su tama�o desde la creaci�n hasta su destrucci�n.
 *DIN�MICAS: Son las que cambian su tama�o durante su vida.
 *
 *ESTRUCTURA DE DATOS EST�TICA: Conocida como ARRAY. Necesito conocer:
 *	1: Su tama�o.
 *	2: El tipo de informaci�n o dato que guarda.
 */
	public static void main(String[] args) {
		//Ejemplo de declarar un array de n�meros enteros.
		//Los corchetes significan que guardo m�s de un valor, "numeros� es el nombre, le asigno el valor " = new"
		//despu�s le digo el tipo "int" y por �ltimo el valor "10".
		int [] numeros = new int [10];
		//Procesar el array
		//La posici�n funciona as�: la primera posici�n es el cero, y la �ltima ser�a la dimensi�n "10" menos 1, o sea 9.
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Jueves31.random(1, 10);
			System.out.print(numeros[i] + "\t");
		}
		System.out.println();
	}

}
