package Enero;
import java.util.Scanner;
public class Martes14 {
	//Crear una función que calcule el mayor divisor de dos números dados
	public static int mcd(int a, int b){
		int divisor = 0;
		//Buscamos el menor de los dos números
		if(a < b){
			divisor = a;
		}else{
			divisor = b;
		}
		//Buscamos el mayor divisor
		while(a%divisor!=0 || b%divisor!=0){//Mientras no sea divisible por a o por b 
			--divisor;//Buscamos el siguiente divisor
		}
		return divisor;
	}
	//Crear una función para calcular el mínimo como un múltiplo
	public static int mcm(int a, int b){
		int multiplo = 0;
		if(a > b){
			multiplo=a;
		}else{
			multiplo=b;
		}
		while(multiplo%a!=0 || multiplo%b!=0){
			++multiplo;//Buscamos el siguiente múltiplo
		}
		return multiplo;
	}
	public static void main(String[] args) {
		//Leer un número entero positivo mayor que 0 desde el teclado
		//Y calcular su máximo común divisor
		Scanner input = new Scanner(System.in);
		int a = 0;
		int b = 0;
		do{
		System.out.println("Dime el primer número: ");
		a = input.nextInt();
		System.out.println("Dime el otro número: ");
		b = input.nextInt();
		}while(a <= 0 || b <=0);
		//Escribimos el máximo común divisor
		System.out.println("El máximo común divisor de " + a + " y " + b + " es " + Martes14.mcd(a, b));
		//Escribimos el mínimo común múltiplo
		System.out.println("El mínimo común múltiplo de "+ a + " y " + b + " es " + Martes14.mcm(a, b));
		input.close();
		
	}

}
