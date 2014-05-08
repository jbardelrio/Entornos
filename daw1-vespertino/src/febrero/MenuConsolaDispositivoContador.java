package febrero;

public class MenuConsolaDispositivoContador extends MenuConsola {
	
	//Atributos: �Qu� conozco?
	private DispositivoContador contador;
	
	//Constructores:
	public MenuConsolaDispositivoContador() {
		// TODO Auto-generated constructor stub
	}
	public MenuConsolaDispositivoContador(int dim) {
		super(dim);
		// TODO Auto-generated constructor stub
	}

	//Accesadores: Getters and setters
	public DispositivoContador getContador() {
		return contador;
	}

	public void setContador(DispositivoContador contador) {
		this.contador = contador;
	}
	//Esta es la manera de construir el men�:
	public void construirMenuConsolaDispositivoContador(DispositivoContador contador){
		this.contador=contador;
		try{
		this.ponerItem("Incrementar");
		this.ponerItem("Decrementar");
		this.ponerItem("Resetear");
		//this.ponerItem("En base 2");
		this.ponerTerminador("Salir");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error: " + e);
		}
		this.setPrompt("Elige opci�n");
	}
	//Le decimos qu� debe hacer seg�n la opci�n elegida:
	public void ejecutarOpcionMenuConsolaDispositivoContador(){
		switch(this.opcion){
		case 1: this.contador.incrementar(); break;
		case 2: this.contador.decrementar(); break;
		case 3: this.contador.resetear(); break;
		
		}
	}
	
	public static void main(String[] args) {
		//Declaramos los objetos:
		DispositivoContador contador = new DispositivoContador();
		MenuConsolaDispositivoContador menu = new MenuConsolaDispositivoContador(4);
		menu.construirMenuConsolaDispositivoContador(contador);
		
		System.out.println("Valor: " + contador.enBase(2));
		
		while(menu.obtenerOpcionUsuarioMenuconsola()!=0){
			menu.ejecutarOpcionMenuConsolaDispositivoContador();
			System.out.println("Valor: " + contador.enBase(2));
		}
		System.out.println("\n\nFinal Feliz!!!!");

	}

}
