package pc5;

public class Farm {
    private FarmAnimal animal;

    public void setAnimal(FarmAnimal animal) {
        this.animal = animal;
    }

    public void serviceAnimal() {
        if (this.animal == null) {
            System.out.println("На ферму не поступало животных");
        } else {
            animal.feed();
            animal.care();
            animal.produce();
        }
    }

    public void leaveFarm(){
        System.out.println(animal.getClass().getSimpleName() + " сбежала");
        this.animal = null;
    }
}
