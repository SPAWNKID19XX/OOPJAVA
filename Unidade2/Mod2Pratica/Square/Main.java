package TokioSchool.Unidade2.Mod2Pratica.Square;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("Insert a size of square: ");
        size = scan.nextInt();

        System.out.println("Square area is " + (size*size));
    }

}
