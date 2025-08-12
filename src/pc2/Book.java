package pc2;

public class Book {
    String title;
    String author;

    Book(String newTitle, String newAuthor) {
        this.author = newAuthor;
        this.title = newTitle;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    void setTitle(String newTitle) {
        title = newTitle;
    }

    void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public void printInfo() {
        System.out.println("Название: "+this.title +" Автор: "+this.author);
    }
}
