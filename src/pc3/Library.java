package pc3;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    Library(String bookTitle1, String author1, int year1, String category1){
        this.year = year1;
        this.author = author1;
        this.category = category1;
        this.bookTitle = bookTitle1;
    }

    String getBookTitle(){
        return bookTitle;
    }
    String getAuthor(){
        return author;
    }
    int getYear(){
        return year;
    }
    String getCategory(){
        return category;
    }

    void setAuthor(String newAuthor){
        author=newAuthor;
    }
    void setYear(int newYear){
        year=newYear;
    }
    void setBookTitle(String newBookTitle){
        bookTitle=newBookTitle;
    }
    void setCategory(String newCategory){
        category=newCategory;
    }
}
