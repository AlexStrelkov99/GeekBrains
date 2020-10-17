package ru.lesson7;

public class Plate {
    private int food;

    public Plate(int food)
    {
        this.food = food;
    }

    public void increaseFood(int food)
    {
        this.food += food;
    }

    public void decreaseFood(int appetite)
    {
       // food = food - appetite;
        if ((food - appetite) <= 0){
            food = 0;
        }
        else {
            food = food - appetite;
        }


    }

    public boolean hasEnoughFood(int appetite)
    {
        return appetite <= food;
    }

    public void countEatInPlate() {
        if (food == 0){
            System.out.println("Тарелка пустая");
        }
        else {
            System.out.println("Количество еды в тарелке: " + food);
        }

    }
}
