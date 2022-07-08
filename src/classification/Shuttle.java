package classification;

import lombok.Data;

/**
 * Esta clase representa una nave espacial lanzadera
 * @author Daniel Zárate
 * @version 1.0.0
 */
@Data
public class Shuttle extends Spaceship {

    /**
     * Representa el empuje de la nave
     */
    private int push;
    /**
     * Representa el peso de la nave
     */
    private int shipWeight;
    /**
     * Representa la capacidad de carga de la nave
     */
    private int loadWeight;

    /**
     * Constructor de la clase
     * @param name de la lanzadera
     * @param maker fabricante de la lanzadera
     * @param launchYear año de lanzamiento de la lanzadera
     * @param actualState estado actual de la lanzadera
     * @param push empuje de la lanzadera
     * @param shipWeight peso de la lanzadera
     * @param loadWeight capacidad de carga de la lanzadera
     */
    public Shuttle(String name, String maker, int launchYear, String actualState, int push, int shipWeight, int loadWeight) {
        super(name, maker, launchYear, actualState);
        this.push = push;
        this.shipWeight = shipWeight;
        this.loadWeight = loadWeight;
    }

    /**
     * Metodo abstracto que representa el propósito de la lanzadera
     */
    @Override
    public void purpose() {
        System.out.println("Su objetivo es lanzar una carga útil al espacio.");
    }

    /**
     * Método abstracto que representa el tipo de combustible
     */
    @Override
    public void fuelType() {
        System.out.println("Estos cohetes impulsores funcionan mediante combustible químico sólido o propelente líquido");
    }

}
