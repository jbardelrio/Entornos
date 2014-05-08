package noviembre;

import octubre.Jueves31;

public class Jueves14d {
/*
 *
 *ALGORITMO: SUMAR 10 NÚMEROS, CALCUALR LA MEDIA ARITMÉTICA Y ESCRIBIR LOS MAYORES DE LA MEDIA:
 *Generar 10 números y guardarlos en un vector
 *sumo los 10 números (PARA i DESDE 0 HASTA 9 HACER, A SUMA INCREMENTARLA EN NÚMEROS[i], FINPARA)
 *divido la suma entre el número de números y calculo la media (MEDIA IGUAL A SUMA DIVIDIDO CANTIDAD DE NÚMEROS)
 *si el número guardado es mayor que la media lo imprimo (el número o números porque pueden ser varios)
 *Los números generados queremos im`rimirlos de manor a mayor (ORDENAR EL VECTOR DE MENOR A MAYOR)
 */
	public static void main(String[] args) {
		
		int [] numeros = new int [10];
		int suma = 0;
		int media = 0;
		
		//Procesar el array
		//La posición funciona así: la primera posición es el cero, y la última sería la dimensión "10" menos 1, o sea 9.
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Jueves31.random(1, 10);
			System.out.print(numeros[i] + "\t");
		}
		System.out.println();
		//Calcular la suma de los números
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		//Calcular la media
		media = suma / numeros.length;
		System.out.println("La media de los números es: " + media);
		//Imprimir los números mayores que la media
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > media){
				System.out.print(numeros[i] + "\t");
			}
		}
		System.out.println();
		//Ordenar los números de menor a mayor
		//EL método consiste en comparar el de más izquierda con el de al lado y sucesivamente, de modo que
		//el mayor va pasando hacia la derecha. Esto se llama método de la burbuja, en este caso con 10 números
		//habría que repertir el proceso 9 veces (dimensión - 1).
		//En este caso inicialimos pasadas en 1 por que es lo mismo que restar 1 a la dimensión
		int aux = 0; //Esta variable auxiliar nos sirve para cambiar de posición los números
		for (int pasadas = 1; pasadas < numeros.length; pasadas++) {//este for repite la operación de números de al lado
			for (int i = 0; i < numeros.length - 1; i++) {//Este for compara los números de al lado
				if (numeros[i] > numeros [i+1]) {//Este se encarga de, si están desordenados, los ordena
					aux = numeros[i];
					numeros[i] = numeros [i + 1];
					numeros[i + 1] = aux;
				}
			}//fin del for del núcleo
		}
		//Imprimir el resultado
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "\t");
		}
	}

}
