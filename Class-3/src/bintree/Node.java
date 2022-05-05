package bintree;

/**
 * Minimal unit of the tree.
 */

public class Node<T extends Comparable<T>> {

    private Node nodeLeft, nodeRight;
    private T t1;

    /**
     * No-Argument constructor
     */
    public Node() {
    }

    /**
     * Parameterized constructor
     * @param t1
     */
    public Node(T t1) {
        this.t1 = t1;
        nodeLeft = nodeRight = null;
    }

    //  ### Getters & Setters ###
    public Node getNodeLeft() {
        return nodeLeft;
    }

    public void setNodeLeft(Node nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public Node getNodeRight() {
        return nodeRight;
    }

    public void setNodeRight(Node nodeRight) {
        this.nodeRight = nodeRight;
    }

    public T getT1() {
        return t1;
    }

    public void setT1(T t1) {
        this.t1 = t1;
    }
}
