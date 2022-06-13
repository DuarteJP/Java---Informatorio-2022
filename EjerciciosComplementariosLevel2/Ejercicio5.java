package EjerciciosComplementariosLevel2;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> horasTrabajadas = new ArrayList<>();
		ArrayList<Integer> valorPorHora = new ArrayList<>();
		ArrayList<Integer> totalFinal = new ArrayList<>();
		
		
		horasTrabajadas.add(6);
		horasTrabajadas.add(7);
		horasTrabajadas.add(8);
		horasTrabajadas.add(4);
		horasTrabajadas.add(5);
		valorPorHora.add(350);
		valorPorHora.add(345);
		valorPorHora.add(550);
		valorPorHora.add(600);
		valorPorHora.add(320);

		
		for (Integer i = 0; i < horasTrabajadas.size(); i++) {
			totalFinal.add(horasTrabajadas.get(i)*valorPorHora.get(i));
		}
		
		System.out.println(totalFinal);
		
		long totalACobrar= totalFinal.stream()
			      .mapToLong(o -> o)
			      .sum();
			System.out.println("Total Final: $ "+totalACobrar);
		

	}

}
