package noviembre;

public class Jueves7 {
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
		int veces = 10;
		//Implementaci�n
		//AL FINAL HEMOS PUESTO EL -- COMO LO VEMOS DEBAJO, DENTRO DEL WHILE, PERO CON CUIDADO
		//DE PONER EL -- DESPUES DE LA VARIABLE, PORQUE SI LO PONEMOS ANTES SOLO LO HAR�A 9 VECES EN VEZ DE 10
		//SE RECOMIENDA USAR MEJOR EL M�TODO DE ABAJO    veces--;  PARA EVITAR ESTE POSIBLE ERROR
		while (veces-- > 0){
			System.out.println("Hola, Mundo");
			//veces = veces - 1; ESTA OPCI�N HACE LO MISMO QUE LE DE ABAJO,
			//PERO SE SUELE USAR EL DE ABAJO AL SER M�S CORTO:
			//veces--; A SUS VEZ, ESTE HACE LO MISMO QUE EL DE ABAJO, QUE ES IGUAL PERO
			//PONIENDO EL -- ANTES DE LA VARIABLE:
			//--veces;
		}

	}

}
