package febrero;

public class ContenedorVisualDispositivoContador {
	//¿Qué conozco?: Un marco y un menú
	private MarcoConsolaDispositivoContador marco;
	private MenuConsolaDispositivoContador menu;
	//Constructores
	public ContenedorVisualDispositivoContador() {
		// TODO Auto-generated constructor stub
	}
	//Accesadores
	public MarcoConsolaDispositivoContador getMarco() {
		return marco;
	}
	public void setMarco(MarcoConsolaDispositivoContador marco) {
		this.marco = marco;
	}
	public MenuConsolaDispositivoContador getMenu() {
		return menu;
	}
	public void setMenu(MenuConsolaDispositivoContador menu) {
		this.menu = menu;
	}
	//Servicios
	public void construirContenedorVisualDispositivoContador(DispositivoContador contador){
		this.marco = new MarcoConsolaDispositivoContador();
		this.marco.construirMarcoConsolaDispositivoContador(contador);
		this.menu = new MenuConsolaDispositivoContador(4);
		this.menu.construirMenuConsolaDispositivoContador(contador);
	}
	public void iniciarContenedorVisualDispositivoContador(){
		this.marco.display();
		while(menu.obtenerOpcionUsuarioMenuconsola()!=0){
			menu.ejecutarOpcionMenuConsolaDispositivoContador();
			marco.actualizarValorMarcoConsolaDispositivoContador();
			marco.display();
		}
	}
	public static void main(String[] args) {
		ContenedorVisualDispositivoContador contenedor = new ContenedorVisualDispositivoContador();
		DispositivoContador contador = new DispositivoContador();
		contenedor.construirContenedorVisualDispositivoContador(contador);
		contenedor.iniciarContenedorVisualDispositivoContador();
		System.out.println("Felicidades!!. Es el Final");

	}

}
