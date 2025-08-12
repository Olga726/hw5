package pc5;

public class PetManager {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public void handlePet() {
        if (this.pet == null) {
            System.out.println("Питомцев не поступало");
        } else {
            pet.feed();
            pet.interact();
        }
    }
}
