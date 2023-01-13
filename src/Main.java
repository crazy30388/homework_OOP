public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada ", "Granta", 1.7, " цвет желтый", 2015, " сборка в России");
        Car car2 = new Car("Audi ", "A8 50 L TDI quattro",3.0, "цвет черный", 2020, "сборка в Германии");
        Car car3 = new Car("BMW ", "Z8",3.0, "цвет черный", 2021, "сборка в Германии");
        Car car4 = new Car("Kia ", "Sportage 4-го поколения",2.4, "цвет красный", 2018, "сборка в Южной Корее");
        Car car5 = new Car("Hyundai ", "Avante",1.6, "цвет оранжевый", 2016, "сборка в Южной Корее");
        System.out.println(car1.getBrand()+car1.getModel()+", "+"объем " +car1.getEngineVolume()+" л, "+car1.getColor()+ ", "+car1.getYear()+ " года выпуска" +", "+car1.getCountry());
        System.out.println(car2.getBrand()+car2.getModel()+", "+"объем " +car2.getEngineVolume()+" л, "+car2.getColor()+ ", "+car2.getYear()+ " года выпуска" +", "+car2.getCountry());
        System.out.println(car3.getBrand()+car3.getModel()+", "+"объем " +car3.getEngineVolume()+" л, "+car3.getColor()+ ", "+car3.getYear()+ " года выпуска" +", "+car3.getCountry());
        System.out.println(car4.getBrand()+car4.getModel()+", "+"объем " +car4.getEngineVolume()+" л, "+car4.getColor()+ ", "+car4.getYear()+ " года выпуска" +", "+car4.getCountry());
        System.out.println(car5.getBrand()+car5.getModel()+", "+"объем " +car5.getEngineVolume()+" л, "+car5.getColor()+ ", "+car5.getYear()+ " года выпуска" +", "+car5.getCountry());
        }
}