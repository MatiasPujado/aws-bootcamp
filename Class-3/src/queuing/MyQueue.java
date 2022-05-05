package queuing;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic Class MyQueue that simulates a queue behaviour.
 *
 * @param <T>
 */

public class MyQueue<T> {

    private List<T> q1;
    private T t1;
    private int index = 0;


    /**
     * No-argument constructor
     */
    public MyQueue() {
    }

    /**
     * Parameterized constructor
     * @param q1
     * @param index
     */
    public MyQueue(List<T>q1, int index) {
        this.q1 = new ArrayList<>();
        this.index = index;
    }

    /**
     * Push method that adds an element to the ArrayList<T>
     * @param q1
     * @param t1
     * @return ArrayList<T>
     */
    public ArrayList<T> push(ArrayList<T>q1, T t1) {
        q1.add(t1);
        return q1;
    }

    /**
     * Method that removes the first element of the queue.
     * @param q1
     * @return ArrayList<T>
     */
    public ArrayList<T> pop(ArrayList<T>q1) {
        if (q1.isEmpty()) {
            System.out.println("The queue is empty");
            return q1;
        }
        System.out.println("Removing " + q1.get(index));
        q1.remove(index);
        return q1;
    }

    /**
     * Prints elements in the queue with their index.
     * @param s1
     */
    public void printArrayList(ArrayList<T> s1) {
        int position=0;
        for (T t : s1) {
            System.out.println("[" + String.valueOf(position++) + "] " + t);
        }
    }

}
