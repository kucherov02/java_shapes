package Shapes;

public class Cube extends Shape {
    private String name = "cube";

    public Cube(double size) {
        super(size);
    }

    @Override
    public String getName() {
        return name;
    }
}
