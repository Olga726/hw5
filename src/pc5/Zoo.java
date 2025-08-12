package pc5;

public class Zoo {
    private Animal animal;

    public void setAnimal(Animal animal){
        this.animal=animal;
    }

    public void showAnimal() {
        if (this.animal == null) {
            System.out.println("Животных не поступало в зоопарк");
        } else {
            animal.move();
            animal.makeSound();
        }
    }
}
