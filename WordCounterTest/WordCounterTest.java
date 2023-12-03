package WordCounter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

public class WordCounterTest {

    @Test
    public void testWordCount() {
        WordCounter wordCounter = new WordCounter();
        String inputText = "Ala ma kota, kota ma Ala";
        Map<String, Integer> wordCountMap = wordCounter.CountWords(inputText);

        // Sprawdzenie wyników
        assertEquals(2, wordCountMap.get("ala").intValue());
        assertEquals(2, wordCountMap.get("ma").intValue());
        assertEquals(2, wordCountMap.get("kota").intValue());

    }
}