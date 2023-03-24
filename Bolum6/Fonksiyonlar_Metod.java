public class Fonksiyonlar_Metod {
    public static void main(String[] args) {

        System.out.println(sinif.dondur());
        System.out.println(sayi());

        for(int i = 0; i < 3 ; i++){
            System.out.println(str());
        }
        System.out.println("4 + 4 = " + topla(4, 4));

        System.out.println("-3'ün mutlak degeri : " + mutlak_deger(-3));

        System.out.println(Math.round(Math.random() * 100 ));
        System.out.println(Math.rint(3.5));
        System.out.println(Math.round(3.5));

    }

    public static int sayi(){
        return 1;
    }


    public static String str(){
        String s = "Hello ";
        return s;
    }
    
    public static int topla(int a, int b){
        return a + b;
    }

    public static int mutlak_deger(int a){
        return Math.abs(a);
    }

}
class sinif{
    static int dondur(){
        return 5;
    }
}
