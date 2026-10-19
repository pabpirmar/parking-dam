package ies.puerto;

import java.util.Scanner;

/**
 * @author Pablo
 * @version 1.0.0
 */

public class Parking {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        float tarifaHora = 1.50f;
        int totalVehiculos = 0;
        int totalHorasRegistradas = 0;
        int totalCalculosTarifa = 0;
        float importeTotalCalculado = 0f;

        System.out.println("=================================\n" +
                "        PARKING-DAM\n" +
                "=================================");

        System.out.println("Introduzca su nombre: ");
        String nombre = teclado.nextLine();

        do {
            System.out.println("1. Registrar vehículos");
            System.out.println("2. Calcular tarifa de estacionamiento");
            System.out.println("3. Mostrar resumen del día");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

        }while (opcion != 4);

        switch (opcion) {

            case 1:
                System.out.print("¿Cuántos vehículos quieres registrar?: ");
                int cantidad = teclado.nextInt();
                teclado.nextLine();

                while (cantidad <= 0) {
                    System.out.println("Debe ser un entero positivo");
                    System.out.print("¿Cuántos vehículos quieres registrar?: ");
                    cantidad = teclado.nextInt();
                    teclado.nextLine();
                }

                for (int i = 1; i <= cantidad; i++) {
                    System.out.println("Vehículo " + i);

                    System.out.print("Matrícula: ");
                    String matricula = teclado.nextLine();

                    System.out.print("Horas estacionadas: ");
                    float horas = teclado.nextFloat();
                    teclado.nextLine();

                    while (horas <= 0) {
                        System.out.println("Las horas deben ser mayores que 0");
                        System.out.print("Horas estacionadas: ");
                        horas = teclado.nextFloat();
                        teclado.nextLine();
                    }

                    totalVehiculos++;
                    totalHorasRegistradas += horas;
                }

                System.out.println("Vehículos registrados en esta operación: " + cantidad);
                break;
        }
        // 4. Llamar a tus métodos y actualizar acumuladores.
        // 5. Cerrar Scanner al salir.

        teclado.close();
    }

    // Escribe aquí tus métodos.
}
