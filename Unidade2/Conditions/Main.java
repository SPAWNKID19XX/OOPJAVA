package TokioSchool.Unidade2.Conditions;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int count=0;
        double num = 4557888;
        while (num != 0){
            num/=10;
            count++;
        }
        System.out.println(count);
        Scanner sc=new Scanner(System.in);
        int  num1, month;
        System.out.println("Exercise 1.\nInsert 2 numbers: ");
        num = sc.nextInt();
        num1 = sc.nextInt();
        System.out.println("Sum: " + (num + num1) + "\nSubtract: " + (num - num1) + "\nMultiplication: " + (num*num1));

        System.out.println("Exercise 2.\n\tUser insert a intiger month and script print a name\nInsert a month: ");
        month = sc.nextInt();
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Month inserted doesnt exist!!!");

        }


        System.out.println("Exercise 3\nUser insert a intiger number, and script print if multiples of 10\nInsert a Integer: ");



        num = sc.nextInt();

        System.out.println((num%10==0)?"Multilpe":"Not Multiple");

        System.out.println("\nExercise 2\nUser insert a char, and a script print if it is Low or Upper\nInsert a char: ");
        char ch = sc.next().charAt(0);

        System.out.println((Character.isLowerCase(ch))?"Low":"Upper");
        IMC imc = new IMC();







    }
}
