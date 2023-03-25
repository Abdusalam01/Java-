public class Diziyi_tessine_Cevir {
    public static void main(String[] args) {
        int[] liste1 = {10,20,30,40,50,60,70,80,90};
        int[] liste2 = new int[liste1.length];
        
        liste1 = cevir(liste1);
        
        for (int yazdir: liste1){
            System.out.print(yazdir + "  ");
        }
        System.out.println();


        // Dizi kopyalama
        System.arraycopy(liste1, 4, liste2, 4, 2);

        // kopyasını yazdır
        for(int yazdir: liste2)
            System.out.print(yazdir + "  ");
    }
    
    public static int[] cevir(int[] liste){

        int[] dizi = new int[liste.length];

        for (int i = 0 , j = dizi.length -1 ; i < liste.length ; i++ , j-- ){
            dizi[j] = liste[i];
        }
        return dizi;
    }
}
