package hw4;

import java.util.Scanner;

public class ForTasks {
    public static void main(String[] args) {
        //1. Вывод чисел от 1 до 100, делящихся на 3
        //numbersMultiplesThree();

        //2. Сумма чисел от 1 до n
        //sunFromOneToN();

        //3. Таблица умножения для числа
        //multipicationTable();

        //4. Проверка на простое число
        //simpleNumber();


    }

    public static void numbersMultiplesThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void sunFromOneToN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void multipicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

    }

    public static void simpleNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i=2; i<=number-1; i++){
            if (number % i ==0){
               isPrime = false;
               break;
            }
        }
        System.out.println(isPrime);
    }
}
