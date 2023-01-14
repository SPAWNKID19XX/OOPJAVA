package TokioSchool.Unidade3.PacageExercise.Main;

import TokioSchool.Unidade3.PacageExercise.Second.Chair;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length,width, height;
        double price;
        Chair chair = new Chair(120, 60, 50);
        Scanner scan = new Scanner(System.in);

        System.out.println(chair.volume(chair.getLength(), chair.getHeight(), chair.getWidth()));


    }
}
