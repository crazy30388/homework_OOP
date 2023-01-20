package transport;

import java.util.Objects;


public class Car extends Transport {

    public static class Key {
        final private boolean remoteStart;
        final private boolean keyLessAccess;

        public Key(Boolean remoteStart, Boolean keyLessAccess) {
            this.remoteStart = remoteStart;
            this.keyLessAccess = keyLessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    ", remoteStart=" + remoteStart +
                    ", keyLessAccess=" + keyLessAccess +
                    '}';
        }
    }
    private double engineVolume;
    private String gearbox;
    private String bodyType;
    private int regNumber;
    private final int numSeats;
    private boolean rubber;

    private Key key;

    public Car(String brand, String model, int year, String country, String color, int maxSpeed, double engineVolume, String gearbox, String bodyType, int regNumber, int numSeats, boolean rubber, boolean remoteStart, boolean keyLessAccess) {
        super(brand, model, year, country, color, maxSpeed);
        this.engineVolume = engineVolume;
        this.gearbox = gearbox;
        this.bodyType = bodyType;
        this.regNumber = regNumber;
        this.numSeats = numSeats;
        this.rubber = rubber;
        key = new Key(remoteStart, keyLessAccess);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public boolean getRubber() {
        return rubber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && regNumber == car.regNumber && numSeats == car.numSeats && rubber == car.rubber && Objects.equals(gearbox, car.gearbox) && Objects.equals(bodyType, car.bodyType) && Objects.equals(key, car.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineVolume, gearbox, bodyType, regNumber, numSeats, rubber, key);
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString()+
                "engineVolume=" + engineVolume +
                ", gearbox='" + gearbox + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regNumber=" + regNumber +
                ", numSeats=" + numSeats +
                ", rubber=" + rubber +
                ", key=" + key +
                '}';
    }
    public void changeTyres(int month){
        if ((month>=11 && month<=12) || (month>=1 && month<=3));{
            rubber = false;
        }
        if (month >=4 && month <= 10){
            rubber = true;
        }

}

}
