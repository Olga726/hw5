package pc3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        //1
        Company emp1 = new Company(157, "John");
        Company emp2 = new Company(17, "Ann");
        Company emp3 = new Company(111, "Adam");
        emp3.setCompanyName("ABC&Co");
        Company.printCompanyName();
        emp2.setCompanyName("Co&Co");
        Company.printCompanyName();

        //2
        MathConstants.calculateCircleArea(159.41);
        MathConstants.calculateCircleArea(11);
        MathConstants.calculateCircumference(55.1);
        MathConstants.calculateCircumference(6);

        //4
        University stud1 = new University(1, "Polinsky");
        University stud2 = new University(48, "Brown");
        University stud3 = new University(548, "Kovidzy");
        University.changeUniversityName("YELL");
        stud1.printStudentInfo();
        stud2.printStudentInfo();
        stud3.printStudentInfo();

        //5
       GameSettings game1 = new GameSettings("WoFT", 200);
       GameSettings game2 = new GameSettings("Maria", 10);
       GameSettings.setMaxPlayers(200);
       game1.addPlayer();
       game1.printGameStatus();
       game2.addPlayer();
       game2.printGameStatus();

        //6
        Person pers1 = new Person("Ann", "Dorn", "14-15-3");
        Person pers2 = new Person("Anna", "Ford", "18-15-3");
        Person pers3 = new Person("Ben", "Tut", "74-15-3");

        pers2.setFirstName("Genry");

        pers1.printPersonInfo();
        pers2.printPersonInfo();
        pers3.printPersonInfo();

    }
}
