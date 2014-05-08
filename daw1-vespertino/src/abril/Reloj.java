package abril;




import java.text.SimpleDateFormat; 

//import java.time.LocalDateTime; 

import java.util.ArrayList; 

import java.util.Date; 

 

/** 

 * 

 * @author lau 

 */ 

public class Reloj { 

    public static final String PIXEL="█"; 

    public static final String ESPACIO="░"; 

    public Boolean[][] mapaElementos(char elemento){ 

        Boolean[][] elementoView = new Boolean[5][5]; 

        switch(elemento){ 

            case '0': 

                llenaLineaHorizontal(elementoView, 0, 1, 2); 

                llenaLineaVertical(elementoView, 1, 1,2); 

                llenaLineaVertical(elementoView, 1,3,2); 

                llenaLineaHorizontal(elementoView, 4,1,2); 

                return elementoView; 

            case '1': 

                llenaLineaHorizontal(elementoView, 0,1,1); 

                llenaLineaVertical(elementoView, 1, 2, 2); 

                llenaLineaHorizontal(elementoView, 4, 1, 2); 

                return elementoView; 

            case '2': 

                llenaLineaHorizontal(elementoView, 0, 1, 2); 

                llenaLineaVertical(elementoView, 1, 3, 1); 

                llenaLineaHorizontal(elementoView, 2, 1, 1); 

                llenaLineaVertical(elementoView, 3, 1, 1); 

                llenaLineaHorizontal(elementoView, 4, 2, 1); 

                return elementoView; 

            case '3': 

                llenaLineaHorizontal(elementoView, 0, 1, 2); 

                llenaLineaVertical(elementoView, 1, 3, 1); 

                llenaLineaHorizontal(elementoView, 2, 1, 1); 

                llenaLineaVertical(elementoView, 3, 3, 1); 

                llenaLineaHorizontal(elementoView, 4, 1, 1); 

                return elementoView; 

            case '4': 

                llenaLineaVertical(elementoView, 0, 0, 2); 

                llenaLineaHorizontal(elementoView, 2, 0, 2); 

                llenaLineaVertical(elementoView, 0, 2, 4); 

                return elementoView; 

            case '5': 

                llenaLineaHorizontal(elementoView, 0, 1, 2); 

                llenaLineaVertical(elementoView, 1, 1, 1); 

                llenaLineaHorizontal(elementoView, 2, 1, 2); 

                llenaLineaVertical(elementoView, 3, 3, 1); 

                llenaLineaHorizontal(elementoView, 4, 1, 2); 

                return elementoView; 

            case '6': 

                llenaLineaHorizontal(elementoView, 0, 1, 2); 

                llenaLineaVertical(elementoView, 1, 1, 3); 

                llenaLineaHorizontal(elementoView, 2, 1, 2); 

                llenaLineaVertical(elementoView, 3, 3, 1); 

                llenaLineaHorizontal(elementoView, 4, 1, 2); 

                return elementoView; 

            case '7': 

                llenaLineaHorizontal(elementoView, 0, 1, 2); 

                llenaLineaVertical(elementoView, 1,3,3); 

                return elementoView; 

            case '8': 

                llenaLineaHorizontal(elementoView, 0, 1, 2); 

                llenaLineaVertical(elementoView, 1, 1,2); 

                llenaLineaVertical(elementoView, 1,3,2); 

                llenaLineaHorizontal(elementoView, 4,1,2); 

                llenaLineaHorizontal(elementoView, 2, 2, 1); 

                return elementoView; 

            case '9': 

                llenaLineaHorizontal(elementoView, 0, 1, 2); 

                llenaLineaVertical(elementoView, 1, 1,1); 

                llenaLineaVertical(elementoView, 1,3,3); 

                llenaLineaHorizontal(elementoView, 2, 2, 1); 

                return elementoView; 

            case ':': 

                llenaLineaVertical(elementoView, 1, 2, 0); 

                llenaLineaVertical(elementoView, 3, 2, 0); 

                return elementoView; 

            case '/': 

                llenaLineaVertical(elementoView, 0, 4, 0); 

                llenaLineaVertical(elementoView, 1, 3, 0); 

                llenaLineaVertical(elementoView, 2, 2, 0); 

                llenaLineaVertical(elementoView, 3, 1, 0); 

                llenaLineaVertical(elementoView, 4, 0, 0); 

                return elementoView; 

        } 

        return null; 

    } 

    private void llenaLineaVertical(Boolean[][] mapaElemento,int x,int y,int length){ 

        for(int i = x; i <= x+length; i ++){ 

            mapaElemento[i][y]=true; 

        } 

    } 

     

    private void llenaLineaHorizontal(Boolean[][] mapaElemento, int x, int y, int length){ 

        for(int i = y; i <= y+length; i++){ 

            mapaElemento[x][i]=true; 

        } 

    } 

     

    public String horaChar(long date){ 

        ArrayList<Boolean[][]> list = new ArrayList<Boolean[][]>(); 

        StringBuilder strBr =new StringBuilder(); 

        Date dt = new Date(date); 

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 

        String fecha = sdf.format(dt); 

        for(char ch:fecha.toCharArray()){ 

            list.add(mapaElementos(ch)); 

        } 

        for(int i = 0; i < 5; i ++) { 

            for(Boolean[][] charDate:list){ 

                if(charDate!=null&&charDate[i]!=null) { 

                    llenarStr(strBr, charDate[i]); 

                } 

            } 

            strBr.append("\n"); 

        } 

        return strBr.toString(); 

    } 

     

    private void llenarStr(StringBuilder strB, Boolean charB[]){ 

        for(int y = 0; y<charB.length; y++){ 

            if(charB[y]!=null&&charB[y]) { 

                strB.append(Reloj.PIXEL); 

            } else { 

                strB.append(Reloj.ESPACIO); 

            } 

        } 

    } 

    public static void main(String[] args) {
    	Reloj reloj = new Reloj(); System.out.println(reloj.horaChar(new Date().getTime())); 
    	}   

} 