import com.sun.jdi.Value;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CalculateIdTest {

//Clase Junit que verifica el correcto funcionamiento del método
// calculateLetterId de la clase CalculateId. Se han creado dos test
// parametrizados para testear el mismo método con la intención de ejemplificar
//las diferentes opciones disponibles.

    @ParameterizedTest
    @CsvSource({"11111111, H", "49812198, V", "22222222, J", "33333333,P",
            "59849248, M","40954950, T","20943203,R", "56567675, A",
            "23212123, V", "56345342,'B'"})
    void testIdCsv(int argument, char letter){
        CalculateId calculateId = new CalculateId(argument);
        char result = calculateId.calculateLetterId();
        assertEquals(letter, result);
    }
    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    void testIdMethodSource(int id, char letter) {
        CalculateId calculateId = new CalculateId(id);
        char result = calculateId.calculateLetterId();
        assertEquals(letter, result);
    }

    static Stream<Arguments> stringIntAndListProvider() {
        return Stream.of(
                arguments(11111111,'H'),
                arguments(49812198,'V'),
                arguments(22222222,'J'),
                arguments(33333333,'P'),
                arguments(59849248,'M'),
                arguments(40954950,'T'),
                arguments(20943203,'R'),
                arguments(56567675,'A'),
                arguments(23212123,'V'),
                arguments(56345342,'B'));
    }
}
