import java.util.Scanner;

public class HaftaninHangiGunu {
    public static void main (String[] args){
        System.out.println(
            "\n*******************************************************************************************************************\n" +
            "* Pazartesi -> 0  * Sali  -> 1  * Carsamba  -> 2  * Persembe  -> 3   * Cuma  -> 4  *" + 
            " Cumartesi  -> 5  * Pazar -> 6 \n" + 
            "*******************************************************************************************************************\n");
        Scanner input = new Scanner(System.in);

        System.out.print("Bugunu giriniz : ");
        int gun1 = input.nextInt();
        System.out.print("Kac gun sonraki gunu ogrenmek istiyor sunuz : ");
        int gun2 = input.nextInt();

        switch (gun1){
            case 0: System.out.print("Bugun" + " Pazartesi ve ");     break;
            case 1: System.out.print("Bugun" + " Sali ve ");          break;
            case 2: System.out.print("Bugun" + " Carsamba ve ");      break;
            case 3: System.out.print("Bugun" + " Persembe ve ");      break;
            case 4: System.out.print("Bugun" + " Cuma ve ");          break;
            case 5: System.out.print("Bugun" + " Cumartesi ve ");     break;
            case 6: System.out.print("Bugun" + " pazar ve ");         break;
        }
        switch ((gun1 + gun2) % 7){
            case 0: System.out.println(gun2 + " gun sonraki gun" + " Pazartesi ");     break;
            case 1: System.out.println(gun2 + " gun sonraki gun" + " Sali ");          break;
            case 2: System.out.println(gun2 + " gun sonraki gun" + " Carsamba ");      break;
            case 3: System.out.println(gun2 + " gun sonraki gun" + " Persembe ");      break;
            case 4: System.out.println(gun2 + " gun sonraki gun" + " Cuma ");          break;
            case 5: System.out.println(gun2 + " gun sonraki gun" + " Cumartesi ");     break;
            case 6: System.out.println(gun2 + " gun sonraki gun" + " pazar ");         break;
        }

        input.close();
    }
}
