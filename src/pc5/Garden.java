package pc5;

public class Garden {
    private Plant plant;

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public void carePlant() {
        if (this.plant == null) {
            System.out.println("В ботанический сад пока не поступало растений");
        } else {
            plant.care();
        }
    }
}
