package Enero;

public class Jueves9b {
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
	public static int exchange(int dia){
		//Aqui día es un DATO, aqui n opodemos cambiar el valor original de la variable
		++dia;
		System.out.println(dia);
		return dia;
	}
	//ESTE EXCHANGE ES EL QUE VAMOS A USAR ABAJO EN EL MAIN, EL ANTERIOR ES PARA USAR LA PARTE COMENTADA DEL MAIN
	public static void exchange(int[]fecha){
		//Usando un vector podemos cambiar los valores en la original, por eso aqui nos salela fecha 32-13-2013,
		//es decir, 1 más en cada valor de int[]fecha = {31, 12, 2012};
		fecha[0] += 1;
		fecha[1] += 1;
		fecha[2] += 1;
	}
	
	public static void diaMes(int diaaño, int año, int[]diamesaño){
		int bis = Jueves9b.esBisiesto(año);
		int mes = 1;
		while(mes <= 12 && Jueves9b.cal[bis][mes] < diaaño ){
			diaaño -= Jueves9b.cal[bis][mes];
			++mes;
		}
		if(mes==13){
			diamesaño[0]=1;
			diamesaño[1]=1;
			diamesaño[2]=año + 1;
		}else{
			diamesaño[0]=diaaño;
			diamesaño[1]=mes;
			diamesaño[2]=año;
		}
	}
	
	/*
	 * public static int[] diaMes(int diaaño){
	 *}
	*/
	
	public static void main(String[] args) {
		int dia = 31;
		int mes = 12;
		int año = 2012;
		int[]fecha = {31, 12, 2012};
		int diaaño = 0;
		//dia=Jueves9b.exchange(dia); 
		//System.out.println(dia);
		//Jueves9b.exchange(fecha);
		diaaño = Jueves9.diaAño(dia, mes, año);
		++diaaño;
		Jueves9b.diaMes(diaaño, año, fecha);
		System.out.println(fecha[0] + " " + fecha[1] + " " + fecha[2]);
		
	}

}
