package hw4;

import java.util.Scanner;

public class WhileTasks {
    public static void main(String[] args) {
      //1. Вычисление факториала с помощью while
       // factorial();

        //1. Запрос положительного числа
        //positiveNumber();

        //2. Проверка пароля
        // password();

        //5. Подсчёт количества цифр в числе
        // countNumbers();

        //1. Сумма чисел до первого отрицательного (использовать break)
        //sumBeforeNeg();

        //2. Вывод всех чётных чисел до заданного
        evenNumber();

    }
public static void factorial(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int number = scanner.nextInt();
    int result = 1;
    int i = 1;
    if (number <= 0){
        System.out.println("Число должно быть больше 0");
    } else {
        while (i <= number) {
            result *= i;
            i ++;
        }
        System.out.println(result);
    }
}

public static void positiveNumber(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            System.out.print("Введите положительное число: ");
            number = scanner.nextInt();
        } while(number <=0);
}

public static void password(){
        Scanner scanner = new Scanner(System.in);
        String password = "111";
        String userInput;
        do{
            System.out.print("Введите пароль: ");
            userInput = scanner.nextLine();
        } while(!userInput.equals(password));
}

public static void countNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int count = 0;
            do {
                count++;
                number = number / 10;
            } while (number != 0);
            System.out.println(count);
        }

public static void sumBeforeNeg(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int number1;
        while(true){
            System.out.print("Число: ");
            number1 = scanner.nextInt();
            if(number1 <0){
                break;}
            number += number1;

        };
    System.out.println(number);
}

public static void evenNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int count=1;
        while(count < number){
            count++;
            if (count % 2 == 0){
                System.out.println(count);
            }
        }
}


}
