package TokioSchool.Unidade3.TV;

public class Tv{
    private String model;
    private int diagonal,year;
    private float price;

    {
        model = "blaupunkt";
        diagonal = 40;
        year = 2013;
        price = 300.00f;
    }

    private Tv(){}


    Tv(String model, int diagonal, int year, float price){
        this.model = model;
        this.diagonal = diagonal;
        this.year = year;
        this.price = price;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
