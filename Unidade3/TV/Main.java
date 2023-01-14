package TokioSchool.Unidade3.TV;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv("blaupunkt",40, 2013,300.00f);
        System.out.println(tv.getModel() + " " + tv.getDiagonal() + " " + tv.getYear() + " " + tv.getPrice());
        tv.setModel("LG");
        tv.setDiagonal(43);
        tv.setYear(2020);
        tv.setPrice(253.59f);
        System.out.println(tv.getModel() + " " + tv.getDiagonal() + " " + tv.getYear() + " " + tv.getPrice());
    }
}
