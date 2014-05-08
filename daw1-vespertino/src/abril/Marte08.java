package abril;

public class Marte08 {
	//Atributos
	private double[][]matriz;//Esta matriz es un atributo de la clase MARTE08
	
	public Marte08() {
		
	}

	public double[][]dispersa(int dim, double porcentaje){
		double [][] matriz = new double [dim][dim];//Esta matriz es un atributo del método DISPERSA
		int n = (int) (dim * dim*porcentaje/100);
		int fila=0;
		int columna=0;
		while (n > 0) {
			//Generar una fila y una columna
			fila = (int) (Math.random()*dim);
			columna = (int) (Math.random()*dim);
			if (matriz[fila][columna]==0) {
				matriz[fila][columna]=Math.random();
				--n;//Cada vez que meto un valor decremento n. Cuando llegue a 0 habré terminado.
			}
			
		}
		return matriz;
	}
	//Ahora creamos una estructura con VALOR, FILA Y COLUMNA en un array que corresponden a la matriz.
	//Lo hacemos en una clase nueva que hemos llamado ElementoMatriz
	
	public static void main(String[] args) {
		

	}

}
