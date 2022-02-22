package oop;

public class Inches extends Distance {
    public Inches(double value) {
        super(value);
    }

    public Inches add(Distance distanceToAdd){
        Inches sum = new Inches (distanceToAdd.getValue() +  this.getValue());
        return sum;
    }
}
