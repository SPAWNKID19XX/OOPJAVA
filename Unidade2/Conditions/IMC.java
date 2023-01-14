package TokioSchool.Unidade2.Conditions;

public class IMC {

    public static float weight, growth;

    public static float calcImc(){
        return weight/(growth*growth);
    }

    public void printRes(){
        float res = calcImc();
        System.out.println(res);
    }

}
