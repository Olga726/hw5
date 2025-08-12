package pc2;

public class Laptop {
    String brand;
    float price;

    Laptop(String newBrand, float newPrice){
        this.brand = newBrand;
        this.price = newPrice;
    }

    String getBrand(){
        return brand;
    }

    float getPrice(){
        return  price;
    }

    void setPrice(float newPrice){
        price = newPrice;
    }

    void setBrand(String newBrand){
        brand = newBrand;
    }

    public void printInfo(){
        System.out.println("Марка: " + brand + " Цена: " + price);
    }
}
