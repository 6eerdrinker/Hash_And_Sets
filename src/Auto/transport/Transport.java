package Auto.transport;

import Auto.driver.Driver;

import java.util.*;

public abstract class Transport {
    private final String brand;
    private final String model;
    public float engineVolume;

    private final Set<Transport> transports = new HashSet<>();
    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();

    public Transport(String brand, String model, float engineVolume)
    {
        this.brand = ValidationUtils.validOrDefault(brand, "Марка указана не корректно");
        this.model = ValidationUtils.validOrDefault(model, "Модель указана не корректно");
        if (engineVolume == 0) {
            System.out.println("Объем двигателя указан не корректно");
        }else {this.engineVolume = engineVolume;}
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public float getEngineVolume() {
        return engineVolume;
    }

    public abstract boolean carService();

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public abstract void autoRepair();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}



