import java.util.Scanner;

public class SatisVergisi {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Satin alma tutarini girin: ");
    double satinAlmaMiktari = input.nextDouble();
    
    double vergi = satinAlmaMiktari * 0.30;
    System.out.println("Satis Vergisi ₺" + (int)(vergi * 100) / 100.0);
    input.close();
  }
}

