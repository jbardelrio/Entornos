package noviembre;


public class Martes19c {
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
		int[]dias={0,31,28,31,30,31,30,31,31,30,31,30,31};
		int mes = 0;
		String nombre= "";
		nombre = "abr";
		//Buscar el nombre en el vector meses
		for (int i = 1; i < meses.length; i++) {
			if (nombre.equalsIgnoreCase(meses[i]) == true) {
				System.out.println("El número de días del mes " + nombre + " son " + dias[i]);
				break;
			}
		}

	}

}
