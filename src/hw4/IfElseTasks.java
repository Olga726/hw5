package hw4;

import java.util.Scanner;

public class IfElseTasks {
    public static void main(String[] args) {
      //1 Определение знака числа
       // numberSign();

        // 2 Поиск наибольшего из двух чисел
       //findMaxNumber();

        //3 Вывод оценки по шкале 1–5
        //textGrade();

        //4 Проверка на чётность
        // numberParity();

        //5. Определение размера скидки по возрасту
        //discount();

        // 6. Оценка результата теста по баллам
        //testScore();
    }

public static void numberSign(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int number = scanner.nextInt();

    if (number > 0){
        System.out.println("Число положительное");
    } else if (number == 0) {
        System.out.println("Число равно нулю");
    } else {
        System.out.println("Число отрицательное");
    }
}
public static void findMaxNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        System.out.println("Наибольшее число: " + Math.max(number1, number2));
}
public static void textGrade(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int grade = scanner.nextInt();
        if (grade == 5){
            System.out.println("Отлично");
        } else if (grade == 4){
            System.out.println("Хорошо");
        } else if (grade == 3){
            System.out.println("Удовлетворительно");
        } else if (grade == 2 | grade ==1) {
            System.out.println("Неудовлетворительно");
        } else {System.out.println("Оценка должна быть от 1 до 5");
        }
}
public static void numberParity(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number % 2 ==0){
            System.out.println("Четное");
        } else {System.out.println("Нечетное");}
}

public static void discount(){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Введите возраст: ");
    int age = scanner.nextInt();
    if (age < 18 && age >= 0){
        System.out.println("скидка 25%");
    } else if (age >= 65) {
        System.out.println("скидка 30%");
    } else {
        System.out.println("без скидки");
    }
}

public static void testScore(){
     Scanner scanner = new Scanner(System.in);
     System.out.print("Введите результат теста в баллах от 0 до 100: ");
     int result = scanner.nextInt();
     if (result >= 90 && result <= 100){
         System.out.println("Отлично");
     } else if (result >= 75 && result <= 89) {
         System.out.println("Хорошо");
     } else if (result >= 60 && result <= 75){
         System.out.println("Удовлетворительно");
     } else if (result <60 && result >=0) {
         System.out.println("Неудовлетворительно");
     } else {
         System.out.println("Результат должен быть от 0 до 100");
     }}

}
