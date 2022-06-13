package EjerciciosComplementariosLevel1;

import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.println("Ingrese 2 n�meros distintos de 0");
		
		Scanner scan = new Scanner(System.in);
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		scan.close();
		
		int resultado = numero1;
		if ((numero1 != 0) && (numero2 != 0)) {
			for (int i = 1; i < numero2; i++) {
				resultado *= numero1;
			}
			
			System.out.println(String.format("%s elevado a %s = %s", numero1,numero2,resultado));
		}
		
		else {
			System.out.println("No ingres� valores v�lidos");
		}
	}
}