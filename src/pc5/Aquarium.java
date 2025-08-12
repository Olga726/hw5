package pc5;

public class Aquarium {
    private Moveable creature;

    public void setCreature(Moveable creature) {
        this.creature = creature;
    }

    public void showMovement(){
        creature.move();
    }
}
