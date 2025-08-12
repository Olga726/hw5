package pc3;

public class MathConstants {
    static final double PI = 3.14159;
    final double E = 2.71828;

    static void calculateCircleArea(double r){
        System.out.println("Площадь круга: " + PI*r*r);
    }

    static void calculateCircumference(double r){
        System.out.println("Длина окружности: " + 2*PI*r);
    }

}
