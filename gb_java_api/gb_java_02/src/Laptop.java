import java.util.Objects;

public class Laptop {
    /*
     * 1 - ОЗУ
     * 2 - Объем ЖД
     * 3 - Операционная система
     * 4 - Цвет
     * */

    private int ram; // 8, 16, 32, 64
    private int hddSize; // 512, 1024, 2048
    private String os; // Windows 10, Windows 11, MacOS, Linux
    final String color; // black, silver, blue, white, red
    final String manufacturer; // Lenovo, Apple, Asus, HP, Acer

    public Laptop(int ram, int hddSize, String os, String color, String manufacturer) {
        this.manufacturer = manufacturer;
        if (manufacturer.equalsIgnoreCase("apple"))
            this.os = "MacOS";
        else
            this.os = os;
        this.ram = ram;
        this.hddSize = hddSize;
        this.color = color;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public int getHddSize() {
        return hddSize;
    }

    public String getOs() {
        return os;
    }

    public boolean corresponds(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;

        boolean correspond = true;
        if (laptop.getRam() > 0 && getRam() != laptop.getRam())
            correspond = false;
//        if (laptop.getHddSize() > 0)

//        return getRam() == laptop.getRam() && getHddSize() == laptop.getHddSize() && getOs().equals(laptop.getOs())
//                && Objects.equals(color, laptop.color) && manufacturer.equals(laptop.manufacturer);
            return correspond;
    }

    @Override
    public String toString() {
        return "Laptop {" +
                manufacturer +
                ", ram: " + ram +
                ", hddSize: " + hddSize +
                ", os: '" + os + '\'' +
                ", color: '" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return getRam() == laptop.getRam() && getHddSize() == laptop.getHddSize() && getOs().equals(laptop.getOs())
                && Objects.equals(color, laptop.color) && manufacturer.equals(laptop.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRam(), getHddSize(), getOs(), color, manufacturer);
    }
}
