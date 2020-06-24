package structural.bridge.problem;

public class RedSquare extends Shape {
    @Override
    String applyColor() {
        return "Apply the red color to the " + getFigureName();
    }

    @Override
    String getFigureName() {
        return "square";
    }
}
