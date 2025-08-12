package pc2;

public class Product {
    String name;
    float price;

    Product(String newName, float newPrice){
        this.name = newName;
        this.price = newPrice;
    }

    String getName(){
        return name;
    }

    float getPrice(){
        return price;
    }

    void setPrice(float newPrice){
        price = newPrice;
    }

    public void applyDiscount(float discount){
        price = price * (1 - discount / 100);
    }

    public void printInfo(){
        System.out.println("Товар: " + name + ", Цена: " + price);
    }
}
