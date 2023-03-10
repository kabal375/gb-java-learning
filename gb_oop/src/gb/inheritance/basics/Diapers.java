package gb.inheritance.basics;

public class Diapers extends HygieneItem {
    int size;
    int minWeight;
    int maxWeight;
    int type;

    public Diapers(String name, double cost, int count, String unit, int pieces,
                   int size, int minWeight, int maxWeight, int type) {
        super(name, cost, count, unit, pieces);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return name +
                " {Цена=" + cost +
                ", Количество=" + count +
                ", Ед.измерения='" + unit + '\'' +
                ", Шт.в упаковке=" + pieces +
                ", Размер=" + size +
                ", Мин.вес=" + minWeight +
                ", Макс.вес=" + maxWeight +
                ", Тип=" + type +
                '}';
    }
}
