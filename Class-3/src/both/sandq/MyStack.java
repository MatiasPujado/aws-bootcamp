package both.sandq;

/**
 *  Generic Class MyStack that simulates queue behaviour.
 * @param <T>
 */

public class MyStack<T> {

    private T t1;
    private int size, index = 0;
    private T[] a1;

    /**
     * No-Argument constructor
     */
    public MyStack() {
    }

    /**
     * Parameterized constructor
     * @param size
     */
    public MyStack(int size) {
        this.size = size;
        this.a1=(T[]) new Object[size];
    }


    /**
     * Adds an element to the stack
     * @param a1
     * @param t1
     * @return Generic Array T[]
     */
    public T[] push(T[] a1, T t1) {
        a1[index] = t1;
        index++;
        return a1;
    }

    /**
     * Removes the first element of the stack
     * @param a1
     * @return Generic Array T[]
     */
    public T[] pop(T[] a1) {
        a1[index-1] = null;
        index--;
        return a1;
    }

    /**
     * Prints on screen the list of stack's elements
     * @param a1
     */
    public void printStack(T[] a1) {

        for(int i = 0; i < a1.length; i++) {
            System.out.println("[" + i + "] " + a1[i]);
        }
    }
}
