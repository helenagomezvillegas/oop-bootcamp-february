package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ConverterTest {
    @Test
    public void itShouldConvertFootToMeters() {
        Converter converter = new Converter();
        assertEquals(converter.calculateMeters(1), 0.3048);
    }
    @Test
    public void itShouldConvertTwoFeetToMeters() {
        Converter converter = new Converter();
        assertEquals(converter.calculateMeters(2), 0.6096);
    }

    @Test
    public void itShouldCompareInchesWithYards() {
        Converter converter = new Converter();

        assertTrue(converter.compareInchWithYards(5.0, 0.1390));
    }

    @Test
    public void itShouldReturnFalseWhenComparingNotEquivalentInchAndYardValue() {
        Converter converter = new Converter();

        assertFalse(converter.compareInchWithYards(2.0, 0.0278));
    }
}
