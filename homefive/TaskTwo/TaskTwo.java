package homefive.TaskTwo;

import java.util.*;


public class TaskTwo {

    public static void main(String[] args) {
        List<String> list = List.of(new String[]{"Глеб", "Ваня", "Ваня", "Глеб", "Хлеб", "Зиз", "Глеб"});
        HashMap<String, Integer> map = new HashMap<>();
        for (String name: list) {
            map.merge(name, 1, Integer::sum);
        }
        for (String name: map.keySet()) {
            if (map.get(name) > 1) {
                System.out.printf("%s, %d\n", name, map.get(name));
            }
        }
    }
}