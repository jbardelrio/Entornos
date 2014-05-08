package febrero;

public class MarcoConsolaDispositivoContador extends MarcoConsola {
	//¿Qué conocemos?: Un DispositivoContador
	private DispositivoContador contador;
	//Constructores
	public MarcoConsolaDispositivoContador() {
		
	}
	//Accesadores
	public DispositivoContador getContador() {
		return contador;
	}

	public void setContador(DispositivoContador contador) {
		this.contador = contador;
	}
	//Servicios
	public void construirMarcoConsolaDispositivoContador(DispositivoContador contador){
		this.setContador(contador);
		this.setLema("Valor actual");
		this.setValor(contador.toString());
	}
	public void actualizarValorMarcoConsolaDispositivoContador(){
		this.setValor(this.contador.toString());
	}
	
	public static void main(String[] args) {
		MarcoConsolaDispositivoContador marco = new MarcoConsolaDispositivoContador();
		DispositivoContador contador = new DispositivoContador();
		marco.construirMarcoConsolaDispositivoContador(contador);
		MenuConsolaDispositivoContador menu = new MenuConsolaDispositivoContador(5);
		menu.construirMenuConsolaDispositivoContador(contador);
		marco.display();
		while(menu.obtenerOpcionUsuarioMenuconsola()!=0){
			menu.ejecutarOpcionMenuConsolaDispositivoContador();
			marco.actualizarValorMarcoConsolaDispositivoContador();
			marco.display();
		}
		System.out.println("Felicidades has terminado");
	}

	

}
