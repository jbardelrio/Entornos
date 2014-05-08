package noviembre;

import octubre.Jueves31;

public class Martes5 {
	//Ordenar 3 números enteros dados, de mayor a menor.
	//Algoritmo
	//Obtener los números a, b y c
	//si a es mayor o igual que b y c entonces
	//escribir a
	// si b es mayor o igual que c entonces
	//  escribir b y c
	// sino 
	//  escribir c y b
	//sino si b es mayor o igual que a y c
	// escribir b
	//si a es mayor o igual que c entonces
	// escribir a y c
	//sino
	// escribir c y a
	//sino
	// escribir c
	//si a es mayor o igual que b entonces
	// escribir a y b
	//sino
	// escribir b y a
	public static void main(String[] args) {
		//Declaración de las variables
		int a = 0;
		int b = 0;
		int c = 0;
		//Generación de los valores de a, b y c
		a = Jueves31.random(1, 10);
		b = Jueves31.random(1, 10);
		c = Jueves31.random(1, 10);
		System.out.println("a: " + a + " " + "b: " + b + " " + "c: " + c);
		//Implementación del algoritmo
		if (a >= b && a >= c) {
			System.out.print("a: " + a + " ");
			if (b >= c) {
				System.out.println("b: " + b + " " + "c: " + c);
			}else{
				  System.out.println("c: " + c + " " + "b: " + b);
			}
		}else if (b >= a && b >= c) {
			System.out.print("b: " + b + " ");
			if (a >= c) {
				System.out.println("a: " + a + " " + "c: " + c);
			}else{
				System.out.println(" c: " + c + " " + "a: " + a);
			}
		}else{
			System.out.print("c: " + c + " ");
			if (a >= b) {
				System.out.println("a: " + a + " " + "b: " + b + " ");
				
			}else{
				System.out.println("b: " + b + " " + "c: " + c + " ");
			}
		}

	}

}
