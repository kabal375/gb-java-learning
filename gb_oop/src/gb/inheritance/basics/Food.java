package gb.inheritance.basics;

public class Food extends Goods{
    protected String expDate;   // Срок годности


    public Food(String name, double cost, int count, String unit, String expDate) {
        super(name, cost, count, unit);
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return name +
                " {Цена=" + cost +
                ", Количество=" + count +
                ", Ед.измерения='" + unit + '\'' +
                ", Срок годности='" + expDate + '\'' +
                '}';
    }
}
