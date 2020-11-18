package approcheimperative.arr;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("tab");
        int[] myArray = new int[100];

        for (int i=0;i<100;i++){
            myArray[i] = i;
            if (myArray[i] % 2 == 0){
                System.out.println(myArray[i]);
            }

        }



    }
}
