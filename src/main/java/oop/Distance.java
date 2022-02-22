package oop;

public abstract class Distance {
    private final double value;

    protected Distance(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
