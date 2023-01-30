package Bolum8;
import java.util.Scanner;

public class SatirlariTopla {
    public static void main(String[] args) {
        double[][] matris = new double[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("3'e  4'luk bir matris giriniz: ");
        for (int i = 0 ; i < matris.length ; i++){
            for (int j = 0 ; j < matris[i].length ; j++){
                matris[i][j] = input.nextDouble();
            }
        }
        
        for (int i = 0 ; i < 3 ; i++){
            int satir = 0;
            for (int j = 0; j < 4 ; j++){
                satir += matris[i][j];
            }
            System.out.println( i + ". satirin elemanlarinin toplami: " + satir);
        }

        input.close();
    }
}