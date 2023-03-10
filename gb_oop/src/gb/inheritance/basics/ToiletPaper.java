package gb.inheritance.basics;

public class ToiletPaper extends HygieneItem {

    int layers;      // Количество слоёв

    public ToiletPaper(String name, double cost, int count, String unit, int pieces, int layers) {
        super(name, cost, count, unit, pieces);
        this.layers = layers;
    }

    @Override
    public String toString() {
        return name +
                " {Цена=" + cost +
                ", Количество=" + count +
                ", Ед.измерения='" + unit + '\'' +
                ", Шт.в упаковке=" + pieces +
                ", Слоёв=" + layers +
                '}';
    }
}
