package TokioSchool.Unidade3.Exercicio5;

public class Dad {
    private String surname;
    private String name;
    public int age;
    boolean student;

    {
        surname = "Isac";
        name = "Boris";
        age = 35;
        student = true;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }
}
