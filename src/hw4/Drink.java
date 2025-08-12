package hw4;

public class Drink implements Descriptionable {
    String name;
    int volume;

    public Drink(String name, int volume){
        this.name=name;
        this.volume=volume;
    }

    @Override
    public void getDescription() {
        System.out.println(this.name + " объем: " + this.volume);
    }
}
