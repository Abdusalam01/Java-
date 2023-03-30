import java.util.Scanner;

public class Terihler {
    public static void main(String[] args) {
        /**
        Date tarih = new Date();

        tarih.setTime(10000);
        System.out.println(tarih.toString());

        tarih.setTime(100000);
        System.out.println(tarih.toString());

        tarih.setTime(1000000);
        System.out.println(tarih.toString());

        tarih.setTime(10000000);
        System.out.println(tarih.toString());

        tarih.setTime(100000000);
        System.out.println(tarih.toString());

        tarih.setTime(1000000000);
        System.out.println(tarih.toString());
         */


        /*
         S adet satırdan oluşan, ilk satırında S adet eleman olan ve her satırındaki eleman sayısı, bir önceki satırındaki 
         eleman sayısından 1 eksik olan bir düzensiz diziyi (ragged array) döngü yardımıyla oluşturup geriye döndüren 
         “yerlestir” isimli metodu yazınız. Metodunuz parametre olarak sadece istenen satır sayısını alacaktır.

        Metodun, S = 5 için geriye döndürdüğü düzensiz dizi:
            1   2   3   4   5 
            6   7   8   9
            10  11  12
            13  14
            15
         */

        Scanner input = new Scanner(System.in);

        int s;

        System.out.print("Satir sayisini giriniz: ");
        s = input.nextInt();

        int g = s;
        int sayac = 1, n = 0;
        int[][] matris = new int[s][];

        for(int i = 0; i < s; i++){
            matris[i] = new int[g--];
            for(int y = 0; y <= g; y++) 
                matris[i][y] = sayac++;
        }
        
        while(n != s){
            for(int yazdir: matris[n]){
                System.out.print(yazdir + "\t");
            }
            System.out.println();
            n++;
        }

        input.close();

    }
}
