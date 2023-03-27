import java.util.regex.Pattern;

public class Regex_5 {
    public static void main(String[] args) {
        
        System.out.println(Pattern.matches(".z." , "azd")); // ortasi 'z' olan 3 karakterli bir kelimemi
        System.out.println(Pattern.matches("...d", "azd"));// 4 karakterli bir kelime olacak ve sonu 'd' ile sonlanıyormu
        System.out.println(Pattern.matches("[a]", "azd" ));  // tek karakter olacak ve o karakterde 'a' olacak
        System.out.println(Pattern.matches("[abc]", "a")); // 'a' olacak veya 'b' olacak, Veya 'c' olacak.  a oldugu icin true döndürecek.
        System.out.println(Pattern.matches("[abc]", "abcabc")); // 'a' olacak veya 'b' olacak, Veya 'c' olacak.

        System.out.println(Pattern.matches("[abc]?", "a")); //Sadece bir kere kullanalacak
        System.out.println(Pattern.matches("[abc]+", "a")); //bir veya daha fazla kez kullanzlacak
        System.out.println(Pattern.matches ("[abc]*", "a")); //His ya da sok kullanzlacak

        System.out.println("\n"+ Pattern.matches("[abc]+", "abcabc"));
    }
}
