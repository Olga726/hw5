package pc5;

public class HotDish implements Dish{
    private int temperature;
    private String name;

    public HotDish(int temperature, String name){
        this.name=name;
        this.temperature=temperature;
    }

    @Override
    public void getDescription() {
        System.out.println(name + ", температура подачи: " + temperature);
    }
}
