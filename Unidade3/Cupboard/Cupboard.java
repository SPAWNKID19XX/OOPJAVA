package TokioSchool.Unidade3.Cupboard;

public class Cupboard {
    int year,length,width, height;
    String type, manufactor;
    float price;

    private Cupboard(){}

    Cupboard(int year, int length, int width, int height, String type, String manufactor, float price){
        this.year = year;
        this.length = length;
        this.width = width;
        this.height = height;
        this.type = type;
        this.manufactor = manufactor;
        this.price = price;
    }

    public double getVolume(int length, int width, int height){
        return  (double) (length * width * height)/1000000;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
