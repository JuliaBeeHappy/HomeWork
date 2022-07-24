import lesson8.ListOfDays;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;



public class getDayTest {

    @Test
    public void positiveNum(){
        String expectedResult =  "Sunday";
        String actualResult = ListOfDays.getDay(1);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void negativeNum(){
        String expectedResult =  "The number should be equal or larger than 1";
        String actualResult = ListOfDays.getDay(-1);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void biggerNum(){
        String expectedResult =  "The number should be equal or smaller than 7";
        String actualResult = ListOfDays.getDay(8);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void zeroTest(){
        String expectedResult =  "The number should be equal or larger than 1";
        String actualResult = ListOfDays.getDay(0);
        assertEquals(expectedResult, actualResult);

    }


    @Test
    @DisplayName("Nullpointer Exeption test")
    public void errorTest() {

        assertThrows(NullPointerException.class, () -> {ListOfDays.getDay(null);});

    }
}
