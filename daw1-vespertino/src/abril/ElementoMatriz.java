package abril;

public class ElementoMatriz {
	
	//Atributos
	private double valor;
	private int fila;
	private int columna;
	
	//Constructores
	public ElementoMatriz() {
		
	}
	
	public ElementoMatriz(double valor, int fila, int columna) {//Este constructor le da los valores a los atributos
		this.valor=valor;
		this.fila=fila;
		this.columna=columna;
	}
	
	//Accesadores
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	
	//Métodos
	public static void main(String[] args) {
		ElementoMatriz[] matriz = new ElementoMatriz[5];//La dimensión de este array es "n"
		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = new ElementoMatriz(0.25,1,2);//Vamos generando y sustituyendo los valores
		}

	}

}
