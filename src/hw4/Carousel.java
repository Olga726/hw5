package hw4;

public class Carousel implements ServeAttractions{
    @Override
    public void showInfo(){
        System.out.println("Карусель спокойно кружит вас");
    }

    @Override
    public  void serve(){
        System.out.println("Карусель требует ТО");
    }
}
