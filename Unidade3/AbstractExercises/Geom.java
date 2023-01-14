package TokioSchool.Unidade3.AbstractExercises;

abstract class Geom {
    int width, color;

    public abstract void drow();

}

class Rect extends Geom{
    int x1,x2,y1,y2;
    public Rect(int x1,int y1,int x2,int y2, int width, int color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.width = width;
        this.color = color;
    }

    @Override
    public void drow() {
        System.out.println("Rect coordinate X1="+x1+" Y1="+y1+" X2=" +x2+ " Y2="+y2+" Width="+width+" Color="+color);
    }
}
class Line extends Geom{
    int x1, y1, x2, y2, width, color;
    public Line(int x1,int y1,int x2,int y2, int width, int color){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.width = width;
        this.color = color;
    }

    @Override
    public void drow() {
        System.out.println("Line coordinate X1="+x1+" Y1="+y1+" X2=" +x2+ " Y2="+y2+" Width="+width+" Color="+color);
    }
}

class Ellips extends  Geom{
    int x1,y1,width;
    public Ellips(int x1,int y1, int width, int color){
        this.x1 = x1; this.y1 = y1;
        this.color = color;
    }

    @Override
    public void drow() {
        System.out.println("Ellips coordinate X1="+x1+" Y1="+y1+" Width="+width+" Color="+color);
    }
}