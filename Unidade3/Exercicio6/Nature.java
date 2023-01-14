package TokioSchool.Unidade3.Exercicio6;

public class Nature {
    String name;

}

class Cat extends Nature{
    int type;
    String name;

    /*after a call of methode super(), a value will be safe in patern class of Cat
    namely Nature*/
    Cat(int type, String name){
        super.name = name;
    }
    Cat(String name){
        this.name = name;
    }

    void showData(){
        if (super.name != null){
            System.out.println("Name = " + super.name + ", belong to Patern clase Nature");
        }
        if (name != null){
            System.out.println("\nName = " + name + ", belong to clase Cat");
        }

    }


}