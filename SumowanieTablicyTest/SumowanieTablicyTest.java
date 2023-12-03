package SumowanieTablicy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumowanieTablicyTest {
    @Test
    public void testSumArrayPositiveNumbers() {
        int[] numbers = {1, 3, 5};
        int result = SumowanieTablicy.sumArray(numbers);
        assertEquals(9, result);
    }


    @Test
    public void testSumArrayNegativeNumbers() {
        int[] numbers = {-1, -2, -3};
        int result = SumowanieTablicy.sumArray(numbers);
        assertEquals(-6, result);
    }
}
