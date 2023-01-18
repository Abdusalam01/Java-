import java.util.Scanner;

public class Scanf {
    public static void main(String[] args) {
    // Bir Tarayıcı nesnesi oluşturun
        Scanner input = new Scanner(System.in);  // **** kullanicidan girdi almak için Scanner metodu kullanılır.

        // Kullanıcıdan bir yarıçap girmesini isteyin
        System.out.print("Yaricap icin bir sayi girin: ");
        double yaricap = input.nextDouble();//     ****  input.nextDouble();

        // Hesaplama alanı
        double alan = yaricap * yaricap * 3.14159;

        // Sonuçları göster
        System.out.println("Yaricap cemberinin alani " + yaricap + " is " + alan);

        input.close();
    }
}
