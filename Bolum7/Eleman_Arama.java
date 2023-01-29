public class Eleman_Arama {
    public static void main(String[] args) {
        int[] dizi = {32, 4, 22, 52, 35, 22, 4, 5, 2, 8};
        
        System.out.println("Bulundugu indis:  " + bul(dizi, 4));
    }

    public static int bul(int[] liste, int indis) {
        for (int i = 0 ; i < liste.length ; i++){
            if (indis == liste[i])
                return i;
        
        }
        return -1;
    }
}
