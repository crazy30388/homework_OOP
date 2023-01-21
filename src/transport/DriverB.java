package transport;

public class DriverB extends Driver{
    public DriverB(String name,
                   boolean hasDriverLicense,
                   int experienceInYears) {
        super(name, hasDriverLicense, experienceInYears);
    }

    @Override
    public void startMoove() {
        System.out.println("Driver B "+getName()+" start move");
    }

    @Override
    public void finishMoove() {
        System.out.println("Driver B "+getName()+" finish move");
   }

    @Override
    public void refill() {
        System.out.println("Driver B "+getName()+" refill");
    }
}
