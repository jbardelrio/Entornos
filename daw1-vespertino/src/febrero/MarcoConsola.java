package febrero;

public class MarcoConsola {
	//Atributos ¿Qué conocemos?: Un lema y un valor
	private String lema;
	private String valor;
	public MarcoConsola() {
		this.lema = "";
		this.valor = "";
	}
	//Accesadores
	public String getLema() {
		return lema;
	}

	public void setLema(String lema) {
		this.lema = lema;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	//Servicios
	public void display(){
		System.out.println(this.lema+": "+this.valor);
	}
	
	public static void main(String[] args) {
		MarcoConsola marco = new MarcoConsola();
		marco.setLema("Valor del contador");
		marco.setValor("10");
		marco.display();

	}

	

}
