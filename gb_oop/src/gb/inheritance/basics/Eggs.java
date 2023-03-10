package gb.inheritance.basics;

public class Eggs extends Food {

    int pieces;     // Количество в упаковке

    public Eggs(String name, double cost, int count, String unit, String expDate, int pieces) {
        super(name, cost, count, unit, expDate);
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return name +
                " {Цена=" + cost +
                ", Количество=" + count +
                ", Ед.измерения='" + unit + '\'' +
                ", Срок годности='" + expDate + '\'' +
                ", Шт.в упаковке==" + pieces +
                '}';
    }
}
