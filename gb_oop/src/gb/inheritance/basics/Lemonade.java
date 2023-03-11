package gb.inheritance.basics;

public class Lemonade extends Drink {

    public Lemonade(String name, double cost, int count, String unit, String expDate, double v) {
        super(name, cost, count, unit, expDate, v);
    }

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
}
