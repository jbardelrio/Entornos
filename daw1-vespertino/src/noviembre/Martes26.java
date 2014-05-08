package noviembre;
import java.io.*;
public class Martes26 {
	//Declara la constante EOF con valor -1 
	private final static int EOF = -1;
	//Declaramos el método para leer una línea
	public static String read(){
		//Declaraciones
		String linea = "";
		int car = 0;
		//Leer caracteres de la entrada o consola hasta final de entrada o final de línea
		try{
			while((car = System.in.read()) != Martes26.EOF){
				if (car == 10 || car == 13){//La pregunta que hace el IF es: "¿Es el final de línea?"
					break;//Final de línea
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
	 * Calcular la fecha del día después
	 * leer días, mes y año
	 * Transofrmar la fecha dd, mm, aa    en    da, aa (quiere decir en día del año, año)
	 * Sumamos todos los días de los meses anteriores al de la fecha(mm)
	 * sumamos los días del mes
	 * Ya tengo los días del año
	 */
	private final static int[][]calendario = {
		{0,31,28,31,30,31,30,31,31,30,31,30,31},
		{0,31,29,31,30,31,30,31,31,30,31,30,31}
	};
	//Metodo del cálculo del bisiesto
	public static boolean bisiesto(int aa){
		boolean bi = false;
		if(aa%4 == 0 && aa%100 != 0 || aa%400 == 0){
			bi = true;
		}
		return bi;
	}
	public static void main(String[] args) {
		//Declaración de variables
		int dd = 0;
		int mm = 0;
		int aa = 0;
		int da = 0;
		int bi = 0;
		String entrada = "";
		//Leer la fecha
		
		System.out.println("Escribe el día dd : ");
		entrada = Martes26.read();
		dd = Integer.parseInt(entrada);
		System.out.println("Escribe el mes mm: ");
		entrada = Martes26.read();
		mm = Integer.parseInt(entrada);
		System.out.println("Escribe el año aa: ");
		entrada = Martes26.read();
		aa = Integer.parseInt(entrada);
		System.out.println(dd + "/" + mm + "/" + aa);
		/*//Calcular si el año es bisiesto
		if(aa%4 == 0 && aa%100 != 0 || aa%400 == 0){
			bi = 1; //Año bisiesto
		}*/
		//bi = Martes26.bisiesto(aa);
		if(Martes26.bisiesto(aa)==true){
			bi=1;
		}
		//Calcular el día del año (sumo todos los días que tiene el calendario de los meses anteriores al que me dan)
		for(int m = 1; m < mm; ++m){
			da += Martes26.calendario[bi][m];
		}
		//Sumamos los días de la fecha dada
		da += dd;
		System.out.println("Día del año :" + da);
		//Sumamos un día más
		++da;
		//Calculamos el día y mes de la fecha
		mm=1;
		while(mm <= 12 && da > Martes26.calendario[bi][mm]){
			//Reducimos los días del mes
			da -= Martes26.calendario[bi][mm];
			//Pasamos al mes siguiente
			++mm;
		}
		//Verificamos si estamos en el mismo año o en el siguiente
		if(mm == 13){
			//Pasamos de año incrementándolo en 1
			++aa;
			//Inicializamos el mes a 1
			mm=1;
			//Los días son los que quedan en "da"
			dd=da;
		}else{
			//Si no pasamos de año, los días "dd" son los que quedan en "da"
			dd=da;
		}
		//Mostrar el resultado
		System.out.println("Fecha del día siguiente: " + dd + "/" + mm + "/" + aa);
	}

}
