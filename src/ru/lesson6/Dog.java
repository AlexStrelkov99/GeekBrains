package ru.lesson6;

public class Dog extends Animal  {

    private int distance2 = 500;
    private int distance3 = 10;
    private double height2 = 0.5;

    Dog(int distance, double height) {
        super(distance, height);
    }

    @Override
    public void run(int distance) {
        if (distance <= distance2) {
            System.out.println("dog run: true");
        }
    }

    @Override
    public void swim(int distance) {
        if(distance <= distance3)
        System.out.println("dog swim: true");
    }

    @Override
    public void jump(double height) {
        if(height <= height2)
        System.out.println("dog jump: true");
    }
}
