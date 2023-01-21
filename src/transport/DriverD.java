package transport;

public class DriverD extends Driver{
    public DriverD(String name,
                   boolean hasDriverLicense,
                   int experienceInYears) {
        super(name, hasDriverLicense, experienceInYears);
    }
    @Override
    public void startMoove() {
        System.out.println("Driver D "+getName()+" start move");
    }

    @Override
    public void finishMoove() {
        System.out.println("Driver D "+getName()+" finish move");
    }

    @Override
    public void refill() {
        System.out.println("Driver D "+getName()+" refill");
    }
}
