package pc5;

public class Carousel extends Attraction{
    @Override
    public void info() {
        System.out.println("Карусель - это спокойный аттракцион");
    }

    @Override
    public void maintain() {
        System.out.println("ТО");
    }
}
