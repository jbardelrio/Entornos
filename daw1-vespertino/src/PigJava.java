
 import java.util.Scanner;
     
    public class PigJava {
    	
    static boolean cadenavacia = false;
    static boolean sintaxis = false;
    String resto = "";
    public static void main(String[] args) {
    	
	    intro();//Llamamos al método "intro" que muestra la pantalla de bienvenida
	   
		do {
			System.out.println();	
		    Scanner input = new Scanner(System.in);
		    
		    try{
			    System.out.print("Introduce la frase a traducir con el PigLatin:");
			    String frase = input.nextLine();
		
			    Scanner cadapalabra = new Scanner(frase);//Nos sirve para leer cada palabra de la frase por separado
			    
			    sonEspacios(frase); //Compruebo en el método sonEspacios si es una cadena vacía (Hay que darle, al menos, un espacio en blanco para esto)
			   
			    while (cadapalabra.hasNext()) { //El método hasNext() retorna true si  contiene más elementos.
				   String pigLatin = cadapalabra.next();//El método next retorna el siguiente elemento
				   System.out.print(convertirPalabra(pigLatin));//Pasamos cada elemento al método convertirPalabra() y los imprimimos
			    }
		    }catch(java.lang.StringIndexOutOfBoundsException e){//Maneja la excepción java.lang.StringIndexOutOfBoundsException
			    System.out.println();
				System.out.println("Error de sintaxis. Puede que hayas escrito algo mal... ");
				sintaxis = true;//Vuelve a repetir el do-while si entra en la excepción
				//input.nextLine();//Limpia el buffer
		    }
		    
		    //System.out.print(convertirPalabra(frase)); Con esto convertiríamos toda la frase como una única palabra
		} while (!cadenavacia || sintaxis);//Hacer mientras cadenavacia sea falso o mientras sintaxis sea verdadero
  
    }
    
    public static  void sonEspacios(String frase){//Este método nos permite saber si hemos introducido una cadena de espacios vacíos
	    for(int i =0; i<frase.length(); i++)//Recorre la longitud de la frase
	    if(frase.charAt(i) != ' '){//Si encuentra algún caracter que no sea un espacio en blanco pone "cadenavacia" en FALSE. De lo contrario en TRUE
	    	cadenavacia = false;
	    }else{
	    	cadenavacia = true;
	    }
    } 
    
    public static void intro() { //Método para mostrar la entrada de bienvenida del programa
	    System.out.println("\t\t~~~~~~~"+ "Bienvenido al traductor de Pig Latin!" + "~~~~~~~");
	    System.out.println("\t~~~~~~~"+ "Traduciremos la frase en el idioma que quieras a Pig Latin !!" + "~~~~~~~");
	    System.out.println();
     
    }
     
    public static String convertirPalabra(String palabra) {//Método para traducir según las reglas que nos piden
    	
	    int longitud = palabra.length();//Variable con la longitud de la palabra para escribir menos después
	    
	    if(palabra.charAt(0) < 65 || palabra.charAt(0) > 122){	//Si una palabra no comienza con una letra lo dejo igual
	    	return palabra + " ";//Devuelve la palabra tal cual sin añadirle nada
	    	
    	}else if (esVocal(palabra.charAt(0)) ||palabra.charAt(0) == 121 || palabra.charAt(0) == 89) {//Si es vocal o "y" o "Y"
	    	return (palabra + "yay"+" "); //Devuelve la palabra tal cual, añadiéndole "yay"
	    	
	    }else if (palabra.charAt(longitud - 1) == '.' || palabra.charAt(longitud - 1) == '!' || palabra.charAt(longitud - 1) == '?'|| palabra.charAt(longitud - 1) == ',') {
	    	//Si la palabara acaba en ".", "!" , "?" o ","
		    char ch = palabra.charAt(0); 
		    String resto = palabra.substring(1, longitud - 1);//la cadena RESTO es igual a la palabra quitándole el primer caracter(letra) y el último (!?.)
		    
		    if (palabra.charAt(0) >= 65 && palabra.charAt(0) <= 90) {//Si es una letra mayúscula
		    	String resto2 = resto.substring(1);//Nueva cadena quitando a RESTO el primer caracter
		    	char letra = resto.charAt(0);//Cogemos la primer caracter de RESTO y lo guardamos en LETRA
		    	letra = Character.toUpperCase(letra);//Pasamos LETRA a mayúscula
		    	ch = Character.toLowerCase(ch);//Pasamos la letra inicial original a minúscula
		    	return (letra + resto2 + ch + "ay"+ palabra.charAt(longitud - 1) +" ");
		    	//Devuelve en este orden: LETRA en mayúscula, más RESTO2, más la primera letra de la palabra original, más "ay", más el último caracter de la palabra original
		    	 
			}else{
		    return (resto + ch + "ay"+ palabra.charAt(longitud - 1) +" ");//Devuelve, en este orden, RESTO más el PRIMER CARACTER, más "ay" más el símbolo del final (!?.,)
			}
		    
	    }else if ((!esVocal(palabra.charAt(0)) && !esVocal(palabra.charAt(1)))) {//Si no son vocales ni el primer ni el segundo caracter
	    	char ch = palabra.charAt(0);
	    	char ch2 = palabra.charAt(1);
	        String resto = palabra.substring(2); //Quita los dos primeros caracteres y guarda el resto en la cadena RESTO
	        
	        if (palabra.charAt(0) >= 65 && palabra.charAt(0) <= 90) {
		    	String resto2 = resto.substring(1);
		    	char letra = resto.charAt(0);
		    	letra = Character.toUpperCase(letra);
		    	ch = Character.toLowerCase(ch);
		    	 return (letra + resto2 + ch + ch2 + "ay" +" ");
		    	 
			}else{
	        return (resto + ch + ch2 + "ay"+" ");//Devuelve la cadena RESTO, más los dos caracteres que ha quitado, más "ay"
			}
	        
	    }else {//En el resto de casos 
		    char ch = palabra.charAt(0);
		    String resto = palabra.substring(1); //la cadena RESTO es la palabra quitándole el primer caracter
		    
		    if (palabra.charAt(0) >= 65 && palabra.charAt(0) <= 90) {
		    	String resto2 = resto.substring(1);
		    	char letra = resto.charAt(0);
		    	letra = Character.toUpperCase(letra);
		    	ch = Character.toLowerCase(ch);
		    	 return (letra + resto2 + ch + "ay" +" ");
		    	 
			}else{
		    return (resto + ch + "ay"+" ");   //Devuelve en este orden: RESTO, más el primer caracter, más "ay"
			}
	    }
	     
    }

    public static boolean esVocal(char c) {//Método booleano para saber si hay una vocal
	    if (c == 'a' || c == 'A') {
	    	return (true);
	     
	    } else if (c == 'e' || c == 'E') {
	    	return (true);
	     
	    } else if (c == 'i' || c == 'I') {
	    	return (true);
	    	
	    } else if (c == 'o' || c == 'O') {
	    	return (true);
	     
	    } else if (c == 'u' || c == 'U') {
	    	return (true);
	     
	    } else {
	    	return (false);
	     
	    }
     
    }
     
   }
