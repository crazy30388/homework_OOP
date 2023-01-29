package transport;


public class Car extends Transport<DriverB> {
    public Car(String brand, String model, double engineVolume, DriverB driver, Type type) {
        super(brand, model, engineVolume, driver, type);
    }

    @Override
    public boolean passDiagnostic(){
        return this.isDiagnosticPassed();
    }
    @Override
    public void startMoove(){
        System.out.println("Car brand "+ getBrand() + " start moove");
    }
    @Override
    public void finishMoove(){
        System.out.println("Car brand "+ getBrand() + " finish moove");
    }
    @Override
    public void pitStop() {
        System.out.println("Pit stop car");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 70;
        int maxBound = 120;
        int theBestTimeInMin = (int)(minBound +(maxBound-minBound)*Math.random());
        System.out.println("Max speed for car in minute: " + theBestTimeInMin);
    }

    @Override
    public void maxSpeed() {
        int minBound = 100;
        int maxBound = 160;
        int maxSpeed = (int)(minBound +(maxBound-minBound)*Math.random());
        System.out.println("Max speed for car: " + maxSpeed);
    }

}
