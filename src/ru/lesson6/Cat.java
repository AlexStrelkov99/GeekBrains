package ru.lesson6;

public class Cat extends Animal {

   private int distance1 = 200;
   private int height1 = 2;

    Cat(int distance, double height) {
        super(distance, height);
    }

    @Override
    public void run(int distance) {
        if (distance <= distance1) {
            System.out.println("cat run: true");
        }
    }
    @Override
    public void swim(int distance) {

    }
    @Override
    public void jump(double height) {
        if(height <= height1)
        System.out.println("cat jump: true");
    }
}
