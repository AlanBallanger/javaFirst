package approcheimperative.arr;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        for (int i = 0; i<array.length; i++){
            System.out.println("valeur tableau : " + array[i]);

            if (array[i] == 3) {
                System.out.println("toto est egal a : "+ array[i]);
            }

            if (array[i] % 2 == 0) {
                System.out.println("nombre pair : "+ array[i]);
            }

            if (i % 2 == 0) {
                System.out.println("valeur index paire : "+ array[i]);
            }

            if (array[i] % 2 != 0) {
                System.out.println("nombre impair : "+ array[i]);
            }

            System.out.println("2eme tableau : " + array[array.length-i-1]);
        }
    }
}
