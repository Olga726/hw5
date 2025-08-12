package pc3;

public class LibraryTest {
    public static void main(String[] args) {

        Library lib1=new Library("1999", "Oryell", 1955, "dystopia" );
        System.out.println(lib1.getAuthor());
        lib1.setAuthor("GUT");
        System.out.println(lib1.getAuthor());
        lib1.setCategory("fiction");
        System.out.println(lib1.getCategory());
        lib1.setYear(1111);
        System.out.println(lib1.getYear());
    }
}
