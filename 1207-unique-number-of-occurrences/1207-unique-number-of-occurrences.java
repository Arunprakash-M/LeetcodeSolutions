import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();

        for (int num : arr) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }

        Set<Integer> uniqueOccurrences = new HashSet<>(occurrenceMap.values());
        return uniqueOccurrences.size() == occurrenceMap.size();
    }
}
