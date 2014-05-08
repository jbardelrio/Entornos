package febrero;

import java.util.Scanner;

//Creación del Menú del DispositivoContador3
//Deben conocer todas las opciones que se necesitan
//Deben conocer el Prompt
//Deben conocer la opción elegida por el usuario

public class MenuConsola {
	//¿Qué es lo que conozco como MenuConsola?
	protected String[] items;
	protected String prompt;
	protected int indice;
	protected int opcion;
	protected Scanner sc;
	//Constructor
	public MenuConsola() {
		this.items = new String[3];
		this.prompt = "";
		this.indice = 0;
		this.opcion = 0;
		this.sc = new Scanner(System.in);
	}
	public MenuConsola(int dim) {
		this.items = new String[dim];
		this.prompt = "";
		this.indice = 0;
		this.opcion = 0;
		this.sc = new Scanner(System.in);
	}
	
	//Accesadores
	public String[] getItems() {
		return items;
	}
	public void setItems(String[] items) {
		this.items = items;
	}
	public String getPrompt() {
		return prompt;
	}
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
	public int getOpcion() {
		return opcion;
	}
	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}
	
	//Servicios ¿Qué hace el MenuConsola?
	public void ponerItem(String item)throws ArrayIndexOutOfBoundsException{
		this.items[this.indice] = ""+(this.indice + 1)+".-"+item;
		this.indice++;
	}
	public void ponerTerminador(String item){
		this.ponerItem(item);
	}
	public int obtenerOpcionUsuarioMenuconsola(){
		int op = 0;
		do {
			this.display();
			op = sc.nextInt();
		} while (op <= 0 || op > this.indice);
		if(op == this.indice){
			op = 0;
		}
		this.opcion = op;
		return op;
	}
	public void display(){
		for(int i = 0; i < this.indice; ++i){
			System.out.println(this.items[i]);
		}
		System.out.print(this.prompt);
	}
	
	public static void main(String[] args) {
		//Creamos el menú
		MenuConsola menu = new MenuConsola(5);
		try{
		menu.ponerItem("Incrementar");
		menu.ponerItem("Decrementar");
		menu.ponerItem("Resetear");
		menu.ponerItem("En Base");
		menu.ponerTerminador("Salir");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error: " + e);
		}
		menu.setPrompt("Elije opción: ");
		while(menu.obtenerOpcionUsuarioMenuconsola()!=0){
			System.out.println("Ha elegido la opción " + menu.getOpcion());
		}
	}

}
