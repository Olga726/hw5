package hw4;

public class Car extends Transport {
    public Car(){
        super(120, 3);
    }

    @Override
    public void start(){
        System.out.print("Корабль поплыл");
    }
}
