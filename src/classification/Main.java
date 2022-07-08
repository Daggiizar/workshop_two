package classification;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int seleccion = 0;
        int selecciony = 0;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println(" Bienvenido explorador! Escoja el tipo de vehiculo espacial a conocer\n"
                    + "1. Lanzadera\n"
                    + "2. Tripulados\n"
                    + "3. No Tripulados\n"
                    + "5. Salir\n");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido aca se encuentran los vehículos Lanzadera mas fuertes\n"
                            + "1. Saturno V\n"
                            + "2. Energía\n"
                            + "3. Ariane V\n"
                            + "4. H-IIA");

                    int shuttleShips = scanner.nextInt();

                    switch (shuttleShips) {
                        case 1:
                            Shuttle shuttle1 = new Shuttle("Saturno V", "EE.UU", 1967, "Retirado", 3500, 2900, 118);
                            System.out.println("---------------------Información clasificada---------------------");
                            shuttle1.purpose();
                            System.out.println("La primera Lanzadera fue " + shuttle1.getName()
                                    + " Fabricada en " + shuttle1.getMaker());
                            System.out.println("------------------------Datos de la nave------------------");
                            System.out.println("Esta nave fue lanzada en el año de: " + shuttle1.getLaunchYear()
                                    + "\nactualmente se encuentra: " + shuttle1.getActualState());
                            shuttle1.fuelType();
                            break;
                        case 2:
                            Shuttle shuttle2 = new Shuttle("Energía", "Rusia/Ucrania", 1987, "Retirado", 3060, 2400, 100);
                            System.out.println("---------------------Información clasificada---------------------");
                            shuttle2.purpose();
                            System.out.println("La segunda Lanzadera fue " + shuttle2.getName()
                                    + " Fabricada en " + shuttle2.getMaker());
                            System.out.println("------------------------Datos de la nave------------------");
                            System.out.println("Esta nave fue lanzada en el año de: " + shuttle2.getLaunchYear()
                                    + "\nactualmente se encuentra: " + shuttle2.getActualState());
                            shuttle2.fuelType();
                            break;
                        case 3:
                            Shuttle shuttle3 = new Shuttle("Ariane v", "Europa", 1996, "Vigente", 4000, 2500, 178);
                            System.out.println("---------------------Información clasificada---------------------");
                            shuttle3.purpose();
                            System.out.println(shuttle3.getName()
                                    + " fue la primera lanzadera fabricada en " + shuttle3.getMaker());
                            System.out.println("------------------------Datos de la nave------------------");
                            System.out.println("Esta nave fue lanzada en el año de: " + shuttle3.getLaunchYear()
                                    + "\nactualmente se encuentra: " + shuttle3.getActualState());
                            shuttle3.fuelType();
                            break;
                        case 4:
                            Shuttle shuttle4 = new Shuttle("H-IIA", "Japón", 2001, "Vigente", 3800, 2700, 180);
                            JOptionPane.showMessageDialog(null,"---------------------Información clasificada---------------------");
                            shuttle4.purpose();
                            System.out.println(shuttle4.getName()
                                    + " fue la primera lanzadera fabricada en " + shuttle4.getMaker());
                            System.out.println("------------------------Datos de la nave------------------");
                            System.out.println("Esta nave fue lanzada en el año de: " + shuttle4.getLaunchYear()
                                    + "\nactualmente se encuentra: " + shuttle4.getActualState());
                            shuttle4.fuelType();
                            break;
                        default:
                            System.out.println("seleccione la opcion correcta");
                            break;
                    }
            }
            break;

        } while (selecciony == 1);
    }
}
