package TokioSchool.Unidade3.AbstractExercises;

abstract public class Reciept {
    String name, type, ingridients,howToCoock;
    public abstract void showReciept();
    public abstract void showingridients();
}

class Salade extends Reciept{
    public Salade (String name,String type, String ingridients, String howToCoock){
        this.name = name;
        this.type = type;
        this.ingridients = ingridients;
        this.howToCoock = howToCoock;
    }

    @Override
    public void showReciept() {
        System.out.println("Name: "+ name +"Type: "+ type +"Reciept: "+howToCoock);
    }

    @Override
    public void showingridients() {
        System.out.println("Ingridients: " +ingridients);
    }
}

class Pizza extends Reciept {
    public Pizza(String name, String type, String ingridients, String howToCoock) {
        this.name = name;
        this.type = type;
        this.ingridients = ingridients;
        this.howToCoock = howToCoock;
    }

    @Override
    public void showReciept() {
        System.out.println("Name: " + name + "Type: " + type + "Reciept: " + howToCoock);
    }

    @Override
    public void showingridients() {
        System.out.println("Ingridients: " + ingridients);
    }
}

class Porrige extends Reciept {
    public Porrige(String name, String type, String ingridients, String howToCoock) {
        this.name = name;
        this.type = type;
        this.ingridients = ingridients;
        this.howToCoock = howToCoock;
    }

    @Override
    public void showReciept() {
        System.out.println("Name: " + name + "Type: " + type + "Reciept: " + howToCoock);
    }

    @Override
    public void showingridients() {
        System.out.println("Ingridients: " + ingridients);
    }
}