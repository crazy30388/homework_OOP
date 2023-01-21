package transport;

public class DriverC extends Driver{
    public DriverC(String name,
                   boolean hasDriverLicense,
                   int experienceInYears) {
        super(name, hasDriverLicense, experienceInYears);
    }
    @Override
    public void startMoove() {
        System.out.println("Driver C "+getName()+" start move");
    }

    @Override
    public void finishMoove() {
        System.out.println("Driver C "+getName()+" finish move");
    }

    @Override
    public void refill() {
        System.out.println("Driver C "+getName()+" refill");
    }
}
