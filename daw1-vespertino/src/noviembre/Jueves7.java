package noviembre;

public class Jueves7 {
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
		int veces = 10;
		//Implementación
		//AL FINAL HEMOS PUESTO EL -- COMO LO VEMOS DEBAJO, DENTRO DEL WHILE, PERO CON CUIDADO
		//DE PONER EL -- DESPUES DE LA VARIABLE, PORQUE SI LO PONEMOS ANTES SOLO LO HARÍA 9 VECES EN VEZ DE 10
		//SE RECOMIENDA USAR MEJOR EL MÉTODO DE ABAJO    veces--;  PARA EVITAR ESTE POSIBLE ERROR
		while (veces-- > 0){
			System.out.println("Hola, Mundo");
			//veces = veces - 1; ESTA OPCIÓN HACE LO MISMO QUE LE DE ABAJO,
			//PERO SE SUELE USAR EL DE ABAJO AL SER MÁS CORTO:
			//veces--; A SUS VEZ, ESTE HACE LO MISMO QUE EL DE ABAJO, QUE ES IGUAL PERO
			//PONIENDO EL -- ANTES DE LA VARIABLE:
			//--veces;
		}

	}

}
