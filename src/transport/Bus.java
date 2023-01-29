package transport;


public class Bus extends Transport<DriverD> {
    public Bus(String brand, String model, double engineVolume, DriverD driver, Size size) {
        super(brand, model, engineVolume, driver, size);
    }

    @Override
    public void startMoove(){
        System.out.println("Bus brand "+ getBrand() + " start moove");
    }
    @Override
    public void finishMoove(){
        System.out.println("Bus brand "+ getBrand() + " finish moove");
    }

    @Override
    public void pitStop() {
        System.out.println("Pit stop bus");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 100;
        int maxBound = 150;
        int theBestTimeInMin = (int)(minBound +(maxBound-minBound)*Math.random());
        System.out.println("Max speed for bus in minute: " + theBestTimeInMin);
    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int)(minBound +(maxBound-minBound)*Math.random());
        System.out.println("Max speed for bus: " + maxSpeed);
    }
}
