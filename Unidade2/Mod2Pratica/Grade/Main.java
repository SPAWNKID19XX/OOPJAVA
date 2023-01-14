package TokioSchool.Unidade2.Mod2Pratica.Grade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        short num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert a number: ");
        num = sc.nextShort();

        if (num > 0 && num < 3)
            System.out.println("Insuficient");
        else if (num>2 && num < 5)
            System.out.println("Suficient");
        else if (num > 4 && num < 7)
            System.out.println("Bom");
        else if (num>6 && num < 9)
            System.out.println("Notavel");
        else if (num > 8 && num < 11)
            System.out.println("Muito Bom");
        else
            System.out.println("Grade doesnt exist");

    }

}
