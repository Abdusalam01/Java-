import java.util.Scanner;

public class Ekran_Pramidi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

		//Kullanıcıdan satir değerini al
		System.out.print("Pramidinizde kac satir isyiyorsunuz: ");
		int satir = input.nextInt();

		//Satır Sayımı 1 ile başlatılıyor
		int satirSayisi = 1;

		System.out.println("Iste Pramidiniz...");

		//pramid mantığı uygulamak

		for (int i = satir; i > 0; i--)
		{
			//Her satırın başında i*2 boşlukları yazdırır
			for (int j = 1; j <= i*2; j++)
			{
				System.out.print(" ");
			}
			//Printing j value where j value will be from 1 to rowCount
			for (int j = 1; j <= satirSayisi; j++) 			
			{
				System.out.print(j+" ");
			}

			//Printing j value where j value will be from rowCount-1 to 1
			
			for (int j = satirSayisi-1; j >= 1; j--)
			{ 				
				System.out.print(j+" "); 			
			} 			 			
			
			System.out.println();

			//Incrementing the rowCount

			satirSayisi++;
		}
        input.close();
    }
}
