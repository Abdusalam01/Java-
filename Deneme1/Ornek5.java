public class Ornek5 {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        
        String s = String.valueOf(sayi1);
        // int tipindeki bir değeri String tipine çevirir

        System.out.println("Sayi1 : " + sayi1);
        System.out.println("Sayi2 : " + sayi2);

        System.out.printf("Sayi1 + sayi2 = %d\n",sayi1 + sayi2);

        System.out.printf("S + sayi2 = %s\n",s + sayi2);


    }
}
