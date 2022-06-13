package EjerciciosComplementariosLevel1;

import java.util.*;

public class Ejercicio7 {
        
	public static void main(String[] args) {
    	System.out.println("Ingrese un String");
    	
    	Scanner scan = new Scanner(System.in);
    	String texto = scan.nextLine();
    	scan.close();
        
    	Ejercicio7.mayusculas(texto);

    }
	static int i;

    static void mayusculas(String txt) {
        for(i=0;i<txt.length();i++) {
            int ch=txt.charAt(i);
            if(ch>64&&ch<91) {
                System.out.print( (char) ch);
            }
            else if(ch>96&&ch<123) {
                ch=ch-32;
                System.out.print( (char) ch);
            }
            if(ch==32)
            System.out.print(" ");
        }
    }


}