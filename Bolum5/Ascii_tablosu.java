public class Ascii_tablosu {
    public static void main(String[] args) {
        int  ascii = 1;
        
        for (ascii = 33; ascii < 128; ascii++){
            char tablo = (char) ascii;
            System.out.print(ascii + " --> " + tablo + " \t ");
        }
    }
}
