package TokioSchool.Unidade3.Constructor;

public class Triangle {
    int x1,x2,x3,y1,y2,y3;

    Triangle(){
        x1=0; y1=0;
        x2 = 3; y2 = 3;
        x3 = 2; y3 = 2;
    }

    Triangle(int x1, int x2, int x3, int y1, int y2, int y3){
        this.x1 = x1;   this.y1 = y1;
        this.x2 = x2;   this.y2 = y2;
        this.x3 = x3;   this.y3 = y3;
    }

}
