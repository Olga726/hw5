package pc5;

public class Drink implements Dish{
    private int volume;
    private String name;

    public Drink(int volume, String name){
        this.name=name;
        this.volume=volume;
    }

    @Override
    public void getDescription() {
        System.out.println(name + ", объем: " + volume);
    }
}
