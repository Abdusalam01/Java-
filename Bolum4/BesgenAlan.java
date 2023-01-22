import java.util.Scanner;

public class BesgenAlan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Merkezden bir tepe noktasina kadar olan uzunlugu girin: ");
        double r = input.nextDouble(); // r == uzunluk
        // burada s bir kenar uzunluğudur. Yan formül s kullanılarak hesaplanabilir.
        double s = 2 * r * Math.sin(Math.PI/5);
        // Beşgenin alanını hesaplama formülü
        double alan = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/5));
        // alannı ekrana yazdır.
        System.out.printf("Besgenin alani: %.2f\n", alan);

        input.close();
    }
}
