package TokioSchool.Unidade3.MethodsGetterSetter;

public class Person {
    String f, i, o;
    int level;
    int wieght;

    Person(){
        f="Error";i="Error";o="Error";
        wieght = 30; level = 1;
    }

    private boolean isCorrectString(String str){
        for (int i = 0 ; i<str.length();i++){
            if ((Character.isLetter(str.charAt(i)) == false)){
                return false;
            }
        }
        return (str.length() > 0);
    }

    private  boolean isCorrectLvl(int level){
        return (level>0 && level<=5);
    }

    private boolean isCorrectWieght(int wieght){
        return (wieght>30 && wieght<=200 );
    }

    void setDatas(String f, String i, String o, int wieght, int level){
        if (isCorrectString(f))         {this.f = f;}
        if (isCorrectString(i))         {this.i = i;}
        if (isCorrectString(o))         {this.o = o;}
        if (isCorrectLvl(level))        {this.level = level;}
        if (isCorrectWieght(wieght))    {this.wieght = wieght;}
    }
    Person(String f, String i, String o, int wieght, byte level){
        this.f = f; this.i = i; this.o =o;
        this.wieght = wieght;
        this.level = level;
    }

    public String getF() {
        return f;
    }

    public String getI() {
        return i;
    }

    public String getO() {
        return o;
    }

    public int getWieght() {
        return wieght;
    }

    public int getLevel() {
        return level;
    }
}
