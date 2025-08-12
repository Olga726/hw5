package hw4;

public class Zoo {
    private Animal animal;

    public void setAnimal(Animal animal){
     this.animal = animal;
     System.out.println("Животное принято в зоопарк");
    }

    public void keep(Animal animal){
        animal.makeSound();
        animal.move();
    }
}
