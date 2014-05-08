package contador;
import java.io.*;
public class ContadorDevice {
	//Atributos: Pueden ser de tres clases: privados, protegidos o p�blicos. 
	//Si los declaramos privados est�n encapsulados.	
	private int valorActual;
	private int valorInicial;
	//Constructores: Es al crear un elemento con lo que nace.
	//Son siempre P�BLICOS y tiene el nombre de la clase y par�ntesis () y llaves {}.
	//Dentro se ponen valores como "this." seguido de los m�todos que podemos invocar y el "=" para indicar el valor
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
	//Se accede en la pesta�a SOURCE en la opci�n correspondiente
	//Servicios: Son los m�todos que me permiten hacer algo. Queremos que me muestre la posiblidad de ver el valor
	//de "contador". Lo hacemos de tipo p�blico. Nos ha cresado esta parte que indico de abajo:
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
		//Instanciar el objeto de la clase. Se pone la clase seguida del nombre que queremos darle. Despu�s va
		//el "=" seguido del operador "new" y del constructor del tipo, en este caso "ContadorDevice"
		ContadorDevice contador = new ContadorDevice(5,2); //aqui 5 ser�a el valro de inicio y 2 el valor de reinicio
		contador.setValorActual(5);
		contador.incrementar();
		contador.incrementar();
		System.out.println(contador.toString());  //este ".toString()" no har�a falta ponerlo en este caso
		//por que hemos definido el "toString" en el p�rrafo anterior, de no haberlo hecho s� que habr�a que ponerlo
		contador.decrementar();
		System.out.println(contador.toString());
		contador.resetear();
		System.out.println(contador.toString());
	}

}
