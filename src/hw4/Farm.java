package hw4;

public class Farm {
    private FarmAnimal animal;

    public void setAnimal(FarmAnimal animal){
        this.animal=animal;
    }
    public void serviceAnimal(){
        animal.care();
        animal.feed();
        animal.produce();
    }

    public void deleteAnimal(){
        System.out.println(animal + " покинуло ферму");
        this.animal = null;
    }
}
