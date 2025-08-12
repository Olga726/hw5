package pc5;

public class AmusementPark {
    private Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void operateAttraction() {
        if (this.attraction == null) {
            System.out.println("Аттракцион не добавлен в парк");
        } else {
            attraction.info();
            attraction.maintain();
        }
    }
}
