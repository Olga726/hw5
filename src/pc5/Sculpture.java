package pc5;

public class Sculpture implements Exhibit{
    @Override
    public void info() {
        System.out.println("Древнегреческая скульптура");
    }

    @Override
    public void preserve() {
        System.out.println("Реставрация");
    }
}
