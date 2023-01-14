package TokioSchool.Unidade3.PacageExercise.Second;

public class Chair {
    int length;
    int width;
    int height;
    double price;

    {
        length = 0;
        width = 0;
        height = 0;
    }

    public Chair(int length, int width, int height){
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public double volume(int length, int width, int height){
        return (double) (length * width * height)/1000000;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
