package Enero;
import java.util.Scanner;
public class Martes14 {
	//Crear una funci�n que calcule el mayor divisor de dos n�meros dados
	public static int mcd(int a, int b){
		int divisor = 0;
		//Buscamos el menor de los dos n�meros
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
	//Crear una funci�n para calcular el m�nimo como un m�ltiplo
	public static int mcm(int a, int b){
		int multiplo = 0;
		if(a > b){
			multiplo=a;
		}else{
			multiplo=b;
		}
		while(multiplo%a!=0 || multiplo%b!=0){
			++multiplo;//Buscamos el siguiente m�ltiplo
		}
		return multiplo;
	}
	public static void main(String[] args) {
		//Leer un n�mero entero positivo mayor que 0 desde el teclado
		//Y calcular su m�ximo com�n divisor
		Scanner input = new Scanner(System.in);
		int a = 0;
		int b = 0;
		do{
		System.out.println("Dime el primer n�mero: ");
		a = input.nextInt();
		System.out.println("Dime el otro n�mero: ");
		b = input.nextInt();
		}while(a <= 0 || b <=0);
		//Escribimos el m�ximo com�n divisor
		System.out.println("El m�ximo com�n divisor de " + a + " y " + b + " es " + Martes14.mcd(a, b));
		//Escribimos el m�nimo com�n m�ltiplo
		System.out.println("El m�nimo com�n m�ltiplo de "+ a + " y " + b + " es " + Martes14.mcm(a, b));
		input.close();
		
	}

}
