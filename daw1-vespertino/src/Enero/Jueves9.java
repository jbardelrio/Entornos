package Enero;

public class Jueves9 {
	//Atributos
	public static int[][]cal = {
		//A�o normal
		{0,31,28,31,30,31,30,31,31,30,31,30,31},
		//A�o bisiesto
		{0,31,29,31,30,31,30,31,31,30,31,30,31},
	};
	//M�todos de clase
	
	//Para saber si el a�o es bisiesto
	public static int esBisiesto(int a�o){
		int respuesta = 0;
		//Si a�o es divisible por 4 Y no es divisible por 100 � es divisible por 400
		if(a�o%4==0 && a�o%100!=0 || a�o%400==0){
			respuesta=1;
		}
		return respuesta;
	}
	
	public static int diaA�o(int dia, int mes, int a�o){
		int diaanual=0;
		//En la variable bisiesto guardamos un 0 si NO lo es y un 1 SI lo es
		int bisiesto = Jueves9.esBisiesto(a�o);
		for (int i = 1; i < mes; ++i) {
			diaanual += Jueves9.cal[bisiesto][i];
		}
		diaanual += dia;
		return diaanual;
	}
	
	public static void main(String[] args) {
		System.out.println("D�a del a�o de 31 12 2013 " + Jueves9.diaA�o(31, 12, 2013));
		System.out.println("D�a del a�o de 31 12 2012 " + Jueves9.diaA�o(31, 12, 2012));
		
	}

}
