package TokioSchool.Unidade3.MethodsGetterSetter;

public class Vector2 {
    private static final int MAXVAL = 100, MINVAL = -100;
    private int posA, posB;

    Vector2(){
        posA = 0;
        posB = 0;
    };

    Vector2(int a, int b){
        this.posA = a; this.posB = b;
    }

    void setValues(int posA, int posB){
        if (posA <= MAXVAL && posA >= MINVAL)  {this.posA = posA;}
        if (posB <= MAXVAL && posB >= MINVAL)  {this.posB = posB;}
    }
    public int getPosA() {
        return posA;
    }
    public int getPosB() {
        return posB;
    }

    int sum(int arg, int arg2){
        return arg+arg2;
    }

    int sub(int arg, int arg2){
        return arg-arg2;
    }
}
