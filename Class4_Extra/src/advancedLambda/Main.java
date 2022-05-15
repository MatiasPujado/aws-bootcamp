package advancedLambda;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * 5 - Este último ejercicio lo pongo sobre la mesa para que lo veamos juntos ya que se basa en uso avanzado de Lambdas.
 *
 * Supongamos que quiero utilizar una interface funcional que realice lo siguiente f(x, y) = 2*x + 3*y
 * Tengo 2 opciones, implemento mi Interface Funcional que va a estar lista para acoplar con el lambda o utilizo BIFunction que es similar a Funcion pero acepta 2 parámetros, justo lo que necesito.
 * Quiero que implementen ambos casos, incluso, igualando contra el lambda pero previamente desarrollando la clase abstracta para comparar ambos funcionamientos.
 *
 * Ahora compliquemos un poco la situación:  Utilicemos Function.  Con esto vamos a estar aplicando el concepto de Currying (investigen Currying) que es bastante común en los lenguajes puramente funcionales y que también es posible en java (con un poco de esfuerzo)
 *
 * Y finalmente, para que no se aburran, implementemos con Function un interface capaz de recibir un lamba de haga esto f(x, y, z) = 2*x + 3*y + 4*z
 *
 * Que las interfaces utilicen Long
 *
 * Importante, cuando hablamos de desarrollar una Interface es definir como será el tipo del parámetro que reciba dicho lamba en un metodo que lo utilice.  Ej:  debemos tener un metodo eval(Function f, Long ... parametros), este metodo obtendrá el resultado en base al lambda que le estamos pasando y los parametros, por supuesto.
 */

public class Main {
    @FunctionalInterface
    public interface LambdaFunction<T, L, R> {
        R apply(T t, L l);
    }

    public static <T> T eval(LambdaFunction<T, T, T> f, T ... params) {
        return f.apply(params[0], params[1]);
    }

    public static <T> T evalBI(BiFunction<T, T, T> f, T ... params) {
        return f.apply(params[0], params[1]);
    }

    public static <T> T evalFunc(Function<T, Function<T, T>> f, T ... params) {
        return f.apply(params[0])
                .apply(params[1]);
    }

    public static <T> T evalTriFunc(Function<T, Function<T, Function<T, T>>> f, T ... params) {
        return f.apply(params[0])
                .apply(params[1])
                .apply(params[2]);
    }

    public static void main(String[] args) {

        /**
         * f(x, y) = 2*x + 3*y con Interfaz Funcional propia
         */
        LambdaFunction<Long, Long, Long> lf = new LambdaFunction<Long, Long, Long>() {

            @Override
            public Long apply(Long t, Long l) {
                return 2*t + 3*l;
            }
        };

        System.out.println("f(x, y) = 2*x + 3*y (sin lambda) -> " + eval(lf, 3L, 4L));

        /**
         * ahora invocaremos eval directamente con un lambda que haga matching
         */
        System.out.println("f(x, y) = 2*x + 3*y (con lambda) -> " + eval((x, y) -> 2*x + 3*y, 3L, 4L));

        /**
         * Ahora utilicemos la interface funcional BiFunction que nos provee java
         */
        BiFunction<Long, Long, Long> biFunc = new BiFunction<Long, Long, Long>() {

            @Override
            public Long apply(Long t, Long u) {
                return 2*t + 3*u;
            }

        };


        System.out.println("f(x, y) = 2*x + 3*y (sin lambda con BIFunction) -> " + evalBI(biFunc, 3L, 4L));

        /**
         * ahora invocaremos evalBI directamente con un lambda que haga matching
         */
        System.out.println("f(x, y) = 2*x + 3*y (con lambda con BIFunction) -> " + evalBI((x, y) -> 2*x + 3*y, 3L, 4L));

        /**
         * Ahora intentaremos implementarlo con Function (Function solo recibe un parametro!) -> Currying
         */

        Function<Long, Function<Long, Long>> func = new Function<Long, Function<Long, Long>>() {

            @Override
            public Function<Long, Long> apply(Long t) {
                return new Function<Long, Long>() {

                    @Override
                    public Long apply(Long u) {
                        return 2*t + 3*u;
                    }

                };
            }

        };

        System.out.println("f(x, y) = 2*x + 3*y (sin lambda con Function) -> " + evalFunc(func, 3L, 4L));

        System.out.println("f(x, y) = 2*x + 3*y (con lambda con Function) -> " + evalFunc(x -> y -> 2*x + 3*y, 3L, 4L));

        /**
         * Implementamos f(x, y, z) = 2*x + 3*y + 4*z con Function
         *
         */

        Function<Long, Function<Long, Function<Long, Long>>> triFunc = new Function<Long, Function<Long, Function<Long, Long>>>() {

            @Override
            public Function<Long, Function<Long, Long>> apply(Long t) {
                return new Function<Long, Function<Long, Long>>() {

                    @Override
                    public Function<Long, Long> apply(Long u) {
                        // TODO Auto-generated method stub
                        return new Function<Long, Long>() {

                            @Override
                            public Long apply(Long v) {
                                // TODO Auto-generated method stub
                                return 2*t + 3*u + 4*v;
                            }

                        };
                    }

                };
            }

        };

        System.out.println("f(x, y, z) = 2*x + 3*y + 4*z (sin lambda con Function) -> " + evalTriFunc(triFunc, 3L, 4L, 5L));

        System.out.println("f(x, y, z) = 2*x + 3*y + 4*z (con lambda con Function) -> " + evalTriFunc(x -> y -> z -> 2*x + 3*y + 4*z, 3L, 4L, 5L));

    }
}
