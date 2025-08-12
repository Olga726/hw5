package hw4;

public abstract class Transport {
    private int speed;
    private int capacity;

    public Transport(int speed1, int capacity1){
    this.speed=speed1;
    this.capacity=capacity1;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCapacity() {
        return capacity;
    }

    abstract void start();
}
