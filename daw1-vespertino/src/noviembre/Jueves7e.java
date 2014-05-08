package noviembre;

public class Jueves7e {
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
		//Este otro método no es muy ortodoxo pero funciona:
		int i = 0;
		while(i < 10){
			System.out.println("Hola, Mundo");
			i++;
			if (i == 10){
				i = 10;
				continue;
			}
			//Este mensaje de abajo saldrá solo 9 veces, ya que el break interrumpe el programa cuando i ha llegado a 10
			System.out.println("Seguimos, adelante");
		}
	}

}
