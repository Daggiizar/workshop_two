package classification;

import lombok.Data;

@Data
public class Shuttle extends Spaceship{

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

    }

    @Override
    public void fuelType() {

    }
}
