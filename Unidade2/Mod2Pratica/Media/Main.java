package TokioSchool.Unidade2.Mod2Pratica.Media;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int arr[] = new int[6];//arr witch will save all values
        int total = 0,i;

        Scanner num = new Scanner(System.in);

        for ( i = 0; i<6 ; i++){
            System.out.print("Insert a number " + (i+1) + ": ");
            arr[i] = num.nextInt();
            total += arr[i];
        }

        float res = (float)total/i;
        System.out.println(res);
    }
}
