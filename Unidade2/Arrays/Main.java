package TokioSchool.Unidade2.Arrays;


public class Main {

    public static void main(String[] args) {
        //create new class Students
        Students[] student = new Students[4];
        for (int i = 0 ; i < 4 ; i++)
            student[i] = new Students();

        student[0].name = "Boris";
        student[0].media= 15;
        if (student[0].media > 9.5)
            student[0].approved = true;
        else
            student[0].approved = false;

        student[1].name = "Aaron";
        student[1].media= 15;
        if (student[1].media > 9.5)
            student[1].approved = true;
        else
            student[1].approved = false;

        student[2].name = "Natasha";
        student[2].media= 15;
        if (student[2].media > 9.5)
            student[2].approved = true;
        else
            student[2].approved = false;

        student[3].name = "Emily";
        student[3].media= 15;
        if (student[3].media > 9.5)
            student[3].approved = true;
        else
            student[3].approved = false;

        for (int i=0 ; i<4 ; i++)
            System.out.println(student[i].name + " " + student[i].media + " " + student[i].approved);


        System.out.println("crosses and nougths");

        char[][] field = new char[3][3];

        field[0][0] = 'O';
        field[0][1] = 'O';
        field[0][2] = 'X';
        field[1][0] = 'O';
        field[1][1] = 'O';
        field[1][2] = 'X';
        field[2][0] = 'O';
        field[2][1] = 'X';
        field[2][2] = 'O';

        for (int i = 0 ; i < 3 ; i++)
            for (int j = 0; j < 3; j++){
                System.out.println(field[i][j]);
            }

    }

}
