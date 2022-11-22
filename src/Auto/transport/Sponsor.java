package Auto.transport;

import java.util.Objects;

public class Sponsor <T extends Transport>{
    private final String name;
    private final int amountSum;

    public Sponsor(String name, int amountSum) {
        this.name = name;
        this.amountSum = amountSum;
    }

    public String getName() {
        return name;
    }

    public int getAmountSum() {
        return amountSum;
    }

    public void giveMoneyToRice() {
        System.out.printf("Спонсор %s спонсировал заезд на %s рублей.",
                getName(), getAmountSum());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor<?> sponsor = (Sponsor<?>) o;
        return Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
