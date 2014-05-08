package contador;
import java.io.*;
public class ContadorDevice {
	//Atributos: Pueden ser de tres clases: privados, protegidos o públicos. 
	//Si los declaramos privados están encapsulados.	
	private int valorActual;
	private int valorInicial;
	//Constructores: Es al crear un elemento con lo que nace.
	//Son siempre PÚBLICOS y tiene el nombre de la clase y paréntesis () y llaves {}.
	//Dentro se ponen valores como "this." seguido de los métodos que podemos invocar y el "=" para indicar el valor
	//que le damos.
	public ContadorDevice(){
		this.valorActual=0;
		this.valorInicial=0;
	}
	//Ahora creamos otro constructor pero con argumentos dentro y le damos ese valor dento de los "this".
	public ContadorDevice(int valorActual, int valorInicial){
		this.valorActual=valorActual;
		this.valorInicial=valorInicial;
	}
	//Accesadores: Son los elementos para acceder a las variables de una manera directa. Se llaman Getters y Setters
	//Se accede en la pestaña SOURCE en la opción correspondiente
	//Servicios: Son los métodos que me permiten hacer algo. Queremos que me muestre la posiblidad de ver el valor
	//de "contador". Lo hacemos de tipo público. Nos ha cresado esta parte que indico de abajo:
	/*
	 * public int getValorActual() {
		return valorActual;
	}
	public void setValorActual(int valorActual) {
		this.valorActual = valorActual;
	}
	public int getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(int valorInicial) {
		this.valorInicial = valorInicial;

	
	 */
	public String toString(){
		String mensaje = "Valor: ";
		mensaje += this.valorActual;
		return mensaje;
	}
	public int getValorActual() {
		return valorActual;
	}
	public void setValorActual(int valorActual) {
		this.valorActual = valorActual;
	}
	public int getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(int valorInicial) {
		this.valorInicial = valorInicial;
	}
	public void incrementar(){
		this.valorActual = this.valorActual + 1;
	}
	public void decrementar(){
		this.valorActual = this.valorActual - 1;
	}
	public void resetear(){
		this.valorActual = this.valorInicial;
	}
	public static void main(String[] args) {
		//Instanciar el objeto de la clase. Se pone la clase seguida del nombre que queremos darle. Después va
		//el "=" seguido del operador "new" y del constructor del tipo, en este caso "ContadorDevice"
		ContadorDevice contador = new ContadorDevice(5,2); //aqui 5 sería el valro de inicio y 2 el valor de reinicio
		contador.setValorActual(5);
		contador.incrementar();
		contador.incrementar();
		System.out.println(contador.toString());  //este ".toString()" no haría falta ponerlo en este caso
		//por que hemos definido el "toString" en el párrafo anterior, de no haberlo hecho sí que habría que ponerlo
		contador.decrementar();
		System.out.println(contador.toString());
		contador.resetear();
		System.out.println(contador.toString());
	}

}
