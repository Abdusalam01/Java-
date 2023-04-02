import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        System.out.print("Yasinizi giriniz: ");
        String yas = input.nextLine();

        int n = Integer.parseInt(yas);

        System.out.printf("Ahmedin yasi: %d\n", n);

        double d = Double.parseDouble(yas);

        System.out.println(d);
        
        System.out.println((n % 2 == 0)? n + " Bir Cift Sayi": n + " Bir Tek Sayi");

        input.close();
    }
}
