package febrero;
//Esta clase define las caracter�sticas de un dispositivo que cuenta de uno en uno
//hacia arriba y hacia abajo(incrementa y decrementa), partiendo siempre de un valor inicial.
//Los objetos de esta clase deben poder 
//incrementar su valor, decrementar su valor e inicializarse al valor indicado
public class DispositivoContador2 {
	//Lo primero es pensar �qu� conozco como objeto dispositivo contador?
	//La respuesta define los atributos de la clase.
		//Los atributos dentro de una clase pueden ser privados o p�bicos. Por defecto ser�n de tipo PRIVADO 
		//salvo que necesite uno p�blico
	
	private int valor;//Este atributo lleva el valor contado por el dispositivo
	private int valorInicial;//Este atributo lleva el valor para resetearse
	
	//Lo siguiente son los constructores
	//Los constructores se llaman como la clase y so nde tipo PULIC y no devuelven valor.
	public DispositivoContador2(){
		this.valor=0;//Le asigno el valor que tendr� cuando se cree por primera vez
		this.valorInicial=0;//Le asigno el valor que tendr� cuando se cree por primera vez
	}
	
	public DispositivoContador2(int valor, int valorInicial){//Este VALOR es el argumento llamado VALOR del constructor
		this.valor=valor;
		this.valorInicial=valorInicial;
	}
	
	//Generar los GET y los SET. Se llaman ACCESADORES. Su misi�n es poder acceder a los valores uqe tienen
	//los atributos tanto para leerlos como para escribirlos desde cualquier sitio. Los atributos
	//son privados y no podemos acceder a ellos directamten, sino que usamos estos M�TODOS para poder acceder
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(int valorInicial) {
		this.valorInicial = valorInicial;
	}
	
	//Luego �qu� puedo hacer por los dem�s?
	//La respuesta define los servicios de la clase.
	public void incrementar(){
		this.valor++;//Incremento el valor en 1
	}
	public void decrementar(){
		this.valor--;//Decrementa el valor en 1
	}
	public void resetear(){
		this.valor=this.valorInicial;
	}
	//Tambi�n podemos a�adir servicios y m�todos AXUILIARES
	public String toString(){
		//Lo que hace es crear una cadena con lainformaci�n que quiero de cualquier objeto de esta clase.
		return ""+this.valor;//En este caso nos retorna el valor de VALOR pero como una cadena de caracteres
							//en lugar de como un n�mero.
	}
	
	//M�todo para calcular el valor almacenado en la base indicada
	public String enBase(int base){
		String salida="";
		int n = this.valor;
		int resto = 0;
		while(n > 0){
			
			resto = n % base;
			
			switch (resto){
			case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:
			case 9: 
				salida = resto + salida;
				break;
			case 10: 
				salida = "A" + salida;
				break;
			case 11:
				salida = "B" + salida;
				break;
			case 12:
				salida = "C" + salida;
				break;
			case 13:
				salida = "D" + salida;
				break;
			case 14:
				salida = "E" + salida;
				break;
			case 15:
				salida = "F" + salida;
				break;
			}
			n = n / base;
		}
		return salida;
	}
	//Igualdad entre objetos
	public boolean clon(DispositivoContador2 dis){
		boolean resp = false;
		if (this.valor == dis.getValor() && this.valorInicial == dis.getValorInicial()) {
			resp = true;
		}
		return resp;
	}
	public boolean igual(DispositivoContador2 dis){
		boolean resp = false;
		if (this.valor == dis.getValor()) {
			resp = true;
		}
		return resp;
	}
	public boolean menor(DispositivoContador2 dis){
		boolean resp = false;
		if (this.valor < dis.getValor()) {
			resp = true;
		}
		return resp;
	}
	public static void main(String[] args) {
		//Crear un objeto del tipo DispositivoContador
		DispositivoContador2 contador = new DispositivoContador2(11,0);
		DispositivoContador2 a = new DispositivoContador2(10,0);
		
		/*contador.incrementar();//Le digo que se incremente en 1 el valor inicial
		contador.incrementar();//Otra vez incremento
		System.out.println("Valor de contador: " + contador);
		
		//Al haber creado el m�todo toString me evita tener que poner arriba 'contador.getValor()' en el SYSO
		
		contador.decrementar();
		System.out.println("Valor de contador: " + contador);
		
		contador.resetear();
		System.out.println("Valor de contador: " + contador);
		
		//Si quiero un array de contadores pondr�a esto:
		DispositivoContador[]contadores = new DispositivoContador[10]; //Array de tama�o 10.
		//Este array solo crea el VECTOR pero no crea lo que contiene. No est�n los dispositivos 
		//contadores, hay que irlos creando a continuaci�n:
		for (int i = 0; i < contadores.length; i++) {
			contadores[i] = new DispositivoContador();
		}
		//Si quiero inicializar el primer contador:
		contadores[0].incrementar();*/
		System.out.println(contador.enBase(2));
		System.out.println(contador.enBase(8));
		System.out.println(contador.enBase(16));
		
		System.out.println("�Son iguales? " + contador.clon(a));
		System.out.println("�Es menor? " + a.menor(contador));
				
	}



}