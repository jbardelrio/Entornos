package abril;
import java.io.*;
public class Ficheros {
	//Atributos
	private File file;//Es la estructura que maneja el SO
	private RandomAccessFile raf;//Flujo de datos del archivo
	private int reg;//Este es el registro de datos
	
	//Constructores
	public Ficheros() {
		
	}
	
	public Ficheros(String file) {
		try{
			this.file = new File(file);
			this.raf = new RandomAccessFile(this.file, "rw");
		}catch(IOException e){
			System.out.println(e);//"E" es el objeto mensaje de error
			System.exit(0);//Para salir del programa
		}
	}

	public Ficheros(String file, String modo) {
		try{
			this.file = new File(file);
			this.raf = new RandomAccessFile(this.file, modo);
		}catch(IOException e){
			System.out.println(e);//"E" es el objeto mensaje de error
			System.exit(0);//Para salir del programa
		}
	}
	public static void main(String[] args) throws IOException{//Este throws IOException es para que no se trate el error, sino haríamos el TRY CATCH
		/*
		//Crear y procesar un archivo de datos numéricos enteros
		RandomAccessFile raf = new RandomAccessFile("datos.dat", "rw");//RAF es el objeto que maneja esta estructura
		//De arriba: Primer argumento: nombre del archivo, segundo argumento: permisos (lectura y escritura)
		int reg;//Registro de nuestro archivo
		//Añadir registros: mando el puntero al final del archivo
		
		//Posicionamiento al final del archivo
		//LO DE ABAJO LO HE COMENTADO DESPUÉS
		//raf.seek(raf.length());//Seek es el comando de posicionamiento, se le dice como argumento la posición en bytes. 
		//Con raf.length nos ponemos al final del archivo
		
		for (reg = 1; reg <= 10; ++reg) {
			raf.writeInt(reg);//El método WRITEINT calcula el número de datos a escribir
		}
		
		//Esto añade 10 números más, del 21 al 30
		for (reg = 21; reg <= 30; ++reg) {
			raf.writeInt(reg);//El método WRITEINT calcula el número de datos a escribir
		}
		
		//Leer el archivo de datos numéricos creado anteriormente
		//Esta primera forma de hacerlo es sabiendo la longitud del los datos del archivos, que son 10 en este caso
		//Posicionamos el puntero al principio. El 0 es el principiodel archivo
		raf.seek(0);
		for(int i = 0; i <20; ++i){
			reg = raf.readInt();//El READINT se encarga de leer
			System.out.println(reg);
		}
		*/
		
		Ficheros mifichero = new Ficheros("numeros.dat");

	}

}
