package classifying.text;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 4 - Tome un texto considerablemente largo de alguna página de internet y colóquelo en un String.  Proceda a quitarle los simbolos de puntuación (, . ;).
 * Luego realice un split en base a los espacios en blanco.  Asi obtenemos una arreglo de palabras.
 * Procesar dicho arreglo con un stream, quitando los duplicados y clasificando las palabras respecto de su dimensión, para lograr algo similar a esto:
 * <p>
 * 1 letra [5]:
 * A
 * a
 * y
 * e
 * o
 * <p>
 * 2 letras [2]:
 * de
 * un
 * <p>
 * 3 letras ....
 */

public class Main {
    public static void main(String[] args) {

        String text = "Computer science often advances in fits and starts, with good ideas appearing decades before they suddenly become part of the mainstream. For example, Simula 67, created in 1967, is the first object-oriented language, yet object orientation didn’t really become mainstream until after the popularization of C++, which first appeared in 1983. Often, good ideas await foundation technologies to catch up. In its early years, Java was regularly considered too slow and expansive in memory usage for high-performance applications, but shifts in the hardware market made it an attractive choice.";


        List<String> wordList = List.of(text.replaceAll("\\.", "").replaceAll(",", "").split(" "));
        System.out.println("");
        System.out.println(wordList);
        System.out.println("");


        Map<Integer, List<String>> wordsByDimension = wordList.stream()
            .distinct()
            .collect(Collectors.groupingBy(String::length));

		wordsByDimension.forEach((key, value) -> {
            System.out.println(key + " letras [" + value.size() + "] :");
            value.forEach(System.out::println);
            System.out.println();
        });


    }
}
