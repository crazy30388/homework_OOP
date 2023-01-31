package transport;


import java.util.Objects;

public class Car extends Transport<DriverB> {
    private Type type;
    public Car(String brand, String model, double engineVolume, DriverB driver, Type type) {
        super(brand, model, engineVolume, driver);
        if(type == null){
            System.out.println("Недостаточно данных");
            return;
        }
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return type == car.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public boolean passDiagnostic(){
        return isDiagnosticPassed();
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

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                '}';
    }
}
