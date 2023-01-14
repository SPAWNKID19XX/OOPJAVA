package TokioSchool.Unidade3.ClassesExemples;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise POINT 3D:");
        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D();
        Point3D p3 = new Point3D();

        p1.x = -5; p1.y = 2; p1.z = 3;
        p2.x = 5; p2.y = -2; p2.z = 0;
        p3.x = 1; p3.y = 1; p3.z = 1;

        System.out.println("Point1\nx = " +p1.x+ " y = " +p1.y+ " z = " +p1.z+ "\nPoint2\nx = " +p2.x+ " y = " +p2.y+ " z = " +p2.z+ "\nPoint3\nx = " +p3.x+ " y = " +p3.y+ " z = " +p3.z);

        System.out.println("Exercise Line:");

        Line ln1 = new Line();
        Line ln2 = new Line();

        ln1.startX = 0; ln1.startY = 0; ln1.finishX = 5; ln1.finishY = 5;
        ln2.startX = 1; ln2.startY = 1; ln2.finishX = -5; ln2.finishY = -5;

        System.out.println("Line1\nStartX = " +ln1.startX+ " startY = " +ln1.startY+ " finishX = " +ln1.finishX+ " finishY = " +ln1.finishY);
        System.out.println("Line1\nStartX = " +ln2.startX+ " startY = " +ln2.startY+ " finishX = " +ln2.finishX+ " finishY = " +ln2.finishY);
    }
}
