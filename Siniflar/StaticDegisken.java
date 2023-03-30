public class StaticDegisken {

    static int yas;
    static int yasYaz()
    {   return yas; }

    public static void main(String[] args) {

        StaticDegisken.yas = 25;   // sınıf adi ile doğrudan erişmek.
        System.out.println(StaticDegisken.yasYaz());
    }
}
