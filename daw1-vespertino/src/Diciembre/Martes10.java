package Diciembre;

public class Martes10 {
/*
 * Mostrar los números primos que hay  del 1 al 100.
 * 
 * Mientras no haya terminado con el rango de números hacer
 * 	si el número es primo entonces
 * 		escribir número
 *	finsi
 *	finMientras
 */
	public static boolean primo(int numero){
		boolean respuesta = true;
		int divisor = numero - 1;
		if(numero == 1){
			respuesta = true;
		}else{
			while(numero > 1 && numero%divisor != 0){
				--divisor;
			}
			if(divisor == 1){
				respuesta = true;
			}else{
				respuesta = false;
			}
		}
		return respuesta;	
	}
	public static void main(String[] args) {
		for (int numero = 1; numero < 100; numero++) {
			if (Martes10.primo(numero) == true) {
				System.out.print(numero + "\t");
			}
		}

	}

}
