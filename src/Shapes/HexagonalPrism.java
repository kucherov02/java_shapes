package Shapes;

public class HexagonalPrism extends Shape{
    private String name = "hexagonal prism";

    public HexagonalPrism(double size) {
        super(size);
    }

    @Override
    public String getName() {
        return name;
    }
}
