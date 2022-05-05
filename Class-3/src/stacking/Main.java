package stacking;


import java.util.ArrayList;

/**
 * 1 - Implementar la clase Pila (Utilizando una Collection que no implemente la interfaz Queue / Deque)
 */

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        MyStack<String> ms = new MyStack<>();

        System.out.println("");
        ms.push(names, "Luis");
        ms.push(names, "Ludmila");
        ms.push(names, "Carlos");
        ms.push(names, "Martin");
        ms.push(names, "Andres");


        ms.printArrayList(names);
        System.out.println("");

        ms.pop(names);
        ms.pop(names);
        ms.pop(names);
        ms.pop(names);
        System.out.println("");

        ms.printArrayList(names);
    }
}
