package noviembre;

public class Jueves28 {
/*
 * Tenemos una tabla con los gastos de personal por d�a de la semana
 * Luis Luisa Maria Jose
 * 10	5		7	8
 * 6	6		7	10
 * 5	4		3	6
 * 7	7		8	9
 * 4	3		2	1
 * Calcular los gastos:
 * Gastos totales de personal
 * Gastos de cada uno de los empleados
 * �Quien es el que m�s gasta? �Y el que menos?
 * Gastos ocasionados por d�a
 * gastos : tabla[5][4]     //5 son los d�as y 4 los empleados
 * para cada d�a de la semana hacer
 * 	para cada empleado hacer
 * 		acumular el gasto ocasionado por empleado y d�a
 * 	finpara
 * finpara
 * Escribir el gasto acumulado
 * para cada empleado hacer
 * 	para cada d�a hacer
 * 		acumular el gasto ocasionado por el empleado
 * 	finpara
 * 	escribir el gasto
 * 	guardar en gasto_empleado
 * 	inicializar contador de gasto
 * finpara
 * gastoso el primero
 * para cada empleado hacer
 * comparar gastos con el anterior empleado
 * si es mayor que el anterior anotarlo
 * finpara
 * 
 */
	
	
	//Atributos de clase
	private static final int[][] gastos={
		{10,5,7,8},
		{6,6,7,10},
		{5,4,3,6},
		{7,7,8,9},
		{4,3,2,1}
	};
	public static void main(String[] args) {
		//Calcular gasto total
		//variables
		int total=0; //Este es el acumulador, nos va a decir cuanto se ha gastado en total
		//Calcular el gasto
		for(int d=0; d < Jueves28.gastos.length; ++d){
				for(int e=0; e < Jueves28.gastos[e].length; ++e){
					total += Jueves28.gastos[d][e]; //Procesamos por filas y columnas, pero podr�amos hacerlo por columnas y filas
				}
		}
		System.out.println("Gastos totales: " + total);
		
		//Calcular gasto por empleado, el empleado que m�s ha gastado y el que menos ha gastado
		int gastoe=0;
		int maximo = 0;
		int minimo = 0;
		int empleado = 0;
		int empleahorrador = 0;
		for(int e=0; e < Jueves28.gastos[e].length; ++e){
			for(int d = 0; d < Jueves28.gastos.length; ++d){
				gastoe += Jueves28.gastos[d][e];
			}
			if ( e == 0 || gastoe > maximo ){
				maximo = gastoe;
				empleado = e;
			}
			if(e == 0 || gastoe < minimo){
				minimo = gastoe;
				empleahorrador = e;
			}
			System.out.println("Empleado N " + (e+1) + "\tGasto" + gastoe);  
			//El +1 de arriba es para que no aparezca un primer empleado con n�mero 0, sino con n�mero 1
			gastoe=0; //Reinicializamos la variable gastoe para que empiece de 0 con cada empleado
		}
	
		System.out.println("El empleado que m�s ha gastado : " +(empleado+1));
		System.out.println("El empleado que menos ha gastado : " +(empleahorrador+1));
		//Calcular gastos por d�a y el d�a en que m�s se ha gastado
		int diamasgastador = 0;
		int gastodia = 0;
		for(int d = 0; d < Jueves28.gastos.length; ++d){
			for(int e = 0; e < Jueves28.gastos[e].length; ++e){
				gastodia += Jueves28.gastos[d][e];
			}
			if(d == 0 || gastodia > maximo){
				maximo = gastodia;
				diamasgastador = d;
			}
			System.out.println("D�a N " + (d+1) + "\tGasto" + gastodia);  
			gastodia = 0; 
		
		}
		System.out.println("El d�a que m�s se ha gastado es : " + (diamasgastador+1));
		}
	}
	


