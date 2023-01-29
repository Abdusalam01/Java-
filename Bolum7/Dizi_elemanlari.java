public class Dizi_elemanlari{
    public static void main(String[] args) {
        /**
        1. (Giriş değerleriyle dizileri başlatma)
        2. (Rastgele değerlerle dizileri başlatma)
        3. (Dizileri yazdırma)
        4. (Tüm elemanların toplanması)
        5. (En büyük elemanı bulma)
        6. (En büyük elemanı bulma)
        7. (elemanların yerini degistirme) */

        /*  1. 
        java.util.Scanner input = new java.util.Scanner(System.in); 
        System.out.print("Enter " + myList.length + " values: "); 
        for (int i = 0; i < myList.length; i++){
            myList[i] = input.nextDouble();    }   */
        
        /*  2. 
        for (int i = 0; i < myList.length; i++) { 
            myList[i] = Math.random() * 100;    }  */

        /*  3.
        for (int i = 0; i < myList.length; i++) { 
            System.out.print(myList[i] + " ");  }  */

        /*  4. 
        double toplam = 0;
        for (int i = 0; i < myList.length; i++) {
            toplam += myList[i];                }  */

        /*  5.
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) 
                max = myList[i];                }  */

        /*  6.
        double[] myList = {1.1 ,43.3 ,5.6 ,75.4 ,6};
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) 
                max = myList[i];    }
        System.out.println(max);   */

        /*  7.
        double[] myList = {1.1 ,43.3 ,5.6 ,75.4 ,6};
        double temp = myList[0]; // İlk öğeyi koru
        // Öğeleri sola kaydır
        for (int i = 1; i < myList.length; i++) {
             myList[i - 1] = myList[i];         }
        // Son konumu doldurmak için ilk öğeyi hareket ettirin
        myList[myList.length - 1] = temp; 
        System.out.println(myList[0]);      */

    }
}