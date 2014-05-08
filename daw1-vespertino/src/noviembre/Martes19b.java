package noviembre;

import octubre.Jueves31;

public class Martes19b {
/*
 * Dado un numero entre 1 y 12 escribir el nombre del mes
 * creo el vector nombres de mes
 * obtengo el número
 * imprimo el nombre del mes en que coincide el número dado con su índice
 * 
 * meses={"ene","feb","mar","abr","may","jun","jul","ago","sep","oct","nov","dic"}
 * escribir meses(numero)
 */
	public static void main(String[] args) {
		//Declaraciones de las variables
		String[]meses={"nul","ene","feb","mar","abr","may","jun","jul","ago","sep","oct","nov","dic"};
		int mes = 0;
		//Generamos el mes entre 1 y 12
		mes = Jueves31.random(1, 12);
		System.out.println("Mes: " + mes + " Nombre del mes: " + meses[mes]);

	}

}
