import java.util.Scanner;

public class CikarmaTesti {
    public static void main(String[] args) {
        // 1. İki rastgele tek basamaklı tam sayı üretin
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
    
        // 2. Sayı1 < sayı2 ise, sayı1'i sayı2 ile değiştirin
        if (number1 < number2) {
          int temp = number1;
          number1 = number2;
          number2 = temp;
        }
    
        // 3. Öğrenciden “sayi1 – sayi2 nedir?” sorusunu yanıtlamasını isteyin.
        System.out.print("What is " + number1 + " - " + number2 + " = ? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // 4. Cevabı not edin ve sonucu görüntüleyin
        if (number1 - number2 == answer)
          System.out.println("Dogru cevap!");
        else
          System.out.println("Cevabiniz yanlis.\n" + number1 + " - "
            + number2 + " = " + (number1 - number2) + " Olmali \n"); 
    
        input.close();
    }    
}
