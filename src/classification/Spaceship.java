package classification;


import lombok.Data;

@Data
public abstract class Spaceship {

    private String name;
    private String maker;
    private int launchYear;
    private String actualState;

    public Spaceship() {
    }

    public Spaceship(String name, String maker, int launchYear, String actualState) {
        this.name = name;
        this.maker = maker;
        this.launchYear = launchYear;
        this.actualState = actualState;
    }

    public abstract void purpose();

    public abstract void fuelType();
}
