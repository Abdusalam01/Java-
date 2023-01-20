import java.util.Scanner;

public class IkinciDereceden {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(" a, b, c, degerlerini giriniz: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = (Math.pow(b, 2) - 4 * a * c);

        double X1 = 0;
        double X2 = 0;

        X1 = ((-b + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / 2 * a);
        X2 = ((-b - Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / 2 * a);

        if ( delta > 0)
            System.out.println("Denklemin iki koku vardir : " + X1 + " ve " + X2);
        else if (delta == 0)
            System.out.println("Denklemin bir koku vardir : " + X1);
        else 
            System.out.println("Denklemin koku yoktur.");

        input.close();
    }
}
