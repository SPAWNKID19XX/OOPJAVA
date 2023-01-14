package TokioSchool.Unidade3.Exercicio2;

public class Rect implements GeomFig {
    int length = 5, width = 3;

    @Override
    public double getPerimtr() {
        return (length+width)*2;
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
