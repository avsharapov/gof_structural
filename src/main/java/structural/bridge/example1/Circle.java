package structural.bridge.example1;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    String getFigureName() {
        return "circle";
    }
}
