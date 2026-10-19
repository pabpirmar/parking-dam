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
        float totalHorasRegistradas = 0;
        int totalCalculosTarifa = 0;
        float importeTotalCalculado = 0f;
        float resultado = 0;

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
                    int horas = teclado.nextInt();
                    teclado.nextLine();

                    while (horas <= 0) {
                        System.out.println("Las horas deben ser mayores que 0");
                        System.out.print("Horas estacionadas: ");
                        horas = teclado.nextInt();
                        teclado.nextLine();
                    }

                    totalVehiculos++;
                    resultado = sumarHoras(totalHorasRegistradas, horas);
                    totalHorasRegistradas = (int) resultado;
                }

                System.out.println("Vehículos registrados en esta operación: " + cantidad);
                break;

            case 2:
                int horasTarifa = 0;

                System.out.print("Horas para calcular la tarifa: ");
                horasTarifa = teclado.nextInt();
                teclado.nextLine();

                while (horasTarifa <= 0) {
                    System.out.println("Las horas deben ser mayores que 0");
                    System.out.print("Horas para calcular la tarifa: ");
                    horasTarifa = teclado.nextInt();
                    teclado.nextLine();
                }

                resultado = calcularTarifa(horasTarifa, tarifaHora);

                totalCalculosTarifa++;
                importeTotalCalculado += resultado;

                System.out.println("Importe: " + resultado + " euros");
                break;

            case 3:
                System.out.println("Usuario: " + nombre);
                System.out.println("Vehículos registrados: " + totalVehiculos);
                System.out.println("Horas registradas: " + totalHorasRegistradas);
                System.out.println("Cálculos de tarifas: " + totalCalculosTarifa);
                System.out.println("Importe total calculado: " + importeTotalCalculado + " euros");
                break;

            case 4:
                System.out.println("Gracias por utilizar PARKING DAM-PRO");
                teclado.close();
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }

        teclado.close();
    }

    /**
     * Suma las horas registradas acumuladas.
     *
     * @param acumulado horas acumuladas hasta el momento
     * @param nuevasHoras nuevas horas del vehiculo
     * @return total de horas acumuladas
     */
    public static float sumarHoras(float acumulado, float nuevasHoras) {
        return acumulado + nuevasHoras;
    }

    /**
     * Calcula el importe total de un estacionamiento.
     *
     * Multiplica el numero de horas por el precio de una hora.
     *
     * @param horas numero de horas de estacionamiento
     * @param tarifaHora precio por cada hora de estacionamiento
     * @return importe total calculado
     */
    public static float calcularTarifa(int horas, float tarifaHora) {
        return horas * tarifaHora;
    }

}
