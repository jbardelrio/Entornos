package octubre;

public class Jueves31 {
	//Dados 3 números enteros, escribir el mayor y el menor de ellos.
	//Algoritmo del ejercicio
	//1: Obetener los 3 números: a, b, c. Deben ser números diferentes.
	//si a es mayor o igual que b y c, entonces
	//escribir el mayor  es a
	//sino si b es mayor o igual que c entonces
	//escribir el mayor es b
	//sino
	//escribir el mayor es c
	//a = 2; b = 1; c = 0;
	public static int random(int base, int rango){
		int solucion = 0;
		solucion = (int)(Math.random() * rango + base);
		return solucion;
	}
	public static void main(String[] args) {
		//Lo primero es la declaración de las variables u objetos que aparecen en el programa
		int a = 0;
		int b = 0;
		int c = 0;
		//BASE nos indica desde que valor empezamos a contar los números. Es una CONSTANTE.
		//RANGO nos indica hasta que número pueden ir los números.
		//final int BASE = 1;
		//final int RANGO = 2;
		//Genero los números
		/*double d = Math.random();
		int n1 = (int)(d * RANGO);
		int n2 = n1 + BASE;
		System.out.println(d + " " + n1 + " " + n2); */
		//a = (int)(Math.random()*RANGO + BASE);
		//b = (int)(Math.random()*RANGO + BASE);
		//c = (int)(Math.random()*RANGO + BASE);
		a = Jueves31.random(1, 3);
		b = Jueves31.random(1, 3);
		c = Jueves31.random(1, 3);
		System.out.println("a: " + a + " b: " + b + " c: " + c);
		//Buscar el número mayor
		if (a >= b && a >= c){
			System.out.println("El mayor es: " + a);
		}else if(b >= c){
			System.out.println("El mayor es: " + b);
		}else{
			System.out.println("El mayor es: " + c); 
		}
		/*
		for (int i = 0; i < 10; i++) {
			System.out.println(Jueves31.random(1, 10));
		}
		 */
	}

}
