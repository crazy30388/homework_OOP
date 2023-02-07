import transport.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> auto = new ArrayList<>();
        auto.add("car");
        auto.add("bus");
        auto.add("truck");
        System.out.println(auto);

        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Driver cat.B "+i, true, 5+i);
            Car car = new Car("Lada " +i, "Granta" +i, 1.7, driverB, Type.VAN);
            DriverC driverC = new DriverC("Driver cat.C "+i, true, 5+i);
            Truck truck = new Truck("Brand" +i, "Model" +i, 3.4, driverC, LoadCapacity.getValue(15));
            DriverD driverD = new DriverD("Driver cat.D "+i, true, 5+i);
            Bus bus = new Bus("Brand" +i, "Model" +i, 2.6, driverD, Size.getValue(52));
            printInfo(car);
            printInfo(truck);
            printInfo(bus);
            Truck.isDiagnosticPassed();
            Car.isDiagnosticPassed();
            bus.passDiagnostic();
        }

    }
    private static void printInfo(Transport<?> transport){
        System.out.println("водитель "+transport.getDriver().getName()+" управляет автомобилем "+transport.getBrand()+" и будет участвовать в заезде");
    }

}