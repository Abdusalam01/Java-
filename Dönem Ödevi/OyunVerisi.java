import java.util.ArrayList;
import java.util.Scanner;

public class OyunVerisi {

    public static void main(String[] args) {
        
    }
    private ArrayList<Sovalye> sovalyeler = new ArrayList<Sovalye>();
    private ArrayList<Sovalye> aktifSovalyeler = new ArrayList<Sovalye>();
    private ArrayList<Dusman> dusmanlar = new ArrayList<Dusman>();
    private ArrayList<Dusman> AktifDusmanlar = new ArrayList<Dusman>();
    private ArrayList<Sans> sanslar = new ArrayList<Sans>();
    private ArrayList<Sovalye> yazdir = new ArrayList<Sovalye>();

    public OyunVerisi() {

    }

    public ArrayList<Sovalye> getSovalyeler() {
        // sovalye sinifindan yeni sovalyeler yarat ve onlara ad, id, tipive vurus hakki bilgilerini ver
        Sovalye s1 = new GucluSovalye("Sovalye S1", 1, "Guclu sovalye", 1);
        Sovalye s2 = new GucluSovalye("Sovalye S2", 1, "Guclu sovalye", 1);
        Sovalye s3 = new ZayifSovalye("Sovalye S3", 2, "Zayif sovalye", 1);
        Sovalye s4 = new GucluSovalye("Sovalye S4", 1, "Guclu sovalye", 1);
        Sovalye s5 = new ZayifSovalye("Sovalye S5", 2, "Zayif sovalye", 1);
        
        // girilen sovalye bilgilerini Arrayliste ekle
        sovalyeler.add(s1);
        sovalyeler.add(s2);
        sovalyeler.add(s3);
        sovalyeler.add(s4);
        sovalyeler.add(s5);

        return sovalyeler;
    }

    public ArrayList<Sovalye> getAktifSovalyeler() {
        getSovalyeler();   // sovalyeler sonkisyonunu cagir
        // aktif sovalyeleri konsola yazdirir
        for (int k = 1; k <= sovalyeler.size(); k++) {
            System.out.println(k + ")**************************");
            System.out.println(sovalyeler.get(k-1));
            System.out.println("----------------------------\n");
            
        }
        return aktifSovalyeler;
    }

    public ArrayList<Dusman> getDusmanlar() {
        // Dusman sinifindan yeni dusmanlar yaran 
        Dusman d1 = new GucluDusman("Dusman D1", 1);
        Dusman d2 = new ZayifDusman("Dusman D2", 2);
        Dusman d3 = new GucluDusman("Dusman D3", 3);
        Dusman d4 = new ZayifDusman("Dusman D4", 4);
        Dusman d5 = new GucluDusman("Dusman D5", 5);

        // girilen dusman bilgilerini Arrayliste ekle
        dusmanlar.add(d1);
        dusmanlar.add(d2);
        dusmanlar.add(d3);
        dusmanlar.add(d4);
        dusmanlar.add(d5);

        return dusmanlar;
    }

    public ArrayList<Dusman> getAktifDusmanlar() {
        getDusmanlar(); // dusmanlar fonkisyonunu cagir
        // akitif dusmanlari konsola yazdirir
        for (int j = 1; j <= dusmanlar.size(); j++) {
            System.out.println(j + ")**************************");
            System.out.println(dusmanlar.get(j-1));
            System.out.println("----------------------------\n");
        }
        return AktifDusmanlar;
    }

    public ArrayList<Sans> getSanslar() {
        return sanslar;
    }

    public ArrayList<Sovalye> getYazdir() {
        getSovalyeler(); // sovalyeler fonkisyonunu cagir
        getDusmanlar();  // dusmanlar fonkisyonunu cagir

        int sovalyeSkor = 0;
        int dusmanSkor = 0;
        Scanner input = new Scanner(System.in); // Scanner tanimlamasi
        try { // kullanici harf veya liste disi bir sayi girdiginde bi uyari mesaji verir
            for (int i = 0; i < 5; i++) {

                // aktif sovalyeleri konsola yazdir
                for (int k = 1; k <= sovalyeler.size(); k++) {
                    System.out.println(k + ")**************************");
                    System.out.println(sovalyeler.get(k-1));
                    System.out.println("----------------------------\n");  
                }
        
                // aktif dusmanlari konsola yazdir
                for (int j = 1; j <= dusmanlar.size(); j++) {
                    System.out.println(j + ")**************************");
                    System.out.println(dusmanlar.get(j-1));
                    System.out.println("----------------------------\n");
                }

                System.out.println("Kullanacaginiz Sovalyenin numarasini giriniz:");
                int sNo = input.nextInt();  // kullanicidan sovalye numarasini alir
                System.out.println("Hedefteki dusmanin numarasini giriniz:");
                int dNo = input.nextInt();  // kullanicidan dusman numarasini alir
                
                
                // scoru kimin aldiginin hesaplanmasi
                switch (sNo) {
                    case 1:  case 2:  case 4:
                        switch (dNo) {
                            case 1:  case 2:  case 3:  case 4:  case 5:
                                System.out.println("\nHedef vuruldu \nDusman yok edildi\n");
                                sovalyeSkor++;
                                break;
                        }
                        break;

                    case 3:  case 5:
                        switch (dNo) {
                            case 2:  case 4:
                                System.out.println("\nHedef vuruldu \nDusman yok edildi\n");
                                sovalyeSkor++;
                                break;
                            case 1:  case 3:  case 5:
                                System.out.println("\nDusman seni vurdu \nYok edildin");
                                dusmanSkor++;
                                break;
                        }
                    break;
                }         
                sovalyeler.remove(sNo-1);  // kullanilan sovalyenin pasif hala getirilmesi
                dusmanlar.remove(dNo-1);   // kullanilan dusmanin pasif hale getirilmesi  
                
            }
        } catch (Exception e) { // Hata mesaji
            System.out.println("\n*****************************************");
            System.out.println("*       Gecersiz giris yaptiniz!!!      *"); 
            System.out.println("*****************************************\n");
        }
        if (sovalyeSkor < dusmanSkor) {
            System.out.println("\n*****************************************");
            System.out.println("*          Dusman seni yendi...         *"); 
            System.out.println("*****************************************\n");
        }
        else if (sovalyeSkor > dusmanSkor){
            System.out.println("\n*****************************************");
            System.out.println("*      Dusmani yendin tebrikler...      *"); 
            System.out.println("*****************************************\n");
        }
        input.close();
        return yazdir;
    }
    
}
