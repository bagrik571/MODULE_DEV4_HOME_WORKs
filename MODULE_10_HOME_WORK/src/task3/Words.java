package task3;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Words {
    public static void main(String[] args) throws IOException {
        try (FileWriter wordsWriter = new FileWriter("C:\\Users\\bagri\\java16\\MODULE_10_HOME_WORK\\src\\task3\\Words.txt")) {
            wordsWriter.write("the day is sunny the the\n");
            wordsWriter.write("the sunny is is");
        }
        Map<String, Integer> wordCounts = new HashMap<>();
        Path path = Paths.get("C:\\Users\\bagri\\java16\\MODULE_10_HOME_WORK\\src\\task3\\Words.txt");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String[] words = scanner.nextLine().split("\\s+");
                for (String word : words) {
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCounts.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
