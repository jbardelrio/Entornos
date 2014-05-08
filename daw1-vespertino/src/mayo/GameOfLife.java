package mayo;

import mayo.GameOfLife;

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
	
	//Accesadores
	public boolean[][] getCuadricula() {
		return cuadricula;
	}
	public void setCuadricula(boolean[][] cuadricula) {
		this.cuadricula = cuadricula;
	}
	public boolean[][] getGemela() {
		return gemela;
	}
	public void setGemela(boolean[][] gemela) {
		this.gemela = gemela;
	}
	
	//Servicios
	public void addMicro(int x, int y){
		this.cuadricula[x][y]=true;//Significa que en la posici�n que me dan activo el microorganismo vivo
	}
	
	public void display(){
		for (int i = 1; i < this.cuadricula.length-1; i++) {//Empezamos desde la fila 1 porque la tenemos sobredimensionada la tabla
			//LENGTH es la longitud de filas
			for (int j = 1; j < this.cuadricula[i].length; j++) {//Para cada fila, su longitud (n�mero de columnas)
				if (this.cuadricula[i][j]==true) {
					System.out.print(" * ");
				}else{
					System.out.print(" 0 ");
				}
			}
			System.out.println();
		}
	}
	
	public void create(){
		
	}
	
	public int vecinos(int x, int y){
		int contador = 0;
		for (int i = x-1; i <= x+1; i++) {//x-1 es la fila anterior a la que le demos por par�metro, x+1 es la posterior
										  //Recorre 3 filas en total: la anterior, la propia en la que est� y la posterior
			for (int j = y-1; j <= y+1; j++) {//y-1 es la columna anterior a la que le damos por par�metro, y+1 la posterior
				if (this.cuadricula[i][j]==true) {
					++contador;//Contamos todos los vecinos y al propio microorhanismo, luego hjay que descontarlo
				}
			}
		}
		if (this.cuadricula[x][y]==true) {//Si la casilla est� ocupada(microorganismo vivo) lo descontamos 
										  //para que no cuente como vecino �l mismo
			--contador;
		}
		return contador;
	}
	
	public static void main(String[] args) {
		
		GameOfLife game = new GameOfLife(10);
		game.addMicro(3, 3);
		game.addMicro(3, 4);
		game.addMicro(3, 5);
		game.display();//Llamamos al m�todo para mostrarlos
		
		System.out.println("Vecinos de 3,4: " + game.vecinos(3, 4));//Para probar si cuenta bien el n�mero de vecinos
		System.out.println("Vecinos de 3,3: " + game.vecinos(3, 3));
	}

}
