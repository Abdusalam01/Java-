import java.util.Scanner;

public class DovizRMB {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Dolardan RMB'ye doviz kurunu girin: ");
        double kur = input.nextDouble();
        System.out.print("Dolari RMB'ye donusturmek icin 1 girin veye RMB'yi Dolara donusturmek icin 2 giriniz: ");
        int islem = input.nextInt();

        if (islem == 1){
            System.out.print("Dolar miktarini giriniz: ");
            double dolar = input.nextDouble();
            double karsiligi1 = kur * dolar;
            System.out.println(dolar + "$ = " + karsiligi1 + "yuan");
        }
        else if (islem == 2){
            System.out.print("RMB miktarini giriniz: ");
            double rmb = input.nextDouble();
            double karsiligi2 = rmb / kur;
            System.out.printf(rmb + " yuan = %.2f$\n",karsiligi2);
        }
        else 
            System.out.println("Yanlis girdiniz, tekrar deneyin.");
        input.close();
    }
}
