package pc2;

public class Car {
    String brand;
    int year;

    Car(String newBrand, int newYear){
        this.year=newYear;
        this.brand=newBrand;
    }

    String getBrand(){
        return brand;
    }

    int getYear(){
        return year;
    }

    void setBrand(String newBrand){
        brand = newBrand;
    }

    void setYear(int newYear){
        year=newYear;
    }

    public void print(){
        System.out.println("Марка: " + this.brand + ", Год выпуска: " + this.year);
    }
}
