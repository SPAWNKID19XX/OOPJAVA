package TokioSchool.Unidade2.workStr;

public class Main {

    public static void main(String[] args) {
        int[] count = new int[10];
        int i = 0, index = 0;
        String str = new String();
        String[] strHelp = new String[10];
        str = "ola pai, ola mãe, ola Aaron, ola Emily.";//0, 9, 18, 29
        System.out.println("ORIGINAL STRING: \n" + str);

        System.out.println("\nO comprimento de str original: " + str.length() + " caracteres.\n");

        System.out.println("toUpperCase: " + str.toUpperCase());

        System.out.println("\ntoLowerCase: " + str.toLowerCase());

        System.out.println("\nNa Possiçao 13 da str original esta o carater:  " + str.charAt(13));

        System.out.println("\nA palavra mãe comecça na possiçao : " + str.indexOf("mãe"));

        System.out.println("\nTrocamos as palavras mãe com pai e imprimimos:\n" + str.replace("pai", "mãe"));

        System.out.println("Procuramos e monstramos as posiçoes de palavras ***ola***");
        strHelp[i] = str;


        while (strHelp[i].indexOf("ola") != -1){
            count[i] = strHelp[i].indexOf("ola");
            index += count[i] ;
            strHelp[i+1] = strHelp[i].substring(count[i] + 3, strHelp[i].length());
            System.out.print(index+" ");
            index += 3;
            i++;
        }
    }
}
