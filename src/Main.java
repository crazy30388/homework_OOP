import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada ", "Granta", 1.7, " цвет желтый", 2015, " сборка в России", "автомат", "хэтчбэк", 123, 3, true, true,true);
        Car car2 = new Car("Audi ", "A8 50 L TDI quattro",3.0, "цвет черный", 2020, "сборка в Германии", "автомат", "хэтчбэк", 123, 3, true, true,true);
        Car car3 = new Car("BMW ", "Z8",3.0, "цвет черный", 2021, "сборка в Германии", "автомат", "хэтчбэк", 123, 3,true, true,true );
        Car car4 = new Car("Kia ", "Sportage 4-го поколения",2.4, "цвет красный", 2018, "сборка в Южной Корее", "автомат", "хэтчбэк", 123, 3, true, true,true);
        Car car5 = new Car("Hyundai ", "Avante",1.6, "цвет оранжевый", 2016, "сборка в Южной Корее", "автомат", "хэтчбэк", 123, 3,true, true,true );
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}