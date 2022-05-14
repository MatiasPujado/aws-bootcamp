package list.of.students;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Names {
    LUIS,
    ANALIA,
    ESTEBAN,
    FERNANDO,
    IVAN,
    KEVIN,
    OSCAR,
    ROBERTO,
    SAMUEL,
    TOMAS,
    CARLOS,
    MARTIN,
    GERMAN,
    DANIELA,
    LETICIA,
    MARIA,
    PIA,
    CARLA,
    JULIAN,
    JULIETA;

    private static final List<Names> names = Collections.unmodifiableList(Arrays.asList(values()));

    /**
     * Provides a random name
     * @return name
     */
    public static Names randomName() {
        return names.get((int) (Math.random() * 10));
    }
}