package TokioSchool.Unidade2.Metodos;

public class  Student {
    String name;
    int age,gradeCodding, gradeEnglish, gradePython, gradeMashlearning;

    public void printDatas(){
        System.out.println("Nome: "+name);
        System.out.println("Age: "+age);
        System.out.println("Codding: "+gradeCodding);
        System.out.println("English: "+gradeEnglish);
        System.out.println("Python: "+gradePython);
        System.out.println("MashinLearning: "+gradeMashlearning);

    }
    public void mediaOfGrades(){
        double m = (gradeCodding+gradePython+gradeEnglish+gradeMashlearning)/4.0;
        if (m<60)
            System.out.println("Reprovado!");
        else
            System.out.println("Aprovado!");
    }
}
