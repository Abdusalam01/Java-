import java.util.Scanner;

public class Pound_Kilo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("pound miktarini giriniz: ");
        double pound = input.nextDouble();
        
        double kilo = pound * 0.454;

        System.out.println("SONUC :  " + pound + " Pound" + " = " + kilo + " Kilogram \n");


        input.close();
    }
    
}
