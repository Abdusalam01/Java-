import java.util.Scanner;

public class Saniye_Hesaplama {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        // Kullanıcıdan giriş iste.
        System.out.print("Hesaplamak istediginiz saniyeyi giriniz: ");
        int saniye = input.nextInt();

        int dakika = saniye / 60; // kaç dakika olduğunu bul.
        int saat = dakika / 60;
        int gun = saat / 24;
        int ay = gun / 30;
        int yil = ay / 12;
        int kalanSaniye = saniye % 60; // kalan saniye.
        System.out.println(saniye + " Saniye ==> "+ yil + " yil " + ay + " ay " + gun + " gun " + saat + " Saat " 
        + dakika + " dakika " + kalanSaniye + " Saniyedir");

        input.close();
    }
}
