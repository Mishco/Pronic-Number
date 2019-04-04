package sk.mishco;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PronicNumber {
    private PronicCalculator calculator;

    @BeforeEach
    void initTest() {
        calculator = new PronicCalculator();
    }

    @Test
    void basicTest() {
        assertEquals(singletonList(0), calculator.calcPronic(1));
        assertEquals(asList(0, 2), calculator.calcPronic(2));
        assertEquals(asList(0, 2), calculator.calcPronic(3));
        assertEquals(asList(0, 2), calculator.calcPronic(4));
        assertEquals(asList(0, 2, 6), calculator.calcPronic(6));
    }

    @Test
    void multiTest() {
        assertEquals(asList(0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132), calculator.calcPronic(140));
        assertEquals(asList(0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462), calculator.calcPronic(500));
    }
}
