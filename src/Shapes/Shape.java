package Shapes;

 abstract public class Shape {

    private double size;
    private String name = null;

    public Shape(double size) {
        this.size = size;

    }
    public double getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

     public void setSize(double size) {
         this.size = size;
     }
 }
