import java.util.Date;

public class SaatiGoster {
    public static void main(String[] args) {
        // sistem saati geri döndürür.
        Date date = new Date(System.currentTimeMillis()); 
        System.out.println(date);

        // long tipinde bir sayi girerek onun hangi tarihe denk geldigini ogrenme.
        Date tarih2 = new Date(81099999999999L);
        System.out.println(tarih2.toString());

        Date tarih3 = new Date();
        tarih3.setTime(0);
        System.out.println(tarih3.toString());

        // tarihi bir saat ileriye al
        Date tarih4 = new Date();
        tarih4.setTime(date.getTime() + 6000000);
        System.out.println(tarih4.toString());

    }
    
}

