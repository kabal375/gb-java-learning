package gb.inheritance.basics;

public class Milk extends Drink {
    private double fatPercetage;

    public Milk(String name, double cost, int count, String unit, String expDate, double v, double fatPercetage) {
        super(name, cost, count, unit, expDate, v);
        this.fatPercetage = fatPercetage;
    }

    @Override
    public String toString() {
        return name +
                " {Цена=" + cost +
                ", Количество=" + count +
                ", Ед.измерения='" + unit + '\'' +
                ", Срок годности='" + expDate + '\'' +
                ", Объём=" + v +
                ", % жирности=" + fatPercetage +
                '}';
    }
}
