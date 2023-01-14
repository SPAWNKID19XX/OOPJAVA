package TokioSchool.Unidade3.MethodsGetterSetter;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        Person p6 = new Person();
        p1.setDatas("Isac", "Boris", "Boris", 100, 4);
        p2.setDatas("Isac..", "Aaron", "Boris", 30, 2);
        p3.setDatas("Isac", "Emily", "Boris", 20, 3);
        p4.setDatas("Isac", "Nata+lia", "Vasile", 50, 4);
        p5.setDatas("Isac", "Boris", "Gor+ge", 95, 5);
        p6.setDatas("Isac", "Eugenia", "Gorge", 80, 40);

        System.out.println(p1.getF() + " " + p1.getI() + " " + p1.getO() + " " + p1.wieght + " " + p1.level);
        System.out.println(p2.getF() + " " + p2.getI() + " " + p2.getO() + " " + p2.wieght + " " + p2.level);//error on f
        System.out.println(p3.getF() + " " + p3.getI() + " " + p3.getO() + " " + p3.wieght + " " + p3.level);//error on wieght
        System.out.println(p4.getF() + " " + p4.getI() + " " + p4.getO() + " " + p4.wieght + " " + p4.level);//error on i
        System.out.println(p5.getF() + " " + p5.getI() + " " + p5.getO() + " " + p5.wieght + " " + p5.level);//error on o
        System.out.println(p6.getF() + " " + p6.getI() + " " + p6.getO() + " " + p6.wieght + " " + p6.level);//error on level


        System.out.println("Vectors".toUpperCase());

        Vector2 vec = new Vector2();
        Vector2 vec1 = new Vector2();
        vec.setValues(100,555);
        vec1.setValues(25,-16);

        System.out.println(vec.getPosA() + " " +vec.getPosB());
        System.out.println(vec1.getPosA() + " " + vec1.getPosB());
        System.out.println("Sub: " + (vec.getPosA() - vec1.getPosA()) + " " + (vec.getPosB() - vec1.getPosB()));
        System.out.println("Sum: " + (vec.getPosA() + vec1.getPosA()) + " " + (vec.getPosB() + vec1.getPosB()));
    }
}
