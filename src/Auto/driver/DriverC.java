package Auto.driver;

import Auto.transport.Truck;
public class DriverC extends Driver<Truck> {

    public DriverC(String fullName, String category, int drivingExperience, Truck car) {
        super(fullName, "C", drivingExperience, car);
    }
}
