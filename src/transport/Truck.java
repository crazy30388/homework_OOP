package transport;

public class Truck extends Transport<DriverC>{
    public Truck(String brand, String model, double engineVolume, DriverC driver, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver, loadCapacity);
    }

    @Override
    public boolean passDiagnostic(){
        return this.isDiagnosticPassed();
    }

    @Override
    public void printType() {

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
}
