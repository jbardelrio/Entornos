package mayo;
/*
 * Tenemos una rejilla rectangular abierta, en la cual cada celdillapuede estar ocupada o no por un microorganismo.
 * Las celdillas vivas o muertas cambian de una generación a la siguiente según el número de celdillas vecinas que
 * estén vivas en la forma siguiente:
 * 1.-Los vecinos de una celda son los 8 que la tocan en vertical, horizontal y en diagonal.
 * 2.-Si una celda está viva pero no tiene celdillas vecinas vivas o solamente una, en la siguiente generación muere 
 * de soledad.
 * 3.-Si una celdilla que está viva tiene 4 o más vecinos también vivos, en la siguiente generación muere por hacinamiento.
 * 4.-Una celdilla viva con 2 o 3 vecinas vivas permanece viva en la siguiente generación.
 * 5.- Si una celdilla está muerta, en la siguiente generación recuperará la vida si tiene exactamente 3 vecinas vivas.
 * Todas las otras celdillas muertas permanecerán muertas.
 * 6.-Todos los nacimientos y muertes tienen lugar exactamente en el mismo instante, de las que vivan o mueran no 
 * afectará al conteo de la siguiente generación.
 */
public class GameOfLife {
	//Atributos
	//La cuadrícula
	private boolean[][] cuadricula;//Cuadrícula del juego
	private boolean[][] gemela;//Copia de la cuadrícula original que nos servirá para sustituir a la anterior
	
	//Constructores
	public GameOfLife() {
		
	}
	public GameOfLife(int dim) {//Le pasamos como argumento la dimensión
		this.cuadricula = new boolean[dim][dim];//Con esto creamos la cuadrícula
		this.gemela = new boolean[dim][dim];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
