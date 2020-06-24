package structural.bridge.problem;

public class Demo {
    public static void main(String[] args) {
        Shape circle = new BlueCircle();
        Shape square = new RedSquare();

        System.out.println(circle.applyColor());
        System.out.println(square.applyColor());
    }
}
