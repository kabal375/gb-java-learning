package gb.inheritance.basics;

public class Drink extends Food{
    protected double v;   // Объём

    @Override
    public String toString() {
        return name +
                " {Цена=" + cost +
                ", Количество=" + count +
                ", Ед.измерения='" + unit + '\'' +
                ", Срок годности='" + expDate + '\'' +
                ", Объём=" + v +
                '}';
    }

    public Drink(String name, double cost, int count, String unit, String expDate, double v) {
        super(name, cost, count, unit, expDate);
        this.v = v;
    }
}
