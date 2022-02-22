package oop;

public class Converter {

    public static final double FOOT_TO_METERS_CONVERSION_FACTORS = 0.3048;

    public double calculateMeters(int i) {
        return i * FOOT_TO_METERS_CONVERSION_FACTORS;
    }
}
