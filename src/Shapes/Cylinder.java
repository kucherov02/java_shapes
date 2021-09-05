package Shapes;

public class Cylinder extends Shape{
    private String name = "cylinder";

    public Cylinder(double size) {
        super(size);
    }

    @Override
    public String getName() {
        return name;
    }
}
