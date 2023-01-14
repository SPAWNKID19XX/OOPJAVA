package TokioSchool.Unidade3.Exercicio2;

public class Triangle implements GeomFig{

    int hipotenusa = 8, catet1 = 5, catet2 = 4;
    @Override
    public double getPerimtr() {
        return hipotenusa+catet1+catet2;
    }

    @Override
    public double getArea() {
        double p = getPerimtr()/2;
        return Math.sqrt(p*(p-hipotenusa) * (p-catet1) * (p-catet2));
    }
}
