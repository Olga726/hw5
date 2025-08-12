package pc2;

public class Main {
    public static void main(String[] args){

        //1
        Car car1 = new Car("Fiat", 2020);
        car1.setYear(2021);
        car1.print();

        //2
        Rectangle rectangle1 = new Rectangle(15, 21);
        rectangle1.setWidth(19);
        System.out.println(rectangle1.calculateArea());

        //3
        Book book1 = new Book("1001 night", "Shaherezada");
        book1.setAuthor("Shah");
        book1.printInfo();

        //4
        BankAccount acc1 = new BankAccount("Smith", 1000000);
        acc1.deposit(1);
        acc1.withdraw(1001);
        acc1.printBalance();

        //5
        Point point1 = new Point(100.1f, 4.52f);
        point1.setX(10.7f);
        point1.print();

        //6
        StudentGroup group1 = new StudentGroup("Gr-1", 21);
        group1.setStudentCount(16);
        group1.printInfo();

        //7
        Circle circ1 = new Circle(11);
        circ1.setRadius(101);
        System.out.println(circ1.calculateArea());
        System.out.println(circ1.calculateCircumference());

        //8
        Teacher teacher1 = new Teacher("Petrov", "history");
        teacher1.setSubject("english");
        teacher1.printInfo();

        //9
        Product pro1 = new Product("sweets", 100.99f);
        pro1.setPrice(500.01f);
        pro1.applyDiscount(70.5f);
        pro1.printInfo();

        //10
        Laptop laptop1 = new Laptop("HP", 10000.20f);
        laptop1.setPrice(5999.99f);
        laptop1.printInfo();
}
}
