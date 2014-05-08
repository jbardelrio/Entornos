package Diciembre;
import java.io.*;
import java.util.*;
public class Jueves12{
//Contar el número de elementos positivos, negativos y ceros que hay en una serie leída desde la consola.
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	int [] numeros = new int[5];
	int pos=0, neg=0, cer=0;
	System.out.println("Leer los números desde el teclado y guardarlos en un array:");

	for(int i=0; i < numeros.length; ++i){
		System.out.print("Dime un número: ");
			numeros[i]=sc.nextInt();
			
			int j=0;
			for( j=0;numeros[i]>0; ++j){
				++pos;
			}
			for(j=0; numeros[i]<0;++j){
				++neg;
			}
			for(j=0;numeros[i]==0;++j){
				++cer;
			}
	}
	
		
	
	System.out.println("Numeros positivos: "+pos);
	System.out.println("Numeros negativos: "+neg);
	System.out.println("Numeros de ceros:  "+cer);
}
}

