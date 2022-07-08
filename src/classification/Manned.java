package classification;

import lombok.Data;

@Data
public class Manned extends Spaceship{

    private int passengerCapacity;
    private String objective;
    private double orbitDistance;

    public Manned(String name, String maker, int launchYear, String actualState, int passengerCapacity, String objective, double orbitDistance){
        super(name, maker, launchYear, actualState);
        this.passengerCapacity = passengerCapacity;
        this.objective = objective;
        this.orbitDistance = orbitDistance;
    }
    @Override
    public void purpose() {
        System.out.println("Su propósito consiste en mandar seres humanos al espacio para tareas de reparación, mantenimiento o investigación");
    }

    @Override
    public void fuelType() {
        System.out.println("Estas naves funcionan mediante combustible químico sólido o propelente líquido");
    }
}
