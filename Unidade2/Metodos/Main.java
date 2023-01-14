package TokioSchool.Unidade2.Metodos;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Boris";
        student1.age = 35;
        student1.gradeEnglish = 87;
        student1.gradeCodding = 52;
        student1.gradePython = 50;
        student1.gradeMashlearning = 50;


        student1.printDatas();
        student1.mediaOfGrades();

        System.out.println("Exercise 2.");
        Sum soma = new Sum();
        soma.num1 = 5;
        soma.num2 = 5;

        soma.printTotal();
    }



}
