package pc3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String firstName1, String lastName1, String ssn1){
        this.firstName=firstName1;
        this.ssn=ssn1;
        this.lastName=lastName1;
    }

    String getFirstName(){
        return firstName;
    }
    String getSsn(){
        return ssn;
    }
    String getLastName(){
        return lastName;
    }

    void setFirstName(String firstName1){
        firstName=firstName1;
    }
    void setLastName(String lastName1){
        lastName=lastName1;
    }

    void printPersonInfo(){
        System.out.println("Имя: " + firstName + ", Фамилия: " + lastName + ", SSN: " + ssn);
    }
}
