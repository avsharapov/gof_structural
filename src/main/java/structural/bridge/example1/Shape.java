package structural.bridge.example1;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    String applyColor() {
        return color.applyColor() + getFigureName();
    }

    abstract String getFigureName();
}
