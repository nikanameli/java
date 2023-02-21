package homefour;

import java.util.LinkedList;

public class TaskOne {
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<>();
        // Appending elements at the end of the list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList = reverseLinkedList(linkedList);
        System.out.print(linkedList);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> linkedList)
    {
        LinkedList<Integer> reverseLinkedList = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            reverseLinkedList.add(linkedList.get(i));
        }
        return reverseLinkedList;
    }
}
