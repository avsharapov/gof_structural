package structural.bridge.problem;

public class BlueSquare extends Shape {
    @Override
    String applyColor() {
        return "Apply the blue color to the " + getFigureName();
    }

    @Override
    String getFigureName() {
        return "square";
    }
}
