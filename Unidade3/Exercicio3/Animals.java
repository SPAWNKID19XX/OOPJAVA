package TokioSchool.Unidade3.Exercicio3;

public abstract class Animals {
    String name;
    String speacking = "BlaBlaBla (Not declared)";
    String work = "Resting (Not declared)";
    String relax = "Hrrrrrrr (Not declared)";
    String hygiene = "Nooooooo (Not declared)";
    String walking = "Standing (Not declared)";
    void speacking() { System.out.print(speacking); }

    void relax(){
        System.out.print("\t" + relax);
    }

    void spandTime(){
        System.out.print("\t" + work);
    }
    void hygiene() {  System.out.print("\t" + hygiene); }

    void  walking(){
        System.out.print("\t" + walking);
    }

    void printAllMethods(){
        System.out.println (name + ":\n\tSpeaking - " + speacking + "\n\tWorking - " + work + "\n\tRelaxing - " +relax+ "\n\tHygiene - " + hygiene +"\n\tWalking - " + walking);
    }
}

class Cat extends Animals{
    {
        name = "Tom";
        speacking = "Meows";
        work = "Catches mace";
        relax = "Basking in the sun";
    }

}

class Dog extends Animals{
    {
        name = "Jack";
        speacking = "Barks";
        walking = "Running";
        hygiene = "swimming";
    }

}


