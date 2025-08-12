package pc5;

public class Cat implements Pet{
    @Override
    public void feed() {
        System.out.println("Кошка ест влажный корм");
    }

    @Override
    public void interact() {
        System.out.println("Кошка играет");
    }
}
