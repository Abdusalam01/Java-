import java.util.Scanner;

public class Cikarma_testi {
    public static void main(String[] args){
        final int NUMBER_OF_QUESTIONS = 5; // Çıkarma test sayısı
        int dogruCevap = 0; // Doğru cevapların sayısını sayın
        int count = 0; // Soru sayısını say
        long startTime = System.currentTimeMillis();   // Test suresini ölçe bilmemiz için testin başlangıç saniyesini tutar
        String cikti = ""; // çıktı dizesi başlangıçta boş olarak ata.
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            // 1. İki rastgele tek basamaklı tam sayı üret
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            // 2. eger number1 < number2, 1 numarayı 2 numara ile değiştir
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // 3. Öğrenciden "Sayı1 – sayı2 nedir?" sorusunu yanıtlamasını isteyin.
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            // 4. Cevabı not edin ve sonucu görüntüleyin
            if (number1 - number2 == answer) {
                System.out.println("Dogru Cevap!");
                dogruCevap++;
            }
            else
                System.out.println("cevabin yanlis.\n" + number1 
                + " - " + number2 + " = " + (number1 - number2) + " Olmali");

            // test Sayısını artır
            count++;

            cikti += "\n" + number1 + " - " + number2 + " = " + answer + 
                ((number1 - number2 == answer) ? " Dogru" : " Yanlis"); // ternary  ifadesi
        }

        long endTime = System.currentTimeMillis();  // testin bitiş saniyesi
        long testTime = endTime - startTime;

        System.out.println("\nDogru Sayisi " + dogruCevap + 
        "\nTest Suresi " + testTime / 1000 + " saniye\n" + cikti);

        input.close();
    }
}
