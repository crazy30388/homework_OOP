package transport;

import java.util.Objects;

public class Car {
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
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String gearbox;
    private final String bodyType;
    private int regNumber;
    private final int numSeats;
    private boolean rubber;

    private Key key;

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String gearbox, String bodyType, int regNumber, int numSeats, boolean rubber, boolean remoteStart, boolean keyLessAccess) {
        this.brand = brand == null ? "default" : brand;
        this.model = model == null || model.isEmpty() ? "default" : model;
        this.engineVolume = engineVolume > 0 ? engineVolume : 1.5;
        this.color = color == null || color.isEmpty() ? "white" : color;
        this.year = year > 0 ? year : 2000;
        this.country = country == null || country.isEmpty() ? "default" : country;
        this.gearbox = gearbox == null ? "default" : gearbox;
        this.bodyType = bodyType == null ? "default" : bodyType;
        this.regNumber = regNumber > 0 ? regNumber : 555;
        this.numSeats = numSeats <= 0 ? 4 : numSeats;
        this.rubber = rubber;
 //       this.key = new Key(true, true);
        key = new Key(remoteStart, keyLessAccess);
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
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
        return Double.compare(car.engineVolume, engineVolume) == 0 && year == car.year && regNumber == car.regNumber && numSeats == car.numSeats && rubber == car.rubber && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(country, car.country) && Objects.equals(gearbox, car.gearbox) && Objects.equals(bodyType, car.bodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country, gearbox, bodyType, regNumber, numSeats, rubber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", gearbox='" + gearbox + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regNumber=" + regNumber +
                ", numSeats=" + numSeats +
                ", rubber=" + rubber +
                ", key=" + key +
                '}';
    }
  //  public void changeTyres(int month){
    //    if ((month>=11 && month<=12) || (month>=1 && month<=3));{
      //      rubber = false;
        //}
        //if (month >=4 && month <= 10){
          //  rubber = true;
        //}

}
