import java.util.Arrays;

public class Siralama {
    public static void main(String[] args) {
        
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        java.util.Arrays.sort(numbers);

        for(double yazdir: numbers)
            System.out.print(yazdir + "  ");
        System.out.println("\n");

        int [] dizi= {5,9,12, 15, 18, 25, 7, 3,25, 1, 4};
        Arrays.sort(dizi,6,10);

        for(int yazdir: dizi)
            System.out.print(yazdir + "  ");
        
    }
}
