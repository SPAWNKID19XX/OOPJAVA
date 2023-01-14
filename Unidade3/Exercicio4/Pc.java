package TokioSchool.Unidade3.Exercicio4;

public class Pc {
    String brand, model;
    int ram, hd;

    //inicializador
    {
        brand = "";
        model = "";
        ram = 128;
        hd = 20;
    }
    public Pc() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram > 128){
            this.ram = ram;
        }

    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        if (hd > 20){
            this.hd = hd;
        }
    }
}
