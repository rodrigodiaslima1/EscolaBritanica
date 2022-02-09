import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {

    public static void main(String[] args){

        Queue<String> stringQueue = new PriorityQueue<>();

        stringQueue.add("short");
        stringQueue.add("very long indeed");
        stringQueue.add("medium");

        while(stringQueue.size() != 0){
            System.out.println(stringQueue.remove());
        }

    }

}
