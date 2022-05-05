package bintree;

/**
 * 4 - Implementar la clase Arbol Binario con los 3 recorridos básicos (inOrden, preOrden y postOrden)
 */

public class Main {
    public static void main(String[] args) {

        Tree<Integer> myTree = new Tree<>();

        myTree.addData(100);
        myTree.addData(150);
        myTree.addData(10);
        myTree.addData(50);
        myTree.addData(15);

        System.out.println("");
        System.out.println("PRE_ORDER (NLR) =>");
        myTree.traverseTree(Traverse.PRE_ORDER);

        System.out.println("");
        System.out.println("IN_ORDER (LNR) =>");
        myTree.traverseTree(Traverse.IN_ORDER);

        System.out.println("");
        System.out.println("POST_ORDER (LRN) =>");
        myTree.traverseTree(Traverse.POST_ORDER);

    }
}
