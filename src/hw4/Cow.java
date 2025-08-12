package hw4;

public class Cow implements FarmAnimal{
    @Override
    public void feed() {
        System.out.println("Корова ест траву");
    }

    @Override
    public void care() {
        System.out.println("Корова пасется");
    }

    @Override
    public void produce() {
        System.out.println("Корова дает молоко");
    }
}
