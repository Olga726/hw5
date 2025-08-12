package pc4;

import java.util.Scanner;

public class IfElseT{
    public static void main(String[] args) {
        //Задачи на if-else
        //1. Определение знака числа
        //numberSign();

        //2. Поиск наибольшего из двух чисел
        //findMax();

        //3. Вывод оценки по шкале 1–5
        //gradeName();

        //4. Проверка на чётность
        //parityCheck();

        //5. Определение размера скидки по возрасту
        //discount();

        //6. Оценка результата теста по баллам
        //testResult();

        //Switch
        //1. Вывод дня недели по номеру
        //weekDay();

        //2. Стоимость билета по дню недели
        //ticketPrice();

        //3. Перевод числовых оценок в буквенные (A–F)
        //gradeIntoLetter();

        //4. Обработка текстовых команд
        //textCommands();

        //5. Простой калькулятор с использованием switch
        //calculator();

        //for
        //1. Вывод чисел от 1 до 100, делящихся на 3
        //digitsMuliplieThree();

        //2. Сумма чисел от 1 до n
        //sumFromOne();

        //3. Таблица умножения для числа
        //multiplicationTable();

        //4. Проверка на простое число
        //prime();

        //5. Вывод чисел от 1 до 10
        //fromOneToTen();

        //while
        //1. Вычисление факториала с помощью while
        //factorail();

        //2. Вывод всех чётных чисел до заданного
        //evens();

        //3. Обратный отсчёт от введённого числа до 1
        //backCount();

        //do-while
        //1. Запрос положительного числа
        //positiveNumber();

        //2. Проверка пароля
        //password();

        //3. Вывод чисел от 1 до 10 с использованием do-while
        //fromOneToTenDoWhile();

        //4. Завершение программы по команде "exit"
        //quitProgram();

        //5. Подсчёт количества цифр в числе
        //countNumbers();

        //Задачи на break и continue
        //1. Сумма чисел до первого отрицательного (использовать break)
        //sumUntilNeg();

        //2. Пропуск чисел, делящихся на 3 (использовать continue)
        //withoutDividedThree();

        //3. Вывод только положительных чисел (использовать continue)
        //outputPositive();

        //4. Ввод строк до команды "stop" (использовать break)
        //stringUpToStop();





    }

    public static void numberSign(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number == 0){
            System.out.println("Число равно нулю");
        } else if (number > 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void findMax(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        if (number1 > number2){
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }

    }

    public static void gradeName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку от 1 до 5: ");
        int grade = scanner.nextInt();
        if (grade == 5 ){
            System.out.println("Отлично");
        } else if (grade == 4 ) {
            System.out.println("Хорошо");
        } else if (grade == 3 ) {
            System.out.println("Удовлетворительно");
        } else if (grade == 2 | grade == 1 ) {
            System.out.println("Неудовлетворительно");
        } else {
            System.out.println("Оценка должна быть от 1 до 5");
        }
    }

    public static void parityCheck(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number % 2 ==0){
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    public static void discount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        if (age >=0 && age <18){
            System.out.println("скидка 25%");
        } else if (age >=65){
            System.out.println("скидка 30%");
        } else {System.out.println("без скидки");}
    }

    public static void testResult(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int grade = scanner.nextInt();

        if (grade>=90 && grade<=100){
            System.out.println("Отлично");
        } else if (grade>=75 && grade<=89){
            System.out.println("Хорошо");
        } else if (grade>=60 && grade<=74){
            System.out.println("Удовлетворительно");
        } else if (grade>=0 && grade<60){
            System.out.println("Неудовлетворительно");
        } else {
            System.out.println("Оценка должна быть от 0 до 100");
        }
    }

    public static void weekDay(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер дня недели: ");
        int day = scanner.nextInt();
        switch (day){
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
                System.out.println("Номер дня недели должен быть от 1 до 7");
        }
    }

    public static void ticketPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день недели: ");
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
                System.out.println("День недели должен быть от 1 до 7");
        }
    }

    public static void gradeIntoLetter(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int grade = scanner.nextInt();
        if (grade >=0 && grade <=100){
        switch (grade / 10){
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
            default:
                System.out.println("F");
        }
        } else {
            System.out.println("Оценка должна быть от 0 до 100");
        }
    }

    public static void textCommands(){
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
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите оператор: ");
        String operator = scanner.next();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        if (number2 == 0 && operator.equals("/")){
            System.out.println("На 0 делить нельзя по правилам");
        } else {
            switch (operator){
                case "+":
                    System.out.println(number1 + number2);
                    break;
                case "-":
                    System.out.println(number1 - number2);
                    break;
                case "*":
                    System.out.println(number1 * number2);
                    break;
                case "/":
                    System.out.println(number1 / number2);
                    break;
                default:
                    System.out.println("Неверный оператор");
            }
        }

    }

    public static void digitsMuliplieThree(){
        for (int i = 1; i <=100; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    public static void sumFromOne(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int sum = 0;
        int number = scanner.nextInt();
        if (number>1){
        for(int i = 1; i <= number; i++){
            sum +=i;
        }
        System.out.println(sum);
        } else {
            System.out.println("Число должно быть больше 1");
        }
    }

    public static void multiplicationTable(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(number + " * " + i + " = " + number*i);
        }
    }

    public static void prime(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number <1){
            isPrime = false;
        } else {
        for (int i=2; i<number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        }
        System.out.println(isPrime);
        }

    public static void fromOneToTen(){
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }

    public static void factorail(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int result = 1;
        int i = 1;
        if (number <1 || number >12){
            System.out.println("Число должно быть больше 0 и меньше 13");

        } else {
        while (i <= number){
            result *= i;
            i++;
        }
            System.out.println(result);
        }


    }

    public static void evens(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int i=1;
        if (number<2){
            System.out.println("Число должно быть больше 1");
        } else
        while (i<=number){
            i++;
            if (i%2==0){
            System.out.println(i);
            }
        }
    }

    public static void backCount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        while (number>=1){
            System.out.println(number);
            number--;
        }
    }

    public static void password(){
        Scanner scanner = new Scanner(System.in);
        String password = "123";
        String userInput = "";
        do{
            System.out.print("Введите пароль: ");
            userInput = scanner.nextLine();
        } while (!userInput.equals(password));
    }

    public static void positiveNumber(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Введите положительное число: ");
            number = scanner.nextInt();
        } while (number < 0);

    }

    public static void fromOneToTenDoWhile(){
        int i=1;
        do{
            System.out.println(i);
            i++;
        } while (i<=10);

    }

    public static void quitProgram(){
        Scanner scanner = new Scanner(System.in);
        String command = "exit";
        String userInput ="";
        do{
        System.out.print("Введите команду: ");
        userInput = scanner.nextLine();
        } while (!userInput.equals(command));
    }

    public static void countNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int count=0;
        do{
            count++;
            number = number/10;
        } while (number!=0);
        System.out.println(count);
    }

    public static void sumUntilNeg(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            if (number<0){
                break;
            }
            sum+=number;
        }
        System.out.println("Сумма чисел: " + sum);
    }

    public static void withoutDividedThree(){
      for(int i=1; i<=20; i++){
          if (i%3==0){
              continue;
          }
          System.out.println(i);
      }
    }

    public static void outputPositive(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Введите число. Для завершения введите 0: ");
            number = scanner.nextInt();
            if(number<0){
                continue;
            }
            System.out.println(number);
        } while (number!=0);

    }

    public static void stringUpToStop(){
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true){
            System.out.print("Введите текст: ");
            input = scanner.nextLine();
            if (input.equals("stop")){
                break;
            };
        };
        }

    }




