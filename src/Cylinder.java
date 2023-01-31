import java.lang.Math;

public class Cylinder {
    public Cylinder(double radius, double height) {
        m_radius = radius;
        m_height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(m_radius, 2.0) * m_height;
    }

    private double m_radius = 0.0f;
    private double m_height = 0.0f;
}
