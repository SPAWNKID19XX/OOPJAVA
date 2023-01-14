package TokioSchool.Unidade3.Constructor;

public class Line {
    int x1,x2,y1,y2;

    Line(){
        x1 = 0; y1 = 0;
        x2 = 5; y2 = 0;
    }

    Line(int x1,int x2,int y1, int y2){
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
    }
}
