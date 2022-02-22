package oop;

public class Converter {

    public static final double FOOT_TO_METERS_CONVERSION_FACTORS = 0.3048;
    public static final double PRECISION = 0.0001;
    public static final double INCHES_TO_YARDS_CONVERSION_FACTOR = 0.0278;
    public static final int METERS_TO_CENTIMETERS_CONVERSION_FACTOR = 100;

    public double calculateMeters(int i) {
        return i * FOOT_TO_METERS_CONVERSION_FACTORS;
    }

    public boolean compareInchWithYards(double inches, double yards) {
        return compareMeasure(inches, yards, INCHES_TO_YARDS_CONVERSION_FACTOR);
    }

    public boolean compareMetersWithCentimeters(double meters, double centimeters) {
        return compareMeasure(meters, centimeters, METERS_TO_CENTIMETERS_CONVERSION_FACTOR);
    }

    private boolean compareMeasure(double a, double b, double conversionFactor) {
        return Math.abs(b - conversionFactor * a) < PRECISION;
    }
}
