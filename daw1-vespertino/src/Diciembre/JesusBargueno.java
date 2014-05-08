package Diciembre;

import java.io.*;
import java.util.*;

public class JesusBargueno {

        //Cuenta los numeros positivos, negativos y ceros que hay en una array (lo pedimos al inicio
	
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int dim = 20;
            int[] numeros = new int[dim]; //Creamos el array. He quitado el "20" y he puesto de tamaño la variable "DIM"
            int pos = 0, neg = 0, cer = 0; //Declaramos las variables que nos servirán para contar el número total de positivos, negativos y ceros
            
            System.out.println("Leemos los números y los introducimos a un array.");
          
            for(int i=0; i<numeros.length; i++){ //Este bucle nos va a permitir introducir tantos números como tamaño tiene el array
                  System.out.print("numeros[" + i + "]="); //Veremos la posición que ocupan en el array a la hora de introducir los números
                  numeros[i] = sc.nextInt(); //Metemos por teclado los números
                    
            //Aqui he eliminado el DO WHILE por que no pintaba nada, ya se encarga en FOR de repetirlo tantas veces como
            //como sea el tamaño de "numeros"
                    
            }
            
            //Aqui había 3 FOR y solo necesitamos uno, dentro del mismo con un IF-ELSEIF-ELSE damos las 3 posibilidades
            //que necesitamos (mayor que 0, menor que 0 o igual a 0);
            
            for(int i=0; i<numeros.length; i++){ //Este bucle va a recorrer todos los números del array para 
            									 //realizar las comprobaciones que veremos a continuación 
            	
                   if(numeros[i]>0) //Si el número guardado en el array es mayor que 0 
                            ++pos;  //incrementa en 1 la variable "pos"
                   else if(numeros[i]<0)//Si el número guardado en el array es menor que 0 
                            ++neg;   	//incrementa en 1 la variable "neg"
                   else 
                            ++cer; //Si no es mayor ni menor que 0 es un 0, es decir, ninguno de los casos anteriores es un 0 e incrementa en 1 la variable cer
            }
            //Por último imprimimos el valor de las variables con los totales de números positivos, negativos y ceros.
            System.out.println("Números positivos: " + pos);
            System.out.println("Números negativos: " + neg);
            System.out.println("Número de ceros: " + cer);                
            
            sc.close(); //Cerramos el teclado
        }

}