package classification;

import lombok.Data;

/**
 * Esta clase representa una nave espacial tripulada
 * @author Daniel Zárate
 * @version 1.0.0
 */
@Data
public class Manned extends Spaceship{

    /**
     * Representa la capacidad de pasajeros
     */
    private int passengerCapacity;
    /**
     * Representa el objetivo de la nave
     */
    private String objective;
    /**
     * Representa la orbita de la distancia
     */
    private double orbitDistance;

    /**
     * Constructor de la clase
     * @param name  nombre de la nave tripulada
     * @param maker fabricante de la nave tripulada
     * @param launchYear año de lanzamiento de la nave tripulada
     * @param actualState estado actual de la nave tripulada
     * @param passengerCapacity capacidad de pasajeros de la nave tripulada
     * @param objective objetivo de la nave tripulada
     * @param orbitDistance distancia de la orbita en que se encuentra la nave tripulada
     */
    public Manned(String name, String maker, int launchYear, String actualState, int passengerCapacity, String objective, double orbitDistance){
        super(name, maker, launchYear, actualState);
        this.passengerCapacity = passengerCapacity;
        this.objective = objective;
        this.orbitDistance = orbitDistance;
    }

    /**
     * Metodo abstracto que representa el propósito de la nave tripulada
     */
    @Override
    public void purpose() {
        System.out.println("Su propósito consiste en mandar seres humanos al espacio para tareas de reparación, mantenimiento o investigación");
    }

    /**
     * Metodo abstracto que representa tipo de combustible de la nave tripulada
     */
    @Override
    public void fuelType() {
        System.out.println("Estas naves funcionan mediante combustible químico sólido o propelente líquido");
    }
}
