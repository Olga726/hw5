package pc1;

public class MathOperations {
   public static void main(String[] args){
     System.out.println(add(8, 6));
     System.out.println(subtract(100, 900));
     System.out.println(multiply(15, -3));
     System.out.println(divide(78, 4));
     System.out.println(findMax(10001, 1002));
     System.out.println(difference(64, 98));
     System.out.println(squareArea(161));
     System.out.println(squarePerimeter(2));
     System.out.println(convertSecondsToMinutes(701));
     System.out.println(averageSpeed(1000, 32));
     System.out.println(findHypotenuse(7, 6));
     System.out.println(findHypotenuse(70, 61));
     System.out.println(circleCircumference(151));
     System.out.println(circleCircumference(15.15));
     System.out.println(calculatePercentage(1000, 10) +"%");
     System.out.println(celsiusToFahrenheit(32));
     System.out.println(fahrenheitToCelsius(341));
   }

   public static int add(int x, int y){
       return x + y;
   }
   public static int subtract(int x, int y){
        return x - y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
    public static double divide(int x, int y){
       return (double) x / y;
    }
    public static int findMax(int a, int b){
       return Math.max(a, b);
    }
    public static int difference(int x, int y){
       return Math.abs(x - y);
    }
    public static int squareArea(int side){
       return side*side;
    }
    public static int squarePerimeter(int side){
       return side*4;
    }
    public static double convertSecondsToMinutes(int seconds){
       return (double) seconds/ 60;
    }
    public static double averageSpeed(double distance, double time){
       return distance / time;
    }
    public static double findHypotenuse(double a, double b){
       return Math.sqrt(a*a + b*b);
    }
    public static double circleCircumference(double radius){
       return 2 * Math.PI * radius;
    }
    public static double calculatePercentage(double total, double part){
       return (part / total) * 100;
    }
    public static double celsiusToFahrenheit(double c){
       return c * 9 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double f){
       return (f - 32) * 5 / 9;
    }
}
