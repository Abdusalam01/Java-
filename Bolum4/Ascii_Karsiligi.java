import java.util.Scanner;

public class Ascii_Karsiligi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("\n\n ASCII --> HARF Cevirmek istiyorsaniz 1 giriniz,\n " +
                              "HARF --> ASCII Cevirmek istiyorsaniz 2 giriniz: ");
        int secim = input.nextInt();
        if (secim == 1){ // ASCII kodunu harf'e çevivrir.
            System.out.print("Bir ASCII kodu girin: ");
            int ascii = input.nextInt();

            char ch = (char) ascii;
            System.out.println(ch);
        }
        else if (secim == 2){ // Girilen herfi ASCII koda çevirir.
            System.out.print("Bir HARF girin: ");
            char ch = input.next().charAt(0);

            int ascii = (int) ch;
            System.out.println(ascii);
        }
        else 
            System.out.println(" Yanlis giris yaptiniz, Tekrar deneyin...\n");
        input.close();
    }
}
