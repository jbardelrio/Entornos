package maquina;

public class ContenedorDistribuidor {
	//Esta clase es la que va a tener los botes.
	
	//Atributos:
	private Item[] items;
	private int indice;
	//Constructores:
	public ContenedorDistribuidor() {
		this.items = new Item[10];
		this.indice = 0;
	}
	//Accesadores:
	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
	//Servicios:
	public boolean estaVacio(){
		boolean rsp = false;
		if(this.indice == 0){
			rsp = true;
		}
		return rsp;//Si no esta vacio, es decir, si no es 0, retorna FALSE que es el valor de rsp por defecto
	}
	
	public void addItem(Item item){
		this.items[this.indice]=item;
		this.indice++;
	}
	
	public boolean siItemEsDispensable(Item item){
		if(!this.estaVacio() && item.equals(this.items[0])){
			return true;
		}
		return false;
	}
	
	public String obtenerNombreItemDispensable(){
		if(!this.estaVacio()){
			return this.items[0].getNombre();
		}
		return "Empty";
	}
	
	public double obtenerPrecioItemDispensable(){
		if(!this.estaVacio()){
			return this.items[0].getPrecio();
		}
		return 0.0;
	}
	
	public void despacharItem(){
		//Activar el circuito de dispensación del Item
		System.out.println(this.obtenerNombreItemDispensable() + " ha sido distribuido");
	}
	
	public void distribuir(Item item){
		this.despacharItem();
		for (int i = 0; i < this.items.length-1; i++) { //Esto mueve todos los items en el array 
				this.items[i] = this.items[i + 1];		//para que reste el vendido
		}
		this.indice--;
	}
	
	public static void main(String[] args) {
		

	}

}
