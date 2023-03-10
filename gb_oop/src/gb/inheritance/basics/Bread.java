package gb.inheritance.basics;

public class Bread extends Food {
    String flour;   // Тип муки

    public Bread(String name, double cost, int count, String unit, String expDate, String flour) {
        super(name, cost, count, unit, expDate);
        this.flour = flour;
    }

    @Override
    public String toString() {
        return name +
                " {Цена=" + cost +
                ", Количество=" + count +
                ", Ед.измерения='" + unit + '\'' +
                ", Срок годности='" + expDate + '\'' +
                ", Тип мукм='" + flour + '\'' +
                '}';
    }
}
