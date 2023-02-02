package transport;

import java.util.Objects;

public class Mechanic {

    private String nameMechanic;
    private String company;

    public String job(){
        System.out.println("провести техобслуживание");
        System.out.println("починить машину");
        return null;
    }

    public Mechanic(String nameMechanic, String company) {
        this.nameMechanic = nameMechanic;
        this.company = company;
    }

    public String getNameMechanic() {
        return nameMechanic;
    }

    public void setNameMechanic(String nameMechanic) {
        this.nameMechanic = nameMechanic;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(nameMechanic, mechanic.nameMechanic) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameMechanic, company);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "nameMechanic='" + nameMechanic + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
