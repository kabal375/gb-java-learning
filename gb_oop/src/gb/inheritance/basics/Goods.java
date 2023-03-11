package gb.inheritance.basics;

public class Goods {
    protected String name;    // Название
    protected double cost;    // Цена
    protected int count;      // Количество
    protected String unit;    // Единица измерения


    public Goods(String name, double cost, int count, String unit) {
        this.name = name;
        this.cost = cost;
        this.count = count;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return name +
                " {Цена=" + cost +
                ", Количество=" + count +
                ", Ед.измерения='" + unit + '\'' +
                '}';
    }

}
