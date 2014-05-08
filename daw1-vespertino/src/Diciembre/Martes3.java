package Diciembre;

public class Martes3 {
/*
 * Manejo de listas en paralelo
 * 	Dada la puntuación de una serie de concursantes imprimir la lista ordenada de mayor a menor.
 * 	nombres:(Lista de concursantes) Es un array de 5 nombres
 * 	puntos: array de 5 números enteros
 * 
 * 	Para pasadas desde 1 hasta 5 hacer
 * 		Para índice desde 0 hasta 5-pasadas hacer
 * 			si puntos[indice] < puntos [indice+1] entonces
 * 				cambiamos puntos
 * 				cambiamos nombres
 * 			finsi
 * 		finpara
 * 	finpara
 */
	public static void main(String[] args) {
		//Declaración de variables
		int [] puntos = {4,7,3,9,5};
		String [] nombres = {"Alberto", "Ana", "Luis", "Eva", "Pepe"};
		int punto = 0; //Variable auxiliar para cambiar los puntos
		String nombre = ""; //Variable auxiliar para cambiar los nombres
		//Proceso de ordenación
		for(int pasada=1; pasada < puntos.length; ++pasada){
			for(int i=0; i < puntos.length-pasada; ++i){
				if(puntos[i]<puntos[i+1]){
					punto=puntos[i];
					puntos[i]=puntos[i+1];
					puntos[i+1]=punto;
					nombre=nombres[i];
					nombres[i]=nombres[i+1];
					nombres[i+1]=nombre;
				}
			}
		}

		//Imprimir resultados
		for(int i=0; i< puntos.length; ++i){
			System.out.println(nombres[i]+"\t"+puntos[i]);
		}
		
	}

}
