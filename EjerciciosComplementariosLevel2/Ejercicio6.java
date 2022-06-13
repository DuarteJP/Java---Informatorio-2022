package EjerciciosComplementariosLevel2;

import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
       
    	Set<Empleado> empleados = new HashSet<>();
        Map<Integer, Integer> mapDniSueldo = new HashMap<Integer, Integer>();
        empleados.add(new Empleado(11111111, "Juan P�rez", 150, 375));
        empleados.add(new Empleado(22222222, "John Doe", 170, 430));
        empleados.add(new Empleado(33333333, "Natalia Natalia", 160, 420));
        empleados.add(new Empleado(44444444, "Fulano Gonzales", 145, 410));
        empleados.add(new Empleado(55555555, "Mengano Rodr�guez", 135, 400));
        empleados.add(new Empleado(66666666, "Jane Doe", 150, 380));

        for (Empleado i:empleados){
            int sueldo = i.getValorHora() * i.getHorasTrabajadas();
            mapDniSueldo.put(i.getDni(), sueldo);
            System.out.println("-------------------------\n"
            		+ "Nombre: " + i.getNombre() + "\nDNI: " + i.getDni() + "\nSueldo: " + sueldo);
        }
    }

    static class Empleado {
        private Integer dni;
        private String nombreApellido;
        private Integer horasTrabajadas;
        private Integer valorXHora;

        public Empleado(Integer dni, String nombreApellido, Integer horasTrabajadas, Integer valorXHora){
            this.dni = dni;
            this.nombreApellido = nombreApellido;
            this.horasTrabajadas = horasTrabajadas;
            this.valorXHora = valorXHora;
        }

        public Integer getDni() {
            return dni;
        }

        public String getNombre() {
            return nombreApellido;
        }
        
        public Integer getHorasTrabajadas() {
            return horasTrabajadas;
        }

        public Integer getValorHora() {
            return valorXHora;
        }
    }
}