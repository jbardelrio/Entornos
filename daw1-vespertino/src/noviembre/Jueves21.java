package noviembre;
import java.io.*;
public class Jueves21 {
	//Declara la constante EOF con valor -1 
	private final static int EOF = -1;
	//Declaramos el m�todo para leer una l�nea
	public static String read(){
		//Declaraciones
		String linea = " ";
		int car = 0;
		//Leer caracteres de la entrada o consola hasta final de entrada o final de l�nea
		try{
			while((car = System.in.read()) != Jueves21.EOF){
				if (car == 10 || car == 13){//La pregunta que hace el IF es: "�Es el final de l�nea?"
					break;//Final de l�nea
				}
				linea += (char)car;
			}
			//Vaciar el buffer de entrada
			System.in.skip(System.in.available());
		}catch(IOException e){
			System.out.println(e);
		}
		return linea;
	}

	public static void main(String[] args) {
		//Declaraci�n de variables
		String mensaje = "";
		System.out.println("Escribe una l�nea: ");
		mensaje = Jueves21.read();
		System.out.println("L�nea : " + mensaje);

	}

}
