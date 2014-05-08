package noviembre;

public class Jueves7b {
/*Las Iteraciones o Bucles (Repeticiones):
 * Consiste en la repetición de un fragmento de código desde 0 hasta infinitas veces.
 * Esta estructura está condicionada por una expresión lógica y esta expresión puede estar
 * determinada o ser indeterminada.
 * ESTRUCTURAS DETERMINADAS: Escribir un mensaje de saludo un número finito de veces (10).
 * veces = 10
 * mientras no haya terminado de escribir los mensajes (veces sea mayor que 0) hacer
 * 	escribir mensaje de saludo
 * 	contar que ya he escrito un mensaje más (decremento en 1 el valor de veces)
 * finmientras
 */
	public static void main(String[] args) {
		//Declarar las variables
		//Implementación. PRIMERO L OHEMOS HECHO ASÍ, PERO ES MEJRO HACERLO CON LA VARIABLE i COMO VEMOS ABAJO:
		//for (int veces = 0; veces < 10; veces++) {
		//System.out.println("Hola, Mundo");	
		//}
		for (int i = 0; i < 10; i++) {
			System.out.println("Hola, Mundo");		
		}
	}

}
