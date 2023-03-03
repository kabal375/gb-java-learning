import java.util.HashMap;
import java.util.Map;

public class LaptopFilter {
    final int[] ramSizes = {8, 16, 32, 64};
    final int[] hddSizes = {512, 1024, 2048};
    final String[] osNames = {"Windows 10", "Windows 11", "MacOs", "Linux"};
    final String[] colors = {"black", "silver", "blue", "white", "red"};
    final String[] manufacturers = {"Lenovo", "Apple", "Asus", "HP", "Acer"};
    Map<String, String> filterSet;

    public LaptopFilter() {
        this.filterSet = new HashMap<>();
    }

    public void add(String key, String value) {
        if (value.length() > 0)
            filterSet.put(key, value);
    }

}
