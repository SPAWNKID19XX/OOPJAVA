package TokioSchool.Unidade3.Exercicio1;

import TokioSchool.Unidade3.Constructor.Triangle;

public class Geom {
    static int totalFig = 0, totalTr = 0, totalCircle = 0, totalSq = 0;
    Point p;
    String name;
    {
        addCounter();
        name = " ";
        p = new Point();
    }

    static void addCounter(){
        totalFig++;
    }

    static void addTr(){
        totalTr++;
    }

    static void addCircle(){
        totalCircle++;
    }

    private void setCenterFig(int x, int y){
        p.setX(x);
        p.setY(y);
    }

    static void addSq(){
        totalSq++;
    }
    Geom(){
    }

    Geom(String name){
        this.name = name;
        if (name == "Triangle"){
            addTr();
        } else if (name == "Square") {
            addSq();
        } else if (name == "Circle") {
            addCircle();
        }
    }


    class Point{
        protected int x,y;

        Point(){}
        Point(int x, int y){
            this.x = x; this.y = y;
        }

        public int getX() {
            return x;
        }

        private void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        private void setY(int y) {
            this.y = y;
        }

    }

}
