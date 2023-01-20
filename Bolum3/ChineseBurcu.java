import java.util.Scanner;

public class ChineseBurcu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print(" Yili giriniz : ");
        int yil = input.nextInt();

        switch( yil % 12){
            case 0:  System.out.println("Maymun 🙈");   break;
            case 1:  System.out.println("Horoz 🐓");    break;
            case 2:  System.out.println("Kopek 🐕");    break;
            case 3:  System.out.println("Domuz 🐷");    break;
            case 4:  System.out.println("Fare 🐁");     break;
            case 5:  System.out.println("Okuz 🐄");     break;
            case 6:  System.out.println("Kapla 🐅");    break;
            case 7:  System.out.println("Tavsan 🐇");   break;
            case 8:  System.out.println("Ejderha 🐉");  break;
            case 9:  System.out.println("Yilan 🐍");    break;
            case 10: System.out.println("At 🐎");       break;
            case 11: System.out.println("Keci 🐐");     break;
        }
        input.close();
    }
}
