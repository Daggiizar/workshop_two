package classification;

import lombok.Data;

/**
 * Esta clase representa una nave espacial no tripulada
 * @author Daniel Zárate
 * @version 1.0.0
 */
@Data
public class Unmanned extends Spaceship {

    /**
     * Representa la velocidad de la nave no tripulada
     */
    private String speed;
    /**
     * Representa el año de llegada de la nave no tripulada
     */
    private int yearArrive;

    /**
     * Constructor de la clase
     * @param name nombre de la nave no tripulada
     * @param maker fabricante de la nave no tripulada
     * @param launchYear año de lanzamiento de la nave no tripulada
     * @param actualState estado actual de la nave no tripulada
     * @param speed velocidad de la nave no tripulada
     * @param yearArrive año de llegada de la nave no tripulada
     */
    public Unmanned(String name, String maker, int launchYear, String actualState, String speed, int yearArrive) {
        super(name, maker, launchYear, actualState);
        this.speed = speed;
        this.yearArrive = yearArrive;
    }

    /**
     * Metodo abstracto que representa el propósito de la nave no tripulada
     */
    @Override
    public void purpose() {
        System.out.println("Su objetivo principal es estudiar otros cuerpos celestes");
    }

    /**
     * Método abstracto que representa el tipo de combustible de la nave no tripulada
     */
    @Override
    public void fuelType() {
        System.out.println("No precisan de combustible, suelen emplear celdas fotovoltaicas");
    }
}
