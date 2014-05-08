package Enero;

public class OchoReinas {
	//Algoritmo
	/*
	 * ensayar(reina)
	 * begin
	 * buscar la primera posición de la reina en la fila
	 * 	Mientras no haya terminado Y haya una columna para poner la reina hacer
	 *   Si la posición elegida es válida, entonces
	 *   	Anotar la posición
	 *   	si he colocado la última reina entonces
	 *   	 Anotar que he terminado
	 *   	 imprimir el resultado
	 *      sino 
	 *       ensayar(la siguiente reina)
	 *       Si no es el fin entonces
	 *        Eliminar la anotación de esta reina
	 *       finSi
	 *      finSino
	 *   finSi
	 *    buscar la siguiente posición de la reina en la fila
	 *  finMientras
	 * end
	 * 
	 */
	private static int[]reinas = new int[8];//Este vector lleva el control de las columas en que ha acabado cada reina
	//En el índice 0 la primera reina, en índice 1 la segunda etc...
	private static boolean[] diagonalDerecha = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
	//Son 15 diagonales hacia la derecha, las ponemos en FALSE por defecto y, si están ocupadas, las pasamos a TRUE
	private static boolean[] diagonalIzquierda = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
	//Son 15 diagonales hacia la izquierda, las ponemos en FALSE por defecto y, si están ocupadas, las pasamos a TRUE
	private static boolean[] columnas = {false,false,false,false,false,false,false,false};
	//Estas son las columnas ocupadas, son 8 columnas disponibles en total
	private static boolean fin = false; //Este indica si hemos terminado o no de encontrar el sitio de las 8 reinas
	
	public static void main(String[] args) {
		

	}

}
