package classification;

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
                    System.out.println("Vehiculos Lanzadera\n"
                            + "1. Saturno V\n"
                            + "2. Energía\n"
                            + "3. Ariane V\n");

                    int shuttleShips = scanner.nextInt();

                    switch (shuttleShips) {
                        case 1:
                            Shuttle shuttle1 = new Shuttle(" Saturno V ", " EE.UU ", 1973, "Retirado", 4000, 2500, 1000);
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
                            Shuttle shuttle2 = new Shuttle(" Energía ", " Rusia/Ucrania ", 1987, "Retirado", 4000, 2500, 1000);
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
                            Shuttle shuttle3 = new Shuttle(" Ariane v ", " Europa ", 1996, "Vigente", 4000, 2500, 1000);
                            System.out.println("---------------------Información clasificada---------------------");
                            shuttle3.purpose();
                            System.out.println(shuttle3.getName()
                                    + " fue la primera lanzadera fabricada : " + shuttle3.getMaker());
                            System.out.println("------------------------Datos de la nave------------------");
                            System.out.println("Esta nave fue lanzada en el año de: " + shuttle3.getLaunchYear()
                                    + "\nactualmente se encuentra: " + shuttle3.getActualState());
                            shuttle3.fuelType();
                            break;

                    }

            }


        } while (selecciony == 1);
    }
}
