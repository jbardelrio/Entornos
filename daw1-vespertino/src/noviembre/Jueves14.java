package noviembre;

import octubre.Jueves31;

public class Jueves14 {
/*
 *Estructuras de datos:
 *Pueden ser ESTÁTICAS O DINÁMICAS:
 *ESTÁTICAS: Son aquellas que no cambian su tamaño desde la creación hasta su destrucción.
 *DINÁMICAS: Son las que cambian su tamaño durante su vida.
 *
 *ESTRUCTURA DE DATOS ESTÁTICA: Conocida como ARRAY. Necesito conocer:
 *	1: Su tamaño.
 *	2: El tipo de información o dato que guarda.
 */
	public static void main(String[] args) {
		//Ejemplo de declarar un array de números enteros.
		//Los corchetes significan que guardo más de un valor, "numeros· es el nombre, le asigno el valor " = new"
		//después le digo el tipo "int" y por último el valor "10".
		int [] numeros = new int [10];
		//Procesar el array
		//La posición funciona así: la primera posición es el cero, y la última sería la dimensión "10" menos 1, o sea 9.
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Jueves31.random(1, 10);
			System.out.print(numeros[i] + "\t");
		}
		System.out.println();
	}

}
