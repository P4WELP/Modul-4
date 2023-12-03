package WordCounter;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        WordCounter wordCounter = new WordCounter();
        Map<String, Integer> wordCountMap = wordCounter.CountWords(text);

        // Wyświetlenie wyników
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public Map<String, Integer> CountWords(String text) {
        // Usunięcie znaków specjalnych i podział tekstu na słowa
        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        // Mapa do przechowywania ilości tych samych słów
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Iteracja po słowach i zliczanie ich ilości
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordCountMap;
    }
}