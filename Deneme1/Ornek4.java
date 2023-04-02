public class Ornek4 {
    public static void main(String[] args) {

        String myString = "Merhaba Dunya";

        System.out.println("Uzunluk = " + myString.length());
        // Metnin uzunLuëunu (karakter savasanz) bulmak icin length metodu kullanilir

        System.out.println(myString.substring(8, myString.length()));
        // 8. karakterden baslavarak son karaktere kadar. olan kismi yazdicir

        System.out.println (myString.substring(0, 7));
        // 0 - 7 arasandaki (0 dahil. 7 haric) karakterleci konsola yazdicir

        System.out .println("Dunya baslangici " + myString.indexOf("Dunya"));
        // Bir harfin ya da String değerinin kacinci dizinden (index) itibaren basladigini bulur

        System.out.println("Kucuk harfler : " + myString.toLowerCase());
        // Bir metni kücük hanflere sevirmek isin toLowerCase, büyük harflere sevirmek icin toupperCase

    }
}
