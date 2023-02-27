import java.util.ArrayList;
import java.util.List;

public class ArrListsExamples {
//      1.Реализовать алгоритм сортировки слиянием
//      2.Пусть дан произвольный список целых чисел, удалить из него четные числа
//      3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 4, 11, 3, 8, 10, 2, 15, 19, 7, 5));
        System.out.println("Initial array: " + list1);
        System.out.println("Merge sorted array: " + mergeSort(list1));
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> initialArray) {
        ArrayList<Integer> result;

        if (initialArray.size() <= 1)
            return initialArray;
        else {
            int middle = initialArray.size() / 2;
            ArrayList<Integer> leftHalf = new ArrayList<>(initialArray.subList(0, middle));
            ArrayList<Integer> rightHalf = new ArrayList<>(initialArray.subList(middle, initialArray.size()));
            result = merge(mergeSort(leftHalf), mergeSort(rightHalf));
            return  result;

        }
    }


    public static ArrayList<Integer> merge(ArrayList<Integer> firstPart, ArrayList<Integer> secondPart){
        ArrayList<Integer> result = new ArrayList<>(firstPart.size() + secondPart.size());

        int fi = 0; int si = 0;

        while (fi < firstPart.size() && si < secondPart.size()) {
            if (firstPart.get(fi) <= secondPart.get(si)) {
                result.add(firstPart.get(fi));
                fi++;
            } else {
                result.add(secondPart.get(si));
                si++;
            }
        }
        while (fi < firstPart.size()) {
            result.add(firstPart.get(fi));
            fi++;
        }

        while (si < secondPart.size()) {
            result.add(secondPart.get(si));
            si++;
        }

        return result;

    }

}
