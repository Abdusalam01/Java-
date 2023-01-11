public class Adim4_Math {
    public static void main(String[] args) {

        /**  ----- MATH METODU -------   */
        System.out.println(Math.pow(5,4)); // pow -- İki parametre alır ve ikinci parametreyi birincinin üstü olarak kullanır. => 625.0
        System.out.println(Math.sin(Math.PI/ 2));// Tek parametre alır(double) Math.cos(Math.PI) => 1.0
        System.out.println(Math.floor(9.8));// floor -- tek parametre alır ve ondalik kismini atar ve tam sayiya döndurur. => 9.0
        System.out.println(Math.max(2.5,8));// max -- İki parametre alır ve parametrelerden büyük olan sayıyı geri döner.  => 8.0
        System.out.println(Math.min(2.5,9));// İki parametre alır ve parametrelerden küçük olan sayıyı geri döner. =>2.5
        System.out.println(Math.random()); // Parametre almaz ve 0 ile 1 arasında double bir değer döner
        System.out.println(Math.round(2.4));// Tek parametre alır(float) ve yakın olan tam sayıya döner. => 2
        System.out.println(Math.round(5.7));// => 6  
        
        /** Math trigonometrik medotlar */
        Math.toDegrees(Math.PI / 2); //returns 90.0 
        Math.toRadians(30); // returns 0.5236 (same as π/6) 
        Math.sin(0);   // returns 0.0 
        Math.sin(Math.toRadians(270));  // returns -1.0 
        Math.sin(Math.PI / 6);   // returns 0.5 
        Math.sin(Math.PI / 2);   // returns 1.0 
        Math.cos(0);  // returns 1.0
        Math.cos(Math.PI / 6);  // returns 0.866 
        Math.cos(Math.PI / 2);  // returns 0 
        Math.asin(0.5);  // returns 0.523598333 (same as π/6) 
        Math.acos(0.5);  // returns 1.0472 (same as π/3) 
        Math.atan(1.0);  // returns 0.785398 (same as π/4)

        /** Math logaritmik medotlar */
        Math.exp(1); // returns 2.71828 
        Math.log(Math.E);   // returns 1.0 
        Math.log10(10);   // returns 1.0 
        Math.pow(2, 3);   // returns 8.0 
        Math.sqrt(4);   // returns 2.0   

        /** Math yuvarlama metodu */
        Math.ceil(2.1);   /**  ceil metodu içine alan double sayiyi kendinden buyuk veye kendine eşit 
                                olan integer tamsayısına yuvarlar. */
        Math.floor(9.8); // floor -- Tek parametre alır ve ondalik kismini atar ve tam sayiya döndurur. => 9.0
        Math.rint(8.6); //  kendine yakin olan tamsayıya yuvarlar.  --> 9
        Math.round(-2.6); //  kendine yakin olan tamsayıya yuvarlar. --> -3
        Math.abs(-2); // Aldığı degerin mutlak degerini ödürür. --> 2


        int sayiUret = 50 + (int)(Math.random() * 50);  // 50 ile 99 arasında rastgele bir tam sayı döndürür.
        System.out.println(sayiUret);

        System.out.println("He said \"Java is fun\"");  // He said "Java is fun"
    }
}
