package Shapes;

public class Pyramid extends Shape{

    private String name = "pyramid";

    public Pyramid(double size) {
        super(size);
    }

    @Override
    public String getName() {
        return name;
    }
}
