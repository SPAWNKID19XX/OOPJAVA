package TokioSchool.Unidade3.Exercicio7;

public class Book {
    private String title, author;
    private int isbn, pages;

    {
        title = ""; author = ""; isbn = 0;pages = 0;
    }
    Book(){

    }
    Book(String title, String author, int isbn, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }
    String toStr(){
        return "O livro com título " + title + " e ISBN " + isbn + " e autor " + author + " tem " +pages+ " páginas.";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}

class BiggestBook extends Book{
    {
        setTitle("");
        setAuthor("");
        setIsbn(0);
        setPages(0);
    }
}
