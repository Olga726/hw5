package hw4;

public class Menu {
    private Descriptionable dish;

    public void addDish(Descriptionable dish){
        this.dish=dish;
    }

    public void showDish(){
        dish.getDescription();
    }
}
