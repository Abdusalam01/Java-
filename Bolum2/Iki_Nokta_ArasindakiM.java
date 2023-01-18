import java.util.Scanner;

public class Iki_Nokta_ArasindakiM {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.printf("X1 ve Y1 noktalarini giriniz: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.printf("X2 ve Y2 noktalarini giriniz: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        double a = Math.pow((x2-x1), 2);
        double b = Math.pow((y2-y1), 2);
        double sonuc = Math.pow((a+b), 0.5);
        
        System.out.println("Iki nokta arasindaki mesafe : " + sonuc);
        input.close();
    }
}
