package classification;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int seleccion = 0;
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
                            + "4. H-IIA\n");

                    int shuttleShips = scanner.nextInt();

                    switch (shuttleShips) {
                        case 1:
                            Shuttle shuttle1 = new Shuttle(
                                    "Saturno V",
                                    "EE.UU",
                                    1967,
                                    "Retirado",
                                    3500,
                                    2900,
                                    118
                            );
                            JOptionPane.showMessageDialog(null," ¡Información clasificada! ");
                            shuttle1.purpose();
                            System.out.println("La primera Lanzadera fue " + shuttle1.getName()
                                    + " Fabricada en " + shuttle1.getMaker());
                            System.out.println("------------------------Datos de la nave------------------");
                            System.out.println("Esta nave fue lanzada en el año de: " + shuttle1.getLaunchYear()
                                    + "\nactualmente se encuentra: " + shuttle1.getActualState());
                            shuttle1.fuelType();
                            break;
                        case 2:
                            Shuttle shuttle2 = new Shuttle(
                                    "Energía",
                                    "Rusia/Ucrania",
                                    1987,
                                    "Retirado",
                                    3060,
                                    2400,
                                    100
                            );
                            JOptionPane.showMessageDialog(null," ¡Información clasificada! ");
                            shuttle2.purpose();
                            System.out.println("La segunda Lanzadera fue " + shuttle2.getName()
                                    + " Fabricada en " + shuttle2.getMaker());
                            System.out.println("------------------------Datos de la nave------------------");
                            System.out.println("Esta nave fue lanzada en el año de: " + shuttle2.getLaunchYear()
                                    + "\nactualmente se encuentra: " + shuttle2.getActualState());
                            shuttle2.fuelType();
                            break;
                        case 3:
                            Shuttle shuttle3 = new Shuttle(
                                    "Ariane v",
                                    "Europa",
                                    1996,
                                    "Vigente",
                                    4000,
                                    2500,
                                    178
                            );
                            JOptionPane.showMessageDialog(null," ¡Información clasificada! ");
                            shuttle3.purpose();
                            System.out.println(shuttle3.getName()
                                    + " fue la primera lanzadera fabricada en " + shuttle3.getMaker());
                            System.out.println("------------------------Datos de la nave------------------");
                            System.out.println("Esta nave fue lanzada en el año de: " + shuttle3.getLaunchYear()
                                    + "\nactualmente se encuentra: " + shuttle3.getActualState());
                            shuttle3.fuelType();
                            break;
                        case 4:
                            Shuttle shuttle4 = new Shuttle(
                                    "H-IIA",
                                    "Japón",
                                    2001,
                                    "Vigente",
                                    3800,
                                    2700,
                                    180
                            );
                            JOptionPane.showMessageDialog(null," ¡Información clasificada! ");
                            System.out.println("------------------------Contenido clasificado------------------");
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
                    break;

                case 2:
                    System.out.println("Bienvenido aca se encuentran los vehículos tripulados más importantes \n"
                            + "1. Skylab\n"
                            + "2. Salyut\n"
                            + "3. EEI\n"
                            + "4. Shenzou\n");

                    int mannedShips = scanner.nextInt();

                    switch (mannedShips){
                        case 1:
                            Manned manned1 = new Manned(
                                    "Skylab",
                                    "EE.UU.",
                                    1973,
                                    "Retirado",
                                    3,
                                    "experimentación",
                                    435
                            );
                            JOptionPane.showMessageDialog(null," ¡Información clasificada! ");
                            System.out.println("------------------------Contenido clasificado------------------");
                            manned1.purpose();
                            System.out.println(manned1.getName()
                                    + " fue la primera lanzadera fabricada en " + manned1.getMaker());
                            System.out.println("------------------------Datos de la nave------------------");
                            System.out.println("Esta nave fue lanzada en el año de: " + manned1.getLaunchYear()
                                    + "\nactualmente se encuentra: " + manned1.getActualState());
                            manned1.fuelType();
                            break;
                        case 2:
                            Manned manned2 = new Manned(
                                    "Salyut",
                                    "Rusia",
                                    1982,
                                    "Retirado",
                                    3,
                                    "estudio del comportamiento humano en condiciones ingrávidas",
                                    248.9
                            );
                            JOptionPane.showMessageDialog(null," ¡Información clasificada! ");
                            System.out.println("------------------------Contenido clasificado------------------");
                            manned2.purpose();
                            System.out.println(manned2.getName()
                                    + " fue la primera lanzadera fabricada en " + manned2.getMaker());
                            System.out.println("------------------------Datos de la nave------------------");
                            System.out.println("Esta nave fue lanzada en el año de: " + manned2.getLaunchYear()
                                    + "\nactualmente se encuentra: " + manned2.getActualState());
                            manned2.fuelType();
                            break;
                        case 3:
                            Manned manned3 = new Manned(
                                    "EEI",
                                    "Proyecto Internacional",
                                    1998,
                                    "Vigente",
                                    7,
                                    "mantenimiento satelites, acoplamientos con otras naves y equipos electrónicos",
                                    386
                            );
                            JOptionPane.showMessageDialog(null," ¡Información clasificada! ");
                            System.out.println("------------------------Contenido clasificado------------------");
                            manned3.purpose();
                            System.out.println(manned3.getName()
                                    + " fue la primera lanzadera fabricada en " + manned3.getMaker());
                            System.out.println("------------------------Datos de la nave------------------");
                            System.out.println("Esta nave fue lanzada en el año de: " + manned3.getLaunchYear()
                                    + "\nactualmente se encuentra: " + manned3.getActualState());
                            manned3.fuelType();
                            break;
                        case 4:
                            Manned manned4 = new Manned(
                                    "Shenzou",
                                    "China",
                                    1999,
                                    "Vigente",
                                    3,
                                    "misiones lunares",
                                    395
                            );
                            JOptionPane.showMessageDialog(null," ¡Información clasificada! ");
                            System.out.println("------------------------Contenido clasificado------------------");
                            manned4.purpose();
                            System.out.println(manned4.getName()
                                    + " fue la primera lanzadera fabricada en " + manned4.getMaker());
                            System.out.println("------------------------Datos de la nave------------------");
                            System.out.println("Esta nave fue lanzada en el año de: " + manned4.getLaunchYear()
                                    + "\nactualmente se encuentra: " + manned4.getActualState());
                            manned4.fuelType();
                            break;
                    }
            }

        } while (seleccion != 5);
    }
}
