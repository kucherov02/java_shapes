package Shapes;

public class Sphere extends Shape{
    private String name = "sphere";

    public Sphere(double size) {
        super(size);
    }

    @Override
    public String getName() {
        return name;
    }
}
