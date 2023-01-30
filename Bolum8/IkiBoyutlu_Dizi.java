//import java.util.Scanner;

public class IkiBoyutlu_Dizi {
    public static void main(String[] args) {
        int[][] matris = {{0,2,3},{4,0,6},{7,8,0}};
        for (int i = 0 ; i < 3; i++){
            for ( int j = 0 ; j < 3 ; j++)
                System.out.print(matris[i][j] + " ");
            System.out.println();
        }

        /*
        Metindeki örneklere bakın.
        1. (Giriş değerleriyle dizileri başlatma)
        2. (Dizileri yazdırma)
        3. (Tüm elemanları toplamak)
        4. (Tüm elemanları sütuna göre toplama)
        5. (En büyük toplam hangi satırdadır)
        6. (Dizileri rastgele degerlerle doldurma)
        7. (Rastgele karıştırma) */

        /*  1. 
        int[][] matrix = new int[2][2]; // matrisin kaç satir ve kaç sütünden oluştuğunu belirle
        Scanner input = new Scanner(System.in); 
        System.out.println( matrix.length + " Satir ve " + matrix[0].length + " sutun'den olusan bir matris giriniz: ");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) { 
                matrix[row][column] = input.nextInt();    }    } 

        // girilen matrisi ekrana yazdir
        for (int i = 0 ; i < matrix.length; i++){
            for ( int j = 0 ; j < matrix[i].length ; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();
        } input.close();*/
    /* --------------------------------------------------------------------------------------------------------------- */

        /*  2. 
        for (int i = 0 ; i < matrix.length; i++){
            for ( int j = 0 ; j < matrix[i].length ; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();
        }*/
    /* --------------------------------------------------------------------------------------------------------------- */

        /*  3. 
        int total = 0;
        for (int row = 0; row < matris.length; row++) {
            for (int column = 0; column < matris[row].length; column++) { 
                total += matris[row][column];
            } 
        }
        System.out.println(total);  */
    /* --------------------------------------------------------------------------------------------------------------- */

        /*  4. 
        for (int column = 0; column < matris[0].length; column++) { int total = 0;
            for (int row = 0; row < matris.length; row++)
                total += matris[row][column];
            System.out.println("Sutun " + column + " icin toplami: " + total); 
        }*/
    /* --------------------------------------------------------------------------------------------------------------- */

        /*  5.  
        int maxSatir = 0;
        int indexMaxSatir = 0;
        // maxSatir'daki ilk satırın toplamını alın
        for (int i = 0; i < matris[0].length; i++) { 
            maxSatir += matris[0][i];
        }
        for (int row = 1; row < matris.length; row++) {
            int satirinToplami= 0;
            for (int column = 0; column < matris[row].length; column++)
                satirinToplami += matris[row][column];
            if (satirinToplami > maxSatir) { 
                maxSatir = satirinToplami; 
                indexMaxSatir = row;
            } 
        }
        indexMaxSatir++;
        System.out.println("En buyuk tolama sahip olan satir " + indexMaxSatir + ". Satirdir, toplami: " + maxSatir);
        */
    /* --------------------------------------------------------------------------------------------------------------- */
            
        /*  6.  
            int[][] matrix = new int[5][5];
            for (int row = 0; row < matrix.length; row++) {
                for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random() * 10); }
            }*/
    /* --------------------------------------------------------------------------------------------------------------- */

        /*  7. 
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                int i1 = (int)(Math.random() * matris.length); 
                int j1 = (int)(Math.random() * matris[i].length); // Swap matris[i][j] with matris[i1][j1]
                int temp = matris[i][j];
                matris[i][j] = matris[i1][j1];
                matris[i1][j1] = temp;
            } 
        }System.out.println();
        for (int i = 0 ; i < 3; i++){
            for ( int j = 0 ; j < 3 ; j++)
                System.out.print(matris[i][j] + " ");
            System.out.println();
        }*/
    /* --------------------------------------------------------------------------------------------------------------- */

    
    }
}
