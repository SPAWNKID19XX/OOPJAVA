package TokioSchool.Unidade3.Cupboard;

public class Main {
    public static void main(String[] args) {
        Cupboard a = new Cupboard(2019,100,25,300,"old","Olhão", 298.85f);
        Cupboard b = new Cupboard(2018,200,45,300,"old","Olhão", 298.85f);
        Cupboard c = new Cupboard(2017,300,75,300,"old","Olhão", 298.85f);

        System.out.println("Volume First = " + a.getVolume(a.length,a.width, a.height));
        System.out.println("Volume Second = " + b.getVolume(b.length,b.width, b.height));
        System.out.println("Volume Third = " + c.getVolume(c.length,c.width, c.height));

    }
}
