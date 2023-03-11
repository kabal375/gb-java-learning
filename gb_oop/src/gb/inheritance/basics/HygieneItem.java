package gb.inheritance.basics;

public class HygieneItem extends Goods{
    protected int pieces; // Количество штук в упаковке

    public HygieneItem(String name, double cost, int count, String unit, int pieces) {
        super(name, cost, count, unit);
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return name +
                " {Цена=" + cost +
                ", Количество=" + count +
                ", Ед.измерения='" + unit + '\'' +
                ", Шт.в упаковке=" + pieces +
                '}';
    }
}
