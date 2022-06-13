package EjerciciosComplementariosLevel2;

import java.util.*;

public class Ejercicio7 {

	public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de inicio: ");
        int numero1 = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Ingrese el numero final: ");
        int numero2 = scan.nextInt();
        scan.close();
        
        fizzBuzz(numero1, numero2);


	}
	public static void fizzBuzz(int numero1, int numero2) {
	        for (int i = numero1; i < numero2; i++){
	        	if(i%2==0 && i%3 == 0) {
	        		System.out.println("-FizzBuzz");
	        	}
	        	else if (i%3 == 0) {
	        		System.out.println("-Buzz");
	        	}
	        	else if(i%2 == 0) {
         		  	System.out.println("-Fizz");
	        	}
	        	else {
	        		System.out.println("-" + i);
            	}
	        }
	}
}
