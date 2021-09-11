package lesson10;

import java.util.HashMap;

public class WordsCalculator {

    private HashMap<String, Integer> wordsDict = new HashMap<>();

    public WordsCalculator(String[] words) {
        for (String word : words) {
            wordsDict.put(word, wordsDict.getOrDefault(word, 0) + 1);
        }
    }

    public int getUniqueWordsNumber(){
        return wordsDict.size();
    }

    public void printUniqueWords(){
        System.out.println(wordsDict.keySet());
    }

    public void printWordsCount(){
        wordsDict.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }

}
