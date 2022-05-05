package stacking;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic Class MyStack simulating stack behaviour.
 * @param <T>
 */

public class MyStack<T> {

    private List<T> s1;
    private T t1;
    private int index = 0;


    /**
     * No-argument constructor
     */
    public MyStack() {
    }

    /**
     * Parameterized constructor
     * @param s1
     * @param t1
     */
    public MyStack(List<T> s1, T t1) {
        this.s1 = new ArrayList<>();
        this.t1 = t1;
    }

    /**
     * Push method that adds an element to the ArrayList
     * @param s1
     * @param t1
     * @return ArrayList<T>
     */
    public ArrayList<T> push(ArrayList<T> s1, T t1) {
        s1.add(t1);
        index++;
        return s1;
    }

    /**
     * Pop method that removes the top element of the stack.
     * @param s1
     * @return ArrayList<T>
     */
    public ArrayList<T> pop(ArrayList<T> s1) {
        --index;
        if (s1.isEmpty()) {
            System.out.println("The stack is empty");
            return s1;
        }
        System.out.println("Removing " + s1.get(index) + " in [" + index + "]");
        s1.remove(index);
        return s1;
    }


    /**
     * Prints all ArrayList elements with their index.
     * @param s1
     */
    public void printArrayList(ArrayList<T> s1) {
        int position=0;
        for (T t : s1) {
            System.out.println("[" + String.valueOf(position++) + "] " + t);
        }
    }
}
