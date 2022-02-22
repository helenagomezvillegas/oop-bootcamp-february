package oop;

public class Inches {
    private final double value;

    public Inches(double value) {
        this.value = value;
    }

    public Inches add(Inches inchesToAdd){
        Inches sum = new Inches (inchesToAdd.getValue() +  value);
        return sum;
    }

    public double getValue() {
        return value;
    }
}
