import java.util.Scanner;

public class Basamaklarin_toplami {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // 0 ile 1000 arasında bir degeer oku
        System.out.print("0 ile 1000 arasinda bir deger giriniz : ");
        int girilenSayi = input.nextInt();
        
        if (girilenSayi > 0 && girilenSayi < 1000){ // kullanıcı 0 ile 1000 aralıgında bir deger girerse program çalışır.
            int a = girilenSayi % 10; // birler basamağındaki eleman
            int b = girilenSayi / 10; // birler basamağındaki elemansız kalan kisim
            int c = b % 10; // kalan kısmın birler basamağındaki eleman
            int d = b / 10;// kalan kismın birler basamagındaki elemansız hali.
            System.out.println(a + c + d);
        }
        else
            System.out.println("Istene aralikta bir sayi giriniz!!!!");

        input.close();
    }
}
