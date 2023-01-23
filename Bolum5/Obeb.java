import java.util.Scanner;

public class Obeb {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        for(int i=2; i <= sayi; i++){
            while(sayi % i == 0){
                System.out.print(i + " "); // System.out.println(i + "| " + sayi);
                //System.out.println(" -----");
                sayi = sayi/i;
            }
        }
        input.close();
    }
}
