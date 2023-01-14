package TokioSchool.Unidade3.Exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pc comp = new Pc();
        String brand, model;
        int ram, hd;
        System.out.println("Insert brand: ");
        comp.setBrand(sc.next());
        System.out.println("Insert model: ");
        comp.setModel(sc.next());
        System.out.println("insert RAM(mb): ");
        comp.setRam(sc.nextInt());
        System.out.println("Insert hard disc(gb): ");
        comp.setHd(sc.nextInt());
        System.out.println("Your macbook is:)))))\n\t" +comp.getBrand() + "\n\t" + comp.getModel() + "\n\t" + comp.getRam() + "\n\t" + comp.getHd());
    }
}
