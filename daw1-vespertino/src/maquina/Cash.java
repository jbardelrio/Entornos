package maquina;

import java.util.Scanner;


public class Cash {
	//Atributos
	private static int amount;//cantidad de dinero que mete el usuario en valor absoluto, independientemente de las monedas que meta
	private int[]valor={5, 10, 20, 50, 100};//valores de las monedas en céntimos
	private int[]monedas; //almacena el número de monedas que tiene la máquina de cada tipo
	private int total;//total del dinero que tiene almacenada la máquina
	private int []aux; //guarda las monedas que se utilizan en el cambio una vez que hemos conseguido saber que podemos
					 // dar el cambio en caso de tener suficientes monedas
	//Constructor
	public Cash() {
		this.amount = 0;
		this.monedas = new int[this.valor.length];//Es del tamaño de la cantidad de monedas que maneja la máquina
												  //En este caso son 5 tipos: 5, 10, 20, 50, 100
		this.total=0;
		this.aux = new int [this.valor.length]; //tamaño en función de los tipos de monedas:  5, 10, 20, 50, 100
	}

	//Accesadores
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int[] getValor() {
		return valor;
	}
	public void setValor(int[] valor) {
		this.valor = valor;
	}
	public int[] getMonedas() {
		return monedas;
	}
	public void setMonedas(int[] monedas) {
		this.monedas = monedas;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int[] getAux() {
		return aux;
	}
	public void setAux(int[] aux) {
		this.aux = aux;
	}

	//Servicios
	public boolean siHayMonedas(int cambio, int indice, int total ){//int cambio: cambio que tengo que devolver 
									//int indice: desde que nivel de monedas estoy empezando
									//int total: dinero que le queda a la máquina en función del nivel que estoy
		for (int i = this.monedas[indice]; i >= 0 && cambio <= total; --i) {
			if(i * this.valor[indice] > cambio){//le pregunto si el valor de la moneda es mayor que el cambio que tenemos que dar
				continue;					    //si es así pasamos a la siguiente vuelta del bucle
			}
			this.aux[indice] = i;//Anoto el número de monedas que vamos a dar de cambio en el array AUX
			if(i * this.valor[indice] == cambio){ //si el valor de las monedas es igual al cambio he finalizado
				return true;
			}
			if(indice > 0){ //Si llego aquí es que aún no he encontrado el cambio que necesito
				if(this.siHayMonedas(cambio - (i * this.valor[indice]), indice - 1, total - (this.monedas[indice] * this.valor[indice]))){
					return true; //Si he conseguido las monedas retornamos TRUE
				}
				
			}
			this.aux[indice] = 0;//Si no me vale decuelvo la moneda cogida para deshacer la operación
		}
		return false; //Si al final del todo no encuentro cambio suficient retornamos FALSE
	}
	
	public boolean siHayCambio(int cambio){ //como argumento tiene el valor CAMBIO que es lo que le pasamos
		this.iniAux();
		return this.siHayMonedas(cambio, this.valor.length - 1, this.total);
	}
	
	private void iniAux(){//Este método inicializa el vector AUX a 0. Sirve para dejarlo a 0 después de cada
						  //operación y que funcione bien
		for (int i = 0; i < this.aux.length; ++i) {
			this.aux[i] = 0;
		}
	}	

	//azarquiel.rivas@gmail.com
	
	public void addCash(int coin){//COIN pasa el valor de cada moneda que metamos
		switch(coin){
		case 5: this.amount += coin; this.total += coin; this.monedas[0]++; break; //Una monedas más de 5
		case 10: this.amount += coin; this.total += coin; this.monedas[1]++; break; //Una moneda más de 10
		case 20: this.amount += coin; this.total += coin; this.monedas[2]++; break; //Una moneda más de 20
		case 50: this.amount += coin; this.total += coin; this.monedas[3]++; break; //Una moneda más de 50
		case 100: this.amount += coin; this.total += coin; this.monedas[4]++; break; //Una moneda más de 100
		}
	}
	
	//Método "sihaysuficientedinero": mirar si el dinero que le paso en el argumento es menor o igual que AMOUNT
	public boolean siHaySuficienteDinero(int precio){
		if (this.amount>=precio) {
			return true;
		}
		return false;
	}
	
	//Método para mostrar las monedas devueltas: Muestra las monedas de cada tipo devueltas
	private void displayAux(){
		for (int i = 0; i < this.aux.length; ++i) {
			if (this.aux[i]>0) {
				System.out.println("Monedas de " + this.valor[i] + " : " + this.aux[i]);
			}
		}
	}
	
	//hacercambio: quitarle el dinero del producto al usuario (monedas)
	public void hacerCambio(int precio){
		this.amount -= precio;//Lo que hacemos es restar, del dinero que ha metido, lo que vale el producto
	}
	
	//return: dinero que tiene el usuario todavia
	public void returnCash(){
		this.iniAux();//Este método que llamamos pone a 0 el vector de las monedas que tengo que devolver
		if(this.siHayMonedas(this.amount, this.valor.length - 1, this.total)){
			for (int i = 0; i < this.aux.length; ++i) {
				this.monedas[i] -= this.aux[i];//Va reduciendo las monedas que tiene que devolver del total de monedas
			}
			this.total -= this.amount;//Actualizo el total de monedas que he devuelto
			this.amount = 0;//Cuando le devuelva el dinero le queda 0 de dinero al usuario
		}
		this.displayAux();//Muestra las monedas que tengo que devolver
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		boolean finalizar = false;
		int coin = 0; 
		System.out.println("CINEXIN");
		Cash cash = new Cash();
		
		do {

			System.out.println("Elija una opción:");
			System.out.println("1.Introduce una moneda");
			System.out.println("2.Comprar coca-cola");
			System.out.println("3.Visualizar una película");
			System.out.println("4.Salir");

			int opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Introduce moneda: ");
				coin = teclado.nextInt();
				cash.addCash(coin);
				break;
			case 2:	
				int amount =+ coin;
				int precio = 80;
				int cambio= amount - precio;
				
				System.out.println("Ha elegido comprar una coca-cola");
				if (cash.siHaySuficienteDinero(80) && cash.siHayCambio(cambio) ) {//&& amount > 80
					System.out.println("Sus vueltas, gracias");
					cash.hacerCambio(cambio);
				}else{
					System.out.println("Dinero insuficiente, te devuelvo tus monedas:");
					if (amount == 0) {
						System.out.println("No has echado dinero");
					}
					cash.returnCash();
				}
				cash.returnCash();
			case 3:
				
				break;
			case 4:
				break;
			}

			System.out.print("Desea realizar alguna otra operación[s/n]");
			String respuesta = teclado.next();
			if (respuesta.equalsIgnoreCase("n"))
				finalizar = true;

		} while (!finalizar);
		
		
		
		//Cash cash = new Cash();
		/*
		int[]monedas = {0, 0, 4, 1, 1};
		cash.setMonedas(monedas);
		cash.setTotal(230);
		System.out.println(cash.siHayCambio(80));//Esto es lo que tengo que devolver: 80 céntimos
		cash.displayAux();
		 */
		//LLega el primer usuario
		System.out.println("Primer usuario: ");
		cash.addCash(50);//Metemos una moneda de 50
		cash.addCash(20);//Metemos una moneda de 20
		cash.addCash(10);
		cash.addCash(10);
		if (cash.siHaySuficienteDinero(80) && cash.siHayCambio(10)) {
			//Pregunto si hay suficiente cambio. El producto vale 80. El cambio que me tienen que dar es 10
			cash.hacerCambio(80);//Si se cumplen las 2 cosas hacemos el cambio. Nos devolverá una moneda de 10
		}
		cash.returnCash();//Aqui nos devuelve el cambio
		
		//LLega el segundo usuario. Ahora la máquina tiene de cambio 80 céntimos en monedas de 50, 20 y 10
		System.out.println("Segundo usuario: ");
		cash.addCash(100);//El segundo usuario mete una moneda de 1 euro
		if (cash.siHaySuficienteDinero(80) && cash.siHayCambio(20)) {
			//Pregunto si hay suficiente cambio. El producto vale 80. El cambio que me tienen que dar es 20
			cash.hacerCambio(80);//Si se cumplen las 2 cosas hacemos el cambio. Nos devolverá una moneda de 20
		}
		cash.returnCash();
		
		//Llega el tercer usuario. NO VA A TENER CAMBIO SUFICIENTE. LO QUE HACE ES DEVOLVERLE TODO EL DINERO: 1 EURO
		System.out.println("Tercer usuario: ");
		cash.addCash(100);//El tercer usuario mete una moneda de 1 euro
		if (cash.siHaySuficienteDinero(80) && cash.siHayCambio(20)) {
			//Pregunto si hay suficiente cambio. El producto vale 80. El cambio que me tienen que dar es 20
			cash.hacerCambio(80);//Si se cumplen las 2 cosas hacemos el cambio. Nos devolverá una moneda de 20
		}
		cash.returnCash();
		
		//Llega el cuarto usuario. A ESTE SI LE DA CAMBIO PORQUE HABIA UNA MONEDA DE 50
		System.out.println("Cuarto usuario: ");
		cash.addCash(100);//El cuarto usuario mete una moneda de 1 euro
		if (cash.siHaySuficienteDinero(50) && cash.siHayCambio(50)) {
			//Pregunto si hay suficiente cambio. El producto vale 50. El cambio que me tienen que dar es 50
			cash.hacerCambio(50);//Si se cumplen las 2 cosas hacemos el cambio. Nos devolverá una moneda de 50
		}
		cash.returnCash();
	}
	
}
