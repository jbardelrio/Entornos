package Diciembre;

import java.io.*;
import java.util.Scanner;

public class JesusBargueno2 {

        //Cuenta los numeros positivos, negativos y ceros que hay en una array (lo pedimos al inicio
	
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int dim = 20;
            int[] numeros = new int[dim]; //Creamos el array
            int pos = 0, neg = 0, cer = 0; //Declaramos las variables que nos servirán para contar positivos, negativos y ceros
            
            System.out.println("Leemos los números y los introducimos a un array.");
          
            for(int i=0; i<numeros.length; i++){ //Este bucle nos va a permitir introducir tantos números como tamaño tiene el array
                  System.out.print("numeros[" + i + "]=");
                  numeros[i] = sc.nextInt(); //Metemos por teclado los números
                    
            //Aqui he eliminado el DO WHILE por que no pintaba nada, ya se encarga en FOR de repetirlo tantas veces como
            //como sea el tamaño de "numeros"
                    
            }
            
            //Aqui había 3 FOR y solo necesitamos uno, dentro del mismo con un IF-ELSEIF-ELSE damos las 3 posibilidades
      
            //Por último imprimimos el valor de las variables con los totales de números positivos, negativos y ceros.
            System.out.println("Números positivos: " + pos);
            System.out.println("Números negativos: " + neg);
            System.out.println("Número de ceros: " + cer);                
            
            sc.close(); //Cerramos el teclado
        }

}