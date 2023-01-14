package TokioSchool.Unidade3.Exercicio5;

public class Main {
    public static void main(String[] args) {
        Dad dad = new Dad();
        System.out.println("DAD\n\tName: " + dad.getName() + "\n\tSurname: " + dad.getSurname() + "\n\tAge: " + dad.getAge() + "\n\tIs student?: " + dad.isStudent());
        Son son = new Son();
        son.setName("Aaron");
        son.setAge(9);
        System.out.println("SON\n\tName: " + son.getName() + "\n\tSurname: " + son.getSurname() + "\n\tAge: " + son.getAge() + "\n\tIs student?: " + son.isStudent());
        Doughter doughter = new Doughter();
        doughter.setName("Emily");
        doughter.setAge(4);
        doughter.setStudent(false);
        System.out.println("Doughter\n\tName: " + doughter.getName() + "\n\tSurname: " + doughter.getSurname() + "\n\tAge: " + doughter.getAge() + "\n\tIs student?: " + doughter.isStudent());
        Wife wife = new Wife();
        wife.setName("Natasha");
        wife.setAge(37);
        wife.setStudent(false);
        System.out.println("Wife\n\tName: " + wife.getName() + "\n\tSurname: " + wife.getSurname() + "\n\tAge: " + wife.getAge() + "\n\tIs student?: " + wife.isStudent());
    }
}
