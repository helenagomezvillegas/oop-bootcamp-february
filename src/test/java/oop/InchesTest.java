package oop;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InchesTest {
    @Test
    public void itShouldReturnTheSumOfTwoInch() {
        Inches inch1 = new Inches(2.0);
        Inches inch2 = new Inches(2.0);

        Inches sum = inch1.add(inch2);

        assertEquals(sum.getValue(), 4.0);
    }
}
