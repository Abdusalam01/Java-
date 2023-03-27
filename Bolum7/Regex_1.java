import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_1 {
    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("[^abc]def"); //a,b, c en basta bulunumaz^
        Matcher matcher = pattern.matcher("adef");  // false
        Matcher matcher1 = pattern.matcher("ddef");  // true
        Matcher matcher2 = pattern.matcher("asdf");  // false

        System.out.println(matcher.matches());
        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
        

    }
}
