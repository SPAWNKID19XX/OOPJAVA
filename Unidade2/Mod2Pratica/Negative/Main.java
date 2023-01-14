package TokioSchool.Unidade2.Mod2Pratica.Negative;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert a number: ");
        num = scanner.nextInt();

        if (num < 0)
            System.out.println("Negative");
        else if ( num > 0)
            System.out.println("Positive");
        else
            System.out.println("Zero");
    }
}
