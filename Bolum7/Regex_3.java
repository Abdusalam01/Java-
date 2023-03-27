import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_3 {
    public static void main(String[] args) {
        
        String s = "bir Berber bir berbere gel beraber bir berber dukkan acalim beraber demis";
        Pattern pattern = Pattern.compile ("ber",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        
        int sayac = 0;
        while(matcher.find())
            sayac++;

        System.out.println(sayac);
    }
}
