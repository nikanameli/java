package homethree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskTwo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 23, 33, 12, 14, 15, 19, 9);
        list = list.stream().filter(integer -> (integer % 2 != 0)).collect(Collectors.toList());
        System.out.println(list);
    }
}
