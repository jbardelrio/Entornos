package maquina;
/*
 * La clase MonederoSupremo controla 5 tipos de monedas: 5, 10, 20, 50, 100 cts
 * Los servicios son:
 * 	MÉTODO: AñadirMoneda
 * 	MÉTODO: Si hay suficiente dinero (comprobar aqui si hay dinero suficiente para dar el producto, pero
 * 				 si, además, no hay para dar el cambio, no debe dar el producto)
 *  MÉTODO: Si puedo devolver el cambio 
 *  MÉTODO: hacer el cambio (hacer la resta del dinero que mete y lo que cuesta para devolver el cambio)
 *  retornar dinero (interesa que el cambio lo de en las monedas más grandes posibles para seguir teniendo cambio)
 */


public class MonederoSupremo {
	//Atributos:
	private double cantidad;//Cantidad de dinero que ha metido el usuario
	private double[]valor = {0.05, 0.10, 0.20, 0.50, 1.00};//Tipos de moneda
	private int[]monedas;//Cantidad de monedas físicas que tiene la máquina de cada tipo
	private int[]aux;//Copia de "monedas". Nos servirá para calcular las devoluciones y no cambiar el original hasta que sepamos si hay sufuciente cambio
	
	//Constructores:	
	public MonederoSupremo() {
		this.cantidad=0.0;
		this.monedas=new int [this.valor.length];
		this.aux = new int [this.valor.length];
	}
	
	public MonederoSupremo(int[]monedas) {//Este constructor es para meter monedas de cambio el dueño de la máquina 
		this.cantidad=0.0;
		this.monedas=new int [this.valor.length];
		for(int i=0; i < this.monedas.length; ++i){
			this.monedas[i] = monedas [i];
		}
		this.aux = new int [this.valor.length]; //Para llevar los calculos de las monedas en una copia
	}

	//Accesadores:
	public double getCantidad() {
		return cantidad;
	}


	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}


	public double[] getValor() {
		return valor;
	}


	public void setValor(double[] valor) {
		this.valor = valor;
	}


	public int[] getMonedas() {
		return monedas;
	}


	public void setMonedas(int[] monedas) {
		this.monedas = monedas;
	}

	//Utilidades:
	public static double round(double valor, int decimales){//Este sirve para redondear las cantidades
		long divisor = 1;
		long x = 0;
		for(int i=0; i < decimales; ++i){
			divisor *=10;//Vamos multiplicando para luego dividir en función de los decimales a sacar
		}
		x = Math.round(valor * divisor);
		//x = (long)(valor * divisor);
		valor = (double)x/divisor;
		return valor;
	}
	
	//Servicios:
	public void addCoin(int valor){//Poner la moneda: el tipo o valor
		switch(valor){
		case 5:		this.cantidad += 0.05; this.monedas[0]++; break;
		case 10: 	this.cantidad += 0.10; this.monedas[1]++; break;
		case 20: 	this.cantidad += 0.20; this.monedas[2]++; break;
		case 50: 	this.cantidad += 0.50; this.monedas[3]++; break;
		case 100:	this.cantidad += 1.00; this.monedas[4]++; break;
		}
	}
	
	public boolean siHayCambio (double cambio){ //A este metodo se le pasa la cantidad que le tengo que devolver(restar a la cantidad metida el precio del producto)
		boolean rsp = false;
		//Copiamos todos los datos de "monedas" en "aux"
		for (int i = 0; i < this.monedas.length; ++i) {
			this.aux[i] = this.monedas [i];
		}
		//Buscamos si hay cambio con las monedas
		for (int i = this.valor.length - 1; i >= 0; --i) {//Empiezo por las monedas de mayor valor y vamos restando
			while(aux[i]>0 && cambio > 0 && this.valor[i]<=cambio){
				//aux[i]>0    :significa que hay monedas para ese valor de i
				//cambio > 0    :¿cambio es mayor que 0?
				// this.valor[i]>=cambio     :¿el valor de la moneda que hay es menor o igual que la moneda que tengo?
				cambio -= this.valor[i];//si la rrespuesta a todo es que sí realizo el cambio del valor cambio
				cambio = MonederoSupremo.round(cambio, 2); //Para redondear los decimales por si acaso dan problema
				aux[i]--; //decremento el valor porque restaríamos una moneda para el cambio
			}
		}
		if(cambio == 0){//si cambio es 0 es que hemos encontrado cambio y cambiamos "rps" a true
			rsp = true;
		}
		System.out.println(cambio);
		return rsp;
	}
	
	public void displayAux(){
		for (int i = 0; i < this.monedas.length; ++i) {
			System.out.println("Monedas de " + this.valor[i] + " : " + this.aux[i]);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(MonederoSupremo.round(23.123456, 2));//Con esto redondea a 2 decimales
		int []monedas = {2,0,1,2,1};//Esto son las monedas que se pueden recargar antes de empezar para que haya cambio
		MonederoSupremo monedero = new MonederoSupremo(monedas);//Le pasamos el array monedas y ya tiene 10 monedas de cada tipo de cambio
		System.out.println(monedero.siHayCambio(2.10));
		monedero.displayAux();//usamos este método para ver las monedas que hay
	}

}
