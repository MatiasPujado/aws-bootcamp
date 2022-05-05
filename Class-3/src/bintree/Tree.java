package bintree;

import java.util.Objects;

/**
 * Binary tree
 */

public class Tree<T extends Comparable<T>> {

    /**
     * Root node is set to null
     */
    private Node<T> rootNode = null;

    /**
     * No-argument constructor
     */
    public Tree() {
    }

    /**
     * Parameterized constructor
     *
     * @param rootNode
     */
    public Tree(Node<T> rootNode) {
        this.rootNode = rootNode;
    }

    /**
     * Validates the input data and allows the creation of the root node
     *
     * @param data
     */
    public void addData(T data) {
        if (!Objects.isNull(data)) {
            if (Objects.isNull(this.rootNode)) {
                this.rootNode = new Node<>(data);
            } else {
                this.addData(this.rootNode, data);
            }
        }
    }

    /**
     * It determines whether a new node should be created(L-R) or it should keep looking recursively
     *
     * @param nodeTree
     * @param data
     */
    public void addData(Node<T> nodeTree, T data) {
        if (nodeTree.getT1().compareTo(data) <= 0) {
            if (Objects.isNull(nodeTree.getNodeRight())) {
                nodeTree.setNodeRight(new Node<>(data));
            } else {
                this.addData(nodeTree.getNodeRight(), data);
            }
        } else {
            if (Objects.isNull(nodeTree.getNodeLeft())) {
                nodeTree.setNodeLeft(new Node<>(data));
            } else {
                this.addData(nodeTree.getNodeLeft(), data);
            }
        }
    }



    /**
     * Pre-Order traverse (NLR)
     *
     * @param nodeTree
     */
    public void preOrder(Node<T> nodeTree) {
        if (!Objects.isNull(nodeTree)) {
            System.out.println(nodeTree.getT1());
            this.preOrder(nodeTree.getNodeLeft());
            this.preOrder(nodeTree.getNodeRight());
        }
    }

    /**
     * In-Order traverse (LNR)
     *
     * @param nodeTree
     */
    public void inOrder(Node<T> nodeTree) {
        if (!Objects.isNull(nodeTree)) {
            this.inOrder(nodeTree.getNodeLeft());
            System.out.println(nodeTree.getT1());
            this.inOrder(nodeTree.getNodeRight());
        }
    }

    /**
     * Post-Order traverse (LRN)
     *
     * @param nodeTree
     */
    public void postOrder(Node<T> nodeTree) {
        if (!Objects.isNull(nodeTree)) {
            this.postOrder(nodeTree.getNodeLeft());
            this.postOrder(nodeTree.getNodeRight());
            System.out.println(nodeTree.getT1());
        }
    }

    /**
     * It will execute any of the three DFS (Depth-First Search)
     *
     * @param cross
     */
    public void traverseTree(Traverse cross) {
        switch (cross) {
            case PRE_ORDER:
                this.preOrder(this.rootNode);
                break;
            case IN_ORDER:
                this.inOrder(this.rootNode);
                break;
            case POST_ORDER:
                this.postOrder(this.rootNode);
                break;
            default:
                System.err.println("Invalid traverse.");
        }
    }
}
