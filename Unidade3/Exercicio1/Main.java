package TokioSchool.Unidade3.Exercicio1;

public class Main {
    public static void main(String[] args) {

        Geom fig1 = new Geom("Triangle");
        Geom fig2 = new Geom("Square");
        Geom fig3 = new Geom("Circle");
        Geom fig4 = new Geom("Square");
        Geom fig5 = new Geom("Triangle");


        System.out.println("Total Fig: " + Geom.totalFig +
                "\nTriangles: " + Geom.totalTr +
                "\nSquare: " + Geom.totalSq +
                "\nCircles: " + Geom.totalCircle);

    }
}
