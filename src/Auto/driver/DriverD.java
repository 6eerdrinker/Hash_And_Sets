package Auto.driver;

import Auto.transport.Bus;

public class DriverD extends Driver<Bus> {
    public DriverD(String fullName, String category, int drivingExperience, Bus car) {
        super("Сидор Сидорович Сидоров", "D", 18, car);
    }
}
