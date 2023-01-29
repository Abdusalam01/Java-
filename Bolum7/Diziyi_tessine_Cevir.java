public class Diziyi_tessine_Cevir {
    public static void main(String[] args) {
        int[] liste1 = {10,20,30,40,50,60,70,80,90};
        
        liste1 = cevir(liste1);
        
        for (int i = 0 ; i < liste1.length ; i++){
            System.out.print(liste1[i] + "  ");
        }
    }
    
    public static int[] cevir(int[] liste){

        int[] dizi = new int[liste.length];

        for (int i = 0 , j = dizi.length -1 ; i < liste.length ; i++ , j-- ){
            dizi[j] = liste[i];
        }
        return dizi;
    }
}
