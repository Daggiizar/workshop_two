package classification;

import lombok.Data;

import java.util.Scanner;

@Data
public class Shuttle extends Spaceship {

    private int push;
    private int shipWeight;
    private int loadWeight;

    public Shuttle(String name, String maker, int launchYear, String actualState, int push, int shipWeight, int loadWeight) {
        super(name, maker, launchYear, actualState);
        this.push = push;
        this.shipWeight = shipWeight;
        this.loadWeight = loadWeight;
    }

    @Override
    public void purpose() {
        System.out.println("Su objetivo es lanzar una carga útil al espacio.");
    }

    @Override
    public void fuelType() {
        System.out.println("Estos cohetes impulsores funcionan mediante combustible químico sólido o propelente líquido");
    }

}
