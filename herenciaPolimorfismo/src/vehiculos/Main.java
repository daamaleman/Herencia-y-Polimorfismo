package vehiculos;

import java.util.ArrayList;
import java.util.Scanner;

 // Clase principal Main que demuestra el polimorfismo.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar Carro");
            System.out.println("2. Agregar Moto");
            System.out.println("3. Agregar Camion");
            System.out.println("4. Mostrar todos los vehículos (demostrar polimorfismo)");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la marca del Carro:");
                    String marcaCarro = sc.nextLine();
                    System.out.println("Ingrese el modelo del Carro:");
                    String modeloCarro = sc.nextLine();
                    vehiculos.add(new Carro(marcaCarro, modeloCarro));
                    System.out.println("Carro agregado.");
                    break;
                case 2:
                    System.out.println("Ingrese la marca de la Moto:");
                    String marcaMoto = sc.nextLine();
                    System.out.println("Ingrese el modelo de la Moto:");
                    String modeloMoto = sc.nextLine();
                    vehiculos.add(new Moto(marcaMoto, modeloMoto));
                    System.out.println("Moto agregada.");
                    break;
                case 3:
                    System.out.println("Ingrese la marca del Camion:");
                    String marcaCamion = sc.nextLine();
                    System.out.println("Ingrese el modelo del Camion:");
                    String modeloCamion = sc.nextLine();
                    vehiculos.add(new Camion(marcaCamion, modeloCamion));
                    System.out.println("Camion agregado.");
                    break;
                case 4:
                    if (vehiculos.isEmpty()) {
                        System.out.println("No hay vehículos agregados.");
                    } else {
                        System.out.println("\nDemostrando polimorfismo con mover():");
                        for (Vehiculo vehiculo : vehiculos) {
                            vehiculo.mover();
                        }

                        System.out.println("\nDemostrando polimorfismo con recargar() (solo para vehículos con combustible):");
                        for (Vehiculo vehiculo : vehiculos) {
                            if (vehiculo instanceof Combustible) {
                                ((Combustible) vehiculo).recargar();
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);

        sc.close();
    }
}