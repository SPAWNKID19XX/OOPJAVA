package TokioSchool.Unidade3.Exercicio7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> lib = new ArrayList<>();
        Book book = new Book("Harry Potter","J. K. Rowling", 165435,556);
        lib.add(book);
        book = new Book("Clean Code A Handbook Of Agile Software Craftsmanship"," Robert C. Martin",97801,464);
        lib.add(book);

        BiggestBook bb= new BiggestBook();
        System.out.println(bb.getIsbn());
        for (int i = 0; i<lib.size() ; i++){
            System.out.println(lib.get(i).toStr());
            if (lib.get(i).getPages() > bb.getPages()){
                bb.setPages(lib.get(i).getPages());
                bb.setIsbn(lib.get(i).getIsbn());
                bb.setTitle(lib.get(i).getTitle());
                bb.setAuthor(lib.get(i).getAuthor());
                //System.out.println("datas has been changed\n" + bb.toStr());
            }
        }
        System.out.println("O livro com maior numero de paginas: " + bb.toStr());
    }
}
