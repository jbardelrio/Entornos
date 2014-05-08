package noviembre;
import java.io.*;
public class Jueves21b {
	//Declara la constante EOF con valor -1 
	private final static int EOF = -1;
	//Declaramos el m�todo para leer una l�nea
	public static String read(){
		//Declaraciones
		String linea = "";
		int car = 0;
		//Leer caracteres de la entrada o consola hasta final de entrada o final de l�nea
		try{
			while((car = System.in.read()) != Jueves21b.EOF){
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
	/*
	 * Calcular la fecha del d�a despu�s
	 * leer d�as, mes y a�o
	 * Transofrmar la fecha dd, mm, aa    en    da, aa (quiere decir en d�a del a�o, a�o)
	 * Sumamos todos los d�as de los meses anteriores al de la fecha(mm)
	 * sumamos los d�as del mes
	 * Ya tengo los d�as del a�o
	 */
	private final static int[][]calendario = {
		{0,31,28,31,30,31,30,31,31,30,31,30,31},
		{0,31,29,31,30,31,30,31,31,30,31,30,31}
	};
	public static void main(String[] args) {
		//Declaraci�n de variables
		int dd = 0;
		int mm = 0;
		int aa = 0;
		int da = 0;
		int bi = 0;
		String entrada = "";
		//Leer la fecha
		
		System.out.println("Escribe el d�a dd : ");
		entrada = Jueves21b.read();
		dd = Integer.parseInt(entrada);
		System.out.println("Escribe el mes mm: ");
		entrada = Jueves21b.read();
		mm = Integer.parseInt(entrada);
		System.out.println("Escribe el a�o aa: ");
		entrada = Jueves21b.read();
		aa = Integer.parseInt(entrada);
		System.out.println(dd + "/" + mm + "/" + aa);
		//Calcular si el a�o es bisiesto
		if(aa%4 == 0 && aa%100 != 0 || aa%400 == 0){
			bi = 1; //A�o bisiesto
		}
		//Calcular el d�a del a�o (sumo todos los d�as que tiene el calendario de los meses anteriores al que me dan)
		for(int m = 1; m < mm; ++m){
			da += Jueves21b.calendario[bi][m];
		}
		da += dd;
		System.out.println("D�a del a�o :" + da);
		
	}

}
