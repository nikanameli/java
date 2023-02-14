package homethree;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskThree {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int max = arrayList.get(0);
        int min = arrayList.get(0);
        float sum = 0;
        int counter = 0;
        for (int i: arrayList) {
            sum += i;
            counter += 1;
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum / counter);
    }
}