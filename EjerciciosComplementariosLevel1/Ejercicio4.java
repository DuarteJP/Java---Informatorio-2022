package EjerciciosComplementariosLevel1;

import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		System.out.println("Ingresa un n�mero entero:");

	    Scanner scan = new Scanner(System.in);
	    int numero = scan.nextInt();
	    scan.close();

	    int resultado = factorial(numero);
	    System.out.println(String.format("El facotrial de %s es: %s", numero, resultado));

	}
	private static int factorial(int nro) {
		if (nro <= 1)
		return nro;
	    return nro * factorial(nro - 1);
	    }
}
