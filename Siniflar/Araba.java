public class Araba {
    String marka,renk;  // durum
    void gazaBas()  // davraniş
    {
        System.out.println("Araba hizlaniyor...");
    }
    void fireneBas() // davraniş
    {
        System.out.println("Araba yavaşliyor...");
    }
    public static void main(String[] args) {
        Araba a1 = new Araba();             // Araba sınıfından a1 nesnesi oluşturuldu.
        a1.marka = "BMW";                   // nesnesinin markasi belirlendi.
        a1.renk = "Kirmizi";                // nenenin rengi belirlendi.
        a1.gazaBas();                       // a1 nesnesinin gazaBas adlı metodu çağırıldı.
        a1.fireneBas();                     // a1 nesnesinin fireneBas adlı metodu çağırıldı.

        System.out.println("\nArabanin markasi: " + a1.marka + "\nArabanin rengi: " + a1.renk );
    }
}
