package TokioSchool.Unidade2.Mod2Pratica.BankAccount;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numbersOfUsers, i;

        Scanner data = new Scanner(System.in);
        String str = new String();
        Random randVal = new Random();
        //create classes
        System.out.print("Number of Users: ");
        numbersOfUsers = data.nextInt();
        Richest userRichest = new Richest();

        double richest = 0;//variable save maxim amount

        //Insert data about user
        for (i=0; i<numbersOfUsers ; i++){
            Richest user_i = new Richest();
            System.out.print("\nUser " + (i+1) + " nome: ");
            user_i.name = data.next();
            System.out.print("User " + (i+1) + " iban: ");
            user_i.iban = data.nextInt();
            user_i.amountOfMoney = randVal.nextFloat(25000);
            System.out.println("Val: " + user_i.amountOfMoney);
            if (user_i.amountOfMoney > richest){
                richest = user_i.amountOfMoney;
                userRichest.name = user_i.name;
                userRichest.iban = user_i.iban;
                userRichest.amountOfMoney = user_i.amountOfMoney;
            }

        }


        System.out.println("Richest\n\tNome: " + userRichest.name + "\n\tIban: " + userRichest.iban + "\n\tAmount: " + userRichest.amountOfMoney);



    }

}
