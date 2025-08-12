package hw4;

public class HitDish implements Descriptionable {
    int temp;
    String name;

    public HitDish(String name, int temp) {
        this.name = name;
        this.temp = temp;
    }


    @Override
    public void getDescription() {
        System.out.println(this.name + " температура: " + this.temp);
    }
}
