import Shapes.*;

import java.util.ArrayList;
import java.util.List;


public class Tank {
    private double volume;
    private double water;
    private double free_volume;
    private List<Shape> arrayList = new ArrayList();

    public Tank(double volume, double water){
        this.volume = volume;
        this.water = water;
        free_volume = volume - water;
    }

    public void addShape(Shape shape){
        System.out.println("Оставшийся объем до добавления: "+free_volume);
        arrayList.add(shape);
        free_volume -= shape.getSize();
        System.out.println("Оставшийся объем после добавления: "+free_volume);
    }

    public boolean isFull(){
        if(free_volume <= 0){
            return true;
        }
        return false;
    }

    public double getVolume() {
        return volume;
    }

    public double getFree_volume() {
        return free_volume;
    }

    public double getWater() {
        return water;
    }

    public void printShapes(){
        arrayList
                .forEach((x)->{
            System.out.print(x.getName()+" "+x.getSize()+ " |");
        });
        System.out.println();
    }

}
