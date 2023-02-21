package homefour;

import java.util.*;


public class TaskTwo {

    public LinkedList<Integer> linkedList;

    TaskTwo() {
        this.linkedList = new LinkedList<>();
    }

    public static void main(String[] args)
    {
        TaskTwo myLinkedList = new TaskTwo();
        myLinkedList.enqueue(1);
        myLinkedList.enqueue(2);
        myLinkedList.enqueue(3);
        System.out.println(myLinkedList.linkedList);
        System.out.println(myLinkedList.first());
        System.out.println(myLinkedList.dequeue());
        System.out.println(myLinkedList.linkedList);
    }

    public void enqueue(int el) {
        this.linkedList.add(el);
    }

    public Integer dequeue() {
        if (!this.linkedList.isEmpty()) {
            int el = this.linkedList.get(0);
            this.linkedList.remove(0);
            return el;
        }
        return null;
    }

    public Integer first() {
        if (!this.linkedList.isEmpty()) {
            return this.linkedList.get(0);
        }
        return null;
    }

}