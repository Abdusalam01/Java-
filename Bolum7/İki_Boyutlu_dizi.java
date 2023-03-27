public class İki_Boyutlu_dizi {
    public static void main(String[] args) {

        int[][] matris = new int[3][3];

        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[i].length; j++)
                matris[i][j] = (int)(Math.random() * 10);   
        }

        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[i].length; j++)
                System.out.print(matris[i][j] + "  ");
            System.out.println();
        }

        System.out.println();

        for(int i = 0,j = 0; i < matris.length; i++, j = 0){
            System.out.printf("%d  %d  %d\n", matris[i][j], matris[i][j + 1], matris[i][j + 2]);
        }


    }
}
