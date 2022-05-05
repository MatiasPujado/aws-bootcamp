package both.sandq;

/**
 * 3 - Implementar las clases Pila y Fila sin utilizar Collections
 */

public class Main {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        int size;
        Integer[] ages;

        System.out.println("");
        System.out.println("##################################################");
        System.out.println("             Queue");
        System.out.println("##################################################");

        System.out.println("");
        System.out.print("How many items will you add?: ");
        //size = sc.nextInt();
        size = 4;
        System.out.println(size);
        ages = new Integer[size];

        MyQueue<Integer> mq = new MyQueue<>(size);

        mq.push(ages, 1414);
        mq.push(ages, 1400);
        mq.push(ages, 1751);
        mq.push(ages, 1285);

        System.out.println("");
        mq.printQueue(ages);

        System.out.println("");
        mq.pop(ages);
        mq.pop(ages);
//        mq.pop(ages);
//        mq.pop(ages);


        System.out.println("");
        mq.printQueue(ages);

        System.out.println("");
        System.out.println("##################################################");
        System.out.println("            Stack");
        System.out.println("##################################################");

        int sizeStack;
        String[] names;

        System.out.println("");
        System.out.print("How many items will you add?: ");
        //sizeStack = sc.nextInt();
        sizeStack = 4;
        System.out.println(sizeStack);
        names = new String[sizeStack];

        MyStack<String> ms = new MyStack<>(sizeStack);

        ms.push(names, "Roberto");
        ms.push(names, "Ana");
        ms.push(names, "Laura");
        ms.push(names, "Damian");

        System.out.println("");
        ms.printStack(names);

        System.out.println("");
        ms.pop(names);
        ms.pop(names);
//        ms.pop(names);
//        ms.pop(names);


        System.out.println("");
        ms.printStack(names);

    }
}
