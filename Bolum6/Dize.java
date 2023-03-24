public class Dize {
    public static void main(String[] args) {

        /*
            - length()    —>  Bu dizideki karakter sayısını döndürür.
            - charAt (index)    —>  Bu dizeden belirtilen dizindeki karakteri döndürür.
            - concat (s1)    —>  Bu dizgiyi s1 dizgisiyle birleştiren yeni bir dizge döndürür.
            - toUpperCase ()    —>  Tüm harfleri büyük olan yeni bir dize döndürür.
            - toLowerCase ( )    —>  Tüm harfleri küçük olacak şekilde yeni bir dize döndürür
            - trim()    —>  Her iki tarafı kırpılmış boşluk karakterleriyle yeni bir dize döndürür.
         */
        String ad = "Hamdiye Akbaba ";
        String soyad = "Zilli ";

        System.out.println("Karakter sayisi: " + ad.length());

        System.out.println("5. indisteki karakter: " + ad.charAt(5));

        System.out.println("Ad - Soyad: " + ad.concat(soyad).toUpperCase());

        System.out.println(ad.toUpperCase());

        System.out.println(ad.toLowerCase());

        System.out.println(ad.trim().concat(soyad)+ "\n");


        // .equals()
        if(ad.equals(soyad))
            System.out.println("Metinler Ayni\n");
        else 
            System.out.println("Metinler Farkli\n");


        // .comoareTo
        if(ad.compareTo(soyad) == 0)
            System.out.println("Metinler Ayni\n");
        else 
            System.out.println("Metinler Farkli\n");


        System.out.println(ad.startsWith("Hamdiye"));

        System.out.println(ad.endsWith("Akbaba "));

        System.out.println(ad.contains(soyad));


        String str = "Welcome To Java";
        String str2 = str.substring(0, 11) + "HTML";

        System.out.println(str2);

        System.out.println(str.indexOf("J"));

    } 
}
