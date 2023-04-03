import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OyunGorunumu {
    
    
    private OyunVerisi oyunVerisi = new OyunVerisi();
    private SavasMotoru savasMotoru = new SavasMotoru();

    OyunGorunumu() {}

    public void baslangicEkrani() { 
        System.out.println("*******************************************");
        System.out.println("            Oyuna hos geldiniz             ");
        System.out.println("*******************************************");
    }

    public void anaMenuyuGoster() {
        System.out.println("ANA MENU");
        System.out.println("1.Tum sovalyeleri goster\n" + // menu
                           "2.Aktif olan sovalyeleri goster\n" + 
                           "3.Adi girilen sovalye bilgilerini goster\n" +
                           "4.Adi girilen sovalyeyi degistir\n" + 
                           "5.Yardim\n" +
                           "6.Oyunu baslat\n" + 
                           "7.Oyundan cik");
        System.out.print("Lutfen seciminizi yapiniz: ");
        int secim;  // kullanici secimini tutan secim nesnesi
        try {
            Scanner input = new Scanner(System.in); 
            
            secim = input.nextInt(); // kullanicidan girdi alir
            if (secim > 0 && secim <= 7) { // kullanicinin menudeki secenekleri secip secmedigini kontrol eder
                switch (secim) {
                    case 1:
                        sovalyeleriGoster();
                        break;
                    case 2:
                        AktifSovalyeleriGoster();
                        break;
                    case 3:
                        oyunVerisi.getSovalyeler();
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    case 6:
                        System.out.println("\n    SOVALYELER VE DUSMANLAR      ");
                        System.out.println("-----------------------------------\n");
                        oyunVerisi.getYazdir();
                        break;
                
                    default:
                        System.out.println("oyundan ciktiniz.");
                        break;
                }
            }
            else { // kullanici istenilen aralikta girmediyse else calisir
                System.out.println("\n*****************************************");
                System.out.println("*  Lutfen gecerli bir secim yapiniz!!!  *");
                System.out.println("*****************************************\n");
                anaMenuyuGoster();
            }
        } catch(InputMismatchException e) {
            System.out.println("\n*****************************************");
            System.out.println("*   Harf girdiniz, lutfen sayı giriniz  *"); 
            System.out.println("*****************************************\n");
            anaMenuyuGoster();
        }
    }

    public void yardim() {

    }

    public void sovalyeleriGoster() {
        oyunVerisi.getAktifSovalyeler();
    }

    public void AktifSovalyeleriGoster() {
        oyunVerisi.getAktifSovalyeler();
    }

    public void manuddenSecimYap() {
        anaMenuyuGoster();
    }

    public void soyalyeyiGoster() {
        oyunVerisi.getSovalyeler();
        
    }

    public void oyunDurumunuGoster(ArrayList<Dusman> dusmanlar, ArrayList<Sovalye> sovalyeler) {

    }



}
