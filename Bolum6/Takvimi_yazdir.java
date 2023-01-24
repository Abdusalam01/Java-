import java.util.Scanner;

public class Takvimi_yazdir {
    /** Main method */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan yılı girmesini isteyin
        System.out.print("Tam yili girin (or. 2020): ");
        int yil = input.nextInt();

        // Kullanıcıdan ay girmesini isteyin
        System.out.print("1 ile 12 arasinda bir sayi girin: ");
        int ay = input.nextInt();

        // Yılın ayı için takvimi yazdırın
        ayYazdir(yil, ay);
        input.close();
    }

    /** Yılda bir ay için takvimi yazdırın */
    public static void ayYazdir(int yil, int ay) {
        // Takvimin başlıklarını yazdırın
        TakvimBasligi(yil, ay);

        // Takvimin gövdesini yazdır
        takvimGovdesi(yil, ay);
    }

    /** Ay başlığını yazdırın, ör. Mayıs, 1999 */
    public static void TakvimBasligi(int yil, int ay) {
        System.out.println("\n       " + ayAdi(ay) + " " + yil);
        System.out.println("-----------------------------");
         System.out.println(" Paz Pzt Sal Car Per Cum Cmt");
    }

    /** Ayların türkçe adlari */
    public static String ayAdi(int ay) {
        String monthName = "";
        switch (ay) {
        case 1: monthName = "Ocak"; break;
        case 2: monthName = "Subat"; break;
        case 3: monthName = "Mart"; break;
        case 4: monthName = "Nisan"; break;
        case 5: monthName = "Mayis"; break;
        case 6: monthName = "Haziran"; break;
        case 7: monthName = "Temmuz"; break;
        case 8: monthName = "Agustos"; break;
        case 9: monthName = "Eylul"; break;
        case 10: monthName = "Ekim"; break;
        case 11: monthName = "Kasim"; break;
        case 12: monthName = "Aralik";
        }
        return monthName;
    }

    /** Ay gövdesini yazdır */
    public static void takvimGovdesi(int yil, int ay) {
        // Aydaki ilk tarih için haftanın başlangıç gününü alın
        int baslangicGun = getStartDay(yil, ay);

        // Aydaki gün sayısını alın
        int numberOfDaysInMonth = aylarinGunSayisi(yil, ay);

        // Ayın ilk gününden önceki ped alanı
        int i = 0;
        for (i = 0; i < baslangicGun; i++)
        System.out.print("    ");

        for (i = 1; i <= numberOfDaysInMonth; i++) {
        System.out.printf("%4d", i);

        if ((i + baslangicGun) % 7 == 0)
            System.out.println();
        }

        System.out.println();
    }

    /** Yil, Ay, Günün başlamgicini alin */
    public static int getStartDay(int yil, int ay) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        // 1/1/1800 ile ay/1/yıl arasındaki toplam gün sayısını alın
        int toplamGunSayisi = alToplamGunSayisi(yil, ay);

        // Ay/1/yıl için başlangıç gününü döndür
        return (toplamGunSayisi + START_DAY_FOR_JAN_1_1800) % 7;
    }

    /** 1 Ocak 1800'den bu yana toplam gün sayısını alın */
    public static int alToplamGunSayisi(int yil, int ay) {
        int toplam = 0;

        // 1800'den 1/1/yıl'a kadar toplam günleri alın
        for (int i = 1800; i < yil; i++)
        if (kalanYil(i))
            toplam = toplam + 366;
        else
            toplam = toplam + 365;

        // Ocak ayından önceki aya gün ekleyin
        for (int i = 1; i < ay; i++)
            toplam = toplam + aylarinGunSayisi(yil, i);

        return toplam;
    }

  /** Bir aydaki gün sayısını alın */
  public static int aylarinGunSayisi(int yil, int ay) {
    if (ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12)
      return 31;

    if (ay == 4 || ay == 6 || ay == 9 || ay == 11)
      return 30;

    if (ay == 2) return kalanYil(yil) ? 29 : 28;

    return 0; //Ay yanlışsa
  }

  /** Artık yıl olup olmadığını belirleyin */
  public static boolean kalanYil(int yil) {
    return yil % 400 == 0 || (yil % 4 == 0 && yil % 100 != 0);
    }
}
