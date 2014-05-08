package octubre;

public class Martes29 {

	public static void main(String[] args) {
		// Operadores booleanos. Operan sobre expresiones lógicas.Se puede hacer así directamente sin decir que 
		//es de tipo booleano:
		
		System.out.println((2 * 3 == 5));
		//Y también se pued ehacer así, asignando una variable:
		boolean resultado = 2 * 3 == 5;
		System.out.println(resultado);
		
		//También se puede hacer con un if - else
		if(resultado == true) {
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		//Operadores específicos de valores lógicos:
		//No (!) es un operador monario. Aqui debajo lo que hace es darle la vuelta a la pregunta, 
		//cambiando el sentido de uno a otro
		if(!(resultado == true)) {
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		//Y (&&) Es un operador binario. Cuando las dos son verdaderas el resultado es true, en cualquier otro caso 
		//es false
		if (3 > 2 && 2 < 4){
			System.out.println("Cierto");
		}else{
			System.out.println("Falso");
		}
		//O (||) Es un operador binario. Cuando las dos son falsas, el resultado es falso,
		//en cualquier otro caso el resultado es cierto. Es decir, con una verdadera que haya sería cierto
		if (3 < 2 || 2 < 4){
			System.out.println("Cierto");
		}else{
			System.out.println("Falso");
		}
		//EJERCICIO DE EJEMPLO: Dados dos números enteros, escribir el mayor de los dos.
		//Declaramos las variables:
		int a = 0;
		int b = 0;
		//Asignamos los valores:
		System.out.println(Math.random());
		a = (int)(Math.random() * 10 + 1);
		b = (int)(Math.random() * 10 + 1);
		//Ahora queremos ver cúal es el mayor:
		if (a > b){
			System.out.println("El mayor es: " + a);
		}else if(b > a){
			System.out.println("El mayor es: " + b);
		}else{
			System.out.println("Son iguales: " + a);
		}
		System.out.println(a + " " + b);
	}

}
