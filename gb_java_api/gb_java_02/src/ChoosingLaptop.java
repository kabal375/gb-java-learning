import java.util.*;

public class ChoosingLaptop {
    /*
     * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
     * Создать множество ноутбуков.
     * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
     * отвечающие фильтру. Критерии фильтрации можно хранить в Map.
     * Например: “Введите цифру, соответствующую необходимому критерию:
     * 1 - ОЗУ
     * 2 - Объем ЖД
     * 3 - Операционная система
     * 4 - Цвет …
     * Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры
     * фильтрации можно также в Map.
     * Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
     * */
    static Set<Laptop> laptopSet = new LinkedHashSet<>();


    public static void main(String[] args) {


        LaptopFilter laptopFilter = new LaptopFilter();

        for (int i = 0; i < 100; i++) {
            laptopSet.add(new Laptop(generateRAMSize(laptopFilter.ramSizes), generateHDDSize(laptopFilter.hddSizes),
                    generateOS(laptopFilter.osNames), generateColor(laptopFilter.colors),
                    generateManufacturer(laptopFilter.manufacturers)));
        }

        System.out.println(laptopSet.size());

        filterMenu(laptopFilter);

    }

    public static void filterMenu(LaptopFilter laptopFilter) {
        int item = 0;
        Scanner scanner = new Scanner(System.in);

        while (item != 6) {
            System.out.println("-= Укажите номер параметра для фильтра: =- ");
            System.out.println("1 - RAM");
            System.out.println("2 - HDD Size");
            System.out.println("3 - OS Name");
            System.out.println("4 - Color");
            System.out.println("5 - Manufacturer");
            System.out.println("6 - Run Filter");

            try {
                item = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input!!! Enter number 1-6");
            }

            switch (item) {
                case 1 -> laptopFilter.add("ram", enterIntData(laptopFilter.ramSizes));
                case 2 -> laptopFilter.add("hddSize", enterIntData(laptopFilter.hddSizes));
                case 3 -> laptopFilter.add("os", enterStrData(laptopFilter.osNames));
                case 4 -> laptopFilter.add("color", enterStrData(laptopFilter.colors));
                case 5 -> laptopFilter.add("manufacturer", enterStrData(laptopFilter.manufacturers));
                case 6 -> {
                    System.out.println(laptopFilter.filterSet);
                    showFiltered(laptopSet, laptopFilter);
                }
            }
        }
    }

    private static void showFiltered(Set<Laptop> laptops, LaptopFilter filter) {
        for (Laptop laptop :
                laptops) {

            System.out.println(laptop);
        }
    }

    private static String enterStrData(String[] strArr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value from list (" + Arrays.toString(strArr) + ")");
        return scanner.nextLine();
    }

    private static String enterIntData(int[] intArr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value from list (" + Arrays.toString(intArr) + ")");
        String data = scanner.nextLine();
        try {
            Integer.parseInt(data);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input!!! Enter number from " + Arrays.toString(intArr));
            return "";
        }
        return data;
    }

    public static int generateRAMSize(int[] ramSizes) {
        Random rnd = new Random();
        return ramSizes[rnd.nextInt(0, ramSizes.length)];
    }

    public static int generateHDDSize(int[] hddSizes) {
        Random rnd = new Random();
        return hddSizes[rnd.nextInt(0, hddSizes.length)];
    }

    public static String generateOS(String[] osNames) {
        Random rnd = new Random();
        return osNames[rnd.nextInt(0, osNames.length)];
    }

    public static String generateColor(String[] colors) {
        Random rnd = new Random();
        return colors[rnd.nextInt(0, colors.length)];
    }

    public static String generateManufacturer(String[] manufacturers) {
        Random rnd = new Random();
        return manufacturers[rnd.nextInt(0, manufacturers.length)];
    }

}
