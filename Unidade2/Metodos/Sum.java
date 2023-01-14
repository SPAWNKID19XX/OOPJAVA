package TokioSchool.Unidade2.Metodos;

public class Sum {
    public static int num1;
    public static int num2;

    public static int Somar(){
        return num1+ num2;
    }

    public void printTotal(){
        int total = Somar();
        System.out.println(total);
    }
}
