package queuing;

import java.util.ArrayList;

/**
 * 2 - Implementar la clase Fila (Utilizando una Collection que no implemente la interfaz Queue / Deque)
 */

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        MyQueue<String> mq = new MyQueue<>();

        System.out.println("");
        mq.push(names, "Luis");
        mq.push(names, "Ludmila");
        mq.push(names, "Carlos");
        mq.push(names, "Martin");
        mq.push(names, "Andres");

        mq.printArrayList(names);
        System.out.println("");

        mq.pop(names);
        mq.pop(names);
        mq.pop(names);
        mq.pop(names);

        System.out.println("");
        System.out.println(names.size());

        System.out.println("");
        mq.printArrayList(names);

    }
}
