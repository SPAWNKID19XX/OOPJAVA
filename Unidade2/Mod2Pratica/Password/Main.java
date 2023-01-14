package TokioSchool.Unidade2.Mod2Pratica.Password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Password ja esta difinida, porque na
        // pratica a pass esta gravada na BD(SQL).
        int count = 0;
        String myPass = "spawnkid19XX";
        Scanner pass = new Scanner(System.in);
        String str = new String("");

        while (!str.equals(myPass)){
            System.out.print("Password: ");
            str = pass.nextLine();
            count++;

            if (count == 3){
                System.out.println("Attempts exhausted!");
                return;
            }
        }

        System.out.println("Greating msg");
    }
}
