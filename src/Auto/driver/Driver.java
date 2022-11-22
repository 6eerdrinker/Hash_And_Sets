package Auto.driver;

import Auto.transport.Transport;

import java.util.Objects;

public abstract class Driver <T extends Transport> {
    private final String fullName;
    private final String category;
    private final int drivingExperience;
    private final T car;

    public Driver(String fullName, String category,
                  int drivingExperience, T car) {
        this.fullName = fullName;
        this.category = category;
        this.drivingExperience = drivingExperience;
        this.car = car;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return String.format("Водитель %s, категория '%s'," +
                        " стаж вождения %s лет, управляет автомобилем '%s %s', объем двигателя %s л. " +
                        "и будет участвовать в заезде! ",
                this.fullName, this.category, this.drivingExperience,
                this.car.getBrand(), this.car.getModel(), this.car.getEngineVolume());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return Objects.equals(fullName, driver.fullName) && Objects.equals(category, driver.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, category);
    }
}
