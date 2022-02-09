package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    public static void main(String[] args) {

        Deque<String> dequeList = new ArrayDeque<>();

        dequeList.add("alberta");
        dequeList.add("miami");
        dequeList.add("tihuana");

        System.out.println("Last element: " + dequeList.getLast());
        System.out.println("First element: " + dequeList.getFirst());

    }

}
