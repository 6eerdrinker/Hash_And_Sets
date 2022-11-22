package Auto.transport;

import java.util.Objects;

public class Mechanic <T extends Transport>{
    private final String name;
    private final String surname;
    private final String nameCompany;

    public Mechanic(String name, String surname, String nameCompany) {
        this.name = name;
        this.surname = surname;
        this.nameCompany = nameCompany;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public boolean carService(T t) {
       return t.carService();
    }

    public void autoRepair(T t) {
        t.autoRepair();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(surname, mechanic.surname)
                && Objects.equals(nameCompany, mechanic.nameCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, nameCompany);
    }
}
