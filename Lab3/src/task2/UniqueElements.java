package task2;

import java.util.*;

public class UniqueElements {
    public static <T> Collection<T> getUniqueElements(List<T> list) {
        return new HashSet<>(list);
    }

    public static <T> Map<T, Integer> getElementCounts(List<T> list) {
        Map<T, Integer> counts = new HashMap<>();
        for (T element : list) {
            counts.put(element, counts.getOrDefault(element, 0) + 1);
        }
        return counts;
    }
}