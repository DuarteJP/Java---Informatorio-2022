package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]) {
        List<String> ciudades = new ArrayList<>();
        String agregarOtra;
        do {
            System.out.print("Ingrese una Ciudad Favorita: ");
            Scanner scan = new Scanner(System.in);
            String ciudad = scan.nextLine();
            ciudades.add(ciudad);
            System.out.println("Quiere ingresar otra ciudad? Si o No");
            agregarOtra = scan.nextLine();
        }
        while(agregarOtra.toLowerCase().equals("si"));
        System.out.println("Tus Ciudades favoritas son:");
        for (int i = 0; i < ciudades.size(); i++) {
            String ciudad = ciudades.get(i);
            System.out.println(String.format("#%s - %s",(i+1),ciudad));
        }
    }
}
