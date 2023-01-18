public class ShowCurrentTime {
    public static void main(String[] args) {
        // 1 Ocak 1970 gece yarısından bu yana toplam milisaniyeyi al
        long toplamMillisaniye = System.currentTimeMillis();
    
        // 1 Ocak 1970 gece yarısından itibaren toplam saniyeyi al
        long toplamSaniye = toplamMillisaniye / 1000;
    
        // Compute the current second in the minute in the hour
        long kalansaniye = toplamSaniye % 60;
    
        // Obtain the total minutes
        long toplamDakika = toplamSaniye / 60;
    
        // Compute the current minute in the hour
        long kalanDakika = toplamDakika % 60;
    
        // Obtain the total hours
        long toplamSaat = toplamDakika / 60;
    
        // Compute the current hour
        long kalanSaat = toplamSaat % 24;
    
        // Display results
        System.out.println("Current time is " + kalanSaat + ":"
            + kalanDakika + ":" + kalansaniye + " GMT");
    }
  }