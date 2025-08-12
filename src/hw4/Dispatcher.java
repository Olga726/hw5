package hw4;

public class Dispatcher {
    public void control(Transport transport){
        transport.start();
    }
    public void printInfo(Transport transport){
    System.out.println(" Скорость; " + transport.getSpeed() + " Вместимость: " + transport.getCapacity());
    }
}