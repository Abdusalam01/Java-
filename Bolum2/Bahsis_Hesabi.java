import java.util.Scanner;

public class Bahsis_Hesabi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // yemek ucret miktarini kullanıcıdan alınız.
        System.out.print("Yemek ucreti giriniz ve bahsis oranini giriniz : ");
        double yemekUcreti = input.nextDouble();
        double bahsisOrani = input.nextDouble();
        
        double bahsis = (bahsisOrani/100) * yemekUcreti; // bahşişin hesaplanması
        double toplam= bahsis + yemekUcreti;

        System.out.println("Bahsis $" + bahsis + " ve toplam $" + toplam);


        input.close();
    }
}
