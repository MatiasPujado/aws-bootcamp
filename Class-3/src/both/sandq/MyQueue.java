package both.sandq;

/**
 * Generic Class MyQueue that simulates queue behaviour.
 *
 * @param <T>
 */

public class MyQueue<T> {

    private T t1;
    private int size, index = 0, j = 0;
    private T[] a1;

    /**
     * No-Argument constructor
     */
    public MyQueue() {
    }

    /**
     * Parameterized constructor
     *
     * @param size
     */
    public MyQueue(int size) {
        this.size = size;
        this.a1 = (T[]) new Object[size];
    }


    /**
     * Adds an element to the queue
     *
     * @param a1
     * @param t1
     * @return Generic Array T[]
     */
    public T[] push(T[] a1, T t1) {
        a1[j] = t1;
        j++;
        return a1;
    }

    /**
     * Removes the first element of the queue
     *
     * @param a1
     * @return Generic Array T[]
     */
    public T[] pop(T[] a1) {
        a1[index] = null;
        index++;
        return a1;
    }

    /**
     * Prints on screen the list of queue's elements
     *
     * @param a1
     */
    public void printQueue(T[] a1) {

        for (int i = 0; i < a1.length; i++) {
            System.out.println("[" + i + "] " + a1[i]);
        }
    }
}
