package Enero;

public class Jueves9b {
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
	public static int exchange(int dia){
		//Aqui d�a es un DATO, aqui n opodemos cambiar el valor original de la variable
		++dia;
		System.out.println(dia);
		return dia;
	}
	//ESTE EXCHANGE ES EL QUE VAMOS A USAR ABAJO EN EL MAIN, EL ANTERIOR ES PARA USAR LA PARTE COMENTADA DEL MAIN
	public static void exchange(int[]fecha){
		//Usando un vector podemos cambiar los valores en la original, por eso aqui nos salela fecha 32-13-2013,
		//es decir, 1 m�s en cada valor de int[]fecha = {31, 12, 2012};
		fecha[0] += 1;
		fecha[1] += 1;
		fecha[2] += 1;
	}
	
	public static void diaMes(int diaa�o, int a�o, int[]diamesa�o){
		int bis = Jueves9b.esBisiesto(a�o);
		int mes = 1;
		while(mes <= 12 && Jueves9b.cal[bis][mes] < diaa�o ){
			diaa�o -= Jueves9b.cal[bis][mes];
			++mes;
		}
		if(mes==13){
			diamesa�o[0]=1;
			diamesa�o[1]=1;
			diamesa�o[2]=a�o + 1;
		}else{
			diamesa�o[0]=diaa�o;
			diamesa�o[1]=mes;
			diamesa�o[2]=a�o;
		}
	}
	
	/*
	 * public static int[] diaMes(int diaa�o){
	 *}
	*/
	
	public static void main(String[] args) {
		int dia = 31;
		int mes = 12;
		int a�o = 2012;
		int[]fecha = {31, 12, 2012};
		int diaa�o = 0;
		//dia=Jueves9b.exchange(dia); 
		//System.out.println(dia);
		//Jueves9b.exchange(fecha);
		diaa�o = Jueves9.diaA�o(dia, mes, a�o);
		++diaa�o;
		Jueves9b.diaMes(diaa�o, a�o, fecha);
		System.out.println(fecha[0] + " " + fecha[1] + " " + fecha[2]);
		
	}

}
