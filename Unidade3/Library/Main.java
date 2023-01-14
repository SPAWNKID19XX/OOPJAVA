package TokioSchool.Unidade3.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu = 1, delBook;
        String title, author, year, pages;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> lib = new ArrayList<>();
        while (menu != 0){
            System.out.println("1------Add Book.\n" +
                    "2--Show Library.\n" +
                    "3---Delete Book.\n" +
                    "0----------Exit.");
            menu = scanner.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Add Book.");
                    System.out.print("\tTitle: ");          title = scanner.next();
                    System.out.print("\tAuthor: ");         author = scanner.next();
                    System.out.print("\tPublishing year:"); year = scanner.next();
                    System.out.print("\tBook\'s pages: ");  pages = scanner.next();
                    Book book = new Book(title,author,year,pages);
                    lib.add(book);
                    break;
                case 2:
                    System.out.println("Show Library.");
                    for (int i=0;i< lib.size();i++){
                        System.out.println((i+1) + " " +lib.get(i).toStr());
                    }
                    break;
                case 3:
                    for (int i=0;i< lib.size();i++){
                        System.out.println((i+1) + " " +lib.get(i).toStr());
                    }
                    System.out.println("Delete Book nomber");
                    delBook = scanner.nextInt();
                    lib.remove(delBook-1);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Insert menu number:");
            }
        }
    }
}
