package hw4;

public class Manuscript extends Exhibit {
    @Override
    public void describe() {
        System.out.println("Это манускрипт времен возврождения");
    }

    @Override
    public void preserve() {
        System.out.println("Хранить при влажности не более 10%");
    }
}
