import java.lang.Math;

public class Circle {
    public Circle(double radius, double diameter) {
        m_radius = radius;
        m_diameter = diameter;
    }

    public double getArea() {
        return Math.PI * Math.pow(m_radius, 2);
    }

    public double getPerimeter() {
        return Math.PI * m_diameter;
    }

    private double m_radius = 0.0f;
    private double m_diameter = 0.0f;
}
