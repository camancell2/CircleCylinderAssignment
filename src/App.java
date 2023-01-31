public class App {
    private static Circle circle = new Circle(4, 8);
    private static Cylinder cylinder = new Cylinder(4, 8);

    public static void main(String[] args) {
        System.out.printf("Circle Area: %.2f\n", circle.getArea());
        System.out.printf("Circle Perimeter: %.2f\n", circle.getPerimeter());
        System.out.printf("Cylinder Volume: %.2f", cylinder.getVolume());
    }
}
