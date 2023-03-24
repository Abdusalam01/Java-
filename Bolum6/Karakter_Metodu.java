public class Karakter_Metodu {
    public static void main(String[] args) {
        
        System.out.println(Character.compare('a', 'b'));



        //isDigit(ch)             —> Belirtilen karakter bir rakam ise true döndürür.
        System.out.println(Character.isDigit('4'));  // true
        System.out.println(Character.isDigit('a') + "\n");  // false



        //isLetter (ch)           —> Belirtilen karakter bir harf ise true döndürür.
        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isLetter('4') + "\n");



        //isLowerCase(ch)         —> Belirtilen karakter küçük harf ise true döndürür.
        //isUpperCase (ch)        —> Belirtilen karakter büyük harf ise true döndürür.    
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isUpperCase('A') + "\n");



        //toLowerCase(ch)         —> Belirtilen karakterin küçük harfini döndürür.
        //toUpperCase (ch)        —> Belirtilen karakterin büyük harfini döndürür.
        System.out.printf("%c\n",Character.toUpperCase('a'));
        System.out.printf("%c\n\n",Character.toLowerCase('G'));







    }
}
