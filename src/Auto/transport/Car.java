package Auto.transport;


public class Car extends Transport implements Competing {
    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public boolean carService() {
        return false;
    }

    @Override
    public void autoRepair() {
        System.out.println(this.getBrand() + " " + this.getModel() +  " отремонтирован.");
    }
}
