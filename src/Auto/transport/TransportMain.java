package Auto.transport;

import Auto.driver.Driver;
import Auto.driver.DriverB;
import Auto.driver.DriverC;
import Auto.driver.DriverD;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;


public class TransportMain {
    public static void main(String[] args) {
        System.out.println("Список транспорта участвующего в соревнованиях:");
        System.out.println();
        Car bmw = new Car("Автомобиль 'BMW", "z8'", 3.0f);
        Driver <Car> andrey = new DriverB("Андрей Андреевич Андреев", "B", 18,
                new Car("BMW", "Z8", 3.0f));
        Mechanic<Car> akseniy = new Mechanic<Car>("Аксений", "Григорьев", "Топ Гир");
        Sponsor coocooo = new Sponsor("Ку-Ку", 30_000);
        Sponsor oriental = new Sponsor("Ку-Ку", 900_000);
        bmw.addDriver(andrey);
        bmw.addMechanic(akseniy);
        bmw.addSponsor(coocooo, oriental);

        Car kia = new Car("Автомобиль 'KIA", "4-restyle'", 2.0f);
        Driver <Car> nik = new DriverB("Николай Николаевич Николаев", "B", 33,
                new Car("KIA", "4-restyle", 2.0f));
        Mechanic<Car> vlad = new Mechanic<Car>("Владимир", "Иванов", "Мотор");
        Sponsor rytm = new Sponsor("Ритм", 500_000);
        Sponsor tuning = new Sponsor("Ритм", 150_000);
        kia.addDriver(nik);
        kia.addMechanic(vlad);
        kia.addSponsor(rytm, tuning);

        Truck kamaz = new Truck("Грузовой автомбиль 'КАМАЗ", "4326'", 10.85f);
        Driver <Truck> sergey = new DriverC("Сергей Сергеевич Сергеев", "C", 5,
                new Truck("КАМАЗ", "4326", 10.85f));
        Mechanic<Truck> evgeny = new Mechanic<Truck>("Евгений", "Аксёнов", "Вектор");
        Sponsor trassa = new Sponsor("Трасса", 350_000);
        Sponsor highway = new Sponsor("ХайВэй", 350_000);
        kamaz.addDriver(sergey);
        kamaz.addMechanic(evgeny);
        kamaz.addSponsor(trassa, highway);

        Bus paz = new Bus("Автобус 'ПАЗ", "3205'", 4.67f);
        Driver <Bus> vit = new DriverD("Виталий Витальевич Кутепов", "D", 10,
                new Bus("ПАЗ", "3205", 4.67f));
        Mechanic<Bus> ivan = new Mechanic<Bus>("Иван", "Семенов", "Движок");
        Sponsor stavka = new Sponsor("Ставка", 50_000);
        Sponsor freeBet = new Sponsor("ФриБэт", 1_900_000);
        paz.addDriver(vit);
        paz.addMechanic(ivan);
        paz.addSponsor(stavka, freeBet);

        System.out.println("Легковые автомобили: ");
        printInfo(bmw);
        System.out.println();
        printInfo(kia);
        System.out.println();
        System.out.println("Грузовые автомобили: ");
        printInfo(kamaz);
        System.out.println();
        System.out.println("Автобусы: ");
        printInfo(paz);

        List<Transport> transports = List.of(bmw, kamaz, paz, kia);

        AutoService autoService = new AutoService();
        autoService.addCar(bmw);
        autoService.addCar(kia);
        autoService.addTruck(kamaz);
        autoService.service();
        autoService.service();
        autoService.service();

         }


    private static void printInfo(Transport transport) {
        System.out.printf(" - %s - %s, объем двигателя %s л. ",
        transport.getBrand(), transport.getModel(), transport.getEngineVolume());
        System.out.println();
        System.out.println("Водитель: ");
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.printf("%s, категория '%s', стаж вождения - %s лет.", driver.getFullName(),
                    driver.getCategory(), driver.getDrivingExperience());
        }
        System.out.println();
        System.out.println("Спонсоры: ");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println("Компания " + "'" + sponsor.getName() + "'"
                    +", спонсирует заезд на " + sponsor.getAmountSum() +" руб."
            );
        }
        System.out.println("Механики: ");
        for (Mechanic<?> mechanic : transport.getMechanics()) {
            System.out.println(mechanic.getName() + " " + mechanic.getSurname()
                    + ", cервисная компания "
            + "'" + mechanic.getNameCompany() + "'");
        }
    }
}
