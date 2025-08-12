package hw4;

public class Garden {
   private Plant plant;

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public void maintainPlant(){
        plant.water();
        plant.giveSun();
    }
}
