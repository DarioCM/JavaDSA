package org.example.priorityqueue.heaps;

import java.util.PriorityQueue;

public class PriorityQueueMain {

    public static void main(String[] args){

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(25);
        priorityQueue.add(-22);
        priorityQueue.add(1343);
        priorityQueue.add(54);
        priorityQueue.add(0);
        priorityQueue.add(-3492);
        priorityQueue.add(429);

        System.out.println(priorityQueue.peek()); //lowest number
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll()); //remove the highest priority -> minus
        System.out.println(priorityQueue.peek()); //[rint the root of the tree



    }



}
