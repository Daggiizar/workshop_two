package classification;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int seleccion = 0;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido acá econtrara información clasificada sobre las naves espaciales mas grandes de la historia\n"
                    + "Seleccione la nave que desea conocer\n"
                    + "1. Lanzadera\n"
                    + "2. Tripulados\n"
                    + "3. No Tripulados\n"
                    + "4. Salir\n");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Estas son las naves lanzadera mas fuertes\n"
                            + "Seleccione la nave que desea conocer\n"
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
                            JOptionPane.showMessageDialog(null, " ¡Información clasificada! ");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            System.out.println("La primera Lanzadera fue " + shuttle1.getName()
                                    + " Fabricada en " + shuttle1.getMaker());
                            shuttle1.purpose();
                            System.out.println("Esta nave fue lanzada en el año de: " + shuttle1.getLaunchYear()
                                    + "\nactualmente se encuentra: " + shuttle1.getActualState()
                                    + "\nEl peso de este gigante era de:  " + shuttle1.getShipWeight() + " Toneladas"
                                    + "\nSu empuje era de: " + shuttle1.getPush() + " Toneladas"
                                    + "\nTenia una capacidad de transporte de: " + shuttle1.getLoadWeight() + " Toneladas"
                                    );
                            shuttle1.fuelType();
                            System.out.println("");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
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
                            JOptionPane.showMessageDialog(null, " ¡Información clasificada! ");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            System.out.println("La lanzadera " + shuttle2.getName()
                                    + " fue fabricada entre " + shuttle2.getMaker());
                            shuttle2.purpose();
                            System.out.println("Esta nave fue lanzada en el año de: " + shuttle2.getLaunchYear()
                                    + "\nactualmente se encuentra: " + shuttle2.getActualState()
                                    + "\nEl peso de este gigante era de:  " + shuttle2.getShipWeight() + " Toneladas"
                                    + "\nSu empuje era de: " + shuttle2.getPush() + " Toneladas"
                                    + "\nTenia una capacidad de transporte de: " + shuttle2.getLoadWeight() + " Toneladas"
                            );
                            shuttle2.fuelType();
                            System.out.println("");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
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
                            JOptionPane.showMessageDialog(null, " ¡Información clasificada! ");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            System.out.println("La lanzadera " + shuttle3.getName()
                                    + " fue fabricada por " + shuttle3.getMaker());
                            shuttle3.purpose();
                            System.out.println("Esta nave fue lanzada en el año de: " + shuttle3.getLaunchYear()
                                    + "\nactualmente se encuentra: " + shuttle3.getActualState()
                                    + "\nEl peso de este gigante era de:  " + shuttle3.getShipWeight() + " Toneladas"
                                    + "\nSu empuje era de: " + shuttle3.getPush() + " Toneladas"
                                    + "\nTenia una capacidad de transporte de: " + shuttle3.getLoadWeight() + " Toneladas"
                            );
                            shuttle3.fuelType();
                            System.out.println("");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
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
                            JOptionPane.showMessageDialog(null, " ¡Información clasificada! ");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            System.out.println("La lanzadera " + shuttle4.getName()
                                    + " fue fabricada por " + shuttle4.getMaker());
                            shuttle4.purpose();
                            System.out.println("Esta nave fue lanzada en el año de: " + shuttle4.getLaunchYear()
                                    + "\nactualmente se encuentra: " + shuttle4.getActualState()
                                    + "\nEl peso de este gigante era de:  " + shuttle4.getShipWeight() + " Toneladas"
                                    + "\nSu empuje era de: " + shuttle4.getPush() + " Toneladas"
                                    + "\nTenia una capacidad de transporte de: " + shuttle4.getLoadWeight() + " Toneladas"
                            );
                            shuttle4.fuelType();
                            System.out.println("");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            break;
                        default:
                            System.out.println("La opción no existe");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Estas son las principales naves tripuladas \n"
                            + "Seleccione la nave que desea conocer\n"
                            + "1. Skylab\n"
                            + "2. Salyut\n"
                            + "3. EEI\n"
                            + "4. Shenzou\n");

                    int mannedShips = scanner.nextInt();

                    switch (mannedShips) {
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
                            JOptionPane.showMessageDialog(null, " ¡Información clasificada! ");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            System.out.println(manned1.getName() + " es una de las primeras naves tripuladas "
                                    + " construida por " + manned1.getMaker());
                            manned1.purpose();
                            System.out.println("Esta nave fue lanzada en el año de: " + manned1.getLaunchYear()
                                    + "\nActualmente se encuentra: " + manned1.getActualState());
                            System.out.println("Su principal objetivo era la: " + manned1.getObjective()
                                    + "\nOrbitaba a: " + manned1.getOrbitDistance() + "Km"
                                    + "\nSu capacidad era de: " + manned1.getPassengerCapacity() + " pasajeros"
                                     );
                            manned1.fuelType();
                            System.out.println("");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
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
                            JOptionPane.showMessageDialog(null, " ¡Información clasificada! ");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            System.out.println(manned2.getName() + " es una de las primeras naves tripuladas "
                                    + " construida por " + manned2.getMaker());
                            manned2.purpose();
                            System.out.println("Esta nave fue lanzada en el año de: " + manned2.getLaunchYear()
                                    + "\nActualmente se encuentra: " + manned2.getActualState());
                            System.out.println("Su principal objetivo era la: " + manned2.getObjective()
                                    + "\nOrbitaba a: " + manned2.getOrbitDistance() + "Km"
                                    + "\nSu capacidad era de: " + manned2.getPassengerCapacity() + " pasajeros"
                            );
                            manned2.fuelType();
                            System.out.println("");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
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
                            JOptionPane.showMessageDialog(null, " ¡Información clasificada! ");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            System.out.println(manned3.getName() + " es una de las primeras naves tripuladas "
                                    + "construida en un " + manned3.getMaker());
                            manned3.purpose();
                            System.out.println("Esta nave fue lanzada en el año de: " + manned3.getLaunchYear()
                                    + "\nActualmente se encuentra: " + manned3.getActualState());
                            System.out.println("Su principal objetivo era la: " + manned3.getObjective()
                                    + "\nOrbitaba a: " + manned3.getOrbitDistance() + "Km"
                                    + "\nSu capacidad era de: " + manned3.getPassengerCapacity() + " pasajeros"
                            );
                            manned3.fuelType();
                            System.out.println("");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
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
                            JOptionPane.showMessageDialog(null, " ¡Información clasificada! ");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            System.out.println(manned4.getName() + " es una de las primeras naves tripuladas "
                                    + "construida por " + manned4.getMaker());
                            manned4.purpose();
                            System.out.println("Esta nave fue lanzada en el año de: " + manned4.getLaunchYear()
                                    + "\nActualmente se encuentra: " + manned4.getActualState());
                            System.out.println("Su principal objetivo era la: " + manned4.getObjective()
                                    + "\nOrbitaba a: " + manned4.getOrbitDistance() + "Km"
                                    + "\nSu capacidad era de: " + manned4.getPassengerCapacity() + " pasajeros"
                            );
                            manned4.fuelType();
                            System.out.println("");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            break;
                        default:
                            System.out.println("La opción no existe");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Bienvenido acá se encuentran los vehículos no tripulados más importantes \n"
                            + "1. Cassini-Huygens\n"
                            + "2. Salyut\n"
                            + "3. EEI\n"
                            + "4. Shenzou\n");

                    int unmannedShips = scanner.nextInt();

                    switch (unmannedShips) {
                        case 1:
                            Unmanned unmanned1 = new Unmanned(
                                    "Cassini-Huygens",
                                    "EE.UU. ESA/ASI",
                                    1997,
                                    "Vigente",
                                    "18000 Km/h",
                                    7
                            );
                            JOptionPane.showMessageDialog(null, " ¡Información clasificada! ");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            System.out.println("La sonda " + unmanned1.getName()
                                    + " fue un proyecto ejecutado conjuntamente por " + unmanned1.getMaker());
                            unmanned1.purpose();
                            System.out.println("Esta nave fue lanzada en el año de: " + unmanned1.getLaunchYear()
                                    + "\nActualmente se encuentra: " + unmanned1.getActualState()
                                    + "\nCuerpo celeste estudiado: " + "Saturno y sus lunas"
                                    + "\nSe desplazo a: " + unmanned1.getSpeed()
                                    + "\nTardo casi " + unmanned1.getYearArrive() + " años en llegar a su destino");
                            unmanned1.fuelType();
                            System.out.println("");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            break;
                        case 2:
                            Unmanned unmanned2 = new Unmanned(
                                    "Pionero X",
                                    "EE.UU.",
                                    1972,
                                    "Vigente",
                                    "se desplaza de forma inercial",
                                    4000000
                            );
                            JOptionPane.showMessageDialog(null, " ¡Información clasificada! ");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            System.out.println("La sonda " + unmanned2.getName()
                                    + " fue un proyecto ejecutado por " + unmanned2.getMaker());
                            unmanned2.purpose();
                            System.out.println("Esta nave fue lanzada en el año de: " + unmanned2.getLaunchYear()
                                    + "\nActualmente se encuentra: " + unmanned2.getActualState()
                                    + "\nCuerpo celeste estudiado: " + "Júpiter"
                                    + "\nSe quedo sin energía y " + unmanned2.getSpeed()
                                    + "\nSe estima que llegara dentro de " + unmanned2.getYearArrive() + " años ");
                            unmanned2.fuelType();
                            System.out.println("");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            break;
                        case 3:
                            Unmanned unmanned3 = new Unmanned(
                                    "New Horizons",
                                    "EE.UU.",
                                    2006,
                                    "Vigente",
                                    "56000 Km/h",
                                    9
                            );
                            JOptionPane.showMessageDialog(null, " ¡Información clasificada! ");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            System.out.println("La sonda " + unmanned3.getName()
                                    + " fue un proyecto ejecutado por " + unmanned3.getMaker());
                            unmanned3.purpose();
                            System.out.println("Esta nave fue lanzada en el año de: " + unmanned3.getLaunchYear()
                                    + "\nActualmente se encuentra: " + unmanned3.getActualState()
                                    + "\nCuerpo celeste estudiado: " + "Plutón"
                                    + "\nSe desplazo a " + unmanned3.getSpeed()
                                    + "\nTardó más " + unmanned3.getYearArrive() + " años en llegar a su destino");
                            unmanned3.fuelType();
                            System.out.println("");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            break;
                        case 4:
                            Unmanned unmanned4 = new Unmanned(
                                    "Helios",
                                    "Alemania / EE.UU.",
                                    2009,
                                    "Vigente",
                                    "70.4 Km/s",
                                    9
                            );
                            JOptionPane.showMessageDialog(null, " ¡Información clasificada! ");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            System.out.println("La sonda " + unmanned4.getName()
                                    + " fue un proyecto ejecutado en conjunto por " + unmanned4.getMaker());
                            unmanned4.purpose();
                            System.out.println("Esta nave fue lanzada en el año de: " + unmanned4.getLaunchYear()
                                    + "\nActualmente se encuentra: " + unmanned4.getActualState()
                                    + "\nCuerpo celeste estudiado: " + "Sol"
                                    + "\nSe desplazo a " + unmanned4.getSpeed()
                                    + "\nTardó más " + unmanned4.getYearArrive() + " años en llegar a su destino");
                            unmanned4.fuelType();
                            System.out.println("");
                            System.out.println("------------------------Características y datos generales---------------------------------------");
                            System.out.println("");
                            break;
                        default:
                            System.out.println("La opción no existe");
                            break;
                    }
                    break;

                case 4:
                    default:
                        JOptionPane.showMessageDialog(null, "Mantenga la información con discreción\n"
                                + "               Hasta Pronto          "  );
                        System.exit(0);
            }
        }
        while (seleccion != 4) ;
    }
}