package hw4;

import java.util.Scanner;

public class SwitchTasks {
    public static void main(String[] args) {

        //1. Вывод дня недели по номеру
        //weekDay();

        //2. Стоимость билета по дню недели
        //ticketPrice();

        //3. Перевод числовых оценок в буквенные (A–F)
        //scoreInLetter();

        //4. Обработка текстовых команд
        //commandsProcessing();

        //5. Простой калькулятор с использованием switch
        //calculator();

    }

public static void weekDay(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int day = scanner.nextInt();
    switch (day) {
        case 1:
            System.out.println("Понедельник");
            break;
        case 2:
            System.out.println("Вторник");
            break;
        case 3:
            System.out.println("Среда");
            break;
        case 4:
            System.out.println("Четверг");
            break;
        case 5:
            System.out.println("Пятница");
            break;
        case 6:
            System.out.println("Суббота");
            break;
        case 7:
            System.out.println("Воскресенье");
            break;
        default:
            System.out.println("Число должно быть от 1 до 7");
        }
}

public static void ticketPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер дня недели: ");
        int day = scanner.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("300 рублей");
                break;
            case 6:
            case 7:
                System.out.println("450 рублей");
                break;
            default:
                System.out.println("Номер дня недели должен быть от 1 до 7");

        }
}

public static void scoreInLetter(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведите баллы: ");
        int score = scanner.nextInt();
        if (score >=0 && score <=100) {
            switch (score / 10) {
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    System.out.println("F");
                    break;
            }
        } else {
            System.out.println("Балл должен быть от 0 до 100");
        }
        }

        public static void commandsProcessing(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String command = scanner.nextLine();
        switch (command){
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система остановлена");
                break;
            case "restart":
                System.out.println("Система перезапущена");
                break;
            case "status":
                System.out.println("Статус системы");
                break;
            default:
                System.out.println("Неверная команда");
        }
        }

        public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        String operator = "";
        int digit1;
        int digit2;
        System.out.print("Введите первое число: ");
        digit1 = scanner.nextInt();
        System.out.print("Введите оператор: ");
        operator = scanner.next();
        System.out.print("Введите второе число: ");
        digit2 = scanner.nextInt();
        int result;

        if (digit2 ==0 && operator.equals("/")){
            System.out.println("На 0 делить нельзя по правилам");
        } else {
            switch (operator){
                case "+":
                    result = digit1 + digit2;
                    System.out.println(result);
                    break;
                case "-":
                    result = digit1 - digit2;
                    System.out.println(result);
                    break;
                case "*":
                    result = digit1 * digit2;
                    System.out.println(result);
                    break;
                case "/":
                    result = digit1 / digit2;
                    System.out.println(result);
                    break;
                default:
                    System.out.println("Неверный оператор");

            }
        }
    }
}





