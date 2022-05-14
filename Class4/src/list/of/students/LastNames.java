package list.of.students;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum LastNames {
    GOMEZ,
    LOPEZ,
    SAEZ,
    AGUIRRE,
    FERNANDEZ,
    GARCIA,
    SOSA,
    ACOSTA,
    CAMPOS,
    CRUZ,
    LUNA,
    MARTINEZ,
    OLIVERA;

    private static final List<LastNames> surname = Collections.unmodifiableList(Arrays.asList(values()));

    /**
     *  Provides a random last name
     * @return last name
     */
    public static LastNames randomLastName() {
        return surname.get((int) (Math.random() * 10));
    }


}
