public class Asal_Sayi {
    public static void main(String[] args) {
        System.out.println("Ilk 15 asal sayi \n");
        printPrimeNumbers(15);
    }
        
    public static void printPrimeNumbers(int asalSayi) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Satır başına 10 göster
        int saymak = 0; // Asal sayıları sayın
        int number = 2; // Asallık için test edilecek bir sayı
        
        // Teker Teker asal sayıları bulma
        while (saymak < asalSayi) {
            // Asal sayıyı yazdırın ve sayımı artırın
            if (asal(number)) {
                saymak++; // Sayıyı artır
    
                if (saymak % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Numarayı yazdırın ve yeni satıra ilerleyin
                    System.out.printf("%-5s\n", number);
                }
                else
                    System.out.printf("%-5s", number);
            }
    
            // Bir sonraki sayının asal olup olmadığını kontrol edin
            number++;
        }
    }
    /** Sayının asal olup olmadığını kontrol edin */
    public static boolean asal(int number) {
        for (int bolen = 2; bolen <= number / 2; bolen++) {
            if (number % bolen == 0) { // Doğruysa, sayı asal değildir
                return false; // sayı asal değil
        }
      }
      return true; // sayı asaldır
    }
}
