package Passport;

import java.util.HashSet;
import java.util.Set;

public class PassportList {
    Set<Passport> passports = new HashSet<>();

    public void addPassportData(Passport passport) {
        this.passports.add(passport);
    }

    public Passport checkByNumber(int number) {
        for (Passport passport : passports) {
            if (passport.getNumber() == number) {
                return passport;
            }
        }
        return null;
    }
}
