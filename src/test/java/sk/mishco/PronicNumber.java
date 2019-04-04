package sk.mishco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PronicNumber {

    @Test
    public void basicTest() {
        assertEquals(asList(0), calcPronic(1));
        assertEquals(asList(0, 2), calcPronic(2));
        assertEquals(asList(0, 2), calcPronic(3));
        assertEquals(asList(0, 2), calcPronic(4));
    }

    private int calcPronic(int n) {
        return 0;
    }
}
