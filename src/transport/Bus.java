package transport;


import java.util.Objects;

public class Bus extends Transport<DriverD> {
    private Size size;
    public Bus(String brand, String model, double engineVolume, DriverD driver, Size size) {
        super(brand, model, engineVolume, driver);
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return size == bus.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    @Override
    public boolean passDiagnostic(){

        throw new TransportTypeException("Автобусы диагностику проходить не должны");
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
    public void printType() {
        if(getSize() == null){
            System.out.println("Недостаточно данных");
        }
        else {
            System.out.println(getSize());
        }
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

    @Override
    public String toString() {
        return "Bus{" +
                "size=" + size +
                '}';
    }
}
