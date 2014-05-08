package Diciembre;

public class Martes10b {
/*
 * Mostrar 100 primeros números primos
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
		int numero = 1;
		int primos = 100;
		
		while(primos > 0){
			if (Martes10b.primo(numero) == true){
				System.out.print(numero + "\t");
				--primos;
			}
			++numero;
		}
		}

	}


