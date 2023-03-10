package gb.inheritance.basics;

public class Program {

    public static void main(String[] args) {
        Goods[] arr1 = new Goods[8];

        arr1[0] = new Bread("Бородинский", 75, 12, "шт", "01.04.2023", "ржаная");
        arr1[1] = new Eggs("C0", 90, 10, "упаковки", "10.05.2023", 10);
        arr1[2] = new Lemonade("Тархун", 75.5, 20, "бутылка", "20.01.2024", 0.5);
        arr1[3] = new Milk("Весёлый молочник",74, 21, "бутылка", "14.07.2023",
                1, 2.5);
        arr1[4] = new Diapers("Pampers", 2400, 18, "упаковка", 20, 2,
                4, 6, 1);
        arr1[5] = new Masks("Маска хирургическая", 100, 50, "упаковка", 50);
        arr1[6] = new Pacifier("Соска-пустышка", 95, 23, "шт", 0, true);
        arr1[7] = new ToiletPaper("Zewa", 350, 21, "упаковка", 6, 2);

        for (Goods goods : arr1) {
            System.out.println(goods);
        }
    }
}
