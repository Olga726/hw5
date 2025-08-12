package pc5;

public class Menu {
    private Dish dish;

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public void showMenu() {
        if (this.dish == null) {
            System.out.println("Блюда не добавлены в меню");
        } else {
            dish.getDescription();
        }
    }
}
