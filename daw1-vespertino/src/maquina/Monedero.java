package maquina;
/*
 * Proyecto: Máquina expendedora
1.-Identificar los requerimientos del sistema
2.-Buscar las Clases-Objetos: 
	Monedero: ¿Qué conoce de sí mismo?: Cantidad
	Item(lo que se vende): ¿Qué conoce de sí mismo?: Nombre, Precio 
	ContenedorDistribuidor(columnas o filas de la máquina expendedora):¿Qué conoce de sí mismo?: Items

3.-¿Qué hace cada uno?: Casos de uso(describir qué hace para saber los usos que va a hacer):
	
	Monedero: 
		1.-Introduzco monedas de 20 céntimos(son las únicas que voy a usar de momento).
		   También puedo pulsar el botón de recuperación de las monedas.
		2.-Selecciono un producto (Item). La máquina me da el producto si hay dinero suficiente
		   Pulso el botón de recuperar y la máquina me da las vueltas (lo que sobre de dinero).
		3.-Introduzco monedas. Selecciono el producto y me dice que no hay suficiente dinero.
		   Podría en este caso introducir más dinero o recuperar el dinero introducido.

		Métodos: 
		1.-PonerCash
		2.-ReturnCash
		3.-HacerCambio(dar las vueltas)
		4.-SiHaySuficienteCash(saber si hay suficiente dinero para hacer la compra)
	Item:
			
	
	ContenedorDistribuidor:	 
	
 */
public class Monedero {
	
	//Atributos: ¿Qué conozco?
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
												//queremos 2 decimales en caso de haber monedas de 5 céntimos. 
												//Luego dividimos por 100 abajo
		this.cantidad = (double)valor/100; //Ahora volvemos a reconvertirlo en un número con decimales
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
		this.setCantidad(this.cantidad);//Esto filtra a través del setCantidad para que no salgan decimales
		
		
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
			System.out.println("Necesito más Cash");
			monedero.ponerCash();
			System.out.println(monedero);
		}

	}

}




















