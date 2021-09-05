import Shapes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in_menu = new Scanner(System.in);
        Scanner in_data = new Scanner(System.in);
        int menu;

        Shape [] rand_arr = new Shape[6];
        rand_arr[0] = new Cube(0);
        rand_arr[1] = new HexagonalPrism(0);
        rand_arr[2] = new Frustum(0);
        rand_arr[3] = new Sphere(0);
        rand_arr[4] = new Pyramid(0);
        rand_arr[5] = new Cylinder(0);


        System.out.println("""
                Какой режим будет использован?
                1 - ручной ввод
                2 - рандом
                """);

        menu = in_menu.nextInt();

        while(menu != 1 && menu != 2){
            System.out.print("Неккоректные данные, повторите ввод:");
            menu = in_menu.nextInt();
        }


        double volume, water;
        if( menu == 1){



            System.out.print("Введите объем резервуара: ");
            volume = in_data.nextDouble();

            while(volume <= 0){
                System.out.print("Некорректные данные, повторите ввод: ");
                volume = in_data.nextDouble();
            }

            System.out.print("Введите объем воды: ");
            water = in_data.nextDouble();

            while(water <= 0 || water > volume){
                System.out.print("Некорректные данные, повторите ввод: ");
                water = in_data.nextDouble();
            }
        } else{
            volume = Math.random()*140;
            water = Math.random()*(volume -10);
        }

        Tank tank = new Tank(volume, water);



        boolean isRun = true;
        double size;

        while (isRun){
            System.out.print("""
                1 - добавить шар
                2 - добавить призму
                3 - добавить пирамиду
                4 - добавить цилиндр
                5 - добавить усеченный конус
                6 - добавить куб
                7 - добавить случайную фигуру
                8 - информация по резервуару
                9 - выход 
                
                Выберите пункт: 
                """);

            menu = in_menu.nextInt();

            while(menu < 1 || menu > 8){
                System.out.print("Некорректные данные, повторите ввод:");
                menu = in_menu.nextInt();
            }

            switch (menu){
                case 1 ->{
                    System.out.print("Введите размер: ");
                    size = in_data.nextDouble();

                    while(size < 0) {
                        System.out.print("Некорректные данные, повторите ввод:");
                        size = in_data.nextDouble();
                    }

                    Sphere a = new Sphere(size);
                    tank.addShape(a);
                    if(tank.isFull()){
                        isRun = false;
                    }
                }
                case 2 ->{

                    System.out.print("Введите размер: ");
                    size = in_data.nextDouble();
                    while(size < 0){
                        System.out.print("Некорректные данные, повторите ввод:");
                        size = in_data.nextDouble();
                    }
                    HexagonalPrism a = new HexagonalPrism(size);
                    tank.addShape(a);

                    if(tank.isFull()){
                        isRun = false;
                    }
                }
                case 3 ->{

                    System.out.print("Введите размер: ");
                    size = in_data.nextDouble();
                    while(size < 0){
                        System.out.print("Некорректные данные, повторите ввод:");
                        size = in_data.nextDouble();
                    }

                    Pyramid a = new Pyramid(size);
                    tank.addShape(a);

                    if(tank.isFull()){
                        isRun = false;
                    }
                }
                case 4 ->{

                    System.out.print("Введите размер: ");
                    size = in_data.nextDouble();
                    while(size < 0){
                        System.out.print("Некорректные данные, повторите ввод:");
                        size = in_data.nextDouble();
                    }

                    Cylinder a = new Cylinder(size);
                    tank.addShape(a);
                    if(tank.isFull()){
                        isRun = false;
                    }
                }
                case 5 ->{

                    System.out.print("Введите размер: ");
                    size = in_data.nextDouble();
                    while(size < 0){
                        System.out.print("Некорректные данные, повторите ввод:");
                        size = in_data.nextDouble();
                    }

                    Frustum a = new Frustum(size);
                    tank.addShape(a);
                    if(tank.isFull()){
                        isRun = false;
                    }
                }

                case 6 ->{

                        System.out.print("Введите размер: ");
                        size = in_data.nextDouble();
                        while(size < 0){
                            System.out.print("Некорректные данные, повторите ввод:");
                            size = in_data.nextDouble();
                        }

                    Cube a = new Cube(size);
                    tank.addShape(a);
                    if(tank.isFull()){
                        isRun = false;
                    }
                }
                case 7->{
                    int rand = (int)(Math.random()*5);
                    rand_arr[rand].setSize(Math.random()*34);
                    tank.addShape(rand_arr[rand]);

                    System.out.println("Добавлена фигура "+ rand_arr[rand].getName()+" c объемом "+ rand_arr[rand].getSize());
                }
                case 8->{
                    System.out.println("Информация по резервуару\n"+ "Вместимость: "+tank.getVolume()+"\nВода: "+tank.getWater()+ "\nОсталось: "+ tank.getFree_volume());
                    tank.printShapes();
                }
                case 9 ->{
                    isRun = false;
                }

            }
        }
    }
}
