package approcheimperative.arr;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int myArray[] = new int[10];
        for (int i=0;i<10;i++){
            myArray[i] = i;
        }
        System.out.println(myArray[0]);
        System.out.println("Longueur du tableau : " + myArray.length);
        System.out.println("Derniere valeur : " + myArray[myArray.length-1]);
        myArray[4] = 8;
        System.out.println("Nouvelle valeur de [4] : " + myArray[4]);

    }
}
