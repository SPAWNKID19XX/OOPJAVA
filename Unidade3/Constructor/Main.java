package TokioSchool.Unidade3.Constructor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Rectengle".toUpperCase());
        Rect r1 = new Rect();
        Rect r2 = new Rect(0,0,5,3);
        Rect r3 = new Rect(1,1,9,10);

        System.out.println("Rectangle1\n x1=" +r1.x1+ " y1=" +r1.y1+ " x2=" +r1.x2+ " y2=" +r1.y2);
        System.out.println("Rectangle2\n x1=" +r2.x1+ " y1=" +r2.y1+ " x2=" +r2.x2+ " y2=" +r2.y2);
        System.out.println("Rectangle3\n x1=" +r3.x1+ " y1=" +r3.y1+ " x2=" +(r3.x2+ r3.x1)+ " y2=" +(r3.y2+r3.y1));

        System.out.println("Triangle".toUpperCase());
        Triangle tr1 = new Triangle();
        Triangle tr2 = new Triangle(5, 5, 3,1,3,7);

        System.out.println(tr1.x1 + " " +tr1.y1+ " " + tr1.x2+ " " + tr1.y2 + " " + tr1.x3+ " " + tr1.y3);
        System.out.println(tr2.x1 + " " +tr2.y1+ " " + tr2.x2+ " " + tr2.y2 + " " + tr2.x3+ " " + tr2.y3);

        System.out.println("Line".toUpperCase());
        Line ln1 = new Line();
        Line ln2 = new Line(1,1,5,7);

        System.out.println("Line1\nx1="+ln1.x1+" y1=" +ln1.y1+ " x2= " +ln1.x2+ " y2="+ln1.y2);
        System.out.println("Line2\nx1="+ln2.x1+" y1=" +ln2.y1+ " x2= " +ln2.x2+ " y2="+ln2.y2);
    }
}
