package lists.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * 2 - Si pudieron realizar correctamente el anterior, ahora creemos un método como el siguiente:
 * <p>
 * List<Integer> obtenerListaSecuencialCondicionada(Integer desde, Integer hasta, Predicate<Integer> condicion)
 * <p>
 * Como ven, estoy generalizando el ejercicio anterior. Y, como establecerían la posibilidad de recibir múltiples predicados condicionales?
 * <p>
 * List<Integer> obtenerListaSecuencialCondicionadaMultiple(Integer desde, Integer hasta, List<Predicate<Integer>> condiciones)
 * List<Integer> obtenerListaSecuencialCondicionadaMultiple(Integer desde, Integer hasta, Predicate<Integer>[] condiciones)
 * List<Integer> obtenerListaSecuencialCondicionadaMultiple(Integer desde, Integer hasta, Predicate<Integer> ... condicion)
 * <p>
 * Desarrollar los 3 por favor. Es posible, por que? Si no es posible, defina 2.
 * <p>
 * Ahora pensemos que cualquiera de los parámetros (desde, hasta, condicion) podrían ser nulos.  Como lo resolverían.  Incluso, implementemos el metodo:
 * <p>
 * List<Integer> obtenerListaSecuencial(Integer desde, Integer hasta)  reutilizando el metodo anterior!!!
 */

public class Main {
    static List<Integer> nnlist = new ArrayList<>();

    public static void main(String[] args) {

        List<Integer> lInt = obtenerListaSecuencialCondicionada(10, 20, x -> x % 2 == 0);

        System.out.println(lInt);

        lInt = obtenerListaSecuencialCondicionada(1, 100, x -> x % 3 == 0);

        System.out.println(lInt);

        lInt = obtenerListaSecuencialCondicionadaMultiple(1, 100, x -> x % 3 == 0, x -> x % 2 == 0);

        System.out.println(lInt);

        lInt = obtenerListaSecuencialCondicionadaMultiple(1, 100, new ArrayList<Predicate<Integer>>());

        System.out.println(lInt);

        lInt = obtenerListaSecuencial(1, 50);

        System.out.println(lInt);

    }

    public static List<Integer> obtenerListaSecuencialCondicionada(Integer desde, Integer hasta, Predicate<Integer> condicion) {
        return Stream.iterate(Optional.ofNullable(desde)
                                .orElse(1),
                        x -> x <= Optional.ofNullable(hasta)
                                .orElse(100),
                        x -> x + 1)
                .filter(Optional.ofNullable(condicion)
                        .orElse(x -> true))
                .toList();
    }

    public static List<Integer> obtenerListaSecuencialCondicionadaMultiple(Integer desde, Integer hasta, List<Predicate<Integer>> condiciones) {
        Predicate<Integer> condCompuesta = Optional.ofNullable(condiciones)
                .orElse(List.of(x -> true))
                .stream()
                .reduce((x, y) -> y.and(x))
                .orElse(x -> true);

        return obtenerListaSecuencialCondicionada(desde, hasta, condCompuesta);
    }

    public static List<Integer> obtenerListaSecuencial(Integer desde, Integer hasta) {
        return obtenerListaSecuencialCondicionada(desde, hasta, null);
    }

    @SafeVarargs
    public static List<Integer> obtenerListaSecuencialCondicionadaMultiple(Integer desde, Integer hasta, Predicate<Integer>... condiciones) {
        return obtenerListaSecuencialCondicionadaMultiple(desde, hasta, Arrays.asList(Optional.ofNullable(condiciones).orElse(null)));
    }
}
