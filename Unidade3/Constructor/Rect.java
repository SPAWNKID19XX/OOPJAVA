package TokioSchool.Unidade3.Constructor;

public class Rect {
    int x1,x2,y1,y2;

    Rect(){
        x1 = 0; y1 = 0;
        x2 = 3; y2 = 5;
    }

    Rect(int x1,int y1,int x2,int y2){
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
    }

    Rect(byte x1, byte y1, int w, int h){
        this.x1 = x1; this.y1 = y1;
    }

}
