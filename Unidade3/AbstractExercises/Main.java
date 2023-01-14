package TokioSchool.Unidade3.AbstractExercises;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Geom fig[] = new Geom[3];

        fig[0] = new Rect(1,1,8,9,5,22);
        fig[1] = new Ellips(1,1,5,27);
        fig[2]= new Line(1,1,5,1,19,369);

        for (int i=0;i<3;i++){
            fig[i].drow();
        }

        System.out.println("Reciepts: ".toUpperCase());

        Reciept[] menu = new Reciept[3];
        menu[0] = new Salade("Espinafre com baicon","Normal","100 gramas de queijo gorgonzola,\nAzeite quanto baste,\n1/2 colher de sopa de mostarda dijon\n1 colher de sopa de mel\n\t1 colher de sopa de creme de leite\n\t1 maço de espinafre lavado\n\t50 gramas de bacon frito em cubinhos pequenos ou fatias desidratadas no micro-ondas\n\t8 damascos picados ou 100 gramas de cogumelos salteados na manteiga\n\t50 gramas de nozes ou amêndoas tostadas"," Amasse o queijo gorgonzola com azeite e faça uma pastinha.\n" +
                "Adicione a mostarda, mel, creme de leite.\n" +
                "Coloque parte espinafre em uma tigela.\n" +
                "Espalhe um pouco do molhinho preparado por cima.\n" +
                "Coloque mais folhas e molho.\n" +
                "Finalize com o bacon em pedaços pequenos.\n" +
                "Coloque o damasco/cogumelos e as nozes/amêndoas por cima.\n" +
                "Finalize com azeite e está pronta para servir! Bom apetite");

        menu[1] = new Pizza("Espinafre com baicon","Normal","100 gramas de queijo gorgonzola,\nAzeite quanto baste,\n1/2 colher de sopa de mostarda dijon\n1 colher de sopa de mel\n\t1 colher de sopa de creme de leite\n\t1 maço de espinafre lavado\n\t50 gramas de bacon frito em cubinhos pequenos ou fatias desidratadas no micro-ondas\n\t8 damascos picados ou 100 gramas de cogumelos salteados na manteiga\n\t50 gramas de nozes ou amêndoas tostadas"," Amasse o queijo gorgonzola com azeite e faça uma pastinha.\n" +
                "Adicione a mostarda, mel, creme de leite.\n" +
                "Coloque parte espinafre em uma tigela.\n" +
                "Espalhe um pouco do molhinho preparado por cima.\n" +
                "Coloque mais folhas e molho.\n" +
                "Finalize com o bacon em pedaços pequenos.\n" +
                "Coloque o damasco/cogumelos e as nozes/amêndoas por cima.\n" +
                "Finalize com azeite e está pronta para servir! Bom apetite");

        menu[2] = new Porrige("Espinafre com baicon","Normal", "100 gramas de queijo gorgonzola,\nAzeite quanto baste,\n1/2 colher de sopa de mostarda dijon\n1 colher de sopa de mel\n\t1 colher de sopa de creme de leite\n\t1 maço de espinafre lavado\n\t50 gramas de bacon frito em cubinhos pequenos ou fatias desidratadas no micro-ondas\n\t8 damascos picados ou 100 gramas de cogumelos salteados na manteiga\n\t50 gramas de nozes ou amêndoas tostadas"," Amasse o queijo gorgonzola com azeite e faça uma pastinha.\n" +
                "Adicione a mostarda, mel, creme de leite.\n" +
                "Coloque parte espinafre em uma tigela.\n" +
                "Espalhe um pouco do molhinho preparado por cima.\n" +
                "Coloque mais folhas e molho.\n" +
                "Finalize com o bacon em pedaços pequenos.\n" +
                "Coloque o damasco/cogumelos e as nozes/amêndoas por cima.\n" +
                "Finalize com azeite e está pronta para servir! Bom apetite");

        for (int i = 0;i<3; i++){
            menu[i].showingridients();
            menu[i].showReciept();
        }
    }
}
