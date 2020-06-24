package structural.bridge.example1;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    String getFigureName() {
        return "square";
    }
}
