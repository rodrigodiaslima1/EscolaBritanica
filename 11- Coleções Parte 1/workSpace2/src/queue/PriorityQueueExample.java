package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args){

        Queue<String> queueList = new PriorityQueue<>();

        queueList.add("alberta");
        queueList.add("miami");
        queueList.add("tihuana");

        System.out.println(queueList);


        while(queueList.size() != 0){
            System.out.println(queueList.remove());
        }

    }

}
