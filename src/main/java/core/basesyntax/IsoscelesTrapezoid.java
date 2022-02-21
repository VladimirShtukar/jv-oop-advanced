package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area {
    private String color;
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int height) {
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = height * (sideA + sideB) / 2;
        return Math.round(area * 100.0) / 100.0;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, side A: " + sideA
                + " units, side B: " + sideB
                + " units, height: " + height
                + " units, color: " + color;
    }
}