package hw4;

public class Cactus extends Plant{
    @Override
    void water() {
        System.out.println("редкий полив");
    }

    @Override
    void giveSun() {
        System.out.println("посадить на солнце");
    }
}
