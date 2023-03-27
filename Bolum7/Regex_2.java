import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_2 {
    public static void main(String[] args) {

        Pattern pattern = Pattern. compile( "Universites", Pattern.CASE_INSENSITIVE);   //Pattern. UNICODE_CASE
        Matcher matcher = pattern. matcher("Bursa Teknik UNIVERSITEST ");
        boolean matchFound = matcher.find();

        if(matchFound) {
        System.out.println("Match found");
        }
        else {
        System.out.println("Match not found");
        }
        
    }
}
