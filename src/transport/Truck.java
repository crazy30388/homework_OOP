package transport;

import java.util.Objects;

public class Truck extends Transport<DriverC>{
    private LoadCapacity loadCapacity;
    public Truck(String brand, String model, double engineVolume, DriverC driver, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }

    @Override
    public boolean passDiagnostic(){
        return isDiagnosticPassed();

    }

    @Override
    public void printType() {
        if(getLoadCapacity() == null){
            System.out.println("Недостаточно данных");
        }
        else {
            System.out.println(getLoadCapacity());
        }
    }

    @Override
    public void startMoove(){
        System.out.println("Truck brand "+ getBrand() + " start moove");
    }
    @Override
    public void finishMoove(){
        System.out.println("Truck brand "+ getBrand() + " finish moove");
    }
    @Override
    public void pitStop() {
        System.out.println("Pit stop truck");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 90;
        int maxBound = 140;
        int theBestTimeInMin = (int)(minBound +(maxBound-minBound)*Math.random());
        System.out.println("Max speed for truck in minute: " + theBestTimeInMin);
    }

    @Override
    public void maxSpeed() {
        int minBound = 90;
        int maxBound = 130;
        int maxSpeed = (int)(minBound +(maxBound-minBound)*Math.random());
        System.out.println("Max speed for truck: " + maxSpeed);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }
}
