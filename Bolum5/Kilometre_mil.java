import java.util.Scanner;

public class Kilometre_mil {
    public static void main(String[] args) {
        double kilometre = 0;
        int i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("kac mile kadar hesaplasin: ");
        int mil = input.nextInt();
        while (i <= mil){
            kilometre = i * 1.609;
            System.out.println(i + "\t" + kilometre);
            i++;
        }
        input.close();

    }
}