package approcheimperative.tableau;

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner sc = new Scanner( System.in );
        System.out.println("Bienvenue au conseil des classs");
        System.out.print("Entrer le nom de l'apprenant 1 : ");
        String name1 = sc.nextLine();
        System.out.println("Entrer le nom de " +name1+ " : ");
        float note1 = sc.nextFloat();
        sc.nextLine();
        System.out.print("Entrer le nom de l'apprenant 2 : ");
        String name2 = sc.nextLine();
        System.out.println("Entrer le nom de" +name2+ " : ");
        float note2 = sc.nextFloat();
    }
}
