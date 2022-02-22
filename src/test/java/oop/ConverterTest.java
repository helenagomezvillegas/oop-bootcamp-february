package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

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
}
