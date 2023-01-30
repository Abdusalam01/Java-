package Bolum8;

import java.util.Scanner;

public class SatirSrala {
    public static void main(String[] args) {

        int[][] matris = new int[3][3];

        Scanner input = new Scanner(System.in);
        System.out.println(" 3 X 3  tipinde bir matris giriniz: ");

        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                matris[i][j] = input.nextInt();
            }
        }
        matris = sirala(matris);

        for (int i = 0 ; i < matris.length ; i++){
            for (int j = 0 ; j < matris[i].length ; j++){
                System.out.printf(matris[i][j] + "  ");
            }
            System.out.println();
        }
        input.close();
    }
    public static int[][] sirala(int[][] m){
        for(int k=0;k<3;k++){
			for(int i=0;i<3;i++)
				for(int j=i+1;j<3;j++)
					if(m[k][i]>m[k][j]) {	
                        int t=m[k][i];
						m[k][i]=m[k][j];
						m[k][j]=t;
					}
		}
        return m;
    }
}
