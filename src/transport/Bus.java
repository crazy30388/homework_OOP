package transport;

import java.util.Objects;


public class Bus extends Transport {
    private int numSeats;
    private int regNumber;
    private String gearbox;

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, int numSeats, int regNumber, String gearbox) {
        super(brand, model, year, country, color, maxSpeed);
        this.numSeats = numSeats;
        this.regNumber = regNumber;
        this.gearbox = gearbox;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return numSeats == bus.numSeats && regNumber == bus.regNumber && Objects.equals(gearbox, bus.gearbox);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numSeats, regNumber, gearbox);
    }

    @Override
    public String toString() {
        return "Bus{" +
                super.toString()+
                "numSeats=" + numSeats +
                ", regNumber=" + regNumber +
                ", gearbox='" + gearbox + '\'' +
                '}';
    }
}
