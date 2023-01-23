public class Bul_5_6 {
    public static void main(String[] args){
        // n kara > 12000 olan en kucuk n tam sayisini bul
        int n = 1;
        while ( Math.pow(n, 2) < 12000){
            n++;
        }
        System.out.println(n);


        // a küp < 12000 olan en büyük a tam sayisini bul
        int a = 1;
        while ( Math.pow(a, 3) < 12000){
            a++;
        }
        System.out.println(a-1);


    }
}
