public class DegerVeReferansTipi {
    int x;
    public static void main(String[] args) {
        System.out.println();

        // PASS BY VALUE
        int a = 10;

        System.out.println("Eski deger: " + a);
        carp(a);
        System.out.println("Yeni deger: " + a);
        System.out.println();

        // PASS BY REFERENCE
        int[] dizi = {100, 200, 300};
        System.out.println("Eski deger: " + dizi[0] + "  " + dizi[1] + "  " + dizi[2]);
        degistir(dizi);
        System.out.println("Yeni deger: " + dizi[0] + "  " + dizi[1] + "  " + dizi[2]);
        System.out.println();

        // PASS BY REFERENCE
        DegerVeReferansTipi y = new DegerVeReferansTipi();
        y.x = 484;
        System.out.println("Eski deger: " + y.x);
        y.bol(y);
        System.out.println("Yeni deger: " + y.x);
        System.out.println();
    }
    static void carp(int a){
        a*=5;
    }

    static void degistir(int[] dizi){
        dizi[1] = 500;
        dizi[2] = 900;
    }

    void bol(DegerVeReferansTipi y){
        y.x /= 11;
    }
}
