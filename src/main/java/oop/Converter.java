package oop;

public class Converter {

    public static final double FOOT_TO_METERS_CONVERSION_FACTORS = 0.3048;

    public double calculateMeters(int i) {
        return i * FOOT_TO_METERS_CONVERSION_FACTORS;
    }

    public boolean compareInchWithYards(double inches, double yards) {
        return Double.compare(yards, 0.0278 * inches) == 0;
    }
}
