import java.util.Date;
import java.util.Random;

public class RastgeleSayiUret {
    public static void main(String[] args) {
        Random random1 = new Random();
        System.out.print("From random1: ");
        for ( int i = 0 ; i < 10 ; i++){
            System.out.print(random1.nextInt(100) + "  ");
        }


        System.out.println();
        Random random2 = new Random();
        System.out.print("From random2: ");
        for ( int i = 0 ; i < 10 ; i++){
            System.out.print(random2.nextInt(100) + "  ");
        }

        System.out.println(System.currentTimeMillis());
        
        System.out.println(new Date(1680035840735L));

    }
}
