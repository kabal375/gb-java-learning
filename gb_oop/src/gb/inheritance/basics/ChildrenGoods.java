package gb.inheritance.basics;

public class ChildrenGoods extends Goods{
    int minAge;                 // Минимальный возраст
    boolean isHypoallergenic;   // Гипоаллергенность

    public ChildrenGoods(String name, double cost, int count, String unit, int minAge, boolean isHypoallergenic) {
        super(name, cost, count, unit);
        this.minAge = minAge;
        this.isHypoallergenic = isHypoallergenic;
    }

    @Override
    public String toString() {
        return name +
                " {Цена=" + cost +
                ", Количество=" + count +
                ", Ед.измерения='" + unit + '\'' +
                ", Мин.возраст=" + minAge +
                ", Гипоаллергенность=" + isHypoallergenic +
                '}';
    }
}
