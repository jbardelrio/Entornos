package noviembre;

import octubre.Jueves31;

public class Jueves14d {
/*
 *
 *ALGORITMO: SUMAR 10 N�MEROS, CALCUALR LA MEDIA ARITM�TICA Y ESCRIBIR LOS MAYORES DE LA MEDIA:
 *Generar 10 n�meros y guardarlos en un vector
 *sumo los 10 n�meros (PARA i DESDE 0 HASTA 9 HACER, A SUMA INCREMENTARLA EN N�MEROS[i], FINPARA)
 *divido la suma entre el n�mero de n�meros y calculo la media (MEDIA IGUAL A SUMA DIVIDIDO CANTIDAD DE N�MEROS)
 *si el n�mero guardado es mayor que la media lo imprimo (el n�mero o n�meros porque pueden ser varios)
 *Los n�meros generados queremos im`rimirlos de manor a mayor (ORDENAR EL VECTOR DE MENOR A MAYOR)
 */
	public static void main(String[] args) {
		
		int [] numeros = new int [10];
		int suma = 0;
		int media = 0;
		
		//Procesar el array
		//La posici�n funciona as�: la primera posici�n es el cero, y la �ltima ser�a la dimensi�n "10" menos 1, o sea 9.
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Jueves31.random(1, 10);
			System.out.print(numeros[i] + "\t");
		}
		System.out.println();
		//Calcular la suma de los n�meros
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		//Calcular la media
		media = suma / numeros.length;
		System.out.println("La media de los n�meros es: " + media);
		//Imprimir los n�meros mayores que la media
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > media){
				System.out.print(numeros[i] + "\t");
			}
		}
		System.out.println();
		//Ordenar los n�meros de menor a mayor
		//EL m�todo consiste en comparar el de m�s izquierda con el de al lado y sucesivamente, de modo que
		//el mayor va pasando hacia la derecha. Esto se llama m�todo de la burbuja, en este caso con 10 n�meros
		//habr�a que repertir el proceso 9 veces (dimensi�n - 1).
		//En este caso inicialimos pasadas en 1 por que es lo mismo que restar 1 a la dimensi�n
		int aux = 0; //Esta variable auxiliar nos sirve para cambiar de posici�n los n�meros
		for (int pasadas = 1; pasadas < numeros.length; pasadas++) {//este for repite la operaci�n de n�meros de al lado
			for (int i = 0; i < numeros.length - 1; i++) {//Este for compara los n�meros de al lado
				if (numeros[i] > numeros [i+1]) {//Este se encarga de, si est�n desordenados, los ordena
					aux = numeros[i];
					numeros[i] = numeros [i + 1];
					numeros[i + 1] = aux;
				}
			}//fin del for del n�cleo
		}
		//Imprimir el resultado
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "\t");
		}
	}

}
