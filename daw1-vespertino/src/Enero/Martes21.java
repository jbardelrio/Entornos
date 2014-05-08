package Enero;
import java.util.Scanner;
//Factorial de un número dado
//!n = n*(n-1)*(n-2)*...(2*1)
//Utilizar dos métodos. Uno Iterativo y otro recursivo

public class Martes21 {
	//Método Iterativo
	public static  int factorialiteractivo(int numero){
		int resultado = 1;
		for (int i = numero; i > 0; --i) {
			resultado *= i;
		}
		return resultado;
	}
	//Método Recursivo
	//!n = n * !(n-1)
	public static int factorialrecursivo(int numero){
		if(numero == 1){
			return numero;
		}else{
			return (numero * Martes21.factorialrecursivo(numero-1));
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		System.out.println("Escribe un número entero y positivo ");
		numero=teclado.nextInt();
		//Con el método Iterativo
		System.out.println("El factorial Iterativo de " + numero + " es " + Martes21.factorialiteractivo(numero));
		//Con el método Recursivo
		System.out.println("El factorial Recursivo de " + numero + " es " + Martes21.factorialrecursivo(numero));
		teclado.close();

	}

}
