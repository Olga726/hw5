package hw4;

public class AmusementPark {
    private ServeAttractions attraction;

    public void setAttraction(ServeAttractions attraction){
        this.attraction=attraction;
    }

    public  void information(){
        attraction.showInfo();
    }

    public void serveAttrction(){
        attraction.serve();
    }
}
