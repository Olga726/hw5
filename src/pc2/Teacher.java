package pc2;

public class Teacher {
    String name;
    String subject;

    Teacher(String newName, String newSubject){
        this.name = newName;
        this.subject = newSubject;
    }

    String getName(){
        return name;
    }

    String getSubject(){
        return subject;
    }

    void setName(String newName){
        name = newName;
    }

    void setSubject(String newSubject){
        subject = newSubject;
    }

    public void printInfo(){
        System.out.println("Учитель: " + name + ", Предмет: " + subject);
    }
}
