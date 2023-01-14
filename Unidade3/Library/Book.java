package TokioSchool.Unidade3.Library;

public class Book {
    private String title, author, year, pages;

    Book(){

    }
    public Book(String title, String author, String year, String pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    String toStr(){
        return ("Title: " + title + ", Author: " + author + ", Year: "  + year + ", Pages: " + pages);
    }
}
