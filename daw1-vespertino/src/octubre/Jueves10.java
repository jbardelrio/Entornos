package octubre;
//Calcular la media de dos n�meros dados
import java.io.*; //Este import sirve para decir que necesitamos esos objetos adicionales
public class Jueves10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Lo primero que debemos hacer es declarar las variables
			int numero1 = 0; 
			//int es un tipo predefinido de n�meros enteros
			int numero2 = 0;
			int media =0;
			numero1 = (int)(Math.random() * 10);
			numero2 = (int)(Math.random() * 10);
			//Calcular la media
			media = (numero1 + numero2) / 2;
			System.out.println("N�mero1: " + numero1 + " N�mero2: " + numero2 + " Media: " + media);
		
	}

}
