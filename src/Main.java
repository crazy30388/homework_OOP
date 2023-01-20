import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada ", "Granta", 2015, " сборка в России", " цвет желтый" , 120, 1.7, "автомат", "хэтчбэк", 123, 3, true, true,true);
        Car car2 = new Car("Audi ", "A8 50 L TDI quattro",2020,"сборка в Германии","цвет черный",110, 3.0, "автомат", "хэтчбэк", 123, 3, true, true,true);
        Car car3 = new Car("BMW ", "Z8",2021, "сборка в Германии","цвет черный",100, 3.0, "автомат", "хэтчбэк", 123, 3,true, true,true );
        Car car4 = new Car("Kia ", "Sportage 4-го поколения",2018, "сборка в Южной Корее","цвет красный",95, 2.4,   "автомат", "хэтчбэк", 123, 3, true, true,true);
        Car car5 = new Car("Hyundai ", "Avante",2016, "сборка в Южной Корее","цвет оранжевый", 100, 1.6, "автомат", "хэтчбэк", 123, 3,true, true,true );
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        Bus bus = new Bus("Бренд", "Модель", 2020, "Россия", "красный", 125, 3, 222, "механика");
        System.out.println(bus);
    }

}