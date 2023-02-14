package homethree;

import java.util.Arrays;

public class TaskOne {

    public static int[] sortPart(int[] list1, int[] list2, int from, int to) {
        if (from + 1 >= to) {
            return list1;
        }

        int median = (to + from) / 2;
        int[] new_list1 = sortPart(list1, list2, from, median);
        int[] new_list2 = sortPart(list1, list2, median, to);

        int index1 = from;
        int index2 = median;
        int destIndex = from;
        int[] result = new_list1 == list1 ? list2 : list1;
        while (index1 < median && index2 < to) {
            result[destIndex++] = new_list1[index1] < new_list2[index2]
                    ? new_list1[index1++] : new_list2[index2++];
        }
        while (index1 < median) {
            result[destIndex++] = new_list1[index1++];
        }
        while (index2 < to) {
            result[destIndex++] = new_list2[index2++];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {11, 4, 77, 55, 12, 43, 11, 10, 9, 105};
        System.out.println(Arrays.toString(sortArray(array)));
    }

    public static int[] sortArray(int[] array) {
        return sortPart(Arrays.copyOf(array, array.length), new int[array.length], 0, array.length);
    }
}