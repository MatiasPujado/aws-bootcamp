package natural.num.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 1 - Construir un Stream de numeros naturales que contenga todos los números pares mayores o iguales a 10 y menores o iguales a 20.  Presentar en una lista de Integer en forma ordenada.
 * Existen varias formas de realizar esto y me gustaría ver todas las opciones que se les ocurren.
 */

public class Main {
    public static void main(String[] args) {

        List<Integer> nnlist = new ArrayList<>();
        int i = 1;
        while (i <= 20) {
            nnlist.add(i);
            i++;
        }
        System.out.println("");
        System.out.println("nnlist = " + nnlist);
        System.out.println("");


        /////////////////////////////////////////////////////////////////////////////////
        // Option A

        List<Integer> evenNum = nnlist.stream()
                .filter(n -> (n >= 10) && (n <= 20) && (n % 2 == 0))
                .collect(Collectors.toList());
        System.out.println("evenNum = " + evenNum);
        System.out.println("");


        /////////////////////////////////////////////////////////////////////////////////
        // Option B

        nnlist.stream()
                .skip(10)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);


        /////////////////////////////////////////////////////////////////////////////////
        // Made in class

        List<Integer> lInt = Stream.iterate(10, x -> x + 2)
                .limit(6)
                .collect(Collectors.toList()); // podemos usar directamente el toList de Stream

        System.out.println("");
        System.out.println(lInt);
        System.out.println("");

        /////////////////////////////////////////////////////////////////////////////////

        lInt = Stream.iterate(10, x -> x + 2)
                .limit(6)
                .toList();

        System.out.println("");
        System.out.println(lInt);
        System.out.println("");

        /////////////////////////////////////////////////////////////////////////////////


        lInt = Stream.iterate(10, x -> x < 21, x -> x + 2)
                .toList();

        System.out.println("");
        System.out.println(lInt);
        System.out.println("");

        /////////////////////////////////////////////////////////////////////////////////


        lInt = Stream.iterate(10, x -> x + 1)
                .limit(11)
                .filter(x -> x % 2 == 0)
                .toList();

        System.out.println("");
        System.out.println(lInt);
        System.out.println("");

        /////////////////////////////////////////////////////////////////////////////////

        lInt = IntStream.rangeClosed(10, 20)
                .filter(x -> x % 2 == 0)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("");
        System.out.println(lInt);
        System.out.println("");

        /////////////////////////////////////////////////////////////////////////////////

        lInt = IntStream.rangeClosed(10, 20)
                .filter(x -> x % 2 == 0)
                .mapToObj(Integer::valueOf)
                .toList();

        System.out.println("");
        System.out.println(lInt);
        System.out.println("");

    }
}
