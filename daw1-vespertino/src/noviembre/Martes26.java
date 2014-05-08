package noviembre;
import java.io.*;
public class Martes26 {
	//Declara la constante EOF con valor -1 
	private final static int EOF = -1;
	//Declaramos el m�todo para leer una l�nea
	public static String read(){
		//Declaraciones
		String linea = "";
		int car = 0;
		//Leer caracteres de la entrada o consola hasta final de entrada o final de l�nea
		try{
			while((car = System.in.read()) != Martes26.EOF){
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
	//Metodo del c�lculo del bisiesto
	public static boolean bisiesto(int aa){
		boolean bi = false;
		if(aa%4 == 0 && aa%100 != 0 || aa%400 == 0){
			bi = true;
		}
		return bi;
	}
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
		entrada = Martes26.read();
		dd = Integer.parseInt(entrada);
		System.out.println("Escribe el mes mm: ");
		entrada = Martes26.read();
		mm = Integer.parseInt(entrada);
		System.out.println("Escribe el a�o aa: ");
		entrada = Martes26.read();
		aa = Integer.parseInt(entrada);
		System.out.println(dd + "/" + mm + "/" + aa);
		/*//Calcular si el a�o es bisiesto
		if(aa%4 == 0 && aa%100 != 0 || aa%400 == 0){
			bi = 1; //A�o bisiesto
		}*/
		//bi = Martes26.bisiesto(aa);
		if(Martes26.bisiesto(aa)==true){
			bi=1;
		}
		//Calcular el d�a del a�o (sumo todos los d�as que tiene el calendario de los meses anteriores al que me dan)
		for(int m = 1; m < mm; ++m){
			da += Martes26.calendario[bi][m];
		}
		//Sumamos los d�as de la fecha dada
		da += dd;
		System.out.println("D�a del a�o :" + da);
		//Sumamos un d�a m�s
		++da;
		//Calculamos el d�a y mes de la fecha
		mm=1;
		while(mm <= 12 && da > Martes26.calendario[bi][mm]){
			//Reducimos los d�as del mes
			da -= Martes26.calendario[bi][mm];
			//Pasamos al mes siguiente
			++mm;
		}
		//Verificamos si estamos en el mismo a�o o en el siguiente
		if(mm == 13){
			//Pasamos de a�o increment�ndolo en 1
			++aa;
			//Inicializamos el mes a 1
			mm=1;
			//Los d�as son los que quedan en "da"
			dd=da;
		}else{
			//Si no pasamos de a�o, los d�as "dd" son los que quedan en "da"
			dd=da;
		}
		//Mostrar el resultado
		System.out.println("Fecha del d�a siguiente: " + dd + "/" + mm + "/" + aa);
	}

}
