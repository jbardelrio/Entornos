package noviembre;

public class Jueves7b {
/*Las Iteraciones o Bucles (Repeticiones):
 * Consiste en la repetici�n de un fragmento de c�digo desde 0 hasta infinitas veces.
 * Esta estructura est� condicionada por una expresi�n l�gica y esta expresi�n puede estar
 * determinada o ser indeterminada.
 * ESTRUCTURAS DETERMINADAS: Escribir un mensaje de saludo un n�mero finito de veces (10).
 * veces = 10
 * mientras no haya terminado de escribir los mensajes (veces sea mayor que 0) hacer
 * 	escribir mensaje de saludo
 * 	contar que ya he escrito un mensaje m�s (decremento en 1 el valor de veces)
 * finmientras
 */
	public static void main(String[] args) {
		//Declarar las variables
		//Implementaci�n. PRIMERO L OHEMOS HECHO AS�, PERO ES MEJRO HACERLO CON LA VARIABLE i COMO VEMOS ABAJO:
		//for (int veces = 0; veces < 10; veces++) {
		//System.out.println("Hola, Mundo");	
		//}
		for (int i = 0; i < 10; i++) {
			System.out.println("Hola, Mundo");		
		}
	}

}
