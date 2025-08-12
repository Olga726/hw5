package pc2;

public class Circle {
    int radius;

    Circle(int newRadius){
        this.radius = newRadius;
    }

    int getRadius(){
        return radius;
    }

    void setRadius(int newRadius){
        radius = newRadius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
}
