package transport;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public abstract class Transport<T extends Driver> implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private T driver;



    public Transport(String brand, String model, double engineVolume, T driver) {
        this.brand = brand == null ? "default" : brand;
        this.model = model == null || model.isEmpty() ? "default" : model;
        this.engineVolume = engineVolume < 0 ? engineVolume : 1.6;
        setDriver(driver);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public static boolean isDiagnosticPassed(){
        System.out.println("Пройти диагностику");
        return false;
    }

    public abstract boolean passDiagnostic();

    public abstract void startMoove();
    public abstract void finishMoove();
    public void printInfo(){
        System.out.println("водитель "+ driver.getName()+" управляет автомобилем "+getBrand()+" и будет участвовать в заезде");
    }


    public void printType() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
    static List<Mechanic> listMechanics = new ArrayList<>();
    public static void addMechanics(){
    listMechanics.add(new Mechanic("name1", "company1"));
    listMechanics.add(new Mechanic("name2", "company2"));
    listMechanics.add(new Mechanic("name3", "company3"));

}}
