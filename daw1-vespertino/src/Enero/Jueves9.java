package Enero;

public class Jueves9 {
	//Atributos
	public static int[][]cal = {
		//Año normal
		{0,31,28,31,30,31,30,31,31,30,31,30,31},
		//Año bisiesto
		{0,31,29,31,30,31,30,31,31,30,31,30,31},
	};
	//Métodos de clase
	
	//Para saber si el año es bisiesto
	public static int esBisiesto(int año){
		int respuesta = 0;
		//Si año es divisible por 4 Y no es divisible por 100 Ó es divisible por 400
		if(año%4==0 && año%100!=0 || año%400==0){
			respuesta=1;
		}
		return respuesta;
	}
	
	public static int diaAño(int dia, int mes, int año){
		int diaanual=0;
		//En la variable bisiesto guardamos un 0 si NO lo es y un 1 SI lo es
		int bisiesto = Jueves9.esBisiesto(año);
		for (int i = 1; i < mes; ++i) {
			diaanual += Jueves9.cal[bisiesto][i];
		}
		diaanual += dia;
		return diaanual;
	}
	
	public static void main(String[] args) {
		System.out.println("Día del año de 31 12 2013 " + Jueves9.diaAño(31, 12, 2013));
		System.out.println("Día del año de 31 12 2012 " + Jueves9.diaAño(31, 12, 2012));
		
	}

}
