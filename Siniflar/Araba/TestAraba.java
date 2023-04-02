import java.util.Scanner;

public class TestAraba {
    public static void main(String[] args) {
        String[] marka = {"Mersedes", "BMW", "Tesla", "Toyota", "Aoudi", "DS"};
        String[] renk = {"Siyah", "Beyaz", "Kirmizi", "Mavi", "Yesil","Sari"};
        String[] yakit = {"Benzin", "Dizel", "Yari Elektirikli", "Elektirikli"};
        int[] kapi = {2,4};

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Arabalı liste oluturulsun: ");
        int sayi = input.nextInt();

        Araba araba[] = new Araba[sayi];

        for(int i = 0; i < araba.length; i++)
            araba[i] = new Araba();
        
        for(int i = 0; i < araba.length; i++){
            int n = (int)(Math.random() * 5);
            araba[i].setMarka(marka[n]);

            int s = (int)(Math.random() * 6);
            araba[i].setRenk(renk[s]);

            int m = 2010 + (int)(Math.random() * 13);
            araba[i].setYil(m);

            int k = (int)(Math.random() * 2);
            araba[i].setKapiSayisi(kapi[k]);

            int y = (int)(Math.random() * 4);
            araba[i].setYakit_turu(yakit[y]);

            int b = 200 +  100 * (int)(Math.random() * 6);
            araba[i].setBeygir_gucu(b);

            int bj = (int)( 400 + 3 * (Math.random() * 101));
            araba[i].setBagaj_kapasitesi(bj);
        }
        
        System.out.println("\n  - Satilik Araba listesi -");
        System.out.println("------------------------------\n");
        for(int i = 0; i < araba.length; i++){
            System.out.println("Araba Markasi:        " + araba[i].getMarka());
            System.out.println("Araba model yili:     " + araba[i].getYil());
            System.out.println("Araba rengi:          " + araba[i].getRenk());
            System.out.println("Araba Yakit Turu:     " + araba[i].getYakit_turu());
            System.out.println("Araba Beygir Gucu:    " + araba[i].getBeygir_gucu());
            System.out.println("Araba Bagaj Hacmi:    " + araba[i].getBagaj_kapasitesi() + " LT");
            System.out.println("Araba kapi sayisi:    " + araba[i].getKapiSayisi());
            System.out.println("*-----------------------------*\n");
        }

        input.close();
    }
}
