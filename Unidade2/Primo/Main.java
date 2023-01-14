package TokioSchool.Unidade2.Primo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, count = 0;
        short num = 0;

            System.out.print("Insert a number(0..100): ");
            num = sc.nextShort();


        for (i = 1; i<num ; i++){
            if ( num%i == 0){
                System.out.println(count+ " " +i);
                count++;
            }

        }

        System.out.println((count > 1)?"Nao é primo":"primo");



    }
}
