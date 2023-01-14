package TokioSchool.Unidade3.Properties;

public class Main {
    public static void main(String[] args) {
        Properties trinagle = new Properties();
        Properties squad = new Properties();
        Properties line = new Properties();

        trinagle.width = 20;
        trinagle.type = "duble";
        trinagle.color.red = 5;
        trinagle.color.green = 10;
        trinagle.color.blue = 15;

        squad.width = 200;
        squad.type = "single";
        squad.color.red = 53;
        squad.color.green = 310;
        squad.color.blue = 135;

        line.width = 250;
        line.type = "pointed";
        line.color.red = 513;
        line.color.green = 3010;
        line.color.blue = 1350;

        System.out.println(trinagle.width + " " + trinagle.type + " " + trinagle.color.blue + " " + trinagle.color.red + " " + trinagle.color.green );
        System.out.println(squad.width + " " + squad.type + " " + squad.color.blue + " " + squad.color.red + " " + squad.color.green );
        System.out.println(line.width + " " + line.type + " " + line.color.blue + " " + line.color.red + " " + line.color.green );
    }
}
