package classification;

import lombok.Data;

@Data
public class Unmanned extends Spaceship {

    private String speed;
    private int yearArrive;

    public Unmanned(String name, String maker, int launchYear, String actualState, String speed, int yearArrive) {
        super(name, maker, launchYear, actualState);
        this.speed = speed;
        this.yearArrive = yearArrive;
    }

    @Override
    public void purpose() {
        System.out.println("Su objetivo principal es estudiar otros cuerpos celestes");
    }

    @Override
    public void fuelType() {
        System.out.println("No precisan de combustible, suelen emplear celdas fotovoltaicas");
    }
}
