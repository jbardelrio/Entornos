package Diciembre;
import java.io.*;
import java.util.Scanner;
/*
 * Boletín de notas de alumnos
 */
public class Jueves5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numAlum=0; int i = 0; int j = 0;
		double suma=0, media=0, Suma=0;
		//
		do{
			System.out.print("Número de alumnos de la clase: ");
			numAlum=teclado.nextInt();
		}while(numAlum<=0);
		
		//Leer las notas de los alumnos
		double[]notas=new double[numAlum];
		for( i=0; i<notas.length;++i){
			System.out.print("Alumno " + (i+1) + " Nota final:" );
			notas[i]= teclado.nextInt();
		}
		//Calcular la nota media
		for ( i = 0; i < notas.length; ++i) {
			suma = suma + notas[i];
		}
		media=suma/notas.length;
		System.out.println("Nota media del curso:" + media);
		//
		System.out.println("Listado de las notas superiores a la media:");
		for (i = 0; i < notas.length; ++i) {
			if (notas[i]>media) {
				System.out.println("Alumno numero " + (i+1) + " Nota final:" + notas[i]);
			}
		}
		
		//
		System.out.print("Nota máxima de los alumnos:");
		double maxima=0;
		for( i=0; i<notas.length;++i){
			if(maxima<notas[i]){
				maxima=notas[i];
			}
		}
		System.out.println(maxima);
	}

}