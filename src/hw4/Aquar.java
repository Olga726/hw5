package hw4;

public class Aquar {
    private Actionable creature;

    public  void addCreature(Actionable creature){
        this.creature=creature;
    }

    public  void showCreature(){
        creature.act();
    }
}
