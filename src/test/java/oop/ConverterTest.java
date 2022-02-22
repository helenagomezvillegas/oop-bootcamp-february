package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ConverterTest {
    private Converter converter = new Converter();
    @Test
    public void itShouldConvertFootToMeters() {
        assertEquals(converter.calculateMeters(1), 0.3048);
    }
    @Test
    public void itShouldConvertTwoFeetToMeters() {

        assertEquals(converter.calculateMeters(2), 0.6096);
    }

    @Test
    public void itShouldCompareInchesWithYards() {
        assertTrue(converter.compareInchWithYards(5.0, 0.1389));
    }

    @Test
    public void itShouldReturnFalseWhenComparingNotEquivalentInchAndYardValue() {

        assertFalse(converter.compareInchWithYards(2.0, 0.0278));
    }
    @Test
    public void itShouldReturnTrueWhenComparingMetersWithCentimeters() {
        assertTrue(converter.compareMetersWithCentimeters(2.0, 200.0));

    }

    @Test
    public void itShouldReturnFalseWhenComparingMetersWithCentimeters() {
        assertFalse(converter.compareMetersWithCentimeters(3.0, 200.0));
    }
}
