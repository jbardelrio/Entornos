package maquina;
/*
 * Proyecto: M�quina expendedora
1.-Identificar los requerimientos del sistema
2.-Buscar las Clases-Objetos: 
	Monedero: �Qu� conoce de s� mismo?: Cantidad
	Item(lo que se vende): �Qu� conoce de s� mismo?: Nombre, Precio 
	ContenedorDistribuidor(columnas o filas de la m�quina expendedora):�Qu� conoce de s� mismo?: Items

3.-�Qu� hace cada uno?: Casos de uso(describir qu� hace para saber los usos que va a hacer):
	
	Monedero: 
		1.-Introduzco monedas de 20 c�ntimos(son las �nicas que voy a usar de momento).
		   Tambi�n puedo pulsar el bot�n de recuperaci�n de las monedas.
		2.-Selecciono un producto (Item). La m�quina me da el producto si hay dinero suficiente
		   Pulso el bot�n de recuperar y la m�quina me da las vueltas (lo que sobre de dinero).
		3.-Introduzco monedas. Selecciono el producto y me dice que no hay suficiente dinero.
		   Podr�a en este caso introducir m�s dinero o recuperar el dinero introducido.

		M�todos: 
		1.-PonerCash
		2.-ReturnCash
		3.-HacerCambio(dar las vueltas)
		4.-SiHaySuficienteCash(saber si hay suficiente dinero para hacer la compra)
	Item:
			
	
	ContenedorDistribuidor:	 
	
 */
public class Monedero {
	
	//Atributos: �Qu� conozco?
	private double cantidad;
	private final double moneda = 0.20; //EL FINAL es que es una constante NO CAMBIA NUNCA
	//Constructores:
	public Monedero() {
		this.setCantidad(cantidad);
	}
	public Monedero(double cantidad) {
		this.cantidad=cantidad;
	}
	
	//Accesadores: (Getters y Setters)
	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		long valor;
		valor = Math.round(cantidad * 100);//Esta variable valor quita los decimales. Multiplicamos por 100 porque
												//queremos 2 decimales en caso de haber monedas de 5 c�ntimos. 
												//Luego dividimos por 100 abajo
		this.cantidad = (double)valor/100; //Ahora volvemos a reconvertirlo en un n�mero con decimales
	}

	//Utilidades:
	public void display(){
		System.out.println(this.cantidad);
	}
	public String toString(){
		return ""+this.cantidad;
	}
	//Servicios
	public void ponerCash(){
		this.cantidad += this.moneda;
		this.setCantidad(this.cantidad);//Esto filtra a trav�s del setCantidad para que no salgan decimales
		
		
	}
	public void returnCash(){
		this.cantidad = 0.0;
	}
	public void hacerCambio(double cantidad){//HacerCambio quita del dinero que hay la cantidad que vale el producto
		this.cantidad -= cantidad;
	}
	public boolean siHaySuficienteCash(double cantidad){
		if(this.cantidad >= cantidad){
			return true;
		}else{
		return false;
		}
	}
	
	public static void main(String[] args) {
		Monedero monedero = new Monedero();
		while(!monedero.siHaySuficienteCash(1.00)){
			System.out.println("Necesito m�s Cash");
			monedero.ponerCash();
			System.out.println(monedero);
		}

	}

}




















