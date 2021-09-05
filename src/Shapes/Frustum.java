package Shapes;

public class Frustum extends Shape {
    private String name = "frustum";

    public Frustum(double size) {
        super(size);
    }

    @Override
    public String getName() {
        return name;
    }
}
