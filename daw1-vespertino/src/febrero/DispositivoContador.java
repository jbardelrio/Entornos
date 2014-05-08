package febrero;
//Esta clase define las características de un dispositivo que cuenta de uno en uno
//hacia arriba y hacia abajo(incrementa y decrementa), partiendo siempre de un valor inicial.
//Los objetos de esta clase deben poder 
//incrementar su valor, decrementar su valor e inicializarse al valor indicado
public class DispositivoContador {
	//Lo primero es pensar ¿qué conozco como objeto dispositivo contador?
	//La respuesta define los atributos de la clase.
		//Los atributos dentro de una clase pueden ser privados o púbicos. Por defecto serán de tipo PRIVADO 
		//salvo que necesite uno público
	
	private int valor;//Este atributo lleva el valor contado por el dispositivo
	private int valorInicial;//Este atributo lleva el valor para resetearse
	
	//Lo siguiente son los constructores
	//Los constructores se llaman como la clase y so nde tipo PULIC y no devuelven valor.
	
	public DispositivoContador(){
		this.valor=0;//Le asigno el valor que tendrá cuando se cree por primera vez
		this.valorInicial=0;//Le asigno el valor que tendrá cuando se cree por primera vez
	}
	
	public DispositivoContador(int valor, int valorInicial){//Este VALOR es el argumento llamado VALOR del constructor
		this.valor=valor;
		this.valorInicial=valorInicial;
	}
	
	//Generar los GET y los SET. Se llaman ACCESADORES. Su misión es poder acceder a los valores uqe tienen
	//los atributos tanto para leerlos como para escribirlos desde cualquier sitio. Los atributos
	//son privados y no podemos acceder a ellos directamten, sino que usamos estos MÉTODOS para poder acceder
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
	
	//Luego ¿qué puedo hacer por los demás?
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
	//También podemos añadir servicios y métodos AXUILIARES
	public String toString(){
		//Lo que hace es crear una cadena con lainformación que quiero de cualquier objeto de esta clase.
		return ""+this.valor;//En este caso nos retorna el valor de VALOR pero como una cadena de caracteres
							//en lugar de como un número.
	}
	
	//Método para calcular el valor almacenado en la base indicada
	public String enBase(int base){
		String salida="";
		int n = this.valor;
		int resto = 0;
		while(n > 0){
			resto = n% base;
			salida = resto + salida;
			n = n / base;
		}
		return salida;
	}
	public static void main(String[] args) {
		//Crear un objeto del tipo DispositivoContador
		DispositivoContador contador = new DispositivoContador();
		
		/*contador.incrementar();//Le digo que se incremente en 1 el valor inicial
		contador.incrementar();//Otra vez incremento
		System.out.println("Valor de contador: " + contador);
		
		//Al haber creado el método toString me evita tener que poner arriba 'contador.getValor()' en el SYSO
		
		contador.decrementar();
		System.out.println("Valor de contador: " + contador);
		
		contador.resetear();
		System.out.println("Valor de contador: " + contador);
		
		//Si quiero un array de contadores pondría esto:
		DispositivoContador[]contadores = new DispositivoContador[10]; //Array de tamaño 10.
		//Este array solo crea el VECTOR pero no crea lo que contiene. No están los dispositivos 
		//contadores, hay que irlos creando a continuación:
		for (int i = 0; i < contadores.length; i++) {
			contadores[i] = new DispositivoContador();
		}
		//Si quiero inicializar el primer contador:
		contadores[0].incrementar();*/
		//System.out.println(contador.enBase(8));
		//contador.incrementar();
		//System.out.println(contador.enBase(2));
				
	}



}
