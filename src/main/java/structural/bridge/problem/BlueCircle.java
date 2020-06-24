package structural.bridge.problem;

public class BlueCircle extends Shape {
    @Override
    String applyColor() {
        return "Apply the blue color to the " + getFigureName();
    }

    @Override
    String getFigureName() {
        return "circle";
    }
}
