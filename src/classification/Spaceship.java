package classification;

import lombok.Data;

/**
 * Esta clase representa una nave espacial
 * @author Daniel Zárate
 * @version 1.0.0
 */
@Data
public abstract class Spaceship {

    /**
     * Representa el nombre
     */
    private String name;
    /**
     * Representa el fabricante
     */
    private String maker;
    /**
     * representa el año de lanzamiento
     */
    private int launchYear;
    /**
     * Representa el estado actual
     */
    private String actualState;

    /**
     * Constructor de la clase
     * @param name nombre de la nave
     * @param maker fabricante de la nave
     * @param launchYear año de lanzamiento de la nave
     * @param actualState estado actual de la nave
     */
    public Spaceship(String name, String maker, int launchYear, String actualState) {
        this.name = name;
        this.maker = maker;
        this.launchYear = launchYear;
        this.actualState = actualState;
    }

    /**
     * Método abstracto que representa el propósito
     */
    public abstract void purpose();

    /**
     * Método que representa el tipo de combustible
     */
    public abstract void fuelType();
}
