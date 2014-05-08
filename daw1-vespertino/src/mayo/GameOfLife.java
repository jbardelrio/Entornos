package mayo;
/*
 * Tenemos una rejilla rectangular abierta, en la cual cada celdillapuede estar ocupada o no por un microorganismo.
 * Las celdillas vivas o muertas cambian de una generaci�n a la siguiente seg�n el n�mero de celdillas vecinas que
 * est�n vivas en la forma siguiente:
 * 1.-Los vecinos de una celda son los 8 que la tocan en vertical, horizontal y en diagonal.
 * 2.-Si una celda est� viva pero no tiene celdillas vecinas vivas o solamente una, en la siguiente generaci�n muere 
 * de soledad.
 * 3.-Si una celdilla que est� viva tiene 4 o m�s vecinos tambi�n vivos, en la siguiente generaci�n muere por hacinamiento.
 * 4.-Una celdilla viva con 2 o 3 vecinas vivas permanece viva en la siguiente generaci�n.
 * 5.- Si una celdilla est� muerta, en la siguiente generaci�n recuperar� la vida si tiene exactamente 3 vecinas vivas.
 * Todas las otras celdillas muertas permanecer�n muertas.
 * 6.-Todos los nacimientos y muertes tienen lugar exactamente en el mismo instante, de las que vivan o mueran no 
 * afectar� al conteo de la siguiente generaci�n.
 */
public class GameOfLife {
	//Atributos
	//La cuadr�cula
	private boolean[][] cuadricula;//Cuadr�cula del juego
	private boolean[][] gemela;//Copia de la cuadr�cula original que nos servir� para sustituir a la anterior
	
	//Constructores
	public GameOfLife() {
		
	}
	public GameOfLife(int dim) {//Le pasamos como argumento la dimensi�n
		this.cuadricula = new boolean[dim][dim];//Con esto creamos la cuadr�cula
		this.gemela = new boolean[dim][dim];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
