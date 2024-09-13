package Chapter12_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue4Linkedlist {
    public static void main(String[] args) {
        Queue<String> fruit=new LinkedList<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orenge");
        fruit.add("grapes");
        fruit.add("lemon");

        System.out.println("Queue is:"+fruit+" SIZE:"+fruit.size());

        String removedfruit=fruit.remove();
        System.out.println("Queue is:"+fruit+" SIZE:"+fruit.size()+" Removed fruit: "+removedfruit);

        System.out.println(" Peek element "+fruit.peek()+" "); //peek used to view the head of the queue without removing it

    }
}
