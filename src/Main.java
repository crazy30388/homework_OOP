import transport.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> auto = new ArrayList<>();
        auto.add("car");
        auto.add("bus");
        auto.add("truck");
        System.out.println(auto);

        DriverB driverB = null;
        DriverC driverC = null;
        DriverD driverD = null;
        for (int i = 1; i <= 4; i++) {
            driverB = new DriverB("Driver cat.B " + i, true, 5 + i);
            Car car = new Car("Lada " + i, "Granta" + i, 1.7, driverB, Type.VAN);
            driverC = new DriverC("Driver cat.C " + i, true, 5 + i);
            Truck truck = new Truck("Brand" + i, "Model" + i, 3.4, driverC, LoadCapacity.getValue(15));
            driverD = new DriverD("Driver cat.D " + i, true, 5 + i);
            Bus bus = new Bus("Brand" + i, "Model" + i, 2.6, driverD, Size.getValue(52));
            printInfo(car);
            printInfo(truck);
            printInfo(bus);
 //           Truck.isDiagnosticPassed();
//            Car.isDiagnosticPassed();
//            bus.passDiagnostic();
        }
        Car car = new Car("Lada ", "Granta", 1.7, driverB, Type.VAN);
        Truck truck = new Truck("Brand", "Model", 3.4, driverC, LoadCapacity.getValue(15));
        Bus bus = new Bus("Brand", "Model", 2.6, driverD, Size.getValue(52));
        Mechanic mechanic1 = new Mechanic("name1", "comp1");
        Mechanic mechanic2 = new Mechanic("name2", "comp2");
        Mechanic mechanic3 = new Mechanic("name3", "comp3");

        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(mechanic1);
        mechanics.add(mechanic2);
        mechanics.add(mechanic3);

        Map<Transport, Mechanic> map = new HashMap<>();
        map.put(car, mechanic1);
        map.put(bus, mechanic2);
        map.put(truck, mechanic3);
        for (Map.Entry<Transport, Mechanic> item : map.entrySet()) {
            System.out.println("Transport: " + item.getKey() + " Mechanic: " + item.getValue());
        }
    }
    private static void printInfo(Transport<?> transport){
        System.out.println("???????????????? "+transport.getDriver().getName()+" ?????????????????? ?????????????????????? "+transport.getBrand()+" ?? ?????????? ?????????????????????? ?? ????????????");
    }

}