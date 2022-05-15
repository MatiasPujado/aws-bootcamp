package numbers.list;

import java.util.List;
import java.util.stream.Stream;

/**
 * 3 - Utilizando el metodo anterior, obtenga una lista de numeros entre 2 limites y proceda a transformarlos en String para despues obtener una cadena como la siguiente:
 * 10 -> 11 -> 12 -> 13 -> 14 -> 15 ...
 * Y como haría para obtener un String concatenando n veces el número a concatenar?, ej:
 * <p>
 * 122333444455555....
 */

public class Main {
    public static void main(String[] args) {

        List<String> stringList = listWithLimits(0, 5);

        System.out.println("");
        System.out.println(String.join(" -> ", stringList));
        System.out.println("");
        System.out.println("");
        System.out.println(nTimesPrinted(0, 5));
        System.out.println("");


    }

    /**
     * Prints a string with values modified from a list of numbers
     *
     * @param begin
     * @param end
     */
    public static List<String> listWithLimits(Integer begin, Integer end) {
        List<Integer> numList = Stream.iterate(begin, n -> n + 1)
                .limit(end)
                .toList();

        return numList.stream()
                .map(String::valueOf)
                .toList();
    }


    public static String nTimesPrinted(Integer begin, Integer end) {
        List<Integer> numList = Stream.iterate(begin, n -> n + 1)
                .limit(end)
                .toList();

        return numList.stream()
                .map(Main::concatNum)
                .reduce("", (x, y) -> y = x + y);

    }

    public static String concatNum(Integer x) {
        String str = "";

        for (int i = 0; i <= x; i++) {
            str += x;
        }

        return str;
    }
}